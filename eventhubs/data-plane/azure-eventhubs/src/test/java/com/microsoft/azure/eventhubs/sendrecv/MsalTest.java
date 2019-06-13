// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.eventhubs.sendrecv;

import com.microsoft.aad.msal4j.ClientCredentialParameters;
import com.microsoft.aad.msal4j.ClientSecret;
import com.microsoft.aad.msal4j.ConfidentialClientApplication;
import com.microsoft.aad.msal4j.IAuthenticationResult;
import com.microsoft.azure.eventhubs.AzureActiveDirectoryTokenProvider;
import com.microsoft.azure.eventhubs.EventHubClient;

import java.net.MalformedURLException;
import java.util.Collections;
import java.util.concurrent.ExecutionException;

import org.junit.Test;

public class MsalTest extends AadBase {
	final private String authority = "https://login.windows.net/72f988bf-86f1-41af-91ab-2d7cd011db47";
	//final private String authority = AzureActiveDirectoryTokenProvider.COMMON_AUTHORITY;
	final private String clientId = "51ce7943-a1aa-4bb1-b708-8f66656a9242";
	final private String clientSecret = "sMm5YoVVcmb4fUtm=dQa*nY-P-YEkx35";
	
	@Test
	public void runSendReceiveWithAuthCallbackTest() throws Exception {
		final AuthCallback callback = new AuthCallback(this.clientId, this.clientSecret);
		final EventHubClient ehc = EventHubClient.createWithAzureActiveDirectory(MsalTest.endpoint, MsalTest.eventHubName,
				callback, this.executorService, null).get();

		innerTest(ehc);
	}
	
	@Test
	public void runSendReceiveWithAuthCallbackWithAuthorityTest() throws Exception {
		final AuthCallback callback = new AuthCallback(this.clientId, this.clientSecret);
		final EventHubClient ehc = EventHubClient.createWithAzureActiveDirectory(MsalTest.endpoint, MsalTest.eventHubName,
				callback, this.authority, this.executorService, null).get();

		innerTest(ehc);
	}
	
	@Test
	public void runSendReceiveWithAADTokenProvider() throws Exception {
		final AuthCallback callback = new AuthCallback(this.clientId, this.clientSecret);
		final AzureActiveDirectoryTokenProvider aadTokenProvider =
				new AzureActiveDirectoryTokenProvider(callback, this.authority, null);
		final EventHubClient ehc = EventHubClient.createWithTokenProvider(MsalTest.endpoint, MsalTest.eventHubName, aadTokenProvider,
				this.executorService, null).get();
		
		innerTest(ehc);
	}
	
	@Test
	public void runSendReceiveWithCustomTokenProvider() throws Exception {
		final CustomTokenProvider tokenProvider = new CustomTokenProvider(this.authority, this.clientId, this.clientSecret);
		final EventHubClient ehc = EventHubClient.createWithTokenProvider(MsalTest.endpoint, MsalTest.eventHubName, tokenProvider,
				this.executorService, null).get();
		
		innerTest(ehc);
	}
	
	@Override
	String tokenGet(final String authority, final String clientId, final String clientSecret, final String audience, final String extra)
			throws MalformedURLException, InterruptedException, ExecutionException {
		ConfidentialClientApplication app = ConfidentialClientApplication.builder(clientId, new ClientSecret(clientSecret))
				.authority(authority)
				.build();
		
		ClientCredentialParameters parameters = ClientCredentialParameters.builder(Collections.singleton(audience + extra)).build();

		IAuthenticationResult result = app.acquireToken(parameters).get();
		
		System.out.println(result.accessToken());
		System.out.println(decodeToken(result.accessToken()));
		return result.accessToken();
	}
}
