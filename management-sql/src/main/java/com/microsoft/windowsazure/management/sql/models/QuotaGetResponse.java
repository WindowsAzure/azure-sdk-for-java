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

package com.microsoft.windowsazure.management.sql.models;

import com.microsoft.windowsazure.core.OperationResponse;

/**
* Represents the response structure for the Quota Get operation.
*/
public class QuotaGetResponse extends OperationResponse {
    private Quota quota;
    
    /**
    * Optional. Gets or sets the quota that was retrieved from the server.
    * @return The Quota value.
    */
    public Quota getQuota() {
        return this.quota;
    }
    
    /**
    * Optional. Gets or sets the quota that was retrieved from the server.
    * @param quotaValue The Quota value.
    */
    public void setQuota(final Quota quotaValue) {
        this.quota = quotaValue;
    }
}
