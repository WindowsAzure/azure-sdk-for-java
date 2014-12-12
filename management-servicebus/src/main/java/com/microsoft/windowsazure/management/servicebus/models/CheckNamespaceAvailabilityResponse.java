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

package com.microsoft.windowsazure.management.servicebus.models;

import com.microsoft.windowsazure.core.OperationResponse;

/**
* The response to a query for the availability status of a namespace name.
*/
public class CheckNamespaceAvailabilityResponse extends OperationResponse {
    private boolean isAvailable;
    
    /**
    * Optional. Whether or not the namespace is available.
    * @return The IsAvailable value.
    */
    public boolean isAvailable() {
        return this.isAvailable;
    }
    
    /**
    * Optional. Whether or not the namespace is available.
    * @param isAvailableValue The IsAvailable value.
    */
    public void setIsAvailable(final boolean isAvailableValue) {
        this.isAvailable = isAvailableValue;
    }
    
    private String reasonDetails;
    
    /**
    * Optional. The reason the namespace is unavailable.
    * @return The ReasonDetails value.
    */
    public String getReasonDetails() {
        return this.reasonDetails;
    }
    
    /**
    * Optional. The reason the namespace is unavailable.
    * @param reasonDetailsValue The ReasonDetails value.
    */
    public void setReasonDetails(final String reasonDetailsValue) {
        this.reasonDetails = reasonDetailsValue;
    }
}
