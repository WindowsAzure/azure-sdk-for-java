/**
 * Copyright 2011 Microsoft Corporation
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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.windowsazure.serviceruntime package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
class ObjectFactory {

    private final static QName _GoalState_QNAME = new QName("", "GoalState");
    private final static QName _RoleEnvironment_QNAME = new QName("", "RoleEnvironment");
    private final static QName _CurrentState_QNAME = new QName("", "CurrentState");
    private final static QName _RuntimeServerDiscovery_QNAME = new QName("", "RuntimeServerDiscovery");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.windowsazure.serviceruntime
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StatusLeaseInfo.Release }
     * 
     */
    public StatusLeaseInfo.Release createStatusLeaseInfoRelease() {
        return new StatusLeaseInfo.Release();
    }

    /**
     * Create an instance of {@link RuntimeServerEndpointsInfo }
     * 
     */
    public RuntimeServerEndpointsInfo createRuntimeServerEndpointsInfo() {
        return new RuntimeServerEndpointsInfo();
    }

    /**
     * Create an instance of {@link RuntimeServerEndpointInfo }
     * 
     */
    public RuntimeServerEndpointInfo createRuntimeServerEndpointInfo() {
        return new RuntimeServerEndpointInfo();
    }

    /**
     * Create an instance of {@link RuntimeServerDiscoveryInfo }
     * 
     */
    public RuntimeServerDiscoveryInfo createRuntimeServerDiscoveryInfo() {
        return new RuntimeServerDiscoveryInfo();
    }

    /**
     * Create an instance of {@link GoalStateInfo }
     * 
     */
    public GoalStateInfo createGoalStateInfo() {
        return new GoalStateInfo();
    }

    /**
     * Create an instance of {@link LocalResourcesInfo }
     * 
     */
    public LocalResourcesInfo createLocalResourcesInfo() {
        return new LocalResourcesInfo();
    }

    /**
     * Create an instance of {@link ConfigurationSettingInfo }
     * 
     */
    public ConfigurationSettingInfo createConfigurationSettingInfo() {
        return new ConfigurationSettingInfo();
    }

    /**
     * Create an instance of {@link CurrentStateInfo }
     * 
     */
    public CurrentStateInfo createCurrentStateInfo() {
        return new CurrentStateInfo();
    }

    /**
     * Create an instance of {@link CurrentRoleInstanceInfo }
     * 
     */
    public CurrentRoleInstanceInfo createCurrentRoleInstanceInfo() {
        return new CurrentRoleInstanceInfo();
    }

    /**
     * Create an instance of {@link LocalResourceInfo }
     * 
     */
    public LocalResourceInfo createLocalResourceInfo() {
        return new LocalResourceInfo();
    }

    /**
     * Create an instance of {@link RolesInfo }
     * 
     */
    public RolesInfo createRolesInfo() {
        return new RolesInfo();
    }

    /**
     * Create an instance of {@link StatusLeaseInfo }
     * 
     */
    public StatusLeaseInfo createStatusLeaseInfo() {
        return new StatusLeaseInfo();
    }

    /**
     * Create an instance of {@link DeploymentInfo }
     * 
     */
    public DeploymentInfo createDeploymentInfo() {
        return new DeploymentInfo();
    }

    /**
     * Create an instance of {@link RoleInstancesInfo }
     * 
     */
    public RoleInstancesInfo createRoleInstancesInfo() {
        return new RoleInstancesInfo();
    }

    /**
     * Create an instance of {@link RoleInfo }
     * 
     */
    public RoleInfo createRoleInfo() {
        return new RoleInfo();
    }

    /**
     * Create an instance of {@link ConfigurationSettingsInfo }
     * 
     */
    public ConfigurationSettingsInfo createConfigurationSettingsInfo() {
        return new ConfigurationSettingsInfo();
    }

    /**
     * Create an instance of {@link EndpointsInfo }
     * 
     */
    public EndpointsInfo createEndpointsInfo() {
        return new EndpointsInfo();
    }

    /**
     * Create an instance of {@link AcquireLeaseInfo }
     * 
     */
    public AcquireLeaseInfo createAcquireLeaseInfo() {
        return new AcquireLeaseInfo();
    }

    /**
     * Create an instance of {@link EndpointInfo }
     * 
     */
    public EndpointInfo createEndpointInfo() {
        return new EndpointInfo();
    }

    /**
     * Create an instance of {@link RoleEnvironmentInfo }
     * 
     */
    public RoleEnvironmentInfo createRoleEnvironmentInfo() {
        return new RoleEnvironmentInfo();
    }

    /**
     * Create an instance of {@link RoleInstanceInfo }
     * 
     */
    public RoleInstanceInfo createRoleInstanceInfo() {
        return new RoleInstanceInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoalStateInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GoalState")
    public JAXBElement<GoalStateInfo> createGoalState(GoalStateInfo value) {
        return new JAXBElement<GoalStateInfo>(_GoalState_QNAME, GoalStateInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleEnvironmentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RoleEnvironment")
    public JAXBElement<RoleEnvironmentInfo> createRoleEnvironment(RoleEnvironmentInfo value) {
        return new JAXBElement<RoleEnvironmentInfo>(_RoleEnvironment_QNAME, RoleEnvironmentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentStateInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CurrentState")
    public JAXBElement<CurrentStateInfo> createCurrentState(CurrentStateInfo value) {
        return new JAXBElement<CurrentStateInfo>(_CurrentState_QNAME, CurrentStateInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuntimeServerDiscoveryInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RuntimeServerDiscovery")
    public JAXBElement<RuntimeServerDiscoveryInfo> createRuntimeServerDiscovery(RuntimeServerDiscoveryInfo value) {
        return new JAXBElement<RuntimeServerDiscoveryInfo>(_RuntimeServerDiscovery_QNAME, RuntimeServerDiscoveryInfo.class, null, value);
    }

}
