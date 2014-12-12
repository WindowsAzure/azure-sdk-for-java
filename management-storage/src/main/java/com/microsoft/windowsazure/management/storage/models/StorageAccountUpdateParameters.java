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

package com.microsoft.windowsazure.management.storage.models;

import com.microsoft.windowsazure.core.LazyHashMap;
import java.util.HashMap;

/**
* Parameters supplied to the Update Storage Account operation.
*/
public class StorageAccountUpdateParameters {
    private String accountType;
    
    /**
    * Optional. Specifies whether the account supports locally-redundant
    * storage, geo-redundant storage, zone-redundant storage, or read access
    * geo-redundant storage. Possible values are:'Standard_LRS',
    * 'Standard_ZRS', 'Standard_GRS', and 'Standard_RAGRS'.
    * @return The AccountType value.
    */
    public String getAccountType() {
        return this.accountType;
    }
    
    /**
    * Optional. Specifies whether the account supports locally-redundant
    * storage, geo-redundant storage, zone-redundant storage, or read access
    * geo-redundant storage. Possible values are:'Standard_LRS',
    * 'Standard_ZRS', 'Standard_GRS', and 'Standard_RAGRS'.
    * @param accountTypeValue The AccountType value.
    */
    public void setAccountType(final String accountTypeValue) {
        this.accountType = accountTypeValue;
    }
    
    private String description;
    
    /**
    * Optional.
    * @return The Description value.
    */
    public String getDescription() {
        return this.description;
    }
    
    /**
    * Optional.
    * @param descriptionValue The Description value.
    */
    public void setDescription(final String descriptionValue) {
        this.description = descriptionValue;
    }
    
    private HashMap<String, String> extendedProperties;
    
    /**
    * Optional. Represents the name of an extended storage account property.
    * Each extended property must have a defined name and a value. You can
    * have a maximum of 50 extended property name/value pairs. The maximum
    * length of the Name element is 64 characters, only alphanumeric
    * characters and underscores are valid in the Name, and the name must
    * start with a letter. Attempting to use other characters, starting the
    * Name with a non-letter character, or entering a name that is identical
    * to that of another extended property owned by the same storage account
    * will result in a status code 400 (Bad Request) error. Each extended
    * property value has a maximum length of 255 characters. You can delete an
    * extended property by setting the value to NULL.
    * @return The ExtendedProperties value.
    */
    public HashMap<String, String> getExtendedProperties() {
        return this.extendedProperties;
    }
    
    /**
    * Optional. Represents the name of an extended storage account property.
    * Each extended property must have a defined name and a value. You can
    * have a maximum of 50 extended property name/value pairs. The maximum
    * length of the Name element is 64 characters, only alphanumeric
    * characters and underscores are valid in the Name, and the name must
    * start with a letter. Attempting to use other characters, starting the
    * Name with a non-letter character, or entering a name that is identical
    * to that of another extended property owned by the same storage account
    * will result in a status code 400 (Bad Request) error. Each extended
    * property value has a maximum length of 255 characters. You can delete an
    * extended property by setting the value to NULL.
    * @param extendedPropertiesValue The ExtendedProperties value.
    */
    public void setExtendedProperties(final HashMap<String, String> extendedPropertiesValue) {
        this.extendedProperties = extendedPropertiesValue;
    }
    
    private String label;
    
    /**
    * Optional. A name for the storage account, base64-encoded. The name may be
    * up to 100 characters in length. The name can be used identify the
    * storage account for your tracking purposes.
    * @return The Label value.
    */
    public String getLabel() {
        return this.label;
    }
    
    /**
    * Optional. A name for the storage account, base64-encoded. The name may be
    * up to 100 characters in length. The name can be used identify the
    * storage account for your tracking purposes.
    * @param labelValue The Label value.
    */
    public void setLabel(final String labelValue) {
        this.label = labelValue;
    }
    
    /**
    * Initializes a new instance of the StorageAccountUpdateParameters class.
    *
    */
    public StorageAccountUpdateParameters() {
        this.setExtendedProperties(new LazyHashMap<String, String>());
    }
}
