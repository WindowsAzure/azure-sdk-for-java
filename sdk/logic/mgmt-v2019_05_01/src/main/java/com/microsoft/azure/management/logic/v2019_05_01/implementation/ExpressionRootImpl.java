/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01.implementation;

import com.microsoft.azure.management.logic.v2019_05_01.ExpressionRoot;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2019_05_01.AzureResourceErrorInfo;
import java.util.List;
import com.microsoft.azure.management.logic.v2019_05_01.Expression;

class ExpressionRootImpl extends WrapperImpl<ExpressionRootInner> implements ExpressionRoot {
    private final LogicManager manager;
    ExpressionRootImpl(ExpressionRootInner inner, LogicManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public AzureResourceErrorInfo error() {
        return this.inner().error();
    }

    @Override
    public String path() {
        return this.inner().path();
    }

    @Override
    public List<Expression> subexpressions() {
        return this.inner().subexpressions();
    }

    @Override
    public String text() {
        return this.inner().text();
    }

    @Override
    public Object value() {
        return this.inner().value();
    }

}
