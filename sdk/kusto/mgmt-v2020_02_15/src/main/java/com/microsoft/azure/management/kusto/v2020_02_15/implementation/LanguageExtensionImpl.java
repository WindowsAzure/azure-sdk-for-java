/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2020_02_15.implementation;

import com.microsoft.azure.management.kusto.v2020_02_15.LanguageExtension;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.kusto.v2020_02_15.LanguageExtensionName;

class LanguageExtensionImpl extends WrapperImpl<LanguageExtensionInner> implements LanguageExtension {
    private final KustoManager manager;
    LanguageExtensionImpl(LanguageExtensionInner inner, KustoManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public KustoManager manager() {
        return this.manager;
    }

    @Override
    public LanguageExtensionName languageExtensionName() {
        return this.inner().languageExtensionName();
    }

}
