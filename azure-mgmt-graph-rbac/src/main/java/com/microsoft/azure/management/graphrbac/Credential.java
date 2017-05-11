/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.graphrbac;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasId;
import com.microsoft.azure.management.resources.fluentcore.model.Attachable;
import com.microsoft.azure.management.resources.fluentcore.model.Indexable;
import org.joda.time.DateTime;
import org.joda.time.Duration;

/**
 * An immutable client-side representation of an Azure AD credential.
 */
@Fluent(ContainerName = "/Microsoft.Azure.Management.Fluent.Graph.RBAC")
@Beta
public interface Credential extends
        Indexable,
        HasId {
    /**
     * @return start date.
     */
    DateTime startDate();

    /**
     * @return end date.
     */
    DateTime endDate();

    /**
     * @return key value.
     */
    String value();

    /**************************************************************
     * Fluent interfaces to attach a credential
     **************************************************************/

    /**
     * The entirety of a credential definition.
     * @param <ParentT> the return type of the final {@link Attachable#attach()}
     */
    interface Definition<ParentT> extends
            DefinitionStages.Blank<ParentT>,
            DefinitionStages.WithCertificateType<ParentT>,
            DefinitionStages.WithAttach<ParentT> {
    }

    /**
     * Grouping of credential definition stages applicable as part of a key vault creation.
     */
    interface DefinitionStages {
        /**
         * The first stage of a credential definition.
         *
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        interface Blank<ParentT> extends WithKey<ParentT> {
        }

        /**
         * The credential definition stage allowing the the password or certificate to be set.
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithKey<ParentT> {
            /**
             * Use a password as a key.
             * @param password the password value
             * @return the next stage in credential definition
             */
            WithAttach<ParentT> withPassword(String password);

            /**
             * Use a self signed certificate as a key.
             * @param certificate the certificate content
             * @return the next stage in credential definition
             */
            WithCertificateType<ParentT> withCertificate(String certificate);
        }

        /**
         * The credential definition stage allowing the certificate type to be set.
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithCertificateType<ParentT> {
            /**
             * Specifies the type of the certificate
             * @param type the type of the certificate
             * @return the next stage in credential definition
             */
            WithAttach<ParentT> withType(CertificateType type);
            WithAttach<ParentT> withType(String type);
        }

        /**
         * The credential definition stage allowing start date to be set.
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithStartDate<ParentT> {
            /**
             * Specifies the start date after which password or key would be valid. Default value is current time.
             * @param startDate the start date for validity
             * @return the next stage in credential definition
             */
            WithAttach<ParentT> withStartDate(DateTime startDate);
        }

        /**
         * The credential definition stage allowing the duration of key validity to be set.
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithDuration<ParentT> {
            /**
             * Specifies the duration for which password or key would be valid. Default value is 1 year.
             * @param duration the duration of validity
             * @return the next stage in credential definition
             */
            WithAttach<ParentT> withDuration(Duration duration);
        }

        /** The final stage of the credential definition.
         * <p>
         * At this stage, more settings can be specified, or the credential definition can be
         * attached to the parent application / service principal definition
         * using {@link WithAttach#attach()}.
         * @param <ParentT> the return type of {@link WithAttach#attach()}
         */
        interface WithAttach<ParentT> extends
                Attachable.InUpdate<ParentT>,
                WithStartDate<ParentT>,
                WithDuration<ParentT> {
        }
    }

    /**
     * The entirety of a credential definition as part of a key vault update.
     * @param <ParentT> the return type of the final {@link UpdateDefinitionStages.WithAttach#attach()}
     */
    interface UpdateDefinition<ParentT> extends
            UpdateDefinitionStages.Blank<ParentT>,
            UpdateDefinitionStages.WithCertificateType<ParentT>,
            UpdateDefinitionStages.WithAttach<ParentT> {
    }

    /**
     * Grouping of credential definition stages applicable as part of a key vault update.
     */
    interface UpdateDefinitionStages {
        /**
         * The first stage of a credential definition.
         *
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        interface Blank<ParentT> extends WithKey<ParentT> {
        }

        /**
         * The credential definition stage allowing the the password or certificate to be set.
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithKey<ParentT> {
            /**
             * Use a password as a key.
             * @param password the password value
             * @return the next stage in credential definition
             */
            WithAttach<ParentT> withPassword(String password);

            /**
             * Use a self signed certificate as a key.
             * @param certificate the certificate content
             * @return the next stage in credential definition
             */
            WithCertificateType<ParentT> withCertificate(String certificate);
        }

        /**
         * The credential definition stage allowing the certificate type to be set.
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithCertificateType<ParentT> {
            /**
             * Specifies the type of the certificate
             * @param type the type of the certificate
             * @return the next stage in credential definition
             */
            WithAttach<ParentT> withType(CertificateType type);
        }

        /**
         * The credential definition stage allowing start date to be set.
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithStartDate<ParentT> {
            /**
             * Specifies the start date after which password or key would be valid. Default value is current time.
             * @param startDate the start date for validity
             * @return the next stage in credential definition
             */
            WithAttach<ParentT> withStartDate(DateTime startDate);
        }

        /**
         * The credential definition stage allowing the duration of key validity to be set.
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithDuration<ParentT> {
            /**
             * Specifies the duration for which password or key would be valid. Default value is 1 year.
             * @param duration the duration of validity
             * @return the next stage in credential definition
             */
            WithAttach<ParentT> withDuration(Duration duration);
        }

        /** The final stage of the credential definition.
         * <p>
         * At this stage, more settings can be specified, or the credential definition can be
         * attached to the parent application / service principal definition
         * using {@link WithAttach#attach()}.
         * @param <ParentT> the return type of {@link WithAttach#attach()}
         */
        interface WithAttach<ParentT> extends
                Attachable.InUpdate<ParentT>,
                WithStartDate<ParentT>,
                WithDuration<ParentT> {
        }
    }
}
