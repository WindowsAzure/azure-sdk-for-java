// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.aad.resource.server;

import java.util.Collection;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;

/**
 * A {@link Converter} that takes a {@link Jwt} and converts it into a {@link PreAuthenticatedAuthenticationToken}.
 */
public class AzureJwtBearerTokenAuthenticationConverter implements Converter<Jwt, AbstractAuthenticationToken> {

    private Converter<Jwt, Collection<GrantedAuthority>> jwtGrantedConverter
        = new JwtGrantedAuthoritiesConverter();

    public AzureJwtBearerTokenAuthenticationConverter() {
    }

    public AzureJwtBearerTokenAuthenticationConverter(String authoritiesClaimName) {
        JwtGrantedAuthoritiesConverter jwtGrantedAuthoritiesConverter = new JwtGrantedAuthoritiesConverter();
        jwtGrantedAuthoritiesConverter.setAuthoritiesClaimName(authoritiesClaimName);
        this.jwtGrantedConverter = jwtGrantedAuthoritiesConverter;
    }

    protected Collection<GrantedAuthority> extractAuthorities(Jwt jwt) {
        return this.jwtGrantedConverter.convert(jwt);
    }

    @Override
    public AbstractAuthenticationToken convert(Jwt jwt) {
        Collection<GrantedAuthority> authorities = extractAuthorities(jwt);
        AzureOAuth2AuthenticatedPrincipal authenticatedPrincipal = new AzureOAuth2AuthenticatedPrincipal(
            jwt.getHeaders(), jwt.getClaims(), authorities, jwt.getTokenValue());
        return new PreAuthenticatedAuthenticationToken(authenticatedPrincipal, null, authorities);
    }

    public void setJwtGrantedAuthoritiesConverter(
        Converter<Jwt, Collection<GrantedAuthority>> jwtGrantedAuthoritiesConverter) {
        this.jwtGrantedConverter = jwtGrantedAuthoritiesConverter;
    }
}
