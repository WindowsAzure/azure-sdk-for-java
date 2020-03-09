// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity.implementation;

import com.microsoft.aad.msal4j.IAccount;
import com.microsoft.aad.msal4j.IAuthenticationResult;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * Type representing authentication result from the MSAL (Microsoft Authentication Library).
 */
public final class MsalToken extends IdentityToken {

    private IAccount account;

    /**
     * Creates an access token instance.
     *
     * @param msalResult the raw authentication result returned by MSAL
     */
    public MsalToken(IAuthenticationResult msalResult, IdentityClientOptions options) {
        super(msalResult.accessToken(),
                OffsetDateTime.ofInstant(msalResult.expiresOnDate().toInstant(), ZoneOffset.UTC),
                options);
        this.account = msalResult.account();
    }

    /**
     * @return the signed in account
     */
    public IAccount getAccount() {
        return account;
    }
}
