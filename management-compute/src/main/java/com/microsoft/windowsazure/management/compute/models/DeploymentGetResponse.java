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
import com.microsoft.windowsazure.core.LazyHashMap;
import com.microsoft.windowsazure.core.OperationResponse;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

/**
* A deployment that exists in the cloud service.
*/
public class DeploymentGetResponse extends OperationResponse {
    private String configuration;
    
    /**
    * Optional. The configuration file of the deployment.
    * @return The Configuration value.
    */
    public String getConfiguration() {
        return this.configuration;
    }
    
    /**
    * Optional. The configuration file of the deployment.
    * @param configurationValue The Configuration value.
    */
    public void setConfiguration(final String configurationValue) {
        this.configuration = configurationValue;
    }
    
    private Calendar createdTime;
    
    /**
    * Optional. The time that the deployment was created.
    * @return The CreatedTime value.
    */
    public Calendar getCreatedTime() {
        return this.createdTime;
    }
    
    /**
    * Optional. The time that the deployment was created.
    * @param createdTimeValue The CreatedTime value.
    */
    public void setCreatedTime(final Calendar createdTimeValue) {
        this.createdTime = createdTimeValue;
    }
    
    private DeploymentSlot deploymentSlot;
    
    /**
    * Optional. The deployment environment in which this deployment is running.
    * @return The DeploymentSlot value.
    */
    public DeploymentSlot getDeploymentSlot() {
        return this.deploymentSlot;
    }
    
    /**
    * Optional. The deployment environment in which this deployment is running.
    * @param deploymentSlotValue The DeploymentSlot value.
    */
    public void setDeploymentSlot(final DeploymentSlot deploymentSlotValue) {
        this.deploymentSlot = deploymentSlotValue;
    }
    
    private DnsSettings dnsSettings;
    
    /**
    * Optional. The custom DNS settings that are specified for deployment.
    * @return The DnsSettings value.
    */
    public DnsSettings getDnsSettings() {
        return this.dnsSettings;
    }
    
    /**
    * Optional. The custom DNS settings that are specified for deployment.
    * @param dnsSettingsValue The DnsSettings value.
    */
    public void setDnsSettings(final DnsSettings dnsSettingsValue) {
        this.dnsSettings = dnsSettingsValue;
    }
    
    private HashMap<String, String> extendedProperties;
    
    /**
    * Optional. Represents the name of an extended cloud service property. Each
    * extended property must have a defined name and a value. You can have a
    * maximum of 50 extended property name and value pairs.  The maximum
    * length of the name element is 64 characters, only alphanumeric
    * characters and underscores are valid in the name, and it must start with
    * a letter. Attempting to use other characters, starting with a non-letter
    * character, or entering a name that is identical to that of another
    * extended property owned by the same service will result in a status code
    * 400 (Bad Request) error. Each extended property value has a maximum
    * length of 255 characters.
    * @return The ExtendedProperties value.
    */
    public HashMap<String, String> getExtendedProperties() {
        return this.extendedProperties;
    }
    
    /**
    * Optional. Represents the name of an extended cloud service property. Each
    * extended property must have a defined name and a value. You can have a
    * maximum of 50 extended property name and value pairs.  The maximum
    * length of the name element is 64 characters, only alphanumeric
    * characters and underscores are valid in the name, and it must start with
    * a letter. Attempting to use other characters, starting with a non-letter
    * character, or entering a name that is identical to that of another
    * extended property owned by the same service will result in a status code
    * 400 (Bad Request) error. Each extended property value has a maximum
    * length of 255 characters.
    * @param extendedPropertiesValue The ExtendedProperties value.
    */
    public void setExtendedProperties(final HashMap<String, String> extendedPropertiesValue) {
        this.extendedProperties = extendedPropertiesValue;
    }
    
    private ExtensionConfiguration extensionConfiguration;
    
    /**
    * Optional. Represents an extension that is added to the cloud service.
    * @return The ExtensionConfiguration value.
    */
    public ExtensionConfiguration getExtensionConfiguration() {
        return this.extensionConfiguration;
    }
    
    /**
    * Optional. Represents an extension that is added to the cloud service.
    * @param extensionConfigurationValue The ExtensionConfiguration value.
    */
    public void setExtensionConfiguration(final ExtensionConfiguration extensionConfigurationValue) {
        this.extensionConfiguration = extensionConfigurationValue;
    }
    
    private String label;
    
    /**
    * Optional. The user-supplied name of the deployment. This name can be used
    * identify the deployment for tracking purposes.
    * @return The Label value.
    */
    public String getLabel() {
        return this.label;
    }
    
    /**
    * Optional. The user-supplied name of the deployment. This name can be used
    * identify the deployment for tracking purposes.
    * @param labelValue The Label value.
    */
    public void setLabel(final String labelValue) {
        this.label = labelValue;
    }
    
