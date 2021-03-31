// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.aad.webapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.InMemoryOAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.context.support.TestPropertySourceUtils.addInlinedPropertiesToEnvironment;

public class AADOAuth2AuthorizedOboClientRepositoryTest {

    private static final String OBO_ACCESS_TOKEN_1 =
        "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6ImtnMkxZczJUMENUaklmajRydDZKSXluZW4zOCIsImtpZCI6ImtnMkxZczJUMENUaklmajRydDZKSXluZW4zOCJ9.eyJhdWQiOiJhcGk6Ly9zYW1wbGUtY2xpZW50LWlkIiwiaXNzIjoiaHR0cHM6Ly9zdHMud2luZG93cy5uZXQvMWQxYTA2YTktYjIwYS00NTEzLThhNjQtZGFiMDhkMzJjOGI2LyIsImlhdCI6MTYwNzA3NTc1MiwibmJmIjoxNjA3MDc1NzUyLCJleHAiOjE2MDcwNzk2NTIsImFjciI6IjEiLCJhaW8iOiJBVFFBeS84UkFBQUFkSllKZkluaHhoWHBQTStVUVR0TmsrcnJnWG1FQmRpL0JhQWJUOGtQT2t1amJhQ2pBSTNBeUZWcnE0NGZHdHNOIiwiYW1yIjpbInB3ZCJdLCJhcHBpZCI6ImZmMzhjYjg2LTljMzgtNGUyMS1iZTY4LWM1ODFhNTVmYjVjMCIsImFwcGlkYWNyIjoiMSIsImZhbWlseV9uYW1lIjoiY2hlbiIsImdpdmVuX25hbWUiOiJhbXkiLCJpcGFkZHIiOiIxNjcuMjIwLjI1NS42OCIsIm5hbWUiOiJhbXkgY2hlbiIsIm9pZCI6ImFiZDI4ZGUxLTljMzctNDg5ZC04ZWVjLWZlZWVmNGQyNzRhMyIsInJoIjoiMC5BQUFBcVFZYUhRcXlFMFdLWk5xd2pUTEl0b2JMT1A4NG5DRk92bWpGZ2FWZnRjQjRBQUkuIiwic2NwIjoiUmVzb3VyY2VBY2Nlc3NDdXN0b21SZXNvdXJjZXMucmVhZCBSZXNvdXJjZUFjY2Vzc0dyYXBoLnJlYWQgUmVzb3VyY2VBY2Nlc3NPdGhlclJlc291cmNlcy5yZWFkIiwic3ViIjoiS0xyMXZFQTN3Wk1MdWFFZU1IUl80ZmdTdVVVVnNJWDhHREVlOWU5M1BPYyIsInRpZCI6IjFkMWEwNmE5LWIyMGEtNDUxMy04YTY0LWRhYjA4ZDMyYzhiNiIsInVuaXF1ZV9uYW1lIjoiYW15QG1vYXJ5Lm9ubWljcm9zb2Z0LmNvbSIsInVwbiI6ImFteUBtb2FyeS5vbm1pY3Jvc29mdC5jb20iLCJ1dGkiOiJFTG1xXzZVUkJFS19kN3I4ZlFJR0FBIiwidmVyIjoiMS4wIn0.fM_huHrr5M243oM3rMagGGckoxkLanFkurMJz4EBthrdQlFJzl6eo13pmU0Taq2ognAzsxUka0yihImrvhqzub9IGxRtCdQ3NAvD1fAiVdSUt_aBetIFCi5Pdc6I7KJDiGMQh8RTmduM7IOdxV_3-rug6dZXhW5TTmeq5PfLGYlrKOkC2za7M5G7gn7li1D5osh98HorFBWZoCDhe1iJPd_p_m0EffwTbKFwyvOGN-PKxyzOnoCOma_VYvRABUtBa8rNBFTaH5R9EAvsOmIZ_mI98Irl_8QNr9No-R0nXOrqKCFx5sMYkUuT7mvSaVPAlNr2X8eJjY3Wi-6ishufWQ";

