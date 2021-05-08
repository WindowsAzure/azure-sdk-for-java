// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.aad.webapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * A tenant id is used to construct the trusted issuer repository.
 */
public class AADTrustedIssuerRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(AADTrustedIssuerRepository.class);

    private static final String LOGIN_MICROSOFT_ONLINE_ISSUER = "https://login.microsoftonline.com/";

    private static final String STS_WINDOWS_ISSUER = "https://sts.windows.net/";

    private static final String STS_CHINA_CLOUD_API_ISSUER = "https://sts.chinacloudapi.cn/";

    private static final String PATH_DELIMITER = "/";

    private static final String PATH_DELIMITER_V2 = "/v2.0";

    protected List<String> trustedIssuers = new ArrayList<>();

    protected String tenantId;

    public AADTrustedIssuerRepository(String tenantId) {
        this.tenantId = tenantId;
        trustedIssuers.addAll(buildAADIssuers(PATH_DELIMITER));
        trustedIssuers.addAll(buildAADIssuers(PATH_DELIMITER_V2));
    }

    private List<String> buildAADIssuers(String delimiter) {
        return Stream.of(LOGIN_MICROSOFT_ONLINE_ISSUER, STS_WINDOWS_ISSUER, STS_CHINA_CLOUD_API_ISSUER)
                     .map(s -> s + tenantId + delimiter)
                     .collect(Collectors.toList());
    }

    public List<String> getTrustedIssuers() {
        return Collections.unmodifiableList(trustedIssuers);
    }

    public boolean addTrustedIssuer(String... issuers) {
        return trustedIssuers
            .addAll(Arrays.stream(issuers).collect(Collectors.toSet()));
    }

    @Deprecated
    public void addB2CIssuer(String baseUri) {
        Assert.notNull(baseUri, "baseUri cannot be null.");
        trustedIssuers.add(String.format(resolveBaseUri(baseUri) + "/%s/v2.0/", tenantId));
    }

    /**
     * Only the V2 version of Access Token is supported when using Azure AD B2C user flows.
     *
     * @param baseUri The base uri is the domain part of the endpoint.
     * @param userFlows The all user flows mapping which is created under b2c tenant.
     * @deprecated Is not recommended in {@link AADTrustedIssuerRepository} add AAD B2C related content.
     */
    @Deprecated
    public void addB2CUserFlowIssuers(String baseUri, Map<String, String> userFlows) {
        Assert.notNull(userFlows, "userFlows cannot be null.");
        String resolvedBaseUri = resolveBaseUri(baseUri);
        userFlows.keySet().forEach(key -> createB2CUserFlowIssuer(resolvedBaseUri, userFlows.get(key)));
    }

    @Deprecated
    private void createB2CUserFlowIssuer(String resolveBaseUri, String userFlowName) {
        trustedIssuers.add(String.format(resolveBaseUri + "/tfp/%s/%s/v2.0/", tenantId, userFlowName.toLowerCase()));
    }

    /**
     * Resolve the base uri to get scheme and host.
     *
     * @param baseUri baseUri Base uri in the configuration file.
     * @return the parsed base uri.
     * @throws RuntimeException thrown if the uri is not valid.
     */
    protected String resolveBaseUri(String baseUri) {
        Assert.notNull(baseUri, "baseUri cannot be null");
        try {
            URI uri = new URI(baseUri);
            return uri.getScheme() + "://" + uri.getHost();
        } catch (URISyntaxException e) {
            LOGGER.error("Resolve the base uri exception.");
            throw new RuntimeException("Resolve the base uri:'" + baseUri + "' exception.");
        }
    }
}
