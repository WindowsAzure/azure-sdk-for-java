/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.v2016_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.recoveryservices.v2016_06_01.implementation.VaultCertificateResponseInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.recoveryservices.v2016_06_01.implementation.RecoveryServicesManager;

/**
 * Type representing VaultCertificateResponse.
 */
public interface VaultCertificateResponse extends HasInner<VaultCertificateResponseInner>, Indexable, Updatable<VaultCertificateResponse.Update>, HasManager<RecoveryServicesManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    ResourceCertificateDetails properties();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the VaultCertificateResponse definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithVault, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VaultCertificateResponse definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VaultCertificateResponse definition.
         */
        interface Blank extends WithVault {
        }

        /**
         * The stage of the vaultcertificateresponse definition allowing to specify Vault.
         */
        interface WithVault {
           /**
            * Specifies resourceGroupName, vaultName.
            */
            WithCreate withExistingVault(String resourceGroupName, String vaultName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VaultCertificateResponse> {
        }
    }
    /**
     * The template for a VaultCertificateResponse update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VaultCertificateResponse> {
    }

    /**
     * Grouping of VaultCertificateResponse update stages.
     */
    interface UpdateStages {
    }
}
