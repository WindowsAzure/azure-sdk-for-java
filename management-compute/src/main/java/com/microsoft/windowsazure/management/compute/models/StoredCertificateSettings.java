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
* Service certificates with which to provision the new virtual machine. Stored
* certificate settings reference certificates that already exist in the Azure
* hosted service. Prior to configuring the stored certificates for the virtual
* machine, you must call the Add Service Certificate operation or add the
* certificate via the Azure Management portal.
*/
public class StoredCertificateSettings {
    private String storeName;
    
    /**
    * Required. Specifies the name of the certificate store from which to
    * retrieve certificates.  For example, "My".
    * @return The StoreName value.
    */
    public String getStoreName() {
        return this.storeName;
    }
    
    /**
    * Required. Specifies the name of the certificate store from which to
    * retrieve certificates.  For example, "My".
    * @param storeNameValue The StoreName value.
    */
    public void setStoreName(final String storeNameValue) {
        this.storeName = storeNameValue;
    }
    
    private String thumbprint;
    
    /**
    * Required. Specifies the thumbprint of the certificate to be provisioned.
    * The thumbprint must specify an existing service certificate.
    * @return The Thumbprint value.
    */
    public String getThumbprint() {
        return this.thumbprint;
    }
    
    /**
    * Required. Specifies the thumbprint of the certificate to be provisioned.
    * The thumbprint must specify an existing service certificate.
    * @param thumbprintValue The Thumbprint value.
    */
    public void setThumbprint(final String thumbprintValue) {
        this.thumbprint = thumbprintValue;
    }
    
    /**
    * Initializes a new instance of the StoredCertificateSettings class.
    *
    */
    public StoredCertificateSettings() {
    }
    
    /**
    * Initializes a new instance of the StoredCertificateSettings class with
    * required arguments.
    *
    */
    public StoredCertificateSettings(String storeName, String thumbprint) {
        if (storeName == null) {
            throw new NullPointerException("storeName");
        }
        if (thumbprint == null) {
            throw new NullPointerException("thumbprint");
        }
        this.setStoreName(storeName);
        this.setThumbprint(thumbprint);
    }
}
