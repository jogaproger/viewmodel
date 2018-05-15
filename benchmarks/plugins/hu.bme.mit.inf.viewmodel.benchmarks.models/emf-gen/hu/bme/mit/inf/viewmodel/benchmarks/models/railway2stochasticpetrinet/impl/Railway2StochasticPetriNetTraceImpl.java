/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetPackage;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetTrace;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.TraceLink;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Railway2StochasticPetriNetTraceImpl#getTraceLinks <em>Trace Links</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Railway2StochasticPetriNetTraceImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Railway2StochasticPetriNetTraceImpl extends MinimalEObjectImpl.Container implements Railway2StochasticPetriNetTrace {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * The cached value of the '{@link #getTraceLinks() <em>Trace Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<TraceLink> traceLinks;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected RailwayContainer source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Railway2StochasticPetriNetTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Railway2StochasticPetriNetPackage.Literals.RAILWAY2_STOCHASTIC_PETRI_NET_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraceLink> getTraceLinks() {
		if (traceLinks == null) {
			traceLinks = new EObjectContainmentEList<TraceLink>(TraceLink.class, this, Railway2StochasticPetriNetPackage.RAILWAY2_STOCHASTIC_PETRI_NET_TRACE__TRACE_LINKS);
		}
		return traceLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailwayContainer getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (RailwayContainer)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Railway2StochasticPetriNetPackage.RAILWAY2_STOCHASTIC_PETRI_NET_TRACE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailwayContainer basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(RailwayContainer newSource) {
		RailwayContainer oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Railway2StochasticPetriNetPackage.RAILWAY2_STOCHASTIC_PETRI_NET_TRACE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Railway2StochasticPetriNetPackage.RAILWAY2_STOCHASTIC_PETRI_NET_TRACE__TRACE_LINKS:
				return ((InternalEList<?>)getTraceLinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Railway2StochasticPetriNetPackage.RAILWAY2_STOCHASTIC_PETRI_NET_TRACE__TRACE_LINKS:
				return getTraceLinks();
			case Railway2StochasticPetriNetPackage.RAILWAY2_STOCHASTIC_PETRI_NET_TRACE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Railway2StochasticPetriNetPackage.RAILWAY2_STOCHASTIC_PETRI_NET_TRACE__TRACE_LINKS:
				getTraceLinks().clear();
				getTraceLinks().addAll((Collection<? extends TraceLink>)newValue);
				return;
			case Railway2StochasticPetriNetPackage.RAILWAY2_STOCHASTIC_PETRI_NET_TRACE__SOURCE:
				setSource((RailwayContainer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Railway2StochasticPetriNetPackage.RAILWAY2_STOCHASTIC_PETRI_NET_TRACE__TRACE_LINKS:
				getTraceLinks().clear();
				return;
			case Railway2StochasticPetriNetPackage.RAILWAY2_STOCHASTIC_PETRI_NET_TRACE__SOURCE:
				setSource((RailwayContainer)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Railway2StochasticPetriNetPackage.RAILWAY2_STOCHASTIC_PETRI_NET_TRACE__TRACE_LINKS:
				return traceLinks != null && !traceLinks.isEmpty();
			case Railway2StochasticPetriNetPackage.RAILWAY2_STOCHASTIC_PETRI_NET_TRACE__SOURCE:
				return source != null;
		}
		return super.eIsSet(featureID);
	}

} //Railway2StochasticPetriNetTraceImpl
