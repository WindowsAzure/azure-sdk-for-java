// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Operations discovery class. */
@Fluent
public final class OperationsDiscovery {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationsDiscovery.class);

    /*
     * Gets or sets Name of the API.
     * The name of the operation being performed on this particular object. It
     * should
     * match the action name that appears in RBAC / the event service.
     * Examples of operations include:
     * * Microsoft.Compute/virtualMachine/capture/action
     * * Microsoft.Compute/virtualMachine/restart/action
     * * Microsoft.Compute/virtualMachine/write
     * * Microsoft.Compute/virtualMachine/read
     * * Microsoft.Compute/virtualMachine/delete
     * Each action should include, in order:
     * (1) Resource Provider Namespace
     * (2) Type hierarchy for which the action applies (e.g. server/databases
     * for a SQL
     * Azure database)
     * (3) Read, Write, Action or Delete indicating which type applies. If it
     * is a PUT/PATCH
     * on a collection or named value, Write should be used.
     * If it is a GET, Read should be used. If it is a DELETE, Delete should be
     * used. If it
     * is a POST, Action should be used.
     * As a note: all resource providers would need to include the "{Resource
     * Provider
     * Namespace}/register/action" operation in their response.
     * This API is used to register for their service, and should include
     * details about the
     * operation (e.g. a localized name for the resource provider + any special
     * considerations like PII release).
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Indicates whether the operation is a data action
     */
    @JsonProperty(value = "isDataAction")
    private Boolean isDataAction;

    /*
     * Contains the localized display information for this particular operation
     * / action. These
     * value will be used by several clients for
     * (1) custom role definitions for RBAC;
     * (2) complex query filters for the event service; and
     * (3) audit history / records for management operations.
     */
    @JsonProperty(value = "display")
    private Display display;

    /*
     * Gets or sets Origin.
     * The intended executor of the operation; governs the display of the
     * operation in the
     * RBAC UX and the audit logs UX.
     * Default value is "user,system".
     */
    @JsonProperty(value = "origin")
    private String origin;

    /*
     * Any object
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /**
     * Get the name property: Gets or sets Name of the API. The name of the operation being performed on this particular
     * object. It should match the action name that appears in RBAC / the event service. Examples of operations include:
     * * Microsoft.Compute/virtualMachine/capture/action * Microsoft.Compute/virtualMachine/restart/action *
     * Microsoft.Compute/virtualMachine/write * Microsoft.Compute/virtualMachine/read *
     * Microsoft.Compute/virtualMachine/delete Each action should include, in order: (1) Resource Provider Namespace (2)
     * Type hierarchy for which the action applies (e.g. server/databases for a SQL Azure database) (3) Read, Write,
     * Action or Delete indicating which type applies. If it is a PUT/PATCH on a collection or named value, Write should
     * be used. If it is a GET, Read should be used. If it is a DELETE, Delete should be used. If it is a POST, Action
     * should be used. As a note: all resource providers would need to include the "{Resource Provider
     * Namespace}/register/action" operation in their response. This API is used to register for their service, and
     * should include details about the operation (e.g. a localized name for the resource provider + any special
     * considerations like PII release).
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets or sets Name of the API. The name of the operation being performed on this particular
     * object. It should match the action name that appears in RBAC / the event service. Examples of operations include:
     * * Microsoft.Compute/virtualMachine/capture/action * Microsoft.Compute/virtualMachine/restart/action *
     * Microsoft.Compute/virtualMachine/write * Microsoft.Compute/virtualMachine/read *
     * Microsoft.Compute/virtualMachine/delete Each action should include, in order: (1) Resource Provider Namespace (2)
     * Type hierarchy for which the action applies (e.g. server/databases for a SQL Azure database) (3) Read, Write,
     * Action or Delete indicating which type applies. If it is a PUT/PATCH on a collection or named value, Write should
     * be used. If it is a GET, Read should be used. If it is a DELETE, Delete should be used. If it is a POST, Action
     * should be used. As a note: all resource providers would need to include the "{Resource Provider
     * Namespace}/register/action" operation in their response. This API is used to register for their service, and
     * should include details about the operation (e.g. a localized name for the resource provider + any special
     * considerations like PII release).
     *
     * @param name the name value to set.
     * @return the OperationsDiscovery object itself.
     */
    public OperationsDiscovery withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the isDataAction property: Indicates whether the operation is a data action.
     *
     * @return the isDataAction value.
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Set the isDataAction property: Indicates whether the operation is a data action.
     *
     * @param isDataAction the isDataAction value to set.
     * @return the OperationsDiscovery object itself.
     */
    public OperationsDiscovery withIsDataAction(Boolean isDataAction) {
        this.isDataAction = isDataAction;
        return this;
    }

    /**
     * Get the display property: Contains the localized display information for this particular operation / action.
     * These value will be used by several clients for (1) custom role definitions for RBAC; (2) complex query filters
     * for the event service; and (3) audit history / records for management operations.
     *
     * @return the display value.
     */
    public Display display() {
        return this.display;
    }

    /**
     * Set the display property: Contains the localized display information for this particular operation / action.
     * These value will be used by several clients for (1) custom role definitions for RBAC; (2) complex query filters
     * for the event service; and (3) audit history / records for management operations.
     *
     * @param display the display value to set.
     * @return the OperationsDiscovery object itself.
     */
    public OperationsDiscovery withDisplay(Display display) {
        this.display = display;
        return this;
    }

    /**
     * Get the origin property: Gets or sets Origin. The intended executor of the operation; governs the display of the
     * operation in the RBAC UX and the audit logs UX. Default value is "user,system".
     *
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin property: Gets or sets Origin. The intended executor of the operation; governs the display of the
     * operation in the RBAC UX and the audit logs UX. Default value is "user,system".
     *
     * @param origin the origin value to set.
     * @return the OperationsDiscovery object itself.
     */
    public OperationsDiscovery withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the properties property: Any object.
     *
     * @return the properties value.
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Any object.
     *
     * @param properties the properties value to set.
     * @return the OperationsDiscovery object itself.
     */
    public OperationsDiscovery withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
    }
}
