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

import java.util.Calendar;

/**
* Contains the parameters supplied to the Create Restore Database Operation
* request.
*/
public class RestoreDatabaseOperationCreateParameters {
    private Calendar pointInTime;
    
    /**
    * Optional. Gets or sets the point in time to restore to.
    * @return The PointInTime value.
    */
    public Calendar getPointInTime() {
        return this.pointInTime;
    }
    
    /**
    * Optional. Gets or sets the point in time to restore to.
    * @param pointInTimeValue The PointInTime value.
    */
    public void setPointInTime(final Calendar pointInTimeValue) {
        this.pointInTime = pointInTimeValue;
    }
    
    private Calendar sourceDatabaseDeletionDate;
    
    /**
    * Optional. Gets or sets the deletion date of the source Azure SQL Database.
    * @return The SourceDatabaseDeletionDate value.
    */
    public Calendar getSourceDatabaseDeletionDate() {
        return this.sourceDatabaseDeletionDate;
    }
    
    /**
    * Optional. Gets or sets the deletion date of the source Azure SQL Database.
    * @param sourceDatabaseDeletionDateValue The SourceDatabaseDeletionDate
    * value.
    */
    public void setSourceDatabaseDeletionDate(final Calendar sourceDatabaseDeletionDateValue) {
        this.sourceDatabaseDeletionDate = sourceDatabaseDeletionDateValue;
    }
    
    private String sourceDatabaseName;
    
    /**
    * Required. Gets or sets the name of the source Azure SQL Database.
    * @return The SourceDatabaseName value.
    */
    public String getSourceDatabaseName() {
        return this.sourceDatabaseName;
    }
    
    /**
    * Required. Gets or sets the name of the source Azure SQL Database.
    * @param sourceDatabaseNameValue The SourceDatabaseName value.
    */
    public void setSourceDatabaseName(final String sourceDatabaseNameValue) {
        this.sourceDatabaseName = sourceDatabaseNameValue;
    }
    
    private String targetDatabaseName;
    
    /**
    * Required. Gets or sets the name of the target Azure SQL Database.
    * @return The TargetDatabaseName value.
    */
    public String getTargetDatabaseName() {
        return this.targetDatabaseName;
    }
    
    /**
    * Required. Gets or sets the name of the target Azure SQL Database.
    * @param targetDatabaseNameValue The TargetDatabaseName value.
    */
    public void setTargetDatabaseName(final String targetDatabaseNameValue) {
        this.targetDatabaseName = targetDatabaseNameValue;
    }
    
    private String targetServerName;
    
    /**
    * Optional. Gets or sets the name of the target Azure SQL Database Server.
    * @return The TargetServerName value.
    */
    public String getTargetServerName() {
        return this.targetServerName;
    }
    
    /**
    * Optional. Gets or sets the name of the target Azure SQL Database Server.
    * @param targetServerNameValue The TargetServerName value.
    */
    public void setTargetServerName(final String targetServerNameValue) {
        this.targetServerName = targetServerNameValue;
    }
    
    /**
    * Initializes a new instance of the
    * RestoreDatabaseOperationCreateParameters class.
    *
    */
    public RestoreDatabaseOperationCreateParameters() {
    }
    
    /**
    * Initializes a new instance of the
    * RestoreDatabaseOperationCreateParameters class with required arguments.
    *
    */
    public RestoreDatabaseOperationCreateParameters(String sourceDatabaseName, String targetDatabaseName) {
        if (sourceDatabaseName == null) {
            throw new NullPointerException("sourceDatabaseName");
        }
        if (targetDatabaseName == null) {
            throw new NullPointerException("targetDatabaseName");
        }
        this.setSourceDatabaseName(sourceDatabaseName);
        this.setTargetDatabaseName(targetDatabaseName);
    }
}
