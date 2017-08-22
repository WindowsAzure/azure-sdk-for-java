/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute.samples;

import com.microsoft.azure.management.Azure;
import com.microsoft.azure.management.compute.CachingTypes;
import com.microsoft.azure.management.compute.KnownLinuxVirtualMachineImage;
import com.microsoft.azure.management.compute.VirtualMachine;
import com.microsoft.azure.management.compute.VirtualMachineSizeTypes;
import com.microsoft.azure.management.graphrbac.ActiveDirectoryGroup;
import com.microsoft.azure.management.graphrbac.BuiltInRole;
import com.microsoft.azure.management.resources.ResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.Region;
import com.microsoft.azure.management.resources.fluentcore.utils.SdkContext;
import com.microsoft.azure.management.samples.Utils;
import com.microsoft.azure.management.storage.StorageAccount;
import com.microsoft.rest.LogLevel;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Azure Compute sample for managing virtual machines -
 *   - Create a AAD security group
 *   - Assign AAD security group Contributor role at a resource group
 *   - Create a virtual machine with MSI enabled
 *   - Add virtual machine MSI service principal to the AAD group
 *   - Set custom script in the virtual machine that
 *          - install az cli in the virtual machine
 *          - uses az cli MSI credentials to create a storage account
 *   - Get storage account created through MSI credentials.
 */
public final class ManageResourceFromMSIEnabledVirtualMachineBelongsToAADGroup {
    /**
     * Main function which runs the actual sample.
     *
     * @param azure instance of the azure client
     * @return true if sample runs successfully
     */
    public static boolean runSample(Azure azure) {
        final String linuxVMName = Utils.createRandomName("VM1");
        final String rgName = Utils.createRandomName("rgCOMV");
        final String pipName = Utils.createRandomName("pip1");
        String group1Name = SdkContext.randomResourceName("group", 16);
        String roleAssignmentName = SdkContext.randomUuid();
        final String userName = "tirekicker";
        final String password = "12NewPA$$w0rd!";
        final Region region = Region.US_WEST_CENTRAL;

        final String installScript = "https://raw.githubusercontent.com/Azure/azure-sdk-for-java/master/azure-samples/src/main/resources/create_resources_with_msi.sh";
        String installCommand = "bash create_resources_with_msi.sh {subscriptionID} {port} {stgName} {rgName} {location}";
        List<String> fileUris = new ArrayList<>();
        fileUris.add(installScript);

        try {

            //=============================================================
            // Create a AAD security group

            System.out.println("Creating a AAD security group");

            ActiveDirectoryGroup activeDirectoryGroup = azure.accessManagement()
                    .activeDirectoryGroups()
                    .define(group1Name)
                    .withEmailAlias(group1Name)
                    .create();

            //=============================================================
            // Assign AAD security group Contributor role at a resource group

            ResourceGroup resourceGroup = azure.resourceGroups()
                    .define(rgName)
                    .withRegion(region)
                    .create();

            SdkContext.sleep(45 * 1000);

            System.out.println("Assigning AAD security group Contributor role to the resource group");

            azure.accessManagement()
                    .roleAssignments()
                    .define(roleAssignmentName)
                    .forGroup(activeDirectoryGroup)
                    .withBuiltInRole(BuiltInRole.CONTRIBUTOR)
                    .withResourceGroupScope(resourceGroup)
                    .create();

            System.out.println("Assigned AAD security group Contributor role to the resource group");

            //=============================================================
            // Create a Linux VM with MSI enabled

            System.out.println("Creating a Linux VM with MSI enabled");

            VirtualMachine virtualMachine = azure.virtualMachines()
                    .define(linuxVMName)
                    .withRegion(region)
                    .withNewResourceGroup(rgName)
                    .withNewPrimaryNetwork("10.0.0.0/28")
                    .withPrimaryPrivateIPAddressDynamic()
                    .withNewPrimaryPublicIPAddress(pipName)
                    .withPopularLinuxImage(KnownLinuxVirtualMachineImage.UBUNTU_SERVER_16_04_LTS)
                    .withRootUsername(userName)
                    .withRootPassword(password)
                    .withSize(VirtualMachineSizeTypes.STANDARD_DS2_V2)
                    .withOSDiskCaching(CachingTypes.READ_WRITE)
                    .withManagedServiceIdentity()
                    .create();

            System.out.println("Created virtual machine with MSI enabled");
            Utils.print(virtualMachine);

            //=============================================================
            // Add virtual machine MSI service principal to the AAD group

            System.out.println("Adding virtual machine MSI service principal to the AAD group");

            activeDirectoryGroup.update()
                    .withMember(virtualMachine.managedServiceIdentityPrincipalId())
                    .apply();

            System.out.println("Added virtual machine MSI service principal to the AAD group");

            System.out.println("Waiting 15 minutes to MSI extension in the VM to refresh the token");

            SdkContext.sleep(10 * 60 * 1000);

            // Prepare custom script t install az cli that uses MSI to create a storage account
            //
            final String stgName = Utils.createRandomName("st44");
            installCommand = installCommand.replace("{subscriptionID}", azure.subscriptionId())
                    .replace("{port}", "50342")
                    .replace("{stgName}", stgName)
                    .replace("{rgName}", rgName)
                    .replace("{location}", region.name());

            // Update the VM by installing custom script extension.
            //
            System.out.println("Installing custom script extension to configure az cli in the virtual machine");
            System.out.println("az cli will use MSI credentials to create storage account");

            virtualMachine.update()
                    .defineNewExtension("CustomScriptForLinux")
                    .withPublisher("Microsoft.OSTCExtensions")
                    .withType("CustomScriptForLinux")
                    .withVersion("1.4")
                    .withMinorVersionAutoUpgrade()
                    .withPublicSetting("fileUris", fileUris)
                    .withPublicSetting("commandToExecute", installCommand)
                    .attach()
                    .apply();

            // Retrieve the storage account created by az cli using MSI credentials
            //
            StorageAccount storageAccount = azure.storageAccounts()
                    .getByResourceGroup(rgName, stgName);

            System.out.println("Storage account created by az cli using MSI credential");
            Utils.print(storageAccount);
            return true;
        } catch (Exception f) {
            System.out.println(f.getMessage());
            f.printStackTrace();
        } finally {
            try {
                System.out.println("Deleting Resource Group: " + rgName);
                azure.resourceGroups().beginDeleteByName(rgName);
            } catch (NullPointerException npe) {
                System.out.println("Did not create any resources in Azure. No clean up is necessary");
            } catch (Exception g) {
                g.printStackTrace();
            }
        }
        return false;
    }

    /**
     * Main entry point.
     * @param args the parameters
     */
    public static void main(String[] args) {
        try {
            //=============================================================
            // Authenticate

            final File credFile = new File(System.getenv("AZURE_AUTH_LOCATION"));

            Azure azure = Azure.configure()
                    .withLogLevel(LogLevel.BODY_AND_HEADERS)
                    .authenticate(credFile)
                    .withDefaultSubscription();

            // Print selected subscription
            System.out.println("Selected subscription: " + azure.subscriptionId());

            runSample(azure);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private ManageResourceFromMSIEnabledVirtualMachineBelongsToAADGroup() {
    }
}
