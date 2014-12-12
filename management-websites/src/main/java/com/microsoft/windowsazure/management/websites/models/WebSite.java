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
import com.microsoft.windowsazure.core.LazyHashMap;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

/**
* Describes a web site.
*/
public class WebSite {
    private Boolean adminEnabled;
    
    /**
    * Optional. Read-only. This value is always true.
    * @return The AdminEnabled value.
    */
    public Boolean isAdminEnabled() {
        return this.adminEnabled;
    }
    
    /**
    * Optional. Read-only. This value is always true.
    * @param adminEnabledValue The AdminEnabled value.
    */
    public void setAdminEnabled(final Boolean adminEnabledValue) {
        this.adminEnabled = adminEnabledValue;
    }
    
    private WebSpaceAvailabilityState availabilityState;
    
    /**
    * Optional. The state of the availability of management information for the
    * web site. Possible values are Normal or Limited. Normal means that the
    * web site is running correctly and that management information for the
    * web site is available. Limited means that only partial management
    * information for the web site is available and that detailed web site
    * information is unavailable.
    * @return The AvailabilityState value.
    */
    public WebSpaceAvailabilityState getAvailabilityState() {
        return this.availabilityState;
    }
    
    /**
    * Optional. The state of the availability of management information for the
    * web site. Possible values are Normal or Limited. Normal means that the
    * web site is running correctly and that management information for the
    * web site is available. Limited means that only partial management
    * information for the web site is available and that detailed web site
    * information is unavailable.
    * @param availabilityStateValue The AvailabilityState value.
    */
    public void setAvailabilityState(final WebSpaceAvailabilityState availabilityStateValue) {
        this.availabilityState = availabilityStateValue;
    }
    
    private Boolean enabled;
    
    /**
    * Optional. The current state of the web site. This is true if the site is
    * enabled and false otherwise. Setting this value to false disables the
    * site (takes the site offline).
    * @return The Enabled value.
    */
    public Boolean isEnabled() {
        return this.enabled;
    }
    
    /**
    * Optional. The current state of the web site. This is true if the site is
    * enabled and false otherwise. Setting this value to false disables the
    * site (takes the site offline).
    * @param enabledValue The Enabled value.
    */
    public void setEnabled(final Boolean enabledValue) {
        this.enabled = enabledValue;
    }
    
    private ArrayList<String> enabledHostNames;
    
    /**
    * Optional. An array of strings that contains enabled host names for the
    * web site. By default, these are [SiteName].azurewebsites.net and
    * [SiteName].scm.azurewebsites.net.
    * @return The EnabledHostNames value.
    */
    public ArrayList<String> getEnabledHostNames() {
        return this.enabledHostNames;
    }
    
    /**
    * Optional. An array of strings that contains enabled host names for the
    * web site. By default, these are [SiteName].azurewebsites.net and
    * [SiteName].scm.azurewebsites.net.
    * @param enabledHostNamesValue The EnabledHostNames value.
    */
    public void setEnabledHostNames(final ArrayList<String> enabledHostNamesValue) {
        this.enabledHostNames = enabledHostNamesValue;
    }
    
    private ArrayList<String> hostNames;
    
    /**
    * Optional. An array of strings that contains the public host names for the
    * web site, including custom domains. Important: When you add a custom
    * domain in a PUT operation, be sure to include every host name that you
    * want for the web site. To delete a custom domain name in a PUT
    * operation, include all of the host names for the web site that you want
    * to keep, but leave out the one that you want to delete.
    * @return The HostNames value.
    */
    public ArrayList<String> getHostNames() {
        return this.hostNames;
    }
    
    /**
    * Optional. An array of strings that contains the public host names for the
    * web site, including custom domains. Important: When you add a custom
    * domain in a PUT operation, be sure to include every host name that you
    * want for the web site. To delete a custom domain name in a PUT
    * operation, include all of the host names for the web site that you want
    * to keep, but leave out the one that you want to delete.
    * @param hostNamesValue The HostNames value.
    */
    public void setHostNames(final ArrayList<String> hostNamesValue) {
        this.hostNames = hostNamesValue;
    }
    
    private ArrayList<WebSite.WebSiteHostNameSslState> hostNameSslStates;
    
    /**
    * Optional. SSL states bound to the web site.
    * @return The HostNameSslStates value.
    */
    public ArrayList<WebSite.WebSiteHostNameSslState> getHostNameSslStates() {
        return this.hostNameSslStates;
    }
    
    /**
    * Optional. SSL states bound to the web site.
    * @param hostNameSslStatesValue The HostNameSslStates value.
    */
    public void setHostNameSslStates(final ArrayList<WebSite.WebSiteHostNameSslState> hostNameSslStatesValue) {
        this.hostNameSslStates = hostNameSslStatesValue;
    }
    
    private Calendar lastModifiedTimeUtc;
    
    /**
    * Optional. A dateTime value that contains, in Coordinated Universal Time,
    * the last time the web site was modified.
    * @return The LastModifiedTimeUtc value.
    */
    public Calendar getLastModifiedTimeUtc() {
        return this.lastModifiedTimeUtc;
    }
    
