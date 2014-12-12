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

/**
* Parameters supplied to the Set Network Security Rule operation.
*/
public class NetworkSecuritySetRuleParameters {
    private String action;
    
    /**
    * Required. Gets or sets Action. Allow/Deny. Whether to allow or deny
    * traffic.
    * @return The Action value.
    */
    public String getAction() {
        return this.action;
    }
    
    /**
    * Required. Gets or sets Action. Allow/Deny. Whether to allow or deny
    * traffic.
    * @param actionValue The Action value.
    */
    public void setAction(final String actionValue) {
        this.action = actionValue;
    }
    
    private String destinationAddressPrefix;
    
    /**
    * Required. Gets or sets DestinationAddressPrefix. CIDR value of
    * Destination IP from which traffic is coming. You can specify star (*) to
    * map all traffic or one of pre-defined TAGs.
    * @return The DestinationAddressPrefix value.
    */
    public String getDestinationAddressPrefix() {
        return this.destinationAddressPrefix;
    }
    
    /**
    * Required. Gets or sets DestinationAddressPrefix. CIDR value of
    * Destination IP from which traffic is coming. You can specify star (*) to
    * map all traffic or one of pre-defined TAGs.
    * @param destinationAddressPrefixValue The DestinationAddressPrefix value.
    */
    public void setDestinationAddressPrefix(final String destinationAddressPrefixValue) {
        this.destinationAddressPrefix = destinationAddressPrefixValue;
    }
    
    private String destinationPortRange;
    
    /**
    * Required. Gets or sets destination Port (single port) or Destination Port
    * Range (separated by “-“) or star (*) for all ports. All numbers are
    * inclusive. Example: 80, 80-80, 80-81, *
    * @return The DestinationPortRange value.
    */
    public String getDestinationPortRange() {
        return this.destinationPortRange;
    }
    
    /**
    * Required. Gets or sets destination Port (single port) or Destination Port
    * Range (separated by “-“) or star (*) for all ports. All numbers are
    * inclusive. Example: 80, 80-80, 80-81, *
    * @param destinationPortRangeValue The DestinationPortRange value.
    */
    public void setDestinationPortRange(final String destinationPortRangeValue) {
        this.destinationPortRange = destinationPortRangeValue;
    }
    
    private int priority;
    
    /**
    * Required. Gets or sets Priority. Value from 100 – 4096.
    * @return The Priority value.
    */
    public int getPriority() {
        return this.priority;
    }
    
    /**
    * Required. Gets or sets Priority. Value from 100 – 4096.
    * @param priorityValue The Priority value.
    */
    public void setPriority(final int priorityValue) {
        this.priority = priorityValue;
    }
    
    private String protocol;
    
    /**
    * Required. Gets or sets Protocol. TCP, UDP, *.
    * @return The Protocol value.
    */
    public String getProtocol() {
        return this.protocol;
    }
    
    /**
    * Required. Gets or sets Protocol. TCP, UDP, *.
    * @param protocolValue The Protocol value.
    */
    public void setProtocol(final String protocolValue) {
        this.protocol = protocolValue;
    }
    
    private String sourceAddressPrefix;
    
    /**
    * Required. Gets or sets SourceAddressPrefix. CIDR value of Source IP from
    * which traffic is coming. You can specify star (*) to map all traffic or
    * one of pre-defined TAGs
    * @return The SourceAddressPrefix value.
    */
    public String getSourceAddressPrefix() {
        return this.sourceAddressPrefix;
    }
    
    /**
    * Required. Gets or sets SourceAddressPrefix. CIDR value of Source IP from
    * which traffic is coming. You can specify star (*) to map all traffic or
    * one of pre-defined TAGs
    * @param sourceAddressPrefixValue The SourceAddressPrefix value.
    */
    public void setSourceAddressPrefix(final String sourceAddressPrefixValue) {
        this.sourceAddressPrefix = sourceAddressPrefixValue;
    }
    
    private String sourcePortRange;
    
    /**
    * Required. Gets or sets Source Port (single port) or Source Port Range
    * (separated by “-“) or star (*) for all ports. All numbers are inclusive.
    * Example: 80, 80-80, 80-81, *
    * @return The SourcePortRange value.
    */
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }
    
    /**
    * Required. Gets or sets Source Port (single port) or Source Port Range
    * (separated by “-“) or star (*) for all ports. All numbers are inclusive.
    * Example: 80, 80-80, 80-81, *
    * @param sourcePortRangeValue The SourcePortRange value.
    */
    public void setSourcePortRange(final String sourcePortRangeValue) {
        this.sourcePortRange = sourcePortRangeValue;
    }
    
    private String type;
    
    /**
    * Required. Gets or sets type of Rule. Possible values: Inbound (to be
    * evaluated against ingress traffic), Outbound (to be evaluated against
    * egress traffic).
    * @return The Type value.
    */
    public String getType() {
        return this.type;
    }
    
    /**
    * Required. Gets or sets type of Rule. Possible values: Inbound (to be
    * evaluated against ingress traffic), Outbound (to be evaluated against
    * egress traffic).
    * @param typeValue The Type value.
    */
    public void setType(final String typeValue) {
        this.type = typeValue;
    }
}