    private static final String OBO_ACCESS_TOKEN_2 =
        "eyJ0eXAiOiJKV1QiLCJub25jZSI6IkV2OUJILXNUcGdGYUwxTG5NSEVERGFUWDhVYmpuWmdVSEM4SF9BTmpUaXMiLCJhbGciOiJSUzI1NiIsIng1dCI6ImtnMkxZczJUMENUaklmajRydDZKSXluZW4zOCIsImtpZCI6ImtnMkxZczJUMENUaklmajRydDZKSXluZW4zOCJ9.eyJhdWQiOiJodHRwczovL2dyYXBoLm1pY3Jvc29mdC5jb20iLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC8zMDhkZjA4YS0xMzMyLTRhMTUtYmIwNi0yYWQ3ZThiNzFiY2YvIiwiaWF0IjoxNjA3NTg4NTMwLCJuYmYiOjE2MDc1ODg1MzAsImV4cCI6MTYwNzU5MjQzMCwiYWNjdCI6MCwiYWNyIjoiMSIsImFjcnMiOlsidXJuOnVzZXI6cmVnaXN0ZXJzZWN1cml0eWluZm8iLCJ1cm46bWljcm9zb2Z0OnJlcTEiLCJ1cm46bWljcm9zb2Z0OnJlcTIiLCJ1cm46bWljcm9zb2Z0OnJlcTMiLCJjMSIsImMyIiwiYzMiLCJjNCIsImM1IiwiYzYiLCJjNyIsImM4IiwiYzkiLCJjMTAiLCJjMTEiLCJjMTIiLCJjMTMiLCJjMTQiLCJjMTUiLCJjMTYiLCJjMTciLCJjMTgiLCJjMTkiLCJjMjAiLCJjMjEiLCJjMjIiLCJjMjMiLCJjMjQiLCJjMjUiXSwiYWlvIjoiQVNRQTIvOFJBQUFBcVJFS29VQ0I2aFFoVmQxN0I3ZFhVb1NSbDlDZHpkL01yQjJZcWdRTXJXTT0iLCJhbXIiOlsicHdkIl0sImFwcF9kaXNwbGF5bmFtZSI6IkphdmEtd2ViYXBpIiwiYXBwaWQiOiIyYzQ3YjgzMS1kODM4LTQ2NGYtYTY4NC1mYTc5Y2JkNjRmMjAiLCJhcHBpZGFjciI6IjAiLCJoYXN3aWRzIjoidHJ1ZSIsImlkdHlwIjoidXNlciIsImlwYWRkciI6IjE2Ny4yMjAuMjU1LjExMSIsIm5hbWUiOiJBQURfVEVTVF9HWkgiLCJvaWQiOiJhMzlkMDEwMy0yZjBhLTQ1ZjAtYTEwNy1mOWZhZGVkYmQyNjgiLCJwbGF0ZiI6IjMiLCJwdWlkIjoiMTAwMzIwMDBFNjM0ODE1NyIsInJoIjoiMC5BQUFBaXZDTk1ESVRGVXE3QmlyWDZMY2J6ekc0Unl3NDJFOUdwb1Q2ZWN2V1R5QjFBQ3cuIiwic2NwIjoiVXNlci5SZWFkIFVzZXIuUmVhZC5BbGwgcHJvZmlsZSBvcGVuaWQgZW1haWwiLCJzdWIiOiJPenlvOUZkVzIyMWh0QjBOc0ZnR1VseGg3UnQ1UUFDaExYek9UdDlTQWU0IiwidGVuYW50X3JlZ2lvbl9zY29wZSI6Ik5BIiwidGlkIjoiMzA4ZGYwOGEtMTMzMi00YTE1LWJiMDYtMmFkN2U4YjcxYmNmIiwidW5pcXVlX25hbWUiOiJhYWRfdGVzdF9nemhAY29udG9zb3JnMjIyLm9ubWljcm9zb2Z0LmNvbSIsInVwbiI6ImFhZF90ZXN0X2d6aEBjb250b3NvcmcyMjIub25taWNyb3NvZnQuY29tIiwidXRpIjoiWXVzOU1pY2oxRTZqcW1XbWVPUU5BQSIsInZlciI6IjEuMCIsInhtc19zdCI6eyJzdWIiOiJiN3FKY3kyUUpqUFNOc3lWMTBscFQ3RDRieGVlM1NVQjVmV1p4WHZmZG1vIn0sInhtc190Y2R0IjoxNjAwODQ0ODg0fQ.t9qmH_o7kEPwtr42IBU1mddPiOF_V_CX8IOYW2CJVDwwn0aVCyt9H1vWcV67k5R2Pc29hBZaFJbU6oUFWqhLvzg15mwaI4LNUYrJaXGB-oTFmKFItNjtJ3pi4OsZutvth-EmYAoaeYvqbX2irX7br_ipMqQ5YLq9gf1F3PfV1EqdMuphZoirFYUhEioEM8DA3Qp6qSWMljXBEFDY4eAzT-h-p_7YQI0XH5R72P_4ERNgQ2j_B9ulCUWOGTO61NY3RU1IVwW-w17GLlCGjsakkf4V40_p8fgK8QArwYWlX-WlCt6fGWqjY2c4gvMoCM7bsqBJ9yREgcHzQZNc9N5Rxw";

