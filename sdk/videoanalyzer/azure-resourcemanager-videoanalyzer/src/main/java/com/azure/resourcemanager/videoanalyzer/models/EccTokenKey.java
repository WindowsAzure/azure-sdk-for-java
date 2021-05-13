// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Required validation properties for tokens generated with Elliptical Curve algorithm. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
@JsonTypeName("#Microsoft.VideoAnalyzer.EccTokenKey")
@Fluent
public final class EccTokenKey extends TokenKey {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EccTokenKey.class);

    /*
     * Elliptical curve algorithm to be used: ES256, ES384 or ES512.
     */
    @JsonProperty(value = "alg", required = true)
    private AccessPolicyEccAlgo alg;

    /*
     * X coordinate.
     */
    @JsonProperty(value = "x", required = true)
    private String x;

    /*
     * Y coordinate.
     */
    @JsonProperty(value = "y", required = true)
    private String y;

    /**
     * Get the alg property: Elliptical curve algorithm to be used: ES256, ES384 or ES512.
     *
     * @return the alg value.
     */
    public AccessPolicyEccAlgo alg() {
        return this.alg;
    }

    /**
     * Set the alg property: Elliptical curve algorithm to be used: ES256, ES384 or ES512.
     *
     * @param alg the alg value to set.
     * @return the EccTokenKey object itself.
     */
    public EccTokenKey withAlg(AccessPolicyEccAlgo alg) {
        this.alg = alg;
        return this;
    }

    /**
     * Get the x property: X coordinate.
     *
     * @return the x value.
     */
    public String x() {
        return this.x;
    }

    /**
     * Set the x property: X coordinate.
     *
     * @param x the x value to set.
     * @return the EccTokenKey object itself.
     */
    public EccTokenKey withX(String x) {
        this.x = x;
        return this;
    }

    /**
     * Get the y property: Y coordinate.
     *
     * @return the y value.
     */
    public String y() {
        return this.y;
    }

    /**
     * Set the y property: Y coordinate.
     *
     * @param y the y value to set.
     * @return the EccTokenKey object itself.
     */
    public EccTokenKey withY(String y) {
        this.y = y;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EccTokenKey withKid(String kid) {
        super.withKid(kid);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (alg() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property alg in model EccTokenKey"));
        }
        if (x() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property x in model EccTokenKey"));
        }
        if (y() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property y in model EccTokenKey"));
        }
    }
}
