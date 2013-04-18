/**
 * Copyright Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.14 at 04:34:45 PM PST 
//


package com.microsoft.windowsazure.serviceruntime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RuntimeServerDiscoveryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuntimeServerDiscoveryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="RuntimeServerEndpoints" type="{}RuntimeServerEndpointsInfo"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuntimeServerDiscoveryInfo", propOrder = {

})
class RuntimeServerDiscoveryInfo {

    @XmlElement(name = "RuntimeServerEndpoints", required = true)
    protected RuntimeServerEndpointsInfo runtimeServerEndpoints;

    /**
     * Gets the value of the runtimeServerEndpoints property.
     * 
     * @return
     *     possible object is
     *     {@link RuntimeServerEndpointsInfo }
     *     
     */
    public RuntimeServerEndpointsInfo getRuntimeServerEndpoints() {
        return runtimeServerEndpoints;
    }

    /**
     * Sets the value of the runtimeServerEndpoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuntimeServerEndpointsInfo }
     *     
     */
    public void setRuntimeServerEndpoints(RuntimeServerEndpointsInfo value) {
        this.runtimeServerEndpoints = value;
    }

}
