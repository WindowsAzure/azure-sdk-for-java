/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2016_08_01.ProxyOnlyResource;

/**
 * Hybrid Connection contract. This is used to configure a Hybrid Connection.
 */
@JsonFlatten
public class HybridConnectionInner extends ProxyOnlyResource {
    /**
     * The name of the Service Bus namespace.
     */
    @JsonProperty(value = "properties.serviceBusNamespace")
    private String serviceBusNamespace;

    /**
     * The name of the Service Bus relay.
     */
    @JsonProperty(value = "properties.relayName")
    private String relayName;

    /**
     * The ARM URI to the Service Bus relay.
     */
    @JsonProperty(value = "properties.relayArmUri")
    private String relayArmUri;

    /**
     * The hostname of the endpoint.
     */
    @JsonProperty(value = "properties.hostname")
    private String hostname;

    /**
     * The port of the endpoint.
     */
    @JsonProperty(value = "properties.port")
    private Integer port;

    /**
     * The name of the Service Bus key which has Send permissions. This is used
     * to authenticate to Service Bus.
     */
    @JsonProperty(value = "properties.sendKeyName")
    private String sendKeyName;

    /**
     * The value of the Service Bus key. This is used to authenticate to
     * Service Bus. In ARM this key will not be returned
     * normally, use the POST /listKeys API instead.
     */
    @JsonProperty(value = "properties.sendKeyValue")
    private String sendKeyValue;

    /**
     * The suffix for the service bus endpoint. By default this is
     * .servicebus.windows.net.
     */
    @JsonProperty(value = "properties.serviceBusSuffix")
    private String serviceBusSuffix;

    /**
     * Get the name of the Service Bus namespace.
     *
     * @return the serviceBusNamespace value
     */
    public String serviceBusNamespace() {
        return this.serviceBusNamespace;
    }

    /**
     * Set the name of the Service Bus namespace.
     *
     * @param serviceBusNamespace the serviceBusNamespace value to set
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withServiceBusNamespace(String serviceBusNamespace) {
        this.serviceBusNamespace = serviceBusNamespace;
        return this;
    }

    /**
     * Get the name of the Service Bus relay.
     *
     * @return the relayName value
     */
    public String relayName() {
        return this.relayName;
    }

    /**
     * Set the name of the Service Bus relay.
     *
     * @param relayName the relayName value to set
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withRelayName(String relayName) {
        this.relayName = relayName;
        return this;
    }

    /**
     * Get the ARM URI to the Service Bus relay.
     *
     * @return the relayArmUri value
     */
    public String relayArmUri() {
        return this.relayArmUri;
    }

    /**
     * Set the ARM URI to the Service Bus relay.
     *
     * @param relayArmUri the relayArmUri value to set
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withRelayArmUri(String relayArmUri) {
        this.relayArmUri = relayArmUri;
        return this;
    }

    /**
     * Get the hostname of the endpoint.
     *
     * @return the hostname value
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname of the endpoint.
     *
     * @param hostname the hostname value to set
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the port of the endpoint.
     *
     * @return the port value
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port of the endpoint.
     *
     * @param port the port value to set
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the name of the Service Bus key which has Send permissions. This is used to authenticate to Service Bus.
     *
     * @return the sendKeyName value
     */
    public String sendKeyName() {
        return this.sendKeyName;
    }

    /**
     * Set the name of the Service Bus key which has Send permissions. This is used to authenticate to Service Bus.
     *
     * @param sendKeyName the sendKeyName value to set
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withSendKeyName(String sendKeyName) {
        this.sendKeyName = sendKeyName;
        return this;
    }

    /**
     * Get the value of the Service Bus key. This is used to authenticate to Service Bus. In ARM this key will not be returned
     normally, use the POST /listKeys API instead.
     *
     * @return the sendKeyValue value
     */
    public String sendKeyValue() {
        return this.sendKeyValue;
    }

    /**
     * Set the value of the Service Bus key. This is used to authenticate to Service Bus. In ARM this key will not be returned
     normally, use the POST /listKeys API instead.
     *
     * @param sendKeyValue the sendKeyValue value to set
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withSendKeyValue(String sendKeyValue) {
        this.sendKeyValue = sendKeyValue;
        return this;
    }

    /**
     * Get the suffix for the service bus endpoint. By default this is .servicebus.windows.net.
     *
     * @return the serviceBusSuffix value
     */
    public String serviceBusSuffix() {
        return this.serviceBusSuffix;
    }

    /**
     * Set the suffix for the service bus endpoint. By default this is .servicebus.windows.net.
     *
     * @param serviceBusSuffix the serviceBusSuffix value to set
     * @return the HybridConnectionInner object itself.
     */
    public HybridConnectionInner withServiceBusSuffix(String serviceBusSuffix) {
        this.serviceBusSuffix = serviceBusSuffix;
        return this;
    }

}
