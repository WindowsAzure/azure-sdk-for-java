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

/**
* Represents an individual Azure SQL Database Server.
*/
public class Server {
    private String administratorUserName;
    
    /**
    * Optional. Gets the administrator login for the server.
    * @return The AdministratorUserName value.
    */
    public String getAdministratorUserName() {
        return this.administratorUserName;
    }
    
    /**
    * Optional. Gets the administrator login for the server.
    * @param administratorUserNameValue The AdministratorUserName value.
    */
    public void setAdministratorUserName(final String administratorUserNameValue) {
        this.administratorUserName = administratorUserNameValue;
    }
    
    private String fullyQualifiedDomainName;
    
    /**
    * Optional. Gets the fully qualified domain name of the Azure SQL Database
    * Server.
    * @return The FullyQualifiedDomainName value.
    */
    public String getFullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }
    
    /**
    * Optional. Gets the fully qualified domain name of the Azure SQL Database
    * Server.
    * @param fullyQualifiedDomainNameValue The FullyQualifiedDomainName value.
    */
    public void setFullyQualifiedDomainName(final String fullyQualifiedDomainNameValue) {
        this.fullyQualifiedDomainName = fullyQualifiedDomainNameValue;
    }
    
    private String location;
    
    /**
    * Optional. Gets the location of this server. See
    * http://azure.microsoft.com/en-us/regions/#services for a list of valid
    * regions.
    * @return The Location value.
    */
    public String getLocation() {
        return this.location;
    }
    
    /**
    * Optional. Gets the location of this server. See
    * http://azure.microsoft.com/en-us/regions/#services for a list of valid
    * regions.
    * @param locationValue The Location value.
    */
    public void setLocation(final String locationValue) {
        this.location = locationValue;
    }
    
    private String name;
    
    /**
    * Optional. Gets the name of the Azure SQL Database Server.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. Gets the name of the Azure SQL Database Server.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private String state;
    
    /**
    * Optional. Gets the current state of the server.
    * @return The State value.
    */
    public String getState() {
        return this.state;
    }
    
    /**
    * Optional. Gets the current state of the server.
    * @param stateValue The State value.
    */
    public void setState(final String stateValue) {
        this.state = stateValue;
    }
    
    private String version;
    
    /**
    * Optional. Gets the version of the server.
    * @return The Version value.
    */
    public String getVersion() {
        return this.version;
    }
    
    /**
    * Optional. Gets the version of the server.
    * @param versionValue The Version value.
    */
    public void setVersion(final String versionValue) {
        this.version = versionValue;
    }
}
