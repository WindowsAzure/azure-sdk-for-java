/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.implementation;

import java.util.List;
import com.microsoft.azure.management.cdn.QueryStringCachingBehavior;
import com.microsoft.azure.management.cdn.OptimizationType;
import com.microsoft.azure.management.cdn.GeoFilter;
import com.microsoft.azure.management.cdn.EndpointPropertiesUpdateParametersDeliveryPolicy;
import com.microsoft.azure.management.cdn.DeepCreatedOrigin;
import com.microsoft.azure.management.cdn.EndpointResourceState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * CDN endpoint is the entity within a CDN profile containing configuration
 * information such as origin, protocol, content caching and delivery behavior.
 * The CDN endpoint uses the URL format &lt;endpointname&gt;.azureedge.net.
 */
@JsonFlatten
public class EndpointInner extends Resource {
    /**
     * The host header value sent to the origin with each request. If you leave
     * this blank, the request hostname determines this value. Azure CDN
     * origins, such as Web Apps, Blob Storage, and Cloud Services require this
     * host header value to match the origin hostname by default.
     */
    @JsonProperty(value = "properties.originHostHeader")
    private String originHostHeader;

    /**
     * A directory path on the origin that CDN can use to retrieve content
     * from, e.g. contoso.cloudapp.net/originpath.
     */
    @JsonProperty(value = "properties.originPath")
    private String originPath;

    /**
     * List of content types on which compression applies. The value should be
     * a valid MIME type.
     */
    @JsonProperty(value = "properties.contentTypesToCompress")
    private List<String> contentTypesToCompress;

    /**
     * Indicates whether content compression is enabled on CDN. Default value
     * is false. If compression is enabled, content will be served as
     * compressed if user requests for a compressed version. Content won't be
     * compressed on CDN when requested content is smaller than 1 byte or
     * larger than 1 MB.
     */
    @JsonProperty(value = "properties.isCompressionEnabled")
    private Boolean isCompressionEnabled;

    /**
     * Indicates whether HTTP traffic is allowed on the endpoint. Default value
     * is true. At least one protocol (HTTP or HTTPS) must be allowed.
     */
    @JsonProperty(value = "properties.isHttpAllowed")
    private Boolean isHttpAllowed;

    /**
     * Indicates whether HTTPS traffic is allowed on the endpoint. Default
     * value is true. At least one protocol (HTTP or HTTPS) must be allowed.
     */
    @JsonProperty(value = "properties.isHttpsAllowed")
    private Boolean isHttpsAllowed;

    /**
     * Defines how CDN caches requests that include query strings. You can
     * ignore any query strings when caching, bypass caching to prevent
     * requests that contain query strings from being cached, or cache every
     * request with a unique URL. Possible values include: 'IgnoreQueryString',
     * 'BypassCaching', 'UseQueryString', 'NotSet'.
     */
    @JsonProperty(value = "properties.queryStringCachingBehavior")
    private QueryStringCachingBehavior queryStringCachingBehavior;

    /**
     * Specifies what scenario the customer wants this CDN endpoint to optimize
     * for, e.g. Download, Media services. With this information, CDN can apply
     * scenario driven optimization. Possible values include:
     * 'GeneralWebDelivery', 'GeneralMediaStreaming',
     * 'VideoOnDemandMediaStreaming', 'LargeFileDownload',
     * 'DynamicSiteAcceleration'.
     */
    @JsonProperty(value = "properties.optimizationType")
    private OptimizationType optimizationType;

    /**
     * Path to a file hosted on the origin which helps accelerate delivery of
     * the dynamic content and calculate the most optimal routes for the CDN.
     * This is relative to the origin path.
     */
    @JsonProperty(value = "properties.probePath")
    private String probePath;

    /**
     * List of rules defining the user's geo access within a CDN endpoint. Each
     * geo filter defines an access rule to a specified path or content, e.g.
     * block APAC for path /pictures/.
     */
    @JsonProperty(value = "properties.geoFilters")
    private List<GeoFilter> geoFilters;

    /**
     * A policy that specifies the delivery rules to be used for an endpoint.
     */
    @JsonProperty(value = "properties.deliveryPolicy")
    private EndpointPropertiesUpdateParametersDeliveryPolicy deliveryPolicy;

    /**
     * The host name of the endpoint structured as {endpointName}.{DNSZone},
     * e.g. consoto.azureedge.net.
     */
    @JsonProperty(value = "properties.hostName", access = JsonProperty.Access.WRITE_ONLY)
    private String hostName;

