// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.autoconfigure.aad;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.azure.spring.aad.AADAuthorizationGrantType;
import com.azure.spring.aad.webapp.AuthorizationClientProperties;
import com.nimbusds.jose.jwk.source.RemoteJWKSet;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import com.azure.spring.aad.AADApplicationType;
import static com.azure.spring.aad.AADApplicationType.defaultApplicationType;
import static com.azure.spring.aad.AADApplicationType.validateApplicationType;
import static com.azure.spring.aad.AADAuthorizationGrantType.AUTHORIZATION_CODE;
import static com.azure.spring.aad.AADAuthorizationGrantType.CLIENT_CREDENTIALS;
import static com.azure.spring.aad.AADAuthorizationGrantType.ON_BEHALF_OF;
import static com.azure.spring.aad.AADClientRegistrationRepository.AZURE_CLIENT_REGISTRATION_ID;

/**
 * Configuration properties for Azure Active Directory Authentication.
 */
@Validated
@ConfigurationProperties("azure.activedirectory")
public class AADAuthenticationProperties implements InitializingBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(AADAuthenticationProperties.class);

    private static final long DEFAULT_JWK_SET_CACHE_LIFESPAN = TimeUnit.MINUTES.toMillis(5);
    private static final long DEFAULT_JWK_SET_CACHE_REFRESH_TIME = DEFAULT_JWK_SET_CACHE_LIFESPAN;

    /**
     * Default UserGroup configuration.
     */
    private UserGroupProperties userGroup = new UserGroupProperties();

    /**
     * Registered application ID in Azure AD. Must be configured when OAuth2 authentication is done in front end
     */
    private String clientId;

    /**
     * API Access Key of the registered application. Must be configured when OAuth2 authentication is done in front end
     */
    private String clientSecret;

    /**
     * Decide which claim to be principal's name..
     */
    private String userNameAttribute;

    /**
     * Redirection Endpoint: Used by the authorization server to return responses containing authorization credentials
     * to the client via the resource owner user-agent.
     */
    private String redirectUriTemplate;

    /**
     * App ID URI which might be used in the <code>"aud"</code> claim of an <code>id_token</code>.
     */
    private String appIdUri;

    /**
     * Add additional parameters to the Authorization URL.
     */
    private Map<String, Object> authenticateAdditionalParameters;

    /**
     * Connection Timeout for the JWKSet Remote URL call.
     */
    private int jwtConnectTimeout = RemoteJWKSet.DEFAULT_HTTP_CONNECT_TIMEOUT; /* milliseconds */

    /**
     * Read Timeout for the JWKSet Remote URL call.
     */
    private int jwtReadTimeout = RemoteJWKSet.DEFAULT_HTTP_READ_TIMEOUT; /* milliseconds */

    /**
     * Size limit in Bytes of the JWKSet Remote URL call.
     */
    private int jwtSizeLimit = RemoteJWKSet.DEFAULT_HTTP_SIZE_LIMIT; /* bytes */

    /**
     * The lifespan of the cached JWK set before it expires, default is 5 minutes.
     */
    private long jwkSetCacheLifespan = DEFAULT_JWK_SET_CACHE_LIFESPAN;

    /**
     * The refresh time of the cached JWK set before it expires, default is 5 minutes.
     */
    private long jwkSetCacheRefreshTime = DEFAULT_JWK_SET_CACHE_REFRESH_TIME;

    /**
     * Azure Tenant ID.
     */
    private String tenantId;

    private String postLogoutRedirectUri;

    /**
     * If Telemetry events should be published to Azure AD.
     */
    private boolean allowTelemetry = true;

    /**
     * If <code>true</code> activates the stateless auth filter {@link AADAppRoleStatelessAuthenticationFilter}. The
     * default is <code>false</code> which activates {@link AADAuthenticationFilter}.
     */
    private Boolean sessionStateless = false;

    private String baseUri;

    private String graphBaseUri;

    private String graphMembershipUri;

    private Map<String, AuthorizationClientProperties> authorizationClients = new HashMap<>();

    private AADApplicationType applicationType;

    public AADApplicationType getApplicationType() {
        if (applicationType == null) {
            applicationType = defaultApplicationType(this);
        }
        return applicationType;
    }

    public void setApplicationType(AADApplicationType applicationType) {
        this.applicationType = applicationType;
    }

    @DeprecatedConfigurationProperty(
        reason = "Configuration moved to UserGroup class to keep UserGroup properties together",
        replacement = "azure.activedirectory.user-group.allowed-group-names")
    public List<String> getActiveDirectoryGroups() {
        return userGroup.getAllowedGroups();
    }

    /**
     * Properties dedicated to changing the behavior of how the groups are mapped from the Azure AD response. Depending
     * on the graph API used the object will not be the same.
     */
    public static class UserGroupProperties {

        private final Log logger = LogFactory.getLog(UserGroupProperties.class);

        /**
         * Expected UserGroups that an authority will be granted to if found in the response from the MemeberOf Graph
         * API Call.
         */
        private List<String> allowedGroupNames = new ArrayList<>();

        private Set<String> allowedGroupIds = new HashSet<>();

        /**
         * enableFullList is used to control whether to list all group id, default is false
         */
        private Boolean enableFullList = false;

        public Set<String> getAllowedGroupIds() {
            return allowedGroupIds;
        }

        /**
         * Set the allowed group ids.
         *
         * @param allowedGroupIds Allowed group ids.
         */
        public void setAllowedGroupIds(Set<String> allowedGroupIds) {
            this.allowedGroupIds = allowedGroupIds;
        }

        public List<String> getAllowedGroupNames() {
            return allowedGroupNames;
        }

        public void setAllowedGroupNames(List<String> allowedGroupNames) {
            this.allowedGroupNames = allowedGroupNames;
        }

        @Deprecated
        @DeprecatedConfigurationProperty(
            reason = "enable-full-list is not easy to understand.",
            replacement = "allowed-group-ids: all")
        public Boolean getEnableFullList() {
            return enableFullList;
        }

        @Deprecated
        public void setEnableFullList(Boolean enableFullList) {
            logger.warn(" 'azure.activedirectory.user-group.enable-full-list' property detected! "
                + "Use 'azure.activedirectory.user-group.allowed-group-ids: all' instead!");
            this.enableFullList = enableFullList;
        }

        @Deprecated
        @DeprecatedConfigurationProperty(
            reason = "In order to distinguish between allowed-group-ids and allowed-group-names, set allowed-groups "
                + "deprecated.",
            replacement = "azure.activedirectory.user-group.allowed-group-names")
        public List<String> getAllowedGroups() {
            return allowedGroupNames;
        }

        @Deprecated
        public void setAllowedGroups(List<String> allowedGroups) {
            logger.warn(" 'azure.activedirectory.user-group.allowed-groups' property detected! " + " Use 'azure"
                + ".activedirectory.user-group.allowed-group-names' instead!");
            this.allowedGroupNames = allowedGroups;
        }

    }

    public boolean allowedGroupNamesConfigured() {
        return Optional.of(this.getUserGroup())
                       .map(UserGroupProperties::getAllowedGroupNames)
                       .map(allowedGroupNames -> !allowedGroupNames.isEmpty())
                       .orElse(false);
    }

    public boolean allowedGroupIdsConfigured() {
        return Optional.of(this.getUserGroup())
                       .map(UserGroupProperties::getAllowedGroupIds)
                       .map(allowedGroupIds -> !allowedGroupIds.isEmpty())
                       .orElse(false);
    }

    public UserGroupProperties getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroupProperties userGroup) {
        this.userGroup = userGroup;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getUserNameAttribute() {
        return userNameAttribute;
    }

    public void setUserNameAttribute(String userNameAttribute) {
        this.userNameAttribute = userNameAttribute;
    }

    public String getRedirectUriTemplate() {
        return redirectUriTemplate;
    }

    public void setRedirectUriTemplate(String redirectUriTemplate) {
        this.redirectUriTemplate = redirectUriTemplate;
    }

    @Deprecated
    public void setActiveDirectoryGroups(List<String> activeDirectoryGroups) {
        this.userGroup.setAllowedGroups(activeDirectoryGroups);
    }

    public String getAppIdUri() {
        return appIdUri;
    }

    public void setAppIdUri(String appIdUri) {
        this.appIdUri = appIdUri;
    }

    public Map<String, Object> getAuthenticateAdditionalParameters() {
        return authenticateAdditionalParameters;
    }

    public void setAuthenticateAdditionalParameters(Map<String, Object> authenticateAdditionalParameters) {
        this.authenticateAdditionalParameters = authenticateAdditionalParameters;
    }

    public int getJwtConnectTimeout() {
        return jwtConnectTimeout;
    }

    public void setJwtConnectTimeout(int jwtConnectTimeout) {
        this.jwtConnectTimeout = jwtConnectTimeout;
    }

    public int getJwtReadTimeout() {
        return jwtReadTimeout;
    }

    public void setJwtReadTimeout(int jwtReadTimeout) {
        this.jwtReadTimeout = jwtReadTimeout;
    }

    public int getJwtSizeLimit() {
        return jwtSizeLimit;
    }

    public void setJwtSizeLimit(int jwtSizeLimit) {
        this.jwtSizeLimit = jwtSizeLimit;
    }

    public long getJwkSetCacheLifespan() {
        return jwkSetCacheLifespan;
    }

    public void setJwkSetCacheLifespan(long jwkSetCacheLifespan) {
        this.jwkSetCacheLifespan = jwkSetCacheLifespan;
    }

    public long getJwkSetCacheRefreshTime() {
        return jwkSetCacheRefreshTime;
    }

    public void setJwkSetCacheRefreshTime(long jwkSetCacheRefreshTime) {
        this.jwkSetCacheRefreshTime = jwkSetCacheRefreshTime;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getPostLogoutRedirectUri() {
        return postLogoutRedirectUri;
    }

    public void setPostLogoutRedirectUri(String postLogoutRedirectUri) {
        this.postLogoutRedirectUri = postLogoutRedirectUri;
    }

    @Deprecated
    @DeprecatedConfigurationProperty(
        reason = "Deprecate the telemetry endpoint and use HTTP header User Agent instead.")
    public boolean isAllowTelemetry() {
        return allowTelemetry;
    }

    public void setAllowTelemetry(boolean allowTelemetry) {
        this.allowTelemetry = allowTelemetry;
    }

    public Boolean getSessionStateless() {
        return sessionStateless;
    }

    public void setSessionStateless(Boolean sessionStateless) {
        this.sessionStateless = sessionStateless;
    }

    public String getBaseUri() {
        return baseUri;
    }

    public void setBaseUri(String baseUri) {
        this.baseUri = baseUri;
    }

    public String getGraphBaseUri() {
        return graphBaseUri;
    }

    public void setGraphBaseUri(String graphBaseUri) {
        this.graphBaseUri = graphBaseUri;
    }

    public String getGraphMembershipUri() {
        return graphMembershipUri;
    }

    public void setGraphMembershipUri(String graphMembershipUri) {
        this.graphMembershipUri = graphMembershipUri;
    }

    public Map<String, AuthorizationClientProperties> getAuthorizationClients() {
        return authorizationClients;
    }

    public void setAuthorizationClients(Map<String, AuthorizationClientProperties> authorizationClients) {
        this.authorizationClients = authorizationClients;
    }

    public boolean isAllowedGroup(String group) {
        return Optional.ofNullable(getUserGroup())
                       .map(UserGroupProperties::getAllowedGroupNames)
                       .orElseGet(Collections::emptyList)
                       .contains(group)
            || Optional.ofNullable(getUserGroup())
                       .map(UserGroupProperties::getAllowedGroupIds)
                       .orElseGet(Collections::emptySet)
                       .contains(group);
    }

    @Override
    public void afterPropertiesSet() {

        if (!StringUtils.hasText(baseUri)) {
            baseUri = "https://login.microsoftonline.com/";
        } else {
            baseUri = addSlash(baseUri);
        }

        if (!StringUtils.hasText(redirectUriTemplate)) {
            redirectUriTemplate = "{baseUrl}/login/oauth2/code/";
        }

        if (!StringUtils.hasText(graphBaseUri)) {
            graphBaseUri = "https://graph.microsoft.com/";
        } else {
            graphBaseUri = addSlash(graphBaseUri);
        }

        if (!StringUtils.hasText(graphMembershipUri)) {
            graphMembershipUri = graphBaseUri + "v1.0/me/memberOf";
        }

        if (!graphMembershipUri.startsWith(graphBaseUri)) {
            throw new IllegalStateException("azure.activedirectory.graph-base-uri should be "
                + "the prefix of azure.activedirectory.graph-membership-uri. "
                + "azure.activedirectory.graph-base-uri = " + graphBaseUri + ", "
                + "azure.activedirectory.graph-membership-uri = " + graphMembershipUri + ".");
        }

        Set<String> allowedGroupIds = userGroup.getAllowedGroupIds();
        if (allowedGroupIds.size() > 1 && allowedGroupIds.contains("all")) {
            throw new IllegalStateException("When azure.activedirectory.user-group.allowed-group-ids contains 'all', "
                + "no other group ids can be configured. "
                + "But actually azure.activedirectory.user-group.allowed-group-ids="
                + allowedGroupIds);
        }

        if (!StringUtils.hasText(tenantId)) {
            tenantId = "common";
        }

        if (isMultiTenantsApplication(tenantId) && !userGroup.getAllowedGroups().isEmpty()) {
            throw new IllegalStateException("When azure.activedirectory.tenant-id is 'common/organizations/consumers', "
                + "azure.activedirectory.user-group.allowed-groups/allowed-group-names should be empty. "
                + "But actually azure.activedirectory.tenant-id=" + tenantId
                + ", and azure.activedirectory.user-group.allowed-groups/allowed-group-names="
                + userGroup.getAllowedGroups());
        }

        if (isMultiTenantsApplication(tenantId) && !userGroup.getAllowedGroupIds().isEmpty()) {
            throw new IllegalStateException("When azure.activedirectory.tenant-id is 'common/organizations/consumers', "
                + "azure.activedirectory.user-group.allowed-group-ids should be empty. "
                + "But actually azure.activedirectory.tenant-id=" + tenantId
                + ", and azure.activedirectory.user-group.allowed-group-ids=" + userGroup.getAllowedGroupIds());
        }

        if (applicationType == null) {
            applicationType = defaultApplicationType(this);
            LOGGER.debug("The application type '{}' was detected.", applicationType.getValue());
        } else {
            LOGGER.debug("The application type '{}' was configured.", applicationType.getValue());
            if (!validateApplicationType(this)) {
                throw new IllegalStateException("The application type '"
                    + applicationType.getValue() + "' and the dependency do not match.");
            }
        }
        if (!CollectionUtils.isEmpty(authorizationClients)) {
            if (!StringUtils.hasText(clientId)) {
                throw new IllegalStateException("'client-id' must be configured when using client registration.");
            }
            authorizationClients.forEach(this::validateAuthorizationClientProperties);
        }
    }

    private void validateAuthorizationClientProperties(String registrationId,
                                                       AuthorizationClientProperties properties) {
        String type = Optional.of(properties)
                              .map(AuthorizationClientProperties::getAuthorizationGrantType)
                              .map(AADAuthorizationGrantType::getValue)
                              .orElse(null);
        if (null == type) {
            if (isWebApplicationOnly() || AZURE_CLIENT_REGISTRATION_ID.equals(registrationId)) {
                properties.setAuthorizationGrantType(AUTHORIZATION_CODE);
                LOGGER.debug("The client '{}' sets the default value of AADAuthorizationGrantType to "
                    + "'authorization_code'.", registrationId);
            } else if (isResourceServerOnly() || isResourceServerWithObo()) {
                properties.setAuthorizationGrantType(AADAuthorizationGrantType.ON_BEHALF_OF);
                LOGGER.debug("The client '{}' sets the default value of AADAuthorizationGrantType to "
                    + "'on-behalf-of'.", registrationId);
            } else if (isWebApplicationAndResourceServer()) {
                throw new IllegalStateException("azure.activedirectory.authorization-clients." + registrationId
                    + ".authorization-grant-type must be configured. ");
            }
        } else {
            if (!AUTHORIZATION_CODE.getValue().equals(type)
                && !CLIENT_CREDENTIALS.getValue().equals(type)
                && !ON_BEHALF_OF.getValue().equals(type)) {
                throw new IllegalStateException("Valid values are: authorization_code, client_credentials, on-behalf-of");
            }

            if (properties.isOnDemand()
                && !AUTHORIZATION_CODE.getValue().equals(type)) {
                throw new IllegalStateException("onDemand only support authorization_code grant type. Please set "
                    + "'azure.activedirectory.authorization-clients." + registrationId
                    + ".authorization-grant-type=authorization_code'"
                    + " or 'azure.activedirectory.authorization-clients." + registrationId + ".on-demand=false'.");
            }

            if (AZURE_CLIENT_REGISTRATION_ID.equals(registrationId)
                && !AUTHORIZATION_CODE.equals(properties.getAuthorizationGrantType())) {
                throw new IllegalStateException("azure.activedirectory.authorization-clients."
                    + AZURE_CLIENT_REGISTRATION_ID
                    + ".authorization-grant-type must be configured to 'authorization_code'.");
            }
        }

        if (properties.getScopes() == null || properties.getScopes().isEmpty()) {
            throw new IllegalStateException(
                "'azure.activedirectory.authorization-clients." + registrationId + ".scopes' must be configured");
        }
    }

    public boolean isWebApplicationOnly() {
        return AADApplicationType.WEB_APPLICATION == applicationType;
    }

    public boolean isResourceServerOnly() {
        return AADApplicationType.RESOURCE_SERVER == applicationType;
    }

    public boolean isResourceServerWithObo() {
        return AADApplicationType.RESOURCE_SERVER_WITH_OBO == applicationType;
    }

    public boolean isWebApplicationAndResourceServer() {
        return AADApplicationType.WEB_APPLICATION_AND_RESOURCE_SERVER == applicationType;
    }

    private boolean isMultiTenantsApplication(String tenantId) {
        return "common".equals(tenantId) || "organizations".equals(tenantId) || "consumers".equals(tenantId);
    }

    private String addSlash(String uri) {
        return uri.endsWith("/") ? uri : uri + "/";
    }
}
