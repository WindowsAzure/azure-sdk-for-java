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

/**
* The status of a gateway diagnostics operation.
*/
public class GatewayDiagnosticsStatus extends OperationResponse {
    private String diagnosticsUrl;
    
    /**
    * Optional. The url where the diagnostics data can be found.
    * @return The DiagnosticsUrl value.
    */
    public String getDiagnosticsUrl() {
        return this.diagnosticsUrl;
    }
    
    /**
    * Optional. The url where the diagnostics data can be found.
    * @param diagnosticsUrlValue The DiagnosticsUrl value.
    */
    public void setDiagnosticsUrl(final String diagnosticsUrlValue) {
        this.diagnosticsUrl = diagnosticsUrlValue;
    }
    
    private GatewayDiagnosticsState state;
    
    /**
    * Optional. The current state of the gateway's diagnostics session.
    * @return The State value.
    */
    public GatewayDiagnosticsState getState() {
        return this.state;
    }
    
    /**
    * Optional. The current state of the gateway's diagnostics session.
    * @param stateValue The State value.
    */
    public void setState(final GatewayDiagnosticsState stateValue) {
        this.state = stateValue;
    }
}