    /**
    * Optional. A dateTime value that contains, in Coordinated Universal Time,
    * the last time the web site was modified.
    * @param lastModifiedTimeUtcValue The LastModifiedTimeUtc value.
    */
    public void setLastModifiedTimeUtc(final Calendar lastModifiedTimeUtcValue) {
        this.lastModifiedTimeUtc = lastModifiedTimeUtcValue;
    }
    
    private String name;
    
    /**
    * Optional. The name of the web site.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. The name of the web site.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private String repositorySiteName;
    
    /**
    * Optional. The name of the web site repository.
    * @return The RepositorySiteName value.
    */
    public String getRepositorySiteName() {
        return this.repositorySiteName;
    }
    
    /**
    * Optional. The name of the web site repository.
    * @param repositorySiteNameValue The RepositorySiteName value.
    */
    public void setRepositorySiteName(final String repositorySiteNameValue) {
        this.repositorySiteName = repositorySiteNameValue;
    }
    
    private WebSiteRuntimeAvailabilityState runtimeAvailabilityState;
    
    /**
    * Optional. The current availability state for the web site. Possible
    * values are Normal, Degraded, or NotAvailable: Normal: the web site is
    * running correctly; Degraded: the web site is running temporarily in a
    * degraded mode (typically with less memory and a shared instance); Not
    * Available: due to an unexpected issue, the site has been excluded from
    * provisioning. This typically occurs only for free sites.
    * @return The RuntimeAvailabilityState value.
    */
    public WebSiteRuntimeAvailabilityState getRuntimeAvailabilityState() {
        return this.runtimeAvailabilityState;
    }
    
    /**
    * Optional. The current availability state for the web site. Possible
    * values are Normal, Degraded, or NotAvailable: Normal: the web site is
    * running correctly; Degraded: the web site is running temporarily in a
    * degraded mode (typically with less memory and a shared instance); Not
    * Available: due to an unexpected issue, the site has been excluded from
    * provisioning. This typically occurs only for free sites.
    * @param runtimeAvailabilityStateValue The RuntimeAvailabilityState value.
    */
    public void setRuntimeAvailabilityState(final WebSiteRuntimeAvailabilityState runtimeAvailabilityStateValue) {
        this.runtimeAvailabilityState = runtimeAvailabilityStateValue;
    }
    
    private String serverFarm;
    
    /**
    * Optional. Name of a Server Farm (Web Hosting Plan) that this site belongs
    * to.
    * @return The ServerFarm value.
    */
    public String getServerFarm() {
        return this.serverFarm;
    }
    
    /**
    * Optional. Name of a Server Farm (Web Hosting Plan) that this site belongs
    * to.
    * @param serverFarmValue The ServerFarm value.
    */
    public void setServerFarm(final String serverFarmValue) {
        this.serverFarm = serverFarmValue;
    }
    
    private WebSite.WebSiteProperties siteProperties;
    
    /**
    * Optional. The web site properties of the web site. Contains AppSettings,
    * Metadata, and Properties.
    * @return The SiteProperties value.
    */
    public WebSite.WebSiteProperties getSiteProperties() {
        return this.siteProperties;
    }
    
    /**
    * Optional. The web site properties of the web site. Contains AppSettings,
    * Metadata, and Properties.
    * @param sitePropertiesValue The SiteProperties value.
    */
    public void setSiteProperties(final WebSite.WebSiteProperties sitePropertiesValue) {
        this.siteProperties = sitePropertiesValue;
    }
    
    private SkuOptions sku;
    
    /**
    * Optional. The SKU of a Server Farm (Web Hosting Plan) where site belongs
    * to.
    * @return The Sku value.
    */
    public SkuOptions getSku() {
        return this.sku;
    }
    
    /**
    * Optional. The SKU of a Server Farm (Web Hosting Plan) where site belongs
    * to.
    * @param skuValue The Sku value.
    */
    public void setSku(final SkuOptions skuValue) {
        this.sku = skuValue;
    }
    
    private String state;
    
    /**
    * Optional. A string that describes the state of the web site. Possible
    * values are Stopped or Running.
    * @return The State value.
    */
    public String getState() {
        return this.state;
    }
    
    /**
    * Optional. A string that describes the state of the web site. Possible
    * values are Stopped or Running.
    * @param stateValue The State value.
    */
    public void setState(final String stateValue) {
        this.state = stateValue;
    }
    
    private URI uri;
    
    /**
    * Optional. Direct URL to the web site endpoint on Azure Web Sites,
    * including the subscription ID, web space name, and web site name.
    * @return The Uri value.
    */
    public URI getUri() {
        return this.uri;
    }
    
    /**
    * Optional. Direct URL to the web site endpoint on Azure Web Sites,
    * including the subscription ID, web space name, and web site name.
    * @param uriValue The Uri value.
    */
    public void setUri(final URI uriValue) {
        this.uri = uriValue;
    }
    
    private WebSiteUsageState usageState;
    