    /**
     * The source of the content being delivered via CDN.
     */
    @JsonProperty(value = "properties.origins", required = true)
    private List<DeepCreatedOrigin> origins;

    /**
     * Resource status of the endpoint. Possible values include: 'Creating',
     * 'Deleting', 'Running', 'Starting', 'Stopped', 'Stopping'.
     */
    @JsonProperty(value = "properties.resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private EndpointResourceState resourceState;

    /**
     * Provisioning status of the endpoint.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the host header value sent to the origin with each request. If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin hostname by default.
     *
     * @return the originHostHeader value
     */
    public String originHostHeader() {
        return this.originHostHeader;
    }

    /**
     * Set the host header value sent to the origin with each request. If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin hostname by default.
     *
     * @param originHostHeader the originHostHeader value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withOriginHostHeader(String originHostHeader) {
        this.originHostHeader = originHostHeader;
        return this;
    }

    /**
     * Get a directory path on the origin that CDN can use to retrieve content from, e.g. contoso.cloudapp.net/originpath.
     *
     * @return the originPath value
     */
    public String originPath() {
        return this.originPath;
    }

    /**
     * Set a directory path on the origin that CDN can use to retrieve content from, e.g. contoso.cloudapp.net/originpath.
     *
     * @param originPath the originPath value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withOriginPath(String originPath) {
        this.originPath = originPath;
        return this;
    }

    /**
     * Get list of content types on which compression applies. The value should be a valid MIME type.
     *
     * @return the contentTypesToCompress value
     */
    public List<String> contentTypesToCompress() {
        return this.contentTypesToCompress;
    }

    /**
     * Set list of content types on which compression applies. The value should be a valid MIME type.
     *
     * @param contentTypesToCompress the contentTypesToCompress value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withContentTypesToCompress(List<String> contentTypesToCompress) {
        this.contentTypesToCompress = contentTypesToCompress;
        return this;
    }

    /**
     * Get indicates whether content compression is enabled on CDN. Default value is false. If compression is enabled, content will be served as compressed if user requests for a compressed version. Content won't be compressed on CDN when requested content is smaller than 1 byte or larger than 1 MB.
     *
     * @return the isCompressionEnabled value
     */
    public Boolean isCompressionEnabled() {
        return this.isCompressionEnabled;
    }

    /**
     * Set indicates whether content compression is enabled on CDN. Default value is false. If compression is enabled, content will be served as compressed if user requests for a compressed version. Content won't be compressed on CDN when requested content is smaller than 1 byte or larger than 1 MB.
     *
     * @param isCompressionEnabled the isCompressionEnabled value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withIsCompressionEnabled(Boolean isCompressionEnabled) {
        this.isCompressionEnabled = isCompressionEnabled;
        return this;
    }

    /**
     * Get indicates whether HTTP traffic is allowed on the endpoint. Default value is true. At least one protocol (HTTP or HTTPS) must be allowed.
     *
     * @return the isHttpAllowed value
     */
    public Boolean isHttpAllowed() {
        return this.isHttpAllowed;
    }

    /**
     * Set indicates whether HTTP traffic is allowed on the endpoint. Default value is true. At least one protocol (HTTP or HTTPS) must be allowed.
     *
     * @param isHttpAllowed the isHttpAllowed value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withIsHttpAllowed(Boolean isHttpAllowed) {
        this.isHttpAllowed = isHttpAllowed;
        return this;
    }

    /**
     * Get indicates whether HTTPS traffic is allowed on the endpoint. Default value is true. At least one protocol (HTTP or HTTPS) must be allowed.
     *
     * @return the isHttpsAllowed value
     */
    public Boolean isHttpsAllowed() {
        return this.isHttpsAllowed;
    }

    /**
     * Set indicates whether HTTPS traffic is allowed on the endpoint. Default value is true. At least one protocol (HTTP or HTTPS) must be allowed.
     *
     * @param isHttpsAllowed the isHttpsAllowed value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withIsHttpsAllowed(Boolean isHttpsAllowed) {
        this.isHttpsAllowed = isHttpsAllowed;
        return this;
    }

    /**
     * Get defines how CDN caches requests that include query strings. You can ignore any query strings when caching, bypass caching to prevent requests that contain query strings from being cached, or cache every request with a unique URL. Possible values include: 'IgnoreQueryString', 'BypassCaching', 'UseQueryString', 'NotSet'.
     *
     * @return the queryStringCachingBehavior value
     */
    public QueryStringCachingBehavior queryStringCachingBehavior() {
        return this.queryStringCachingBehavior;
    }

    /**
     * Set defines how CDN caches requests that include query strings. You can ignore any query strings when caching, bypass caching to prevent requests that contain query strings from being cached, or cache every request with a unique URL. Possible values include: 'IgnoreQueryString', 'BypassCaching', 'UseQueryString', 'NotSet'.
     *
     * @param queryStringCachingBehavior the queryStringCachingBehavior value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withQueryStringCachingBehavior(QueryStringCachingBehavior queryStringCachingBehavior) {
        this.queryStringCachingBehavior = queryStringCachingBehavior;
        return this;
    }

    /**
     * Get specifies what scenario the customer wants this CDN endpoint to optimize for, e.g. Download, Media services. With this information, CDN can apply scenario driven optimization. Possible values include: 'GeneralWebDelivery', 'GeneralMediaStreaming', 'VideoOnDemandMediaStreaming', 'LargeFileDownload', 'DynamicSiteAcceleration'.
     *
     * @return the optimizationType value
     */
    public OptimizationType optimizationType() {
        return this.optimizationType;
    }

    /**
     * Set specifies what scenario the customer wants this CDN endpoint to optimize for, e.g. Download, Media services. With this information, CDN can apply scenario driven optimization. Possible values include: 'GeneralWebDelivery', 'GeneralMediaStreaming', 'VideoOnDemandMediaStreaming', 'LargeFileDownload', 'DynamicSiteAcceleration'.
     *
     * @param optimizationType the optimizationType value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withOptimizationType(OptimizationType optimizationType) {
        this.optimizationType = optimizationType;
        return this;
    }

    /**
     * Get path to a file hosted on the origin which helps accelerate delivery of the dynamic content and calculate the most optimal routes for the CDN. This is relative to the origin path.
     *
     * @return the probePath value
     */
    public String probePath() {
        return this.probePath;
    }

    /**
     * Set path to a file hosted on the origin which helps accelerate delivery of the dynamic content and calculate the most optimal routes for the CDN. This is relative to the origin path.
     *
     * @param probePath the probePath value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withProbePath(String probePath) {
        this.probePath = probePath;
        return this;
    }

    /**
     * Get list of rules defining the user's geo access within a CDN endpoint. Each geo filter defines an access rule to a specified path or content, e.g. block APAC for path /pictures/.
     *
     * @return the geoFilters value
     */
    public List<GeoFilter> geoFilters() {
        return this.geoFilters;
    }

    /**
     * Set list of rules defining the user's geo access within a CDN endpoint. Each geo filter defines an access rule to a specified path or content, e.g. block APAC for path /pictures/.
     *
     * @param geoFilters the geoFilters value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withGeoFilters(List<GeoFilter> geoFilters) {
        this.geoFilters = geoFilters;
        return this;
    }

    /**
     * Get a policy that specifies the delivery rules to be used for an endpoint.
     *
     * @return the deliveryPolicy value
     */
    public EndpointPropertiesUpdateParametersDeliveryPolicy deliveryPolicy() {
        return this.deliveryPolicy;
    }

    /**
     * Set a policy that specifies the delivery rules to be used for an endpoint.
     *
     * @param deliveryPolicy the deliveryPolicy value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withDeliveryPolicy(EndpointPropertiesUpdateParametersDeliveryPolicy deliveryPolicy) {
        this.deliveryPolicy = deliveryPolicy;
        return this;
    }

    /**
     * Get the host name of the endpoint structured as {endpointName}.{DNSZone}, e.g. consoto.azureedge.net.
     *
     * @return the hostName value
     */
    public String hostName() {
        return this.hostName;
    }

    /**
     * Get the source of the content being delivered via CDN.
     *
     * @return the origins value
     */
    public List<DeepCreatedOrigin> origins() {
        return this.origins;
    }

    /**
     * Set the source of the content being delivered via CDN.
     *
     * @param origins the origins value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withOrigins(List<DeepCreatedOrigin> origins) {
        this.origins = origins;
        return this;
    }

    /**
     * Get resource status of the endpoint. Possible values include: 'Creating', 'Deleting', 'Running', 'Starting', 'Stopped', 'Stopping'.
     *
     * @return the resourceState value
     */
    public EndpointResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get provisioning status of the endpoint.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

}
