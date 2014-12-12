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

import com.microsoft.windowsazure.core.LazyArrayList;
import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;
import java.util.Iterator;

/**
* The List Extensions operation response.
*/
public class HostedServiceListExtensionsResponse extends OperationResponse implements Iterable<HostedServiceListExtensionsResponse.Extension> {
    private ArrayList<HostedServiceListExtensionsResponse.Extension> extensions;
    
    /**
    * Optional. The extensions that were added to a cloud service.
    * @return The Extensions value.
    */
    public ArrayList<HostedServiceListExtensionsResponse.Extension> getExtensions() {
        return this.extensions;
    }
    
    /**
    * Optional. The extensions that were added to a cloud service.
    * @param extensionsValue The Extensions value.
    */
    public void setExtensions(final ArrayList<HostedServiceListExtensionsResponse.Extension> extensionsValue) {
        this.extensions = extensionsValue;
    }
    
    /**
    * Initializes a new instance of the HostedServiceListExtensionsResponse
    * class.
    *
    */
    public HostedServiceListExtensionsResponse() {
        super();
        this.setExtensions(new LazyArrayList<HostedServiceListExtensionsResponse.Extension>());
    }
    
    /**
    * Gets the sequence of Extensions.
    *
    */
    public Iterator<HostedServiceListExtensionsResponse.Extension> iterator() {
        return this.getExtensions().iterator();
    }
    
    /**
    * An extension that was added to a cloud service.
    */
    public static class Extension {
        private String id;
        
        /**
        * Optional. The identifier of the extension.
        * @return The Id value.
        */
        public String getId() {
            return this.id;
        }
        
        /**
        * Optional. The identifier of the extension.
        * @param idValue The Id value.
        */
        public void setId(final String idValue) {
            this.id = idValue;
        }
        
        private String providerNamespace;
        
        /**
        * Optional. The provider namespace of the extension. The provider
        * namespace for Azure extensions is Microsoft.Windows.Azure.Extensions.
        * @return The ProviderNamespace value.
        */
        public String getProviderNamespace() {
            return this.providerNamespace;
        }
        
        /**
        * Optional. The provider namespace of the extension. The provider
        * namespace for Azure extensions is Microsoft.Windows.Azure.Extensions.
        * @param providerNamespaceValue The ProviderNamespace value.
        */
        public void setProviderNamespace(final String providerNamespaceValue) {
            this.providerNamespace = providerNamespaceValue;
        }
        
        private String publicConfiguration;
        
        /**
        * Optional. The public configuration that is defined using the schema
        * returned by the List Extensions operation.
        * @return The PublicConfiguration value.
        */
        public String getPublicConfiguration() {
            return this.publicConfiguration;
        }
        
        /**
        * Optional. The public configuration that is defined using the schema
        * returned by the List Extensions operation.
        * @param publicConfigurationValue The PublicConfiguration value.
        */
        public void setPublicConfiguration(final String publicConfigurationValue) {
            this.publicConfiguration = publicConfigurationValue;
        }
        
        private String thumbprint;
        
        /**
        * Optional. The thumbprint of the certificate that is used to encrypt
        * the configuration specified in PrivateConfiguration. If this element
        * is not specified, a certificate may be automatically generated and
        * added to the cloud service.
        * @return The Thumbprint value.
        */
        public String getThumbprint() {
            return this.thumbprint;
        }
        
        /**
        * Optional. The thumbprint of the certificate that is used to encrypt
        * the configuration specified in PrivateConfiguration. If this element
        * is not specified, a certificate may be automatically generated and
        * added to the cloud service.
        * @param thumbprintValue The Thumbprint value.
        */
        public void setThumbprint(final String thumbprintValue) {
            this.thumbprint = thumbprintValue;
        }
        
        private String thumbprintAlgorithm;
        
        /**
        * Optional. The thumbprint algorithm of the certificate that is used to
        * encrypt the configuration specified in PrivateConfiguration.
        * @return The ThumbprintAlgorithm value.
        */
        public String getThumbprintAlgorithm() {
            return this.thumbprintAlgorithm;
        }
        
        /**
        * Optional. The thumbprint algorithm of the certificate that is used to
        * encrypt the configuration specified in PrivateConfiguration.
        * @param thumbprintAlgorithmValue The ThumbprintAlgorithm value.
        */
        public void setThumbprintAlgorithm(final String thumbprintAlgorithmValue) {
            this.thumbprintAlgorithm = thumbprintAlgorithmValue;
        }
        
        private String type;
        
        /**
        * Required. The type of the extension.
        * @return The Type value.
        */
        public String getType() {
            return this.type;
        }
        
        /**
        * Required. The type of the extension.
        * @param typeValue The Type value.
        */
        public void setType(final String typeValue) {
            this.type = typeValue;
        }
        
        private String version;
        
        /**
        * Optional. The version of the extension.
        * @return The Version value.
        */
        public String getVersion() {
            return this.version;
        }
        
        /**
        * Optional. The version of the extension.
        * @param versionValue The Version value.
        */
        public void setVersion(final String versionValue) {
            this.version = versionValue;
        }
        
        /**
        * Initializes a new instance of the Extension class.
        *
        */
        public Extension() {
        }
        
        /**
        * Initializes a new instance of the Extension class with required
        * arguments.
        *
        */
        public Extension(String type) {
            if (type == null) {
                throw new NullPointerException("type");
            }
            this.setType(type);
        }
    }
}
