// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Windows Java Container settings. */
@Immutable
public final class WindowsJavaContainerSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WindowsJavaContainerSettings.class);

    /*
     * Java container (runtime only).
     */
    @JsonProperty(value = "javaContainer", access = JsonProperty.Access.WRITE_ONLY)
    private String javaContainer;

    /*
     * Java container version (runtime only).
     */
    @JsonProperty(value = "javaContainerVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String javaContainerVersion;

    /*
     * <code>true</code> if the stack is in preview; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "isPreview", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isPreview;

    /*
     * <code>true</code> if the stack is deprecated; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "isDeprecated", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDeprecated;

    /*
     * <code>true</code> if the stack should be hidden; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "isHidden", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isHidden;

    /*
     * End-of-life date for the minor version.
     */
    @JsonProperty(value = "endOfLifeDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endOfLifeDate;

    /*
     * <code>true</code> if the stack version is auto-updated; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "isAutoUpdate", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isAutoUpdate;

    /*
     * <code>true</code> if the minor version is early-access; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "isEarlyAccess", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isEarlyAccess;

    /**
     * Get the javaContainer property: Java container (runtime only).
     *
     * @return the javaContainer value.
     */
    public String javaContainer() {
        return this.javaContainer;
    }

    /**
     * Get the javaContainerVersion property: Java container version (runtime only).
     *
     * @return the javaContainerVersion value.
     */
    public String javaContainerVersion() {
        return this.javaContainerVersion;
    }

    /**
     * Get the isPreview property: &lt;code&gt;true&lt;/code&gt; if the stack is in preview; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isPreview value.
     */
    public Boolean isPreview() {
        return this.isPreview;
    }

    /**
     * Get the isDeprecated property: &lt;code&gt;true&lt;/code&gt; if the stack is deprecated; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isDeprecated value.
     */
    public Boolean isDeprecated() {
        return this.isDeprecated;
    }

    /**
     * Get the isHidden property: &lt;code&gt;true&lt;/code&gt; if the stack should be hidden; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isHidden value.
     */
    public Boolean isHidden() {
        return this.isHidden;
    }

    /**
     * Get the endOfLifeDate property: End-of-life date for the minor version.
     *
     * @return the endOfLifeDate value.
     */
    public OffsetDateTime endOfLifeDate() {
        return this.endOfLifeDate;
    }

    /**
     * Get the isAutoUpdate property: &lt;code&gt;true&lt;/code&gt; if the stack version is auto-updated; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isAutoUpdate value.
     */
    public Boolean isAutoUpdate() {
        return this.isAutoUpdate;
    }

    /**
     * Get the isEarlyAccess property: &lt;code&gt;true&lt;/code&gt; if the minor version is early-access; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isEarlyAccess value.
     */
    public Boolean isEarlyAccess() {
        return this.isEarlyAccess;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
