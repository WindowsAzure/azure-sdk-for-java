// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity;

import com.azure.core.annotation.Immutable;

import java.time.Duration;

/**
 * Response returned from the STS device code endpoint containing information necessary for
 * device code flow.
 */
@Immutable
public class DeviceCodeChallenge {
    /**
     * Creates an instance of a device code challenge.
     *
     * @param userCode code which user needs to provide when authenticating at the verification URI
     * @param deviceCode code which should be included in the request for the access token
     * @param verificationUrl URI where user can authenticate
     * @param expiresIn expiration time of device code in seconds
     * @param pollInterval pollInterval at which the STS should be polled at
     * @param message message which should be displayed to the user
     */
    public DeviceCodeChallenge(String userCode, String deviceCode, String verificationUrl, Duration expiresIn,
                               Duration pollInterval, String message) {
        this.userCode = userCode;
        this.deviceCode = deviceCode;
        this.verificationUrl = verificationUrl;
        this.expiresIn = expiresIn;
        this.pollInterval = pollInterval;
        this.message = message;
    }

    private final String userCode;

    private final String deviceCode;

    private final String verificationUrl;

    private final Duration expiresIn;

    private final Duration pollInterval;

    private final String message;


    /**
     * @return code which user needs to provide when authenticating at the verification URI.
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * @return code which should be included in the request for the access token.
     */
    public String getDeviceCode() {
        return deviceCode;
    }

    /**
     * @return URI where user can authenticate.
     */
    public String getVerificationUrl() {
        return verificationUrl;
    }

    /**
     * @return expiration time of device code.
     */
    public Duration getExpiresIn() {
        return expiresIn;
    }

    /**
     * @return pollInterval at which the STS should be polled at.
     */
    public Duration getPollInterval() {
        return pollInterval;
    }

    /**
     * @return message which should be displayed to the user.
     */
    public String getMessage() {
        return message;
    }
}
