/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.network;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.network.model.HasProtocol;
import com.microsoft.azure.management.resources.fluentcore.model.Executable;

/**
 * A client-side reperesentation allowing to verify IP packet flow from specific vm
 * based on direction, protocol, local IP, remote IP, local port and remote port.
 */
@Fluent
@Beta
public interface VerificationIPFlow extends Executable<VerificationIPFlow> {
    /**
     * Get the access value. Indicates whether the traffic is allowed or denied. Possible values
     * include: 'Allow', 'Deny'.
     *
     * @return the access value
     */
    Access access();

    /**
     * Get the ruleName value. If input is not matched against any security rule, it
     * is not displayed.
     *
     * @return the ruleName value
     */
    String ruleName();

    /**
     * The entirety of verification ip flow parameters definition.
     */
    interface Definition extends
            DefinitionStages.WithTargetResource,
            DefinitionStages.WithDirection,
            DefinitionStages.WithProtocol,
            DefinitionStages.WithLocalIP,
            DefinitionStages.WithRemoteIP,
            DefinitionStages.WithLocalPort,
            DefinitionStages.WithRemotePort,
            DefinitionStages.WithExecute {
    }


    /**
     * Grouping of verification ip flow parameters.
     */
    interface DefinitionStages {
        /**
         * The ID of the target resource to perform next-hop on.
         */
        interface WithTargetResource {
            /**
             * Set the targetResourceId value.
             *
             * @param vmId the targetResourceId value to set
             * @return the next stage of the definition.
             */
            WithDirection withTargetResourceId(String vmId);
        }

        /**
         * The direction of the packet represented as a 5-tuple. Possible values
         * include: 'Inbound', 'Outbound'.
         */
        interface WithDirection {
            /**
             * Set the direction value.
             *
             * @param direction the direction value to set
             * @return the next stage of the definition.
             */
            WithProtocol withDirection(Direction direction);

            /**
             * Set inbound direction.
             *
             * @return the next stage of the definition.
             */
            WithProtocol inbound();

            /**
             * Set outbound direction.
             *
             * @return the next stage of the definition.
             */
            WithProtocol outbound();
        }

        /**
         * Protocol to be verified on. Possible values include: 'TCP', 'UDP'.
         */
        interface WithProtocol extends HasProtocol.DefinitionStages.WithProtocol<WithLocalIP, Protocol> {
            /**
             * Set TCP protocol.
             *
             * @return the next stage of the definition
             */
            WithLocalIP withTCP();

            /**
             * Set UDP protocol
             *
             * @return the next stage of the definition
             */
            WithLocalIP withUDP();
        }

        /**
         * The local IP address. Acceptable values are valid IPv4 addresses.
         */
        interface WithLocalIP {
            /**
             * Set the localIPAddress value.
             *
             * @param localIPAddress the localIPAddress value to set
             * @return the next stage of the definition.
             */
            WithRemoteIP withLocalIPAddress(String localIPAddress);
        }

        /**
         * The remote IP address. Acceptable values are valid IPv4 addresses.
         */
        interface WithRemoteIP {
            /**
             * Set the remoteIPAddress value.
             *
             * @param remoteIPAddress the remoteIPAddress value to set
             * @return the next stage of the definition.
             */
            WithLocalPort withRemoteIPAddress(String remoteIPAddress);
        }

        /**
         * The local port. Acceptable values are a single integer in the range
         * (0-65535). Support for * for the source port, which depends on the
         * direction.
         */
        interface WithLocalPort {
            /**
             * Set the localPort value.
             *
             * @param localPort the localPort value to set
             * @return the next stage of the definition.
             */
            WithRemotePort withLocalPort(String localPort);
        }

        /**
         * The remote port. Acceptable values are a single integer in the range
         * (0-65535). Support for * for the source port, which depends on the
         * direction.
         */
        interface WithRemotePort {
            /**
             * Set the remotePort value.
             *
             * @param remotePort the remotePort value to set
             * @return the next stage of the definition.
             */
            WithExecute withRemotePort(String remotePort);
        }

        /**
         * The NIC ID. (If VM has multiple NICs and IP forwarding is enabled on any
         * of them, then this parameter must be specified. Otherwise optional).
         */
        interface WithNetworkInterface {
            /**
             * Set the targetNicResourceId value.
             *
             * @param targetNicResourceId the targetNicResourceId value to set
             * @return the next stage of the definition.
             */
            VerificationIPFlow withTargetNicResourceId(String targetNicResourceId);
        }

        /**
         * The stage of the definition which contains all the minimum required parameters
         * to execute an action, but also allows
         * for any other optional settings to be specified.
         */
        interface WithExecute extends
                Executable<VerificationIPFlow>,
                WithNetworkInterface {
        }
    }
}
