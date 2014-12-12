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
* Parameters supplied to the Get Service Certificate operation.
*/
public class ServiceCertificateGetParameters {
    private String serviceName;
    
    /**
    * Required. The DNS prefix name of your service.
    * @return The ServiceName value.
    */
    public String getServiceName() {
        return this.serviceName;
    }
    
    /**
    * Required. The DNS prefix name of your service.
    * @param serviceNameValue The ServiceName value.
    */
    public void setServiceName(final String serviceNameValue) {
        this.serviceName = serviceNameValue;
    }
    
    private String thumbprint;
    
    /**
    * Required. The hexadecimal representation of the thumbprint.
    * @return The Thumbprint value.
    */
    public String getThumbprint() {
        return this.thumbprint;
    }
    
    /**
    * Required. The hexadecimal representation of the thumbprint.
    * @param thumbprintValue The Thumbprint value.
    */
    public void setThumbprint(final String thumbprintValue) {
        this.thumbprint = thumbprintValue;
    }
    
    private String thumbprintAlgorithm;
    
    /**
    * Required. The algorithm for the certificate's thumbprint.
    * @return The ThumbprintAlgorithm value.
    */
    public String getThumbprintAlgorithm() {
        return this.thumbprintAlgorithm;
    }
    
    /**
    * Required. The algorithm for the certificate's thumbprint.
    * @param thumbprintAlgorithmValue The ThumbprintAlgorithm value.
    */
    public void setThumbprintAlgorithm(final String thumbprintAlgorithmValue) {
        this.thumbprintAlgorithm = thumbprintAlgorithmValue;
    }
    
    /**
    * Initializes a new instance of the ServiceCertificateGetParameters class.
    *
    */
    public ServiceCertificateGetParameters() {
    }
    
    /**
    * Initializes a new instance of the ServiceCertificateGetParameters class
    * with required arguments.
    *
    */
    public ServiceCertificateGetParameters(String serviceName, String thumbprintAlgorithm, String thumbprint) {
        if (serviceName == null) {
            throw new NullPointerException("serviceName");
        }
        if (thumbprintAlgorithm == null) {
            throw new NullPointerException("thumbprintAlgorithm");
        }
        if (thumbprint == null) {
            throw new NullPointerException("thumbprint");
        }
        this.setServiceName(serviceName);
        this.setThumbprintAlgorithm(thumbprintAlgorithm);
        this.setThumbprint(thumbprint);
    }
}