    /**
    * Optional. The usage state of the web site. Possible values are Normal or
    * Exceeded. If any quota is exceeded, the UsageState value changes to
    * Exceeded and the site goes offline.
    * @return The UsageState value.
    */
    public WebSiteUsageState getUsageState() {
        return this.usageState;
    }
    
    /**
    * Optional. The usage state of the web site. Possible values are Normal or
    * Exceeded. If any quota is exceeded, the UsageState value changes to
    * Exceeded and the site goes offline.
    * @param usageStateValue The UsageState value.
    */
    public void setUsageState(final WebSiteUsageState usageStateValue) {
        this.usageState = usageStateValue;
    }
    
    private String webSpace;
    
    /**
    * Optional. The name of the web space in which the web site is located.
    * This property is read-only.
    * @return The WebSpace value.
    */
    public String getWebSpace() {
        return this.webSpace;
    }
    
    /**
    * Optional. The name of the web space in which the web site is located.
    * This property is read-only.
    * @param webSpaceValue The WebSpace value.
    */
    public void setWebSpace(final String webSpaceValue) {
        this.webSpace = webSpaceValue;
    }
    
    /**
    * Initializes a new instance of the WebSite class.
    *
    */
    public WebSite() {
        this.setEnabledHostNames(new LazyArrayList<String>());
        this.setHostNames(new LazyArrayList<String>());
        this.setHostNameSslStates(new LazyArrayList<WebSite.WebSiteHostNameSslState>());
    }
    
    /**
    * SSL state bound to a web site.
    */
    public static class WebSiteHostNameSslState {
        private String name;
        
        /**
        * Optional. The URL of the web site.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Optional. The URL of the web site.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
        private WebSiteSslState sslState;
        
        /**
        * Optional. The SSL state. Possible values are Disabled, SniEnabled, or
        * IpBasedEnabled.
        * @return The SslState value.
        */
        public WebSiteSslState getSslState() {
            return this.sslState;
        }
        
        /**
        * Optional. The SSL state. Possible values are Disabled, SniEnabled, or
        * IpBasedEnabled.
        * @param sslStateValue The SslState value.
        */
        public void setSslState(final WebSiteSslState sslStateValue) {
            this.sslState = sslStateValue;
        }
        
        private String thumbprint;
        
        /**
        * Optional. A string containing the thumbprint of the SSL certificate.
        * @return The Thumbprint value.
        */
        public String getThumbprint() {
            return this.thumbprint;
        }
        
        /**
        * Optional. A string containing the thumbprint of the SSL certificate.
        * @param thumbprintValue The Thumbprint value.
        */
        public void setThumbprint(final String thumbprintValue) {
            this.thumbprint = thumbprintValue;
        }
        
        private InetAddress virtualIP;
        
        /**
        * Optional. A string containing the IP address assigned to the hostname
        * if the hostname uses IP SSL.
        * @return The VirtualIP value.
        */
        public InetAddress getVirtualIP() {
            return this.virtualIP;
        }
        
        /**
        * Optional. A string containing the IP address assigned to the hostname
        * if the hostname uses IP SSL.
        * @param virtualIPValue The VirtualIP value.
        */
        public void setVirtualIP(final InetAddress virtualIPValue) {
            this.virtualIP = virtualIPValue;
        }
    }
    
    public static class WebSiteProperties {
        private HashMap<String, String> appSettings;
        
        /**
        * Optional. A set of name/value pairs that contain application settings
        * for a web site.
        * @return The AppSettings value.
        */
        public HashMap<String, String> getAppSettings() {
            return this.appSettings;
        }
        
        /**
        * Optional. A set of name/value pairs that contain application settings
        * for a web site.
        * @param appSettingsValue The AppSettings value.
        */
        public void setAppSettings(final HashMap<String, String> appSettingsValue) {
            this.appSettings = appSettingsValue;
        }
        
        private HashMap<String, String> metadata;
        
        /**
        * Optional. A set of name/value pairs that contain metadata information
        * for a web site.
        * @return The Metadata value.
        */
        public HashMap<String, String> getMetadata() {
            return this.metadata;
        }
        
        /**
        * Optional. A set of name/value pairs that contain metadata information
        * for a web site.
        * @param metadataValue The Metadata value.
        */
        public void setMetadata(final HashMap<String, String> metadataValue) {
            this.metadata = metadataValue;
        }
        
        private HashMap<String, String> properties;
        
        /**
        * Optional. A set of name/value pairs that contain properties for a web
        * site.
        * @return The Properties value.
        */
        public HashMap<String, String> getProperties() {
            return this.properties;
        }
        
        /**
        * Optional. A set of name/value pairs that contain properties for a web
        * site.
        * @param propertiesValue The Properties value.
        */
        public void setProperties(final HashMap<String, String> propertiesValue) {
            this.properties = propertiesValue;
        }
        
        /**
        * Initializes a new instance of the WebSiteProperties class.
        *
        */
        public WebSiteProperties() {
            this.setAppSettings(new LazyHashMap<String, String>());
            this.setMetadata(new LazyHashMap<String, String>());
            this.setProperties(new LazyHashMap<String, String>());
        }
    }
}
