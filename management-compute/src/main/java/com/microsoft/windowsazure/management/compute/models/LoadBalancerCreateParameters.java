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

package com.microsoft.windowsazure.management.compute.models;

/**
* Parameters supplied to the Create Load Balancer operation.
*/
public class LoadBalancerCreateParameters {
    private FrontendIPConfiguration frontendIPConfiguration;
    
    /**
    * Optional. The configuration for the virtual IP address (VIP) this load
    * balancer provides.
    * @return The FrontendIPConfiguration value.
    */
    public FrontendIPConfiguration getFrontendIPConfiguration() {
        return this.frontendIPConfiguration;
    }
    
    /**
    * Optional. The configuration for the virtual IP address (VIP) this load
    * balancer provides.
    * @param frontendIPConfigurationValue The FrontendIPConfiguration value.
    */
    public void setFrontendIPConfiguration(final FrontendIPConfiguration frontendIPConfigurationValue) {
        this.frontendIPConfiguration = frontendIPConfigurationValue;
    }
    
    private String name;
    
    /**
    * Optional. Name of the load balancer.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. Name of the load balancer.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
}
