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

package com.microsoft.windowsazure.management.websites.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;

/**
* Scheduled backup definition.
*/
public class WebSiteGetBackupConfigurationResponse extends OperationResponse {
    private BackupSchedule backupSchedule;
    
    /**
    * Optional. Schedule - defines how often should be the backup performed.
    * @return The BackupSchedule value.
    */
    public BackupSchedule getBackupSchedule() {
        return this.backupSchedule;
    }
    
    /**
    * Optional. Schedule - defines how often should be the backup performed.
    * @param backupScheduleValue The BackupSchedule value.
    */
    public void setBackupSchedule(final BackupSchedule backupScheduleValue) {
        this.backupSchedule = backupScheduleValue;
    }
    
    private ArrayList<DatabaseBackupSetting> databases;
    
    /**
    * Optional. Database settings for backup.
    * @return The Databases value.
    */
    public ArrayList<DatabaseBackupSetting> getDatabases() {
        return this.databases;
    }
    
    /**
    * Optional. Database settings for backup.
    * @param databasesValue The Databases value.
    */
    public void setDatabases(final ArrayList<DatabaseBackupSetting> databasesValue) {
        this.databases = databasesValue;
    }
    
    private Boolean enabled;
    
    /**
    * Optional. True if this schedule is enabled and periodically executed;
    * otherwise, false.
    * @return The Enabled value.
    */
    public Boolean isEnabled() {
        return this.enabled;
    }
    
    /**
    * Optional. True if this schedule is enabled and periodically executed;
    * otherwise, false.
    * @param enabledValue The Enabled value.
    */
    public void setEnabled(final Boolean enabledValue) {
        this.enabled = enabledValue;
    }
    
    private String name;
    
    /**
    * Optional. Name of a backup.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. Name of a backup.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private String storageAccountUrl;
    
    /**
    * Optional. SAS URL for a container in a storage account. E.g.
    * https://NAME.blob.core.windows.net/CONTAINERNAME/?sv=2012-02-12&st=2013-12-05T19%3A30%3A45Z&se=2017-12-04T19%3A30%3A45Z&sr=c&sp=rwdl&sig=abcdefABCDEFabcdef0123456789
    * @return The StorageAccountUrl value.
    */
    public String getStorageAccountUrl() {
        return this.storageAccountUrl;
    }
    
    /**
    * Optional. SAS URL for a container in a storage account. E.g.
    * https://NAME.blob.core.windows.net/CONTAINERNAME/?sv=2012-02-12&st=2013-12-05T19%3A30%3A45Z&se=2017-12-04T19%3A30%3A45Z&sr=c&sp=rwdl&sig=abcdefABCDEFabcdef0123456789
    * @param storageAccountUrlValue The StorageAccountUrl value.
    */
    public void setStorageAccountUrl(final String storageAccountUrlValue) {
        this.storageAccountUrl = storageAccountUrlValue;
    }
    
    /**
    * Initializes a new instance of the WebSiteGetBackupConfigurationResponse
    * class.
    *
    */
    public WebSiteGetBackupConfigurationResponse() {
        super();
        this.setDatabases(new LazyArrayList<DatabaseBackupSetting>());
    }
}
