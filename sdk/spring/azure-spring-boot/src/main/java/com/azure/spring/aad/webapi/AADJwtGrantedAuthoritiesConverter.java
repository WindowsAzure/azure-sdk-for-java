package com.azure.spring.aad.webapi;

import org.springframework.core.convert.converter.Converter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Extracts the {@link GrantedAuthority}s from scope attributes typically found in a {@link Jwt}.
 */
public class AADJwtGrantedAuthoritiesConverter implements Converter<Jwt, Collection<GrantedAuthority>> {

    private static final String DEFAULT_SCP_AUTHORITY_PREFIX = "SCOPE_";

    private static final String DEFAULT_ROLES_AUTHORITY_PREFIX = "APPROLE_";

    private static final Collection<String> WELL_KNOWN_AUTHORITIES_CLAIM_NAMES = Arrays.asList("scp", "roles");

    @Override
    public Collection<GrantedAuthority> convert(Jwt jwt) {
        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for (String authority : getAuthorities(jwt)) {
            grantedAuthorities.add(new SimpleGrantedAuthority(authority));
        }
        return grantedAuthorities;
    }

    private Collection<String> getAuthorities(Jwt jwt) {
        List<String> authoritiesList = new ArrayList();
        for (String claimName : WELL_KNOWN_AUTHORITIES_CLAIM_NAMES) {
            if (jwt.containsClaim(claimName)) {
                Object authorities = jwt.getClaim(claimName);
                if (authorities instanceof String) {
                    if (StringUtils.hasText((String) authorities)) {
                        authoritiesList.addAll(Arrays.asList(((String) authorities).split(" "))
                                                     .stream()
                                                     .map(s -> DEFAULT_SCP_AUTHORITY_PREFIX + s)
                                                     .collect(Collectors.toList()));
                    }
                } else if (authorities instanceof Collection) {
                    authoritiesList.addAll(((Collection<?>) authorities)
                        .stream()
                        .filter(s -> StringUtils.hasText((String) s))
                        .map(s -> DEFAULT_ROLES_AUTHORITY_PREFIX + s)
                        .collect(Collectors.toList()));
                }
            }
        }
        return authoritiesList;
    }
}
