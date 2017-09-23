/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.network;

import java.io.File;
import java.io.IOException;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.network.implementation.ApplicationGatewayAuthenticationCertificateInner;
import com.microsoft.azure.management.resources.fluentcore.arm.models.ChildResource;
import com.microsoft.azure.management.resources.fluentcore.model.Attachable;
import com.microsoft.azure.management.resources.fluentcore.model.Settable;
import com.microsoft.azure.management.resources.fluentcore.model.HasInner;

/**
 * A client-side representation of an application gateway authentication certificate.
 */
@Fluent()
@Beta(SinceVersion.V1_4_0)
public interface ApplicationGatewayAuthenticationCertificate extends
    HasInner<ApplicationGatewayAuthenticationCertificateInner>,
    ChildResource<ApplicationGateway> {

    /**
     * @return base-64 encoded bytes of the X.509 certificate
     */
    String data();

    /**
     * Grouping of application gateway authentication certificate stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of an application gateway authentication certificate definition.
         * @param <ReturnT> the stage of the parent application gateway definition to return to after attaching this definition
         */
        interface Blank<ReturnT> extends WithData<ReturnT> {
        }

        /**
         * The stage of an application gateway authentication certificate definition allowing to specify the data of the certificate.
         * @param <ReturnT> the stage of the parent application gateway definition to return to after attaching this definition
         */
        interface WithData<ReturnT> {
            /**
             * Specifies an X.509 certificate to upload.
             * @param data the base-64 encoded bytes of an X.509 certificate
             * @return the next stage of the definition
             */
            WithAttach<ReturnT> fromBytes(byte[] data);

            /**
             * Specifies an X.509 certificate to upload.
             * @param certificateFile a base-64 encoded X.509 certificate file
             * @return the next stage of the definition
             * @throws IOException when there are problems reading the certificate file
             */
            WithAttach<ReturnT> fromFile(File certificateFile) throws IOException;
        }

        /** The final stage of an application gateway authentication certificate definition.
         * <p>
         * At this stage, any remaining optional settings can be specified, or the definition
         * can be attached to the parent application gateway definition.
         * @param <ReturnT> the stage of the parent application gateway definition to return to after attaching this definition
         */
        interface WithAttach<ReturnT> extends
            Attachable.InDefinition<ReturnT> {
        }
    }

    /** The entirety of an application gateway authentication certificate definition.
     * @param <ReturnT> the stage of the parent application gateway definition to return to after attaching this definition
     */
    interface Definition<ReturnT> extends
        DefinitionStages.Blank<ReturnT>,
        DefinitionStages.WithAttach<ReturnT>,
        DefinitionStages.WithData<ReturnT> {
    }

    /**
     * Grouping of application gateway authentication certificate update stages.
     */
    interface UpdateStages {
    }

    /**
     * The entirety of an application gateway authentication certificate update as part of an application gateway update.
     */
    interface Update extends
        Settable<ApplicationGateway.Update> {
    }

    /**
     * Grouping of application gateway authentication certificate definition stages applicable as part of an application gateway update.
     */
    interface UpdateDefinitionStages {
        /**
         * The first stage of an application gateway authentication certificate definition.
         * @param <ReturnT> the stage of the parent application gateway definition to return to after attaching this definition
         */
        interface Blank<ReturnT> extends WithAttach<ReturnT> {
        }

        /** The final stage of an application gateway authentication certificate definition.
         * <p>
         * At this stage, any remaining optional settings can be specified, or the definition
         * can be attached to the parent application gateway definition.
         * @param <ReturnT> the stage of the parent application gateway definition to return to after attaching this definition
         */
        interface WithAttach<ReturnT> extends
            Attachable.InUpdate<ReturnT> {
        }
    }

    /** The entirety of an application gateway authentication certificate definition as part of an application gateway update.
     * @param <ReturnT> the stage of the parent application gateway definition to return to after attaching this definition
     */
    interface UpdateDefinition<ReturnT> extends
        UpdateDefinitionStages.Blank<ReturnT>,
        UpdateDefinitionStages.WithAttach<ReturnT> {
    }
}
