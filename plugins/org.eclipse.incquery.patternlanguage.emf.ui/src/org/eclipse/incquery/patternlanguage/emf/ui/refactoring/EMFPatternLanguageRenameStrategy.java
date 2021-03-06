/*******************************************************************************
 * Copyright (c) 2010-2012, Zoltan Ujhelyi, Istvan Rath and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Zoltan Ujhelyi - initial API and implementation
 *******************************************************************************/
/*
 * generated by Xtext
 */
package org.eclipse.incquery.patternlanguage.emf.ui.refactoring;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.ui.jvmmodel.refactoring.DefaultJvmModelRenameStrategy;

/**
 * Encapsulates the model changes of a rename refactoring.
 */
@SuppressWarnings("restriction")
public class EMFPatternLanguageRenameStrategy extends DefaultJvmModelRenameStrategy {

    @Override
    protected void setInferredJvmElementName(String name, EObject renamedSourceElement) {
        /*
         * TODO: rename inferred elements as you would in IJvmModelInferrer
         */
    }
}
