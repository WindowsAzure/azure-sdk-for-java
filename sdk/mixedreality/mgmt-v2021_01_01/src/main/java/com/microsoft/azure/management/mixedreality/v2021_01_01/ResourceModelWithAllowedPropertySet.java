/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mixedreality.v2021_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.Resource;

/**
 * The resource model definition containing the full set of allowed properties
 * for a resource. Except properties bag, there cannot be a top level property
 * outside of this set.
 */
public class ResourceModelWithAllowedPropertySet extends Resource {
    /**
     * The fully qualified resource ID of the resource that manages this
     * resource. Indicates if this resource is managed by another Azure
     * resource. If this is present, complete mode deployment will not delete
     * the resource if it is removed from the template since it is managed by
     * another resource.
     */
    @JsonProperty(value = "managedBy")
    private String managedBy;

    /**
     * Metadata used by portal/tooling/etc to render different UX experiences
     * for resources of the same type; e.g. ApiApps are a kind of
     * Microsoft.Web/sites type.  If supported, the resource provider must
     * validate and persist this value.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * The etag field is *not* required. If it is provided in the response
     * body, it must also be provided as a header per the normal etag
     * convention.  Entity tags are used for comparing two or more entities
     * from the same requested resource. HTTP/1.1 uses entity tags in the etag
     * (section 14.19), If-Match (section 14.24), If-None-Match (section
     * 14.26), and If-Range (section 14.27) header fields.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * The identity property.
     */
    @JsonProperty(value = "identity")
    private ResourceModelWithAllowedPropertySetIdentity identity;

    /**
     * The sku property.
     */
    @JsonProperty(value = "sku")
    private ResourceModelWithAllowedPropertySetSku sku;

    /**
     * The plan property.
     */
    @JsonProperty(value = "plan")
    private ResourceModelWithAllowedPropertySetPlan plan;

    /**
     * Get the fully qualified resource ID of the resource that manages this resource. Indicates if this resource is managed by another Azure resource. If this is present, complete mode deployment will not delete the resource if it is removed from the template since it is managed by another resource.
     *
     * @return the managedBy value
     */
    public String managedBy() {
        return this.managedBy;
    }

    /**
     * Set the fully qualified resource ID of the resource that manages this resource. Indicates if this resource is managed by another Azure resource. If this is present, complete mode deployment will not delete the resource if it is removed from the template since it is managed by another resource.
     *
     * @param managedBy the managedBy value to set
     * @return the ResourceModelWithAllowedPropertySet object itself.
     */
    public ResourceModelWithAllowedPropertySet withManagedBy(String managedBy) {
        this.managedBy = managedBy;
        return this;
    }

    /**
     * Get metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     *
     * @param kind the kind value to set
     * @return the ResourceModelWithAllowedPropertySet object itself.
     */
    public ResourceModelWithAllowedPropertySet withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the etag field is *not* required. If it is provided in the response body, it must also be provided as a header per the normal etag convention.  Entity tags are used for comparing two or more entities from the same requested resource. HTTP/1.1 uses entity tags in the etag (section 14.19), If-Match (section 14.24), If-None-Match (section 14.26), and If-Range (section 14.27) header fields.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the identity value.
     *
     * @return the identity value
     */
    public ResourceModelWithAllowedPropertySetIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity value.
     *
     * @param identity the identity value to set
     * @return the ResourceModelWithAllowedPropertySet object itself.
     */
    public ResourceModelWithAllowedPropertySet withIdentity(ResourceModelWithAllowedPropertySetIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public ResourceModelWithAllowedPropertySetSku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the ResourceModelWithAllowedPropertySet object itself.
     */
    public ResourceModelWithAllowedPropertySet withSku(ResourceModelWithAllowedPropertySetSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the plan value.
     *
     * @return the plan value
     */
    public ResourceModelWithAllowedPropertySetPlan plan() {
        return this.plan;
    }

    /**
     * Set the plan value.
     *
     * @param plan the plan value to set
     * @return the ResourceModelWithAllowedPropertySet object itself.
     */
    public ResourceModelWithAllowedPropertySet withPlan(ResourceModelWithAllowedPropertySetPlan plan) {
        this.plan = plan;
        return this;
    }

}
