/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appconfiguration.v2020_06_01.implementation;

import com.microsoft.azure.management.appconfiguration.v2020_06_01.KeyValue;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import org.joda.time.DateTime;
import java.util.Map;

class KeyValueImpl extends WrapperImpl<KeyValueInner> implements KeyValue {
    private final AppConfigurationManager manager;
    KeyValueImpl(KeyValueInner inner, AppConfigurationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppConfigurationManager manager() {
        return this.manager;
    }

    @Override
    public String contentType() {
        return this.inner().contentType();
    }

    @Override
    public String eTag() {
        return this.inner().eTag();
    }

    @Override
    public String keyVal() {
        return this.inner().key();
    }

    @Override
    public String label() {
        return this.inner().label();
    }

    @Override
    public DateTime lastModified() {
        return this.inner().lastModified();
    }

    @Override
    public Boolean locked() {
        return this.inner().locked();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().tags();
    }

    @Override
    public String value() {
        return this.inner().value();
    }

}
