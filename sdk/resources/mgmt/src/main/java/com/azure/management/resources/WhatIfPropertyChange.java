// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The WhatIfPropertyChange model. */
@Fluent
public final class WhatIfPropertyChange {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WhatIfPropertyChange.class);

    /*
     * The path of the property.
     */
    @JsonProperty(value = "path", required = true)
    private String path;

    /*
     * The type of property change.
     */
    @JsonProperty(value = "propertyChangeType", required = true)
    private PropertyChangeType propertyChangeType;

    /*
     * The value of the property before the deployment is executed.
     */
    @JsonProperty(value = "before")
    private Object before;

    /*
     * The value of the property after the deployment is executed.
     */
    @JsonProperty(value = "after")
    private Object after;

    /*
     * Nested property changes.
     */
    @JsonProperty(value = "children")
    private List<WhatIfPropertyChange> children;

    /**
     * Get the path property: The path of the property.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: The path of the property.
     *
     * @param path the path value to set.
     * @return the WhatIfPropertyChange object itself.
     */
    public WhatIfPropertyChange withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the propertyChangeType property: The type of property change.
     *
     * @return the propertyChangeType value.
     */
    public PropertyChangeType propertyChangeType() {
        return this.propertyChangeType;
    }

    /**
     * Set the propertyChangeType property: The type of property change.
     *
     * @param propertyChangeType the propertyChangeType value to set.
     * @return the WhatIfPropertyChange object itself.
     */
    public WhatIfPropertyChange withPropertyChangeType(PropertyChangeType propertyChangeType) {
        this.propertyChangeType = propertyChangeType;
        return this;
    }

    /**
     * Get the before property: The value of the property before the deployment is executed.
     *
     * @return the before value.
     */
    public Object before() {
        return this.before;
    }

    /**
     * Set the before property: The value of the property before the deployment is executed.
     *
     * @param before the before value to set.
     * @return the WhatIfPropertyChange object itself.
     */
    public WhatIfPropertyChange withBefore(Object before) {
        this.before = before;
        return this;
    }

    /**
     * Get the after property: The value of the property after the deployment is executed.
     *
     * @return the after value.
     */
    public Object after() {
        return this.after;
    }

    /**
     * Set the after property: The value of the property after the deployment is executed.
     *
     * @param after the after value to set.
     * @return the WhatIfPropertyChange object itself.
     */
    public WhatIfPropertyChange withAfter(Object after) {
        this.after = after;
        return this;
    }

    /**
     * Get the children property: Nested property changes.
     *
     * @return the children value.
     */
    public List<WhatIfPropertyChange> children() {
        return this.children;
    }

    /**
     * Set the children property: Nested property changes.
     *
     * @param children the children value to set.
     * @return the WhatIfPropertyChange object itself.
     */
    public WhatIfPropertyChange withChildren(List<WhatIfPropertyChange> children) {
        this.children = children;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (path() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property path in model WhatIfPropertyChange"));
        }
        if (propertyChangeType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property propertyChangeType in model WhatIfPropertyChange"));
        }
        if (children() != null) {
            children().forEach(e -> e.validate());
        }
    }
}
