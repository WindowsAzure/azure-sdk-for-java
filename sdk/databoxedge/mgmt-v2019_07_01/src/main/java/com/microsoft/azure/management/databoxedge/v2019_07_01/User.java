/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.databoxedge.v2019_07_01.implementation.UserInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.databoxedge.v2019_07_01.implementation.DataBoxEdgeManager;
import java.util.List;

/**
 * Type representing User.
 */
public interface User extends HasInner<UserInner>, Indexable, Refreshable<User>, Updatable<User.Update>, HasManager<DataBoxEdgeManager> {
    /**
     * @return the encryptedPassword value.
     */
    AsymmetricEncryptedSecret encryptedPassword();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the shareAccessRights value.
     */
    List<ShareAccessRight> shareAccessRights();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the User definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithDataBoxEdgeDevice, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of User definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a User definition.
         */
        interface Blank extends WithDataBoxEdgeDevice {
        }

        /**
         * The stage of the user definition allowing to specify DataBoxEdgeDevice.
         */
        interface WithDataBoxEdgeDevice {
           /**
            * Specifies deviceName, resourceGroupName.
            * @param deviceName The device name
            * @param resourceGroupName The resource group name
            * @return the next definition stage
            */
            WithCreate withExistingDataBoxEdgeDevice(String deviceName, String resourceGroupName);
        }

        /**
         * The stage of the user definition allowing to specify EncryptedPassword.
         */
        interface WithEncryptedPassword {
            /**
             * Specifies encryptedPassword.
             * @param encryptedPassword The password details
             * @return the next definition stage
             */
            WithCreate withEncryptedPassword(AsymmetricEncryptedSecret encryptedPassword);
        }

        /**
         * The stage of the user definition allowing to specify ShareAccessRights.
         */
        interface WithShareAccessRights {
            /**
             * Specifies shareAccessRights.
             * @param shareAccessRights List of shares that the user has rights on. This field should not be specified during user creation
             * @return the next definition stage
             */
            WithCreate withShareAccessRights(List<ShareAccessRight> shareAccessRights);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<User>, DefinitionStages.WithEncryptedPassword, DefinitionStages.WithShareAccessRights {
        }
    }
    /**
     * The template for a User update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<User>, UpdateStages.WithEncryptedPassword, UpdateStages.WithShareAccessRights {
    }

    /**
     * Grouping of User update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the user update allowing to specify EncryptedPassword.
         */
        interface WithEncryptedPassword {
            /**
             * Specifies encryptedPassword.
             * @param encryptedPassword The password details
             * @return the next update stage
             */
            Update withEncryptedPassword(AsymmetricEncryptedSecret encryptedPassword);
        }

        /**
         * The stage of the user update allowing to specify ShareAccessRights.
         */
        interface WithShareAccessRights {
            /**
             * Specifies shareAccessRights.
             * @param shareAccessRights List of shares that the user has rights on. This field should not be specified during user creation
             * @return the next update stage
             */
            Update withShareAccessRights(List<ShareAccessRight> shareAccessRights);
        }

    }
}
