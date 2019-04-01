/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The system generated resource properties associated with SQL databases and
 * SQL containers.
 */
public class ExtendedResourceProperties {
    /**
     * A system generated property. A unique identifier.
     */
    @JsonProperty(value = "_rid")
    private String _rid;

    /**
     * A system generated property that denotes the last updated timestamp of
     * the resource.
     */
    @JsonProperty(value = "_ts")
    private Object _ts;

    /**
     * A system generated property. It is the unique addressable URI for the
     * resource.
     */
    @JsonProperty(value = "_self")
    private String _self;

    /**
     * A system generated property representing the resource etag required for
     * optimistic concurrency control.
     */
    @JsonProperty(value = "_etag")
    private String _etag;

    /**
     * Get a system generated property. A unique identifier.
     *
     * @return the _rid value
     */
    public String _rid() {
        return this._rid;
    }

    /**
     * Set a system generated property. A unique identifier.
     *
     * @param _rid the _rid value to set
     * @return the ExtendedResourceProperties object itself.
     */
    public ExtendedResourceProperties with_rid(String _rid) {
        this._rid = _rid;
        return this;
    }

    /**
     * Get a system generated property that denotes the last updated timestamp of the resource.
     *
     * @return the _ts value
     */
    public Object _ts() {
        return this._ts;
    }

    /**
     * Set a system generated property that denotes the last updated timestamp of the resource.
     *
     * @param _ts the _ts value to set
     * @return the ExtendedResourceProperties object itself.
     */
    public ExtendedResourceProperties with_ts(Object _ts) {
        this._ts = _ts;
        return this;
    }

    /**
     * Get a system generated property. It is the unique addressable URI for the resource.
     *
     * @return the _self value
     */
    public String _self() {
        return this._self;
    }

    /**
     * Set a system generated property. It is the unique addressable URI for the resource.
     *
     * @param _self the _self value to set
     * @return the ExtendedResourceProperties object itself.
     */
    public ExtendedResourceProperties with_self(String _self) {
        this._self = _self;
        return this;
    }

    /**
     * Get a system generated property representing the resource etag required for optimistic concurrency control.
     *
     * @return the _etag value
     */
    public String _etag() {
        return this._etag;
    }

    /**
     * Set a system generated property representing the resource etag required for optimistic concurrency control.
     *
     * @param _etag the _etag value to set
     * @return the ExtendedResourceProperties object itself.
     */
    public ExtendedResourceProperties with_etag(String _etag) {
        this._etag = _etag;
        return this;
    }

}
