// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.EncryptionProtectorInner;

/** An immutable client-side representation of EncryptionProtector. */
public interface EncryptionProtector {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the kind property: Kind of encryption protector. This is metadata used for the Azure portal experience.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the location property: Resource location.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the subregion property: Subregion of the encryption protector.
     *
     * @return the subregion value.
     */
    String subregion();

    /**
     * Gets the serverKeyName property: The name of the server key.
     *
     * @return the serverKeyName value.
     */
    String serverKeyName();

    /**
     * Gets the serverKeyType property: The encryption protector type like 'ServiceManaged', 'AzureKeyVault'.
     *
     * @return the serverKeyType value.
     */
    ServerKeyType serverKeyType();

    /**
     * Gets the uri property: The URI of the server key.
     *
     * @return the uri value.
     */
    String uri();

    /**
     * Gets the thumbprint property: Thumbprint of the server key.
     *
     * @return the thumbprint value.
     */
    String thumbprint();

    /**
     * Gets the autoRotationEnabled property: Key auto rotation opt-in flag. Either true or false.
     *
     * @return the autoRotationEnabled value.
     */
    Boolean autoRotationEnabled();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.EncryptionProtectorInner object.
     *
     * @return the inner object.
     */
    EncryptionProtectorInner innerModel();

    /** The entirety of the EncryptionProtector definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The EncryptionProtector definition stages. */
    interface DefinitionStages {
        /** The first stage of the EncryptionProtector definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the EncryptionProtector definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serverName.
             *
             * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this
             *     value from the Azure Resource Manager API or the portal.
             * @param serverName The name of the server.
             * @return the next definition stage.
             */
            WithCreate withExistingServer(String resourceGroupName, String serverName);
        }
        /**
         * The stage of the EncryptionProtector definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithServerKeyName,
                DefinitionStages.WithServerKeyType,
                DefinitionStages.WithAutoRotationEnabled {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            EncryptionProtector create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            EncryptionProtector create(Context context);
        }
        /** The stage of the EncryptionProtector definition allowing to specify serverKeyName. */
        interface WithServerKeyName {
            /**
             * Specifies the serverKeyName property: The name of the server key..
             *
             * @param serverKeyName The name of the server key.
             * @return the next definition stage.
             */
            WithCreate withServerKeyName(String serverKeyName);
        }
        /** The stage of the EncryptionProtector definition allowing to specify serverKeyType. */
        interface WithServerKeyType {
            /**
             * Specifies the serverKeyType property: The encryption protector type like 'ServiceManaged',
             * 'AzureKeyVault'..
             *
             * @param serverKeyType The encryption protector type like 'ServiceManaged', 'AzureKeyVault'.
             * @return the next definition stage.
             */
            WithCreate withServerKeyType(ServerKeyType serverKeyType);
        }
        /** The stage of the EncryptionProtector definition allowing to specify autoRotationEnabled. */
        interface WithAutoRotationEnabled {
            /**
             * Specifies the autoRotationEnabled property: Key auto rotation opt-in flag. Either true or false..
             *
             * @param autoRotationEnabled Key auto rotation opt-in flag. Either true or false.
             * @return the next definition stage.
             */
            WithCreate withAutoRotationEnabled(Boolean autoRotationEnabled);
        }
    }
    /**
     * Begins update for the EncryptionProtector resource.
     *
     * @return the stage of resource update.
     */
    EncryptionProtector.Update update();

    /** The template for EncryptionProtector update. */
    interface Update
        extends UpdateStages.WithServerKeyName, UpdateStages.WithServerKeyType, UpdateStages.WithAutoRotationEnabled {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        EncryptionProtector apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        EncryptionProtector apply(Context context);
    }
    /** The EncryptionProtector update stages. */
    interface UpdateStages {
        /** The stage of the EncryptionProtector update allowing to specify serverKeyName. */
        interface WithServerKeyName {
            /**
             * Specifies the serverKeyName property: The name of the server key..
             *
             * @param serverKeyName The name of the server key.
             * @return the next definition stage.
             */
            Update withServerKeyName(String serverKeyName);
        }
        /** The stage of the EncryptionProtector update allowing to specify serverKeyType. */
        interface WithServerKeyType {
            /**
             * Specifies the serverKeyType property: The encryption protector type like 'ServiceManaged',
             * 'AzureKeyVault'..
             *
             * @param serverKeyType The encryption protector type like 'ServiceManaged', 'AzureKeyVault'.
             * @return the next definition stage.
             */
            Update withServerKeyType(ServerKeyType serverKeyType);
        }
        /** The stage of the EncryptionProtector update allowing to specify autoRotationEnabled. */
        interface WithAutoRotationEnabled {
            /**
             * Specifies the autoRotationEnabled property: Key auto rotation opt-in flag. Either true or false..
             *
             * @param autoRotationEnabled Key auto rotation opt-in flag. Either true or false.
             * @return the next definition stage.
             */
            Update withAutoRotationEnabled(Boolean autoRotationEnabled);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    EncryptionProtector refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    EncryptionProtector refresh(Context context);

    /**
     * Revalidates an existing encryption protector.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void revalidate();

    /**
     * Revalidates an existing encryption protector.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void revalidate(Context context);
}
