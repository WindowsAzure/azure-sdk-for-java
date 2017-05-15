/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.graphrbac;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.graphrbac.implementation.GraphRbacManager;
import com.microsoft.azure.management.graphrbac.implementation.ServicePrincipalInner;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasId;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasManager;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasName;
import com.microsoft.azure.management.resources.fluentcore.model.Creatable;
import com.microsoft.azure.management.resources.fluentcore.model.HasInner;
import com.microsoft.azure.management.resources.fluentcore.model.Indexable;

import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of an Azure AD service principal.
 */
@Fluent(ContainerName = "/Microsoft.Azure.Management.Fluent.Graph.RBAC")
@Beta
public interface ServicePrincipal extends
        Indexable,
        HasInner<ServicePrincipalInner>,
        HasId,
        HasName,
        HasManager<GraphRbacManager> {
    /**
     * @return app id.
     */
    String applicationId();

    /**
     * @return the list of names.
     */
    List<String> servicePrincipalNames();

    /**
     * @return the mapping of password credentials from their names
     */
    Map<String, PasswordCredential> passwordCredentials();

    /**
     * @return the mapping of certificate credentials from their names
     */
    Map<String, CertificateCredential> certificateCredentials();

    /**************************************************************
     * Fluent interfaces to provision a service principal
     **************************************************************/

    /**
     * Container interface for all the definitions that need to be implemented.
     */
    interface Definition extends
            DefinitionStages.Blank,
            DefinitionStages.WithCreate {
    }

    /**
     * Grouping of all the service principal definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the service principal definition.
         */
        interface Blank extends WithApplication {
        }

        /**
         * A service principal definition allowing application to be specified.
         */
        interface WithApplication {
            /**
             * Specifies an existing application by its app ID.
             * @param id the app ID of the application
             * @return the next stage of the service principal definition
             */
            WithCreate withExistingApplication(String id);

            /**
             * Specifies an existing application to use by the service principal.
             * @param application the application
             * @return the next stage of the service principal definition
             */
            WithCreate withExistingApplication(Application application);

            /**
             * Specifies a new application to create and use by the service principal.
             * @param applicationCreatable the new application's creatable
             * @return the next stage of the service principal definition
             */
            WithCreate withNewApplication(Creatable<Application> applicationCreatable);

            /**
             * Specifies a new application to create and use by the service principal.
             * @param signOnUrl the new application's sign on URL
             * @return the next stage of the service principal definition
             */
            WithCreate withNewApplication(String signOnUrl);
        }

        /**
         * A service principal definition allowing credentials to be specified.
         */
        interface WithCredential {
            /**
             * Starts the definition of a certificate credential.
             * @param name the descriptive name of the certificate credential
             * @return the first stage in certificate credential definition
             */
            CertificateCredential.DefinitionStages.Blank<WithCreate> defineCertificateCredential(String name);

            /**
             * Starts the definition of a password credential.
             * @param name the descriptive name of the password credential
             * @return the first stage in password credential definition
             */
            PasswordCredential.DefinitionStages.Blank<WithCreate> definePasswordCredential(String name);
        }

        /**
         * A service principal definition with sufficient inputs to create a new
         * service principal in the cloud, but exposing additional optional inputs to
         * specify.
         */
        interface WithCreate extends
                Creatable<ServicePrincipal>,
                WithCredential {
        }
    }
}