    private static final String AAD_PROPERTY_PREFIX = "azure.activedirectory.";
    public static final String FAKE_GRAPH = "fake-graph";
    public static final String FAKE_PRINCIPAL_NAME = "fake-principal-name";
    public static final String FAKE_TOKEN_VALUE = "fake-token-value";

    private InMemoryClientRegistrationRepository clientRegistrationsRepo;
    private OAuth2AuthorizedClient client;
    private AADResourceServerOAuth2AuthorizedClientRepository authorizedRepo;
    private JwtAuthenticationToken jwtAuthenticationToken;
    private MockHttpServletRequest mockHttpServletRequest;

    private OAuth2AuthorizedClient mockOAuth2AuthorizedClient;
    private OAuth2AuthorizedClientService oAuth2AuthorizedClientService;

    @BeforeEach
    public void setup() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        addInlinedPropertiesToEnvironment(
            context,
            AAD_PROPERTY_PREFIX + "tenant-id = fake-tenant-id",
            AAD_PROPERTY_PREFIX + "client-id = fake-client-id",
            AAD_PROPERTY_PREFIX + "client-secret = fake-client-secret",
            AAD_PROPERTY_PREFIX + "authorization-clients.fake-graph.scopes = https://graph.microsoft.com/.default"
        );
        context.register(AADResourceServerClientConfiguration.class);
        context.refresh();

