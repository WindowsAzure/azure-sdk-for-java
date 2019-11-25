/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.management.logic.v2016_06_01.JsonSchema;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class JsonSchemaImpl extends WrapperImpl<JsonSchemaInner> implements JsonSchema {
    private final LogicManager manager;
    JsonSchemaImpl(JsonSchemaInner inner, LogicManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public String content() {
        return this.inner().content();
    }

    @Override
    public String title() {
        return this.inner().title();
    }

}
