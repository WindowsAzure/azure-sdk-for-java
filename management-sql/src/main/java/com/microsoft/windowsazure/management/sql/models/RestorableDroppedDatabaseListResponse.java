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

import com.microsoft.windowsazure.core.LazyArrayList;
import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;
import java.util.Iterator;

/**
* Contains the response to the List Restorable Dropped Databases request.
*/
public class RestorableDroppedDatabaseListResponse extends OperationResponse implements Iterable<RestorableDroppedDatabase> {
    private ArrayList<RestorableDroppedDatabase> databases;
    
    /**
    * Optional. Gets or sets the collection of restorable dropped databases
    * that has been returned from a List Restorable Dropped Databases request.
    * @return The Databases value.
    */
    public ArrayList<RestorableDroppedDatabase> getDatabases() {
        return this.databases;
    }
    
    /**
    * Optional. Gets or sets the collection of restorable dropped databases
    * that has been returned from a List Restorable Dropped Databases request.
    * @param databasesValue The Databases value.
    */
    public void setDatabases(final ArrayList<RestorableDroppedDatabase> databasesValue) {
        this.databases = databasesValue;
    }
    
    /**
    * Initializes a new instance of the RestorableDroppedDatabaseListResponse
    * class.
    *
    */
    public RestorableDroppedDatabaseListResponse() {
        super();
        this.setDatabases(new LazyArrayList<RestorableDroppedDatabase>());
    }
    
    /**
    * Gets the sequence of Databases.
    *
    */
    public Iterator<RestorableDroppedDatabase> iterator() {
        return this.getDatabases().iterator();
    }
}
