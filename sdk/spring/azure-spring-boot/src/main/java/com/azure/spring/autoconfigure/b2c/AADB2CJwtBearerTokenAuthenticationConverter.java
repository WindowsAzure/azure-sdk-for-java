// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.autoconfigure.b2c;

import com.azure.spring.aad.AADOAuth2AuthenticatedPrincipal;
import com.azure.spring.aad.AbstractJwtBearerTokenAuthenticationConverter;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.OAuth2AuthenticatedPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.BearerTokenAuthentication;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;

import static com.azure.spring.aad.AADJwtGrantedAuthoritiesConverter.DEFAULT_CLAIM_TO_AUTHORITY_PREFIX_MAP;
import static com.azure.spring.aad.AADJwtGrantedAuthoritiesConverter.DEFAULT_PRINCIPAL_CLAIM_NAME;

/**
 * A {@link Converter} that takes a {@link Jwt} and converts it into a {@link BearerTokenAuthentication}.
 */
public class AADB2CJwtBearerTokenAuthenticationConverter extends AbstractJwtBearerTokenAuthenticationConverter {

    /**
     * Use AADJwtGrantedAuthoritiesConverter, it can resolve the access token of scp and roles.
     */
    public AADB2CJwtBearerTokenAuthenticationConverter() {
        this(DEFAULT_PRINCIPAL_CLAIM_NAME, DEFAULT_CLAIM_TO_AUTHORITY_PREFIX_MAP);
    }

    /**
     * Structure AADB2CJwtBearerTokenAuthenticationConverter with the authority claim.
     * @param principalClaimName principal claim name
     * @deprecated Recommended to use others constructor.
     */
    @Deprecated
    public AADB2CJwtBearerTokenAuthenticationConverter(String principalClaimName) {
        super(principalClaimName, DEFAULT_CLAIM_TO_AUTHORITY_PREFIX_MAP.get(DEFAULT_PRINCIPAL_CLAIM_NAME));
    }

    /**
     * Structure AADB2CJwtBearerTokenAuthenticationConverter with the authority claim name and prefix.
     * @param principalClaimName principal claim name
     * @param authorityPrefix the prefix name of the authority
     * @deprecated Recommended to use others constructor.
     */
    @Deprecated
    public AADB2CJwtBearerTokenAuthenticationConverter(String principalClaimName, String authorityPrefix) {
        super(principalClaimName, authorityPrefix);
    }

    public AADB2CJwtBearerTokenAuthenticationConverter(String principalClaimName,
                                                       Map<String, String> claimToAuthorityPrefixMap) {
        super(principalClaimName, claimToAuthorityPrefixMap);
    }

    @Override
    protected OAuth2AuthenticatedPrincipal getAuthenticatedPrincipal(Map<String, Object> headers,
                                                                     Map<String, Object> claims,
                                                                     Collection<GrantedAuthority> authorities,
                                                                     String tokenValue) {
        String name = Optional.ofNullable(principalClaimName)
                              .map(n -> (String) claims.get(n))
                              .orElseGet(() -> (String) claims.get("sub"));
        return new AADOAuth2AuthenticatedPrincipal(headers, claims, authorities, tokenValue, name);
    }
}