    private Calendar lastModifiedTime;
    
    /**
    * Optional. The last time that the deployment was modified.
    * @return The LastModifiedTime value.
    */
    public Calendar getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    
    /**
    * Optional. The last time that the deployment was modified.
    * @param lastModifiedTimeValue The LastModifiedTime value.
    */
    public void setLastModifiedTime(final Calendar lastModifiedTimeValue) {
        this.lastModifiedTime = lastModifiedTimeValue;
    }
    
    private ArrayList<LoadBalancer> loadBalancers;
    
    /**
    * Optional. Optional. A list of internal load balancers that each provide
    * load balancing on a private VIP. It's created when a name is assigned in
    * the list here.
    * @return The LoadBalancers value.
    */
    public ArrayList<LoadBalancer> getLoadBalancers() {
        return this.loadBalancers;
    }
    
    /**
    * Optional. Optional. A list of internal load balancers that each provide
    * load balancing on a private VIP. It's created when a name is assigned in
    * the list here.
    * @param loadBalancersValue The LoadBalancers value.
    */
    public void setLoadBalancers(final ArrayList<LoadBalancer> loadBalancersValue) {
        this.loadBalancers = loadBalancersValue;
    }
    
    private Boolean locked;
    
    /**
    * Optional. Indicates whether the deployment is locked for new write
    * operations because an existing operation is updating the deployment.
    * @return The Locked value.
    */
    public Boolean isLocked() {
        return this.locked;
    }
    
    /**
    * Optional. Indicates whether the deployment is locked for new write
    * operations because an existing operation is updating the deployment.
    * @param lockedValue The Locked value.
    */
    public void setLocked(final Boolean lockedValue) {
        this.locked = lockedValue;
    }
    
    private String name;
    
    /**
    * Optional.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private PersistentVMDowntime persistentVMDowntime;
    
    /**
    * Optional. Specifies information about when the virtual machine has been
    * started and stopped.
    * @return The PersistentVMDowntime value.
    */
    public PersistentVMDowntime getPersistentVMDowntime() {
        return this.persistentVMDowntime;
    }
    
    /**
    * Optional. Specifies information about when the virtual machine has been
    * started and stopped.
    * @param persistentVMDowntimeValue The PersistentVMDowntime value.
    */
    public void setPersistentVMDowntime(final PersistentVMDowntime persistentVMDowntimeValue) {
        this.persistentVMDowntime = persistentVMDowntimeValue;
    }
    
    private String privateId;
    
    /**
    * Optional. The unique identifier for this deployment.
    * @return The PrivateId value.
    */
    public String getPrivateId() {
        return this.privateId;
    }
    
    /**
    * Optional. The unique identifier for this deployment.
    * @param privateIdValue The PrivateId value.
    */
    public void setPrivateId(final String privateIdValue) {
        this.privateId = privateIdValue;
    }
    
    private String reservedIPName;
    
    /**
    * Optional. The name of the Reserved IP that the deployment belongs to.
    * @return The ReservedIPName value.
    */
    public String getReservedIPName() {
        return this.reservedIPName;
    }
    
    /**
    * Optional. The name of the Reserved IP that the deployment belongs to.
    * @param reservedIPNameValue The ReservedIPName value.
    */
    public void setReservedIPName(final String reservedIPNameValue) {
        this.reservedIPName = reservedIPNameValue;
    }
    
    private ArrayList<RoleInstance> roleInstances;
    
    /**
    * Optional. The list of role instances in the deployment.
    * @return The RoleInstances value.
    */
    public ArrayList<RoleInstance> getRoleInstances() {
        return this.roleInstances;
    }
    
    /**
    * Optional. The list of role instances in the deployment.
    * @param roleInstancesValue The RoleInstances value.
    */
    public void setRoleInstances(final ArrayList<RoleInstance> roleInstancesValue) {
        this.roleInstances = roleInstancesValue;
    }
    
    private ArrayList<Role> roles;
    
    /**
    * Optional. The list of roles in the deployment.
    * @return The Roles value.
    */
    public ArrayList<Role> getRoles() {
        return this.roles;
    }
    
    /**
    * Optional. The list of roles in the deployment.
    * @param rolesValue The Roles value.
    */
    public void setRoles(final ArrayList<Role> rolesValue) {
        this.roles = rolesValue;
    }
    
    private Boolean rollbackAllowed;
    
    /**
    * Optional. Indicates whether the Rollback Update Or Upgrade operation is
    * allowed at this time.
    * @return The RollbackAllowed value.
    */
    public Boolean isRollbackAllowed() {
        return this.rollbackAllowed;
    }
    
