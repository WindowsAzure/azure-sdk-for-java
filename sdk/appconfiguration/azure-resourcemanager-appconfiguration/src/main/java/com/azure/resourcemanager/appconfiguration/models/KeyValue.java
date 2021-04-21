// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.models;

import com.azure.resourcemanager.appconfiguration.fluent.models.KeyValueInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of KeyValue. */
public interface KeyValue {
    /**
     * Gets the key property: The primary identifier of a key-value. The key is used in unison with the label to
     * uniquely identify a key-value.
     *
     * @return the key value.
     */
    String key();

    /**
     * Gets the label property: A value used to group key-values. The label is used in unison with the key to uniquely
     * identify a key-value.
     *
     * @return the label value.
     */
    String label();

    /**
     * Gets the value property: The value of the key-value.
     *
     * @return the value value.
     */
    String value();

    /**
     * Gets the contentType property: The content type of the key-value's value. Providing a proper content-type can
     * enable transformations of values when they are retrieved by applications.
     *
     * @return the contentType value.
     */
    String contentType();

    /**
     * Gets the etag property: An ETag indicating the state of a key-value within a configuration store.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the lastModified property: The last time a modifying operation was performed on the given key-value.
     *
     * @return the lastModified value.
     */
    OffsetDateTime lastModified();

    /**
     * Gets the locked property: A value indicating whether the key-value is locked. A locked key-value may not be
     * modified until it is unlocked.
     *
     * @return the locked value.
     */
    Boolean locked();

    /**
     * Gets the tags property: A dictionary of tags that can help identify what a key-value may be applicable for.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the inner com.azure.resourcemanager.appconfiguration.fluent.models.KeyValueInner object.
     *
     * @return the inner object.
     */
    KeyValueInner innerModel();
}
