/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestack.v2017_06_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Registration information.
 */
@JsonFlatten
public class RegistrationInner extends Resource {
    /**
     * The object identifier associated with the Azure Stack connecting to
     * Azure.
     */
    @JsonProperty(value = "properties.objectId")
    private String objectId;

    /**
     * The identifier of the registered Azure Stack.
     */
    @JsonProperty(value = "properties.cloudId")
    private String cloudId;

    /**
     * Specifies the billing mode for the Azure Stack registration.
     */
    @JsonProperty(value = "properties.billingModel")
    private String billingModel;

    /**
     * The entity tag used for optimistic concurrency when modifying the
     * resource.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the object identifier associated with the Azure Stack connecting to Azure.
     *
     * @return the objectId value
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Set the object identifier associated with the Azure Stack connecting to Azure.
     *
     * @param objectId the objectId value to set
     * @return the RegistrationInner object itself.
     */
    public RegistrationInner withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * Get the identifier of the registered Azure Stack.
     *
     * @return the cloudId value
     */
    public String cloudId() {
        return this.cloudId;
    }

    /**
     * Set the identifier of the registered Azure Stack.
     *
     * @param cloudId the cloudId value to set
     * @return the RegistrationInner object itself.
     */
    public RegistrationInner withCloudId(String cloudId) {
        this.cloudId = cloudId;
        return this;
    }

    /**
     * Get specifies the billing mode for the Azure Stack registration.
     *
     * @return the billingModel value
     */
    public String billingModel() {
        return this.billingModel;
    }

    /**
     * Set specifies the billing mode for the Azure Stack registration.
     *
     * @param billingModel the billingModel value to set
     * @return the RegistrationInner object itself.
     */
    public RegistrationInner withBillingModel(String billingModel) {
        this.billingModel = billingModel;
        return this;
    }

    /**
     * Get the entity tag used for optimistic concurrency when modifying the resource.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the entity tag used for optimistic concurrency when modifying the resource.
     *
     * @param etag the etag value to set
     * @return the RegistrationInner object itself.
     */
    public RegistrationInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
