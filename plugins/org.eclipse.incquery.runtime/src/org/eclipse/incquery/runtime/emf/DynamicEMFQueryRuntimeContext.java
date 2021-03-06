/*******************************************************************************
 * Copyright (c) 2010-2015, Bergmann Gabor, Istvan Rath and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Bergmann Gabor - initial API and implementation
 *******************************************************************************/
package org.eclipse.incquery.runtime.emf;

import org.apache.log4j.Logger;
import org.eclipse.incquery.runtime.base.api.NavigationHelper;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;

/**
 * In dynamic EMF mode, we need to make sure that EEnum literal constants and values returned by eval() expressions 
 * 	are canonicalized in the same way as enum literals from the EMF model.
 * 
 * <p> This canonicalization is a one-way mapping, so 
 * 	{@link #unwrapElement(Object)} and {@link #unwrapTuple(Object)} remain NOPs.
 * 
 * @author Bergmann Gabor
 *
 */
public class DynamicEMFQueryRuntimeContext extends EMFQueryRuntimeContext {

	public DynamicEMFQueryRuntimeContext(NavigationHelper baseIndex, Logger logger) {
		super(baseIndex, logger);
	}	
	
	@Override
	public Object wrapElement(Object externalElement) {
		return baseIndex.toCanonicalValueRepresentation(externalElement);
	}
	
	@Override
	public Tuple wrapTuple(Tuple externalElements) {
		Object[] elements = externalElements.getElements();
		for (int i=0; i< elements.length; ++i)
			elements[i] = wrapElement(elements[i]);
		return new FlatTuple(elements);
	}
	
	
	
}