        clientRegistrationsRepo = context.getBean(InMemoryClientRegistrationRepository.class);
        setupForAzureAuthorizedClient();
    }

    @SuppressWarnings("unchecked")
    public void setupForAzureAuthorizedClient() {

        OAuth2AccessToken mockAccessToken = mock(OAuth2AccessToken.class);
        when(mockAccessToken.getTokenValue()).thenReturn(OBO_ACCESS_TOKEN_1);

        InMemoryClientRegistrationRepository mockClientRegistrationsRepo = mock(InMemoryClientRegistrationRepository.class);

        when(mockClientRegistrationsRepo.findByRegistrationId(any())).thenReturn(ClientRegistration
            .withRegistrationId(FAKE_GRAPH)
            .authorizationGrantType(new AuthorizationGrantType("on-behalf-of"))
            .redirectUri("{baseUrl}/login/oauth2/code/")
            .tokenUri("https://login.microsoftonline.com/308df08a-1332-4a15-bb06-2ad7e8b71bcf/oauth2/v2.0/token")
            .jwkSetUri("https://login.microsoftonline.com/308df08a-1332-4a15-bb06-2ad7e8b71bcf/discovery/v2.0/keys")
            .authorizationUri("https://login.microsoftonline.com/308df08a-1332-4a15-bb06-2ad7e8b71bcf/oauth2/v2"
                + ".0/authorize")
            .scope("User.read")
            .clientId("2c47b831-d838-464f-a684-fa79cbd64f20").build());

        ClientRegistration mockClientRegistration = mock(ClientRegistration.class);
        when(mockClientRegistration.getRegistrationId()).thenReturn(FAKE_GRAPH);

        mockOAuth2AuthorizedClient = mock(OAuth2AuthorizedClient.class);
        when(mockOAuth2AuthorizedClient.getClientRegistration()).thenReturn(mockClientRegistration);
        when(mockOAuth2AuthorizedClient.getAccessToken()).thenReturn(mockAccessToken);

        oAuth2AuthorizedClientService = new InMemoryOAuth2AuthorizedClientService(mockClientRegistrationsRepo);
        Authentication mockPrinciple = mock(Authentication.class);
        when(mockPrinciple.getName()).thenReturn(FAKE_PRINCIPAL_NAME);
        oAuth2AuthorizedClientService.saveAuthorizedClient(mockOAuth2AuthorizedClient, mockPrinciple);
        authorizedRepo = new AADResourceServerOAuth2AuthorizedClientRepository(
            oAuth2AuthorizedClientService,
            mockClientRegistrationsRepo) {
        };

        final Jwt mockJwt = mock(Jwt.class);
        when(mockJwt.getTokenValue()).thenReturn(FAKE_TOKEN_VALUE);
        when(mockJwt.getSubject()).thenReturn(FAKE_PRINCIPAL_NAME);

        jwtAuthenticationToken = new JwtAuthenticationToken(mockJwt);
        mockHttpServletRequest = new MockHttpServletRequest();
        client = authorizedRepo.loadAuthorizedClient(FAKE_GRAPH,
            jwtAuthenticationToken,
            mockHttpServletRequest
        );
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testLoadAzureAuthorizedClient() {
        Assertions.assertEquals(OBO_ACCESS_TOKEN_1, client.getAccessToken().getTokenValue());
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testAuthorizedClientCache() {

        Assertions.assertEquals(OBO_ACCESS_TOKEN_1, client.getAccessToken().getTokenValue());

        client = authorizedRepo.loadAuthorizedClient(FAKE_GRAPH,
            jwtAuthenticationToken,
            mockHttpServletRequest
        );

        Assertions.assertEquals(OBO_ACCESS_TOKEN_1, client.getAccessToken().getTokenValue());
        Assertions.assertEquals(mockOAuth2AuthorizedClient, client);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testLoadNotExistClientRegistration() {

        AADResourceServerOAuth2AuthorizedClientRepository authorizedRepo = new AADResourceServerOAuth2AuthorizedClientRepository(
            oAuth2AuthorizedClientService,
            clientRegistrationsRepo);

        final Jwt mockJwt = mock(Jwt.class);
        OAuth2AuthorizedClient client = authorizedRepo.loadAuthorizedClient("fake-graph-fake", new
            JwtAuthenticationToken(mockJwt), new MockHttpServletRequest());
        Assertions.assertNull(client);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testNotExistClientApplication() {

        AADResourceServerOAuth2AuthorizedClientRepository authorizedRepo = new AADResourceServerOAuth2AuthorizedClientRepository(
            oAuth2AuthorizedClientService,
            clientRegistrationsRepo) {
        };

        final Jwt mockJwt = mock(Jwt.class);
        when(mockJwt.getTokenValue()).thenReturn(FAKE_TOKEN_VALUE);
        when(mockJwt.getSubject()).thenReturn("not-exist-client");
        OAuth2AuthorizedClient client = authorizedRepo.loadAuthorizedClient(FAKE_GRAPH, new
            JwtAuthenticationToken(mockJwt), new MockHttpServletRequest());
        Assertions.assertNull(client);
    }

}
