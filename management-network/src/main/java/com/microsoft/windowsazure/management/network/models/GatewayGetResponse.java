/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.network.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.net.InetAddress;

/**
* A standard service response including an HTTP status code and request ID.
*/
public class GatewayGetResponse extends OperationResponse {
    private GatewayDefaultSite defaultSite;
    
    /**
    * Optional. The default site on the gateway.
    * @return The DefaultSite value.
    */
    public GatewayDefaultSite getDefaultSite() {
        return this.defaultSite;
    }
    
    /**
    * Optional. The default site on the gateway.
    * @param defaultSiteValue The DefaultSite value.
    */
    public void setDefaultSite(final GatewayDefaultSite defaultSiteValue) {
        this.defaultSite = defaultSiteValue;
    }
    
    private GatewaySKU gatewaySKU;
    
    /**
    * Optional. The SKU for this virtual network gateway.
    * @return The GatewaySKU value.
    */
    public GatewaySKU getGatewaySKU() {
        return this.gatewaySKU;
    }
    
    /**
    * Optional. The SKU for this virtual network gateway.
    * @param gatewaySKUValue The GatewaySKU value.
    */
    public void setGatewaySKU(final GatewaySKU gatewaySKUValue) {
        this.gatewaySKU = gatewaySKUValue;
    }
    
    private GatewayType gatewayType;
    
    /**
    * Optional. The type of gateway routing used for this virtual network.
    * @return The GatewayType value.
    */
    public GatewayType getGatewayType() {
        return this.gatewayType;
    }
    
    /**
    * Optional. The type of gateway routing used for this virtual network.
    * @param gatewayTypeValue The GatewayType value.
    */
    public void setGatewayType(final GatewayType gatewayTypeValue) {
        this.gatewayType = gatewayTypeValue;
    }
    
    private GatewayEvent lastEvent;
    
    /**
    * Optional. The last recorded event for this virtual network gateway.
    * @return The LastEvent value.
    */
    public GatewayEvent getLastEvent() {
        return this.lastEvent;
    }
    
    /**
    * Optional. The last recorded event for this virtual network gateway.
    * @param lastEventValue The LastEvent value.
    */
    public void setLastEvent(final GatewayEvent lastEventValue) {
        this.lastEvent = lastEventValue;
    }
    
    private String state;
    
    /**
    * Optional. The provisioning state of the virtual network gateway.
    * @return The State value.
    */
    public String getState() {
        return this.state;
    }
    
    /**
    * Optional. The provisioning state of the virtual network gateway.
    * @param stateValue The State value.
    */
    public void setState(final String stateValue) {
        this.state = stateValue;
    }
    
    private InetAddress vipAddress;
    
    /**
    * Optional. The virtual IP address for this virtual network gateway.
    * @return The VipAddress value.
    */
    public InetAddress getVipAddress() {
        return this.vipAddress;
    }
    
    /**
    * Optional. The virtual IP address for this virtual network gateway.
    * @param vipAddressValue The VipAddress value.
    */
    public void setVipAddress(final InetAddress vipAddressValue) {
        this.vipAddress = vipAddressValue;
    }
}
