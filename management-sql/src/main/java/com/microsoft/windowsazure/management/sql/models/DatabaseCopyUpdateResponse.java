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
* Represents a response to the update request.
*/
public class DatabaseCopyUpdateResponse extends OperationResponse {
    private DatabaseCopy databaseCopy;
    
    /**
    * Optional. Gets or sets the returned database copy.
    * @return The DatabaseCopy value.
    */
    public DatabaseCopy getDatabaseCopy() {
        return this.databaseCopy;
    }
    
    /**
    * Optional. Gets or sets the returned database copy.
    * @param databaseCopyValue The DatabaseCopy value.
    */
    public void setDatabaseCopy(final DatabaseCopy databaseCopyValue) {
        this.databaseCopy = databaseCopyValue;
    }
}