    /**
    * Optional. Indicates whether the Rollback Update Or Upgrade operation is
    * allowed at this time.
    * @param rollbackAllowedValue The RollbackAllowed value.
    */
    public void setRollbackAllowed(final Boolean rollbackAllowedValue) {
        this.rollbackAllowed = rollbackAllowedValue;
    }
    
    private String sdkVersion;
    
    /**
    * Optional. The version of the Azure SDK that was used to generate the
    * .cspkg that created this deployment. The first two numerical components
    * of the returned version represent the version of the SDK used to create
    * the package.
    * @return The SdkVersion value.
    */
    public String getSdkVersion() {
        return this.sdkVersion;
    }
    
    /**
    * Optional. The version of the Azure SDK that was used to generate the
    * .cspkg that created this deployment. The first two numerical components
    * of the returned version represent the version of the SDK used to create
    * the package.
    * @param sdkVersionValue The SdkVersion value.
    */
    public void setSdkVersion(final String sdkVersionValue) {
        this.sdkVersion = sdkVersionValue;
    }
    
    private DeploymentStatus status;
    
    /**
    * Optional. The status of the deployment.
    * @return The Status value.
    */
    public DeploymentStatus getStatus() {
        return this.status;
    }
    
    /**
    * Optional. The status of the deployment.
    * @param statusValue The Status value.
    */
    public void setStatus(final DeploymentStatus statusValue) {
        this.status = statusValue;
    }
    
    private int upgradeDomainCount;
    
    /**
    * Optional. The number of upgrade domains available to this cloud service.
    * @return The UpgradeDomainCount value.
    */
    public int getUpgradeDomainCount() {
        return this.upgradeDomainCount;
    }
    
    /**
    * Optional. The number of upgrade domains available to this cloud service.
    * @param upgradeDomainCountValue The UpgradeDomainCount value.
    */
    public void setUpgradeDomainCount(final int upgradeDomainCountValue) {
        this.upgradeDomainCount = upgradeDomainCountValue;
    }
    
    private UpgradeStatus upgradeStatus;
    
    /**
    * Optional. Information about an update occurring on the deployment.
    * @return The UpgradeStatus value.
    */
    public UpgradeStatus getUpgradeStatus() {
        return this.upgradeStatus;
    }
    
    /**
    * Optional. Information about an update occurring on the deployment.
    * @param upgradeStatusValue The UpgradeStatus value.
    */
    public void setUpgradeStatus(final UpgradeStatus upgradeStatusValue) {
        this.upgradeStatus = upgradeStatusValue;
    }
    
    private URI uri;
    
    /**
    * Optional. The URL used to access the hosted service. For example, if the
    * service name is MyService you could access the access the service by
    * calling: http://MyService.cloudapp.net.
    * @return The Uri value.
    */
    public URI getUri() {
        return this.uri;
    }
    
    /**
    * Optional. The URL used to access the hosted service. For example, if the
    * service name is MyService you could access the access the service by
    * calling: http://MyService.cloudapp.net.
    * @param uriValue The Uri value.
    */
    public void setUri(final URI uriValue) {
        this.uri = uriValue;
    }
    
    private ArrayList<VirtualIPAddress> virtualIPAddresses;
    
    /**
    * Optional. The virtual IP addresses that are specified for the deployment.
    * @return The VirtualIPAddresses value.
    */
    public ArrayList<VirtualIPAddress> getVirtualIPAddresses() {
        return this.virtualIPAddresses;
    }
    
    /**
    * Optional. The virtual IP addresses that are specified for the deployment.
    * @param virtualIPAddressesValue The VirtualIPAddresses value.
    */
    public void setVirtualIPAddresses(final ArrayList<VirtualIPAddress> virtualIPAddressesValue) {
        this.virtualIPAddresses = virtualIPAddressesValue;
    }
    
    private String virtualNetworkName;
    
    /**
    * Optional. The name of the Virtual Network that the virtual machine
    * connects to.
    * @return The VirtualNetworkName value.
    */
    public String getVirtualNetworkName() {
        return this.virtualNetworkName;
    }
    
    /**
    * Optional. The name of the Virtual Network that the virtual machine
    * connects to.
    * @param virtualNetworkNameValue The VirtualNetworkName value.
    */
    public void setVirtualNetworkName(final String virtualNetworkNameValue) {
        this.virtualNetworkName = virtualNetworkNameValue;
    }
    
    /**
    * Initializes a new instance of the DeploymentGetResponse class.
    *
    */
    public DeploymentGetResponse() {
        super();
        this.setExtendedProperties(new LazyHashMap<String, String>());
        this.setLoadBalancers(new LazyArrayList<LoadBalancer>());
        this.setRoleInstances(new LazyArrayList<RoleInstance>());
        this.setRoles(new LazyArrayList<Role>());
        this.setVirtualIPAddresses(new LazyArrayList<VirtualIPAddress>());
    }
}
