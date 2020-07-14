// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.resources.fluentcore.policy;

import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import reactor.core.publisher.Mono;

/**
 * Rewrite the UserAgentPolicy, it will use Sdk-Name and Sdk-Version to build default user-agent.
 */
public class UserAgentPolicy implements HttpPipelinePolicy {
    private static final String USER_AGENT_KEY = "User-Agent";
    private static final String SDK_NAME_KEY = "Sdk-Name";
    private static final String SDK_VERSION_KEY = "Sdk-Version";
    private static final String APPLICATION_ID_KEY = "Application-Id";

    private final String defaultSdkName = this.getClass().getPackage().getName();
    private final String defaultSdkVersion = this.getClass().getPackage().getSpecificationVersion();

    private final HttpLogOptions httpLogOptions;
    private final Configuration configuration;

    /**
     * @param httpLogOptions used for get application id
     * @param configuration used for check telemetry enable or not
     */
    public UserAgentPolicy(HttpLogOptions httpLogOptions, Configuration configuration) {
        if (httpLogOptions == null) {
            this.httpLogOptions = new HttpLogOptions();
        } else {
            this.httpLogOptions = httpLogOptions;
        }

        if (configuration == null) {
            this.configuration = Configuration.getGlobalConfiguration();
        } else {
            this.configuration = configuration;
        }
    }

    private static String toUserAgentString(String applicationId, String sdkName, String sdkVersion, Configuration configuration) {
        StringBuilder userAgentBuilder = new StringBuilder();
        if (applicationId != null) {
            applicationId = applicationId.length() > 24 ? applicationId.substring(0, 24) : applicationId;
            userAgentBuilder.append(applicationId).append(" ");
        }

        userAgentBuilder.append("azsdk-java").append("-").append(sdkName).append("/").append(sdkVersion);
        if (!isTelemetryDisabled(configuration)) {
            userAgentBuilder.append(" ").append("(").append(getPlatformInfo()).append(")");
        }

        return userAgentBuilder.toString();
    }

    private static String getPlatformInfo() {
        String javaVersion = Configuration.getGlobalConfiguration().get("java.version");
        String osName = Configuration.getGlobalConfiguration().get("os.name");
        String osVersion = Configuration.getGlobalConfiguration().get("os.version");
        return String.format("%s; %s; %s", javaVersion, osName, osVersion);
    }

    private static boolean isTelemetryDisabled(Configuration configuration) {
        return configuration == null ? (Boolean)Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false) : (Boolean)configuration.get("AZURE_TELEMETRY_DISABLED", false);
    }

    @Override
    public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
        String userAgent = context.getHttpRequest().getHeaders().getValue(USER_AGENT_KEY);
        if (!CoreUtils.isNullOrEmpty(userAgent)) {
            return next.process();
        }

        userAgent = context.getData(USER_AGENT_KEY).orElse("").toString();
        if (!CoreUtils.isNullOrEmpty(userAgent)) {
            context.getHttpRequest().setHeader(USER_AGENT_KEY, userAgent);
            return next.process();
        }

        String sdkName = context.getData(SDK_NAME_KEY).orElse("").toString();
        if (CoreUtils.isNullOrEmpty(sdkName)) {
            sdkName = defaultSdkName;
        }

        String sdkVersion = context.getData(SDK_VERSION_KEY).orElse("").toString();
        if (CoreUtils.isNullOrEmpty(sdkVersion)) {
            sdkVersion = defaultSdkVersion;
        }

        String applicationId = context.getData(APPLICATION_ID_KEY).orElse("").toString();
        if (CoreUtils.isNullOrEmpty(applicationId)) {
            applicationId = httpLogOptions.getApplicationId();
        }

        context.getHttpRequest().setHeader(USER_AGENT_KEY,
            //UserAgentUtil.toUserAgentString(applicationId, sdkName, sdkVersion, configuration));
            toUserAgentString(applicationId, sdkName, sdkVersion, configuration));
        return next.process();
    }
}
