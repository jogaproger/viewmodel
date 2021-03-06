/********************************************************************************
 * Copyright (c) 2018 Contributors to the ViewModel project
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * SPDX-License-Identifier: EPL-1.0
 ********************************************************************************/
package hu.bme.mit.inf.viewmodel.runtime.utils

import java.util.HashSet
import java.util.Set
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceImpl
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope

final class EmfScopeUtils {
	static val TRACE_MODEL_RESOURCE_URI = URI.createURI(
		"hu.bme.mit.inf.viewmodel.runtime.transformation.common.TraceModelResource")

	private new() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}

	static def addToScope(ViatraQueryEngine queryEngine, Iterable<? extends Notifier> newRoots) {
		val emfScope = getEmfScope(queryEngine)
		val navigationHelper = EMFScope.extractUnderlyingEMFIndex(queryEngine)
		val rootsToAdd = newRoots.toSet
		val existingRoots = getRootObjects(emfScope.scopeRoots)
		rootsToAdd.removeAll(existingRoots)
		for (rootToAdd : rootsToAdd) {
			navigationHelper.addRoot(rootToAdd)
		}
	}

	private static def getRootObjects(Set<? extends Notifier> notifiers) {
		val realRoots = new HashSet<Notifier>
		for (notifier : notifiers) {
			switch (notifier) {
				ResourceSet:
					for (resource : notifier.resources) {
						realRoots += resource.contents
					}
				Resource:
					realRoots += notifier.contents
				default:
					realRoots += notifier
			}
		}
		realRoots
	}

	static def addMetamodelsToScope(ViatraQueryEngine queryEngine, Iterable<String> nsUris) {
		val ePackages = nsUris.map[nsUri|EPackageUtils.getEPackage(nsUri)]
		addToScope(queryEngine, ePackages)
	}

	static def Resource getTraceModelResource(ViatraQueryEngine queryEngine) {
		val emfScope = getEmfScope(queryEngine)
		val resourceInScope = getTraceModelResourceFromScope(emfScope)
		if (resourceInScope === null) {
			val resource = new ResourceImpl => [
				URI = TRACE_MODEL_RESOURCE_URI
			]
			EMFScope.extractUnderlyingEMFIndex(queryEngine).addRoot(resource)
			resource
		} else {
			resourceInScope
		}
	}

	private static def getEmfScope(ViatraQueryEngine queryEngine) {
		val scope = queryEngine.scope
		if (scope instanceof EMFScope) {
			scope
		} else {
			throw new IllegalArgumentException("Only EMFScope is supported currently for ViatraQueryEngine")
		}
	}

	private static def getTraceModelResourceFromScope(EMFScope emfScope) {
		for (notifier : emfScope.scopeRoots) {
			switch (notifier) {
				Resource:
					if (isTraceModelResource(notifier)) {
						return notifier
					}
				ResourceSet: {
					val resource = notifier.resources.findFirst[isTraceModelResource]
					if (resource !== null) {
						return resource
					}
				}
				default: {
					// Any other notifier can be ignored.
				}
			}
		}
		null
	}

	private static def isTraceModelResource(Resource resource) {
		resource.getURI == TRACE_MODEL_RESOURCE_URI
	}

}
