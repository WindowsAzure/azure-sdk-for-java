/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ApplicationGatewaySslPolicyName.
 */
public final class ApplicationGatewaySslPolicyName extends ExpandableStringEnum<ApplicationGatewaySslPolicyName> {
    /** Static value AppGwSslPolicy20150501 for ApplicationGatewaySslPolicyName. */
    public static final ApplicationGatewaySslPolicyName APP_GW_SSL_POLICY20150501 = fromString("AppGwSslPolicy20150501");

    /** Static value AppGwSslPolicy20170401 for ApplicationGatewaySslPolicyName. */
    public static final ApplicationGatewaySslPolicyName APP_GW_SSL_POLICY20170401 = fromString("AppGwSslPolicy20170401");

    /** Static value AppGwSslPolicy20170401S for ApplicationGatewaySslPolicyName. */
    public static final ApplicationGatewaySslPolicyName APP_GW_SSL_POLICY20170401S = fromString("AppGwSslPolicy20170401S");

    /**
     * Creates or finds a ApplicationGatewaySslPolicyName from its string representation.
     * @param name a name to look for
     * @return the corresponding ApplicationGatewaySslPolicyName
     */
    @JsonCreator
    public static ApplicationGatewaySslPolicyName fromString(String name) {
        return fromString(name, ApplicationGatewaySslPolicyName.class);
    }

    /**
     * @return known ApplicationGatewaySslPolicyName values
     */
    public static Collection<ApplicationGatewaySslPolicyName> values() {
        return values(ApplicationGatewaySslPolicyName.class);
    }
}
