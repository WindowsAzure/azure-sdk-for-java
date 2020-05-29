// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.compute.samples;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementException;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.management.Azure;
import com.azure.management.compute.AvailabilitySet;
import com.azure.management.compute.KnownLinuxVirtualMachineImage;
import com.azure.management.compute.VirtualMachine;
import com.azure.management.compute.VirtualMachineSizeTypes;
import com.azure.management.network.Network;
import com.azure.management.network.NetworkInterface;
import com.azure.management.network.PublicIpAddress;
import com.azure.management.resources.ResourceGroup;
import com.azure.management.resources.fluentcore.arm.Region;
import com.azure.management.resources.fluentcore.arm.ResourceUtils;
import com.azure.management.resources.fluentcore.arm.models.Resource;
import com.azure.management.resources.fluentcore.model.Creatable;
import com.azure.management.resources.fluentcore.profile.AzureProfile;
import com.azure.management.samples.Utils;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Making use of the reactive pattern in a complex virtual machine creation scenario
 *
 * This sample shows how the reactive pattern (RXJava's Observables) supported by the Azure Libraries for Java in their asynchronous API
 * can be used for handling some more complex real world scenarios involving distributed computation in the cloud with relative ease.
 * The specific example here shows how Observables enable real time tracking of the creation of many virtual machines in parallel and
 * all their related resources. Since Azure does not support transactional creation of virtual machines (no automatic rollback in case
 * of failure), this could be useful for example for the purposes of deleting "orphaned" resources, whenever the creation of some other
 * resources fails. Or simply showing real-time progress in some UI to the end user.
 *
 * The sample goes through the following steps:
 *
 * 1. Define a number of virtual machines and their related required resources (such as virtual networks, etc)
 * 2. Start the parallel creation of those virtual machines with observer logic keeping track of the created resources and reporting
 *    them on the console in real time
 * 3. Clean up the "orphaned" resources, i.e. those that were created successfully but whose associated virtual machine
 *    failed to be created for some reason.
 */
public final class CreateVirtualMachinesAsyncTrackingRelatedResources {

    /**
     * Main function which runs the actual sample.
     * @param azure instance of the azure client
     * @return true if sample runs successfully
     */
    public static boolean runSample(Azure azure) {
        final int desiredVMCount = 6;
        final Region region = Region.US_WEST;
        final String resourceGroupName = azure.sdkContext().randomResourceName("rg", 15);
        final List<Throwable> errors = new ArrayList<>();

        try {
            // Create one resource group for everything for easier cleanup later
            System.out.println(String.format("Creating the resource group (`%s`)...", resourceGroupName));
            ResourceGroup resourceGroup = azure.resourceGroups().define(resourceGroupName)
                    .withRegion(region)
                    .create();
            System.out.println("Resource group created.");

            // =====================================================================
            // Define a number of virtual machines and their related resources
            //

            // Needed for tracking related resources:

            // Map for tracking network interfaces separately because they have to be deleted first
            final Map<String, Creatable<NetworkInterface>> nicDefinitions = new HashMap<>();

            // For each given virtual machine, all of the related resource definitions will be in one collection,
            // which will be be stored in a Map indexed by the VM definition's unique auto-generated key.
            final Map<String, Collection<Creatable<? extends Resource>>> vmNonNicResourceDefinitions = new HashMap<>();

            // Map for tracking VM definitions themselves, indexed by the definition key
            final Map<String, Creatable<VirtualMachine>> vmDefinitions = new HashMap<>();

            // Map for associating the resource definition key with the resource ID of the created resource
            final Map<String, String> createdResourceIds = new HashMap<>();

            for (int i = 0; i < desiredVMCount; i++) {
                Collection<Creatable<? extends Resource>> relatedDefinitions = new ArrayList<>();

                // Define a network for each VM
                String networkName = azure.sdkContext().randomResourceName("net", 14);
                Creatable<Network> networkDefinition = azure.networks().define(networkName)
                        .withRegion(region)
                        .withExistingResourceGroup(resourceGroup)
                        .withAddressSpace("10.0." + i + ".0/29"); // Make the address space unique
                relatedDefinitions.add(networkDefinition);

                // Define a PIP for each VM
                String pipName = azure.sdkContext().randomResourceName("pip", 14);
                Creatable<PublicIpAddress> pipDefinition = azure.publicIpAddresses().define(pipName)
                        .withRegion(region)
                        .withExistingResourceGroup(resourceGroup);
                relatedDefinitions.add(pipDefinition);

                // Define a NIC for each VM
                String nicName = azure.sdkContext().randomResourceName("nic", 14);
                Creatable<NetworkInterface> nicDefinition = azure.networkInterfaces().define(nicName)
                        .withRegion(region)
                        .withExistingResourceGroup(resourceGroup)
                        .withNewPrimaryNetwork(networkDefinition)
                        .withPrimaryPrivateIPAddressDynamic()
                        .withNewPrimaryPublicIPAddress(pipDefinition);

                // Define an availability set for each VM
                String availabilitySetName = azure.sdkContext().randomResourceName("as", 14);
                Creatable<AvailabilitySet> availabilitySetDefinition = azure.availabilitySets().define(availabilitySetName)
                        .withRegion(region)
                        .withExistingResourceGroup(resourceGroup);
                relatedDefinitions.add(availabilitySetDefinition);

                String vmName = azure.sdkContext().randomResourceName("vm", 14);

                // Define a VM
                String userName;
                if (i == desiredVMCount / 2) {
                    // Intentionally cause a "missing user name" failure in one of the VMs to test the sample's rollback implementation
                    userName = "";
                } else {
                    userName = "tester";
                }

                Creatable<VirtualMachine> vmDefinition = azure.virtualMachines().define(vmName)
                        .withRegion(region)
                        .withExistingResourceGroup(resourceGroup)
                        .withNewPrimaryNetworkInterface(nicDefinition)
                        .withPopularLinuxImage(KnownLinuxVirtualMachineImage.UBUNTU_SERVER_16_04_LTS)
                        .withRootUsername(userName)
                        // [SuppressMessage("Microsoft.Security", "CS002:SecretInNextLine", Justification="Serves as an example, not for deployment. Please change when using this in your code.")]
                        .withRootPassword("Abcdef.123456!")
                        .withSize(VirtualMachineSizeTypes.STANDARD_DS1_V2)
                        .withNewAvailabilitySet(availabilitySetDefinition);

                // Keep track of all the related resource definitions based on the VM definition
                vmNonNicResourceDefinitions.put(vmDefinition.key(), relatedDefinitions);
                nicDefinitions.put(vmDefinition.key(), nicDefinition);
                vmDefinitions.put(vmDefinition.key(), vmDefinition);
            }

            // =====================================================================
            // Start the parallel creation of everything asynchronously
            //
            System.out.println("Creating the virtual machines and related required resources in parallel...");
            azure
                .virtualMachines()
                .createAsync(new ArrayList<>(vmDefinitions.values()))
                .map(createdResource -> {
                    if (createdResource instanceof Resource) {
                        Resource resource = (Resource) createdResource;

                        // Report the creation of a resource in the UI
                        System.out.println(String.format("\tCreated resource of type %s named '%s'",
                            ResourceUtils.resourceTypeFromResourceId(resource.id()),
                            ResourceUtils.nameFromResourceId(resource.id())));

                        if (resource instanceof VirtualMachine) {
                            // Track the successful creation of virtual machines, so that their related resources do not cleaned up later
                            VirtualMachine virtualMachine = (VirtualMachine) resource;

                            // Record that this VM was created successfully
                            vmDefinitions.remove(virtualMachine.key());

                            // Remove the associated resources from cleanup list
                            vmNonNicResourceDefinitions.remove(virtualMachine.key());

                            // Remove the associated NIC from cleanup list
                            nicDefinitions.remove(virtualMachine.key());
                        } else {
                            // Since this is not a VM, add this resource to the potential cleanup list
                            createdResourceIds.put(resource.key(), resource.id());
                        }
                    }
                    return createdResource;
                })
                .onErrorResume(e -> {
                    errors.add(e);
                    return Mono.empty();
                })
                .singleOrEmpty();

            System.out.println("Creation completed.");

            // Show any errors
            for (Throwable error: errors) {
                System.out.println("ERROR: Creation of virtual machines has been stopped due to a failure to create a resource.\n");
                if (error instanceof ManagementException) {
                    ManagementException ce = (ManagementException) error;
                    System.out.println("Cloud Exception: " + ce.getMessage());
                } else {
                    error.printStackTrace();
                }
            }

            // =====================================================================
            // Clean up orphaned resources
            //

            // After everything has been created, first we delete the remaining successfully created NICs of failed VM creations
            Collection<String> nicIdsToDelete = new ArrayList<>();
            for (Creatable<NetworkInterface> nicDefinition : nicDefinitions.values()) {
                String nicId = createdResourceIds.get(nicDefinition.key());
                if (nicId != null) {
                    nicIdsToDelete.add(nicId);
                }
            }
            if (!nicIdsToDelete.isEmpty()) {
                // Delete the NICs in parallel for better performance
                azure.networkInterfaces().deleteByIds(nicIdsToDelete);
            }

            // Delete remaining successfully created resources of failed VM creations in parallel
            Collection<Mono<?>> deleteObservables = new ArrayList<>();
            for (Collection<Creatable<? extends Resource>> relatedResources : vmNonNicResourceDefinitions.values()) {
                for (Creatable<? extends Resource> resource : relatedResources) {
                    String createdResourceId = createdResourceIds.get(resource.key());
                    if (createdResourceId != null) {
                        // Prepare the deletion of each related resource (treating it as a generic resource) as a multi-threaded Observable
                        deleteObservables.add(azure.genericResources().deleteByIdAsync(createdResourceId));
                    }
                }
            }

            // Delete the related resources in parallel, as much as possible, postponing the errors till the end
            Flux.mergeSequentialDelayError(deleteObservables, 5, 3);

            System.out.println("Number of failed/cleaned up VM creations: " + vmNonNicResourceDefinitions.size());

            // Verifications
            final int actualVMCount = Utils.getSize(azure.virtualMachines().listByResourceGroup(resourceGroupName));
            System.out.println("Number of successful VMs: " + actualVMCount);

            final int actualNicCount = Utils.getSize(azure.networkInterfaces().listByResourceGroup(resourceGroupName));
            System.out.println(String.format("Remaining network interfaces (should be %d): %d", actualVMCount, actualNicCount));

            final int actualNetworkCount = Utils.getSize(azure.networks().listByResourceGroup(resourceGroupName));
            System.out.println(String.format("Remaining virtual networks (should be %d): %d", actualVMCount, actualNetworkCount));

            final int actualPipCount = Utils.getSize(azure.publicIpAddresses().listByResourceGroup(resourceGroupName));
            System.out.println(String.format("Remaining public IP addresses (should be %d): %d", actualVMCount, actualPipCount));

            final int actualAvailabilitySetCount = Utils.getSize(azure.availabilitySets().listByResourceGroup(resourceGroupName));
            System.out.println(String.format("Remaining availability sets (should be %d): %d", actualVMCount, actualAvailabilitySetCount));

            return true;
        } catch (Exception f) {
            System.out.println(f.getMessage());
            f.printStackTrace();
        } finally {
            try {
                System.out.println("Starting the deletion of resource group: " + resourceGroupName);
                azure.resourceGroups().beginDeleteByName(resourceGroupName);
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
            //
            final AzureProfile profile = new AzureProfile(AzureEnvironment.AZURE);
            final TokenCredential credential = new DefaultAzureCredentialBuilder()
                .authorityHost(profile.environment().getActiveDirectoryEndpoint())
                .build();

            Azure azure = Azure
                .configure()
                .withLogLevel(HttpLogDetailLevel.BASIC)
                .authenticate(credential, profile)
                .withDefaultSubscription();

            // Print selected subscription
            System.out.println("Selected subscription: " + azure.subscriptionId());

            runSample(azure);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private CreateVirtualMachinesAsyncTrackingRelatedResources() {

    }
}
