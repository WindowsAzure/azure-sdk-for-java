/**
 *
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 *
 */

package com.microsoft.azure.management.network.samples;

import com.microsoft.azure.Azure;
import com.microsoft.azure.management.compute.AvailabilitySet;
import com.microsoft.azure.management.compute.KnownLinuxVirtualMachineImage;
import com.microsoft.azure.management.compute.VirtualMachine;
import com.microsoft.azure.management.compute.VirtualMachineSizeTypes;
import com.microsoft.azure.management.network.LoadBalancer;
import com.microsoft.azure.management.network.Network;
import com.microsoft.azure.management.network.NetworkInterface;
import com.microsoft.azure.management.network.PublicIpAddress;
import com.microsoft.azure.management.network.TransportProtocol;
import com.microsoft.azure.management.resources.fluentcore.arm.Region;
import com.microsoft.azure.management.resources.fluentcore.model.Creatable;
import com.microsoft.azure.management.resources.fluentcore.utils.ResourceNamer;
import com.microsoft.azure.management.samples.Utils;
import okhttp3.logging.HttpLoggingInterceptor;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Azure Network sample for managing Internet facing load balancers -
 *
 * High-level ...
 *
 * - Create an Internet facing load balancer that receives network traffic on
 *   port 80 & 443 and sends load-balanced traffic to two virtual machines
 *
 * - Create NAT rules for SSH and TELNET access to virtual
 *   machines behind the load balancer
 *
 * - Create health probes
 *
 * Details ...
 *
 * Create a Internet facing load balancer with ...
 * - A frontend public IP address
 * - Two backend address pools which contain network interfaces for the virtual
 *   machines to receive HTTP and HTTPS network traffic from the load balancer
 * - Two load balancing rules for HTTP and HTTPS to map public ports on the load
 *   balancer to ports in the backend address pool
 * - Two probes which contain HTTP and HTTPS health probes used to check availability
 *   of virtual machines in the backend address pool
 * - Two inbound NAT rules which contain rules that map a public port on the load
 *   balancer to a port for a specific virtual machine in the backend address pool
 * - this provides direct VM connectivity for SSH to port 22 and TELNET to port 23
 *
 * Create two network interfaces in the frontend subnet ...
 * - And associate network interfaces to backend pools and NAT rules
 *
 * Create two virtual machines in the frontend subnet ...
 * - And assign network interfaces
 *
 * Update an existing load balancer, configure TCP idle timeout
 * Create another load balancer
 * Remove an existing load balancer
 */
public final class ManageInternetFacingLoadBalancer {

    /**
     * Main entry point.
     * @param args parameters
     */

    public static void main(String[] args) {

        final String rgName = ResourceNamer.randomResourceName("rgNEML", 15);

        final String vnetName = ResourceNamer.randomResourceName("vnet", 24);

        final String loadBalancerName1 = ResourceNamer.randomResourceName("intlb" + "-", 18);
        final String publicIpName = "pip-" + loadBalancerName1;
        final String frontendName = loadBalancerName1 + "-FE1";
        final String backendPoolName1 = loadBalancerName1 + "-BAP1";
        final String backendPoolName2 = loadBalancerName1 + "-BAP2";

        final String httpProbe = "httpProbe";
        final String httpsProbe = "httpsProbe";
        final String httpLoadBalancingRule = "httpRule";
        final String httpsLoadBalancingRule = "httpsRule";
        final String natRule5000to22forVM1 = "nat5000to22forVM1";
        final String natRule5001to23forVM1 = "nat5001to23forVM1";
        final String natRule5002to22forVM2 = "nat5002to22forVM2";
        final String natRule5003to23forVM2 = "nat5003to23forVM2";

        final String networkInterfaceName1 = ResourceNamer.randomResourceName("nic1",  24);
        final String networkInterfaceName2 = ResourceNamer.randomResourceName("nic2", 24);

        final String availSetName = ResourceNamer.randomResourceName("av", 24);
        final String vmName1 = ResourceNamer.randomResourceName("lVM1", 24);
        final String vmName2 = ResourceNamer.randomResourceName("lVM2", 24);
        final String userName = "tirekicker";
        final String sshKey = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCfSPC2K7LZcFKEO+/t3dzmQYtrJFZNxOsbVgOVKietqHyvmYGHEC0J2wPdAqQ/63g/hhAEFRoyehM+rbeDri4txB3YFfnOK58jqdkyXzupWqXzOrlKY4Wz9SKjjN765+dqUITjKRIaAip1Ri137szRg71WnrmdP3SphTRlCx1Bk2nXqWPsclbRDCiZeF8QOTi4JqbmJyK5+0UqhqYRduun8ylAwKKQJ1NJt85sYIHn9f1Rfr6Tq2zS0wZ7DHbZL+zB5rSlAr8QyUdg/GQD+cmSs6LvPJKL78d6hMGk84ARtFo4A79ovwX/Fj01znDQkU6nJildfkaolH2rWFG/qttD azjava@javalib.com";


        try {

            //=============================================================
            // Authenticate

            final File credFile = new File(System.getenv("AZURE_AUTH_LOCATION"));

            Azure azure = Azure
                    .configure()
                    .withLogLevel(HttpLoggingInterceptor.Level.BASIC)
                    .authenticate(credFile)
                    .withDefaultSubscription();

            // Print selected subscription
            System.out.println("Selected subscription: " + azure.subscriptionId());

            try {

                //=============================================================
                // Create a virtual network with a frontend and a backend subnets
                System.out.println("Creating virtual network with a frontend and a backend subnets...");

                Network network = azure.networks().define(vnetName)
                        .withRegion(Region.US_EAST)
                        .withNewResourceGroup(rgName)
                        .withAddressSpace("172.16.0.0/16")
                        .defineSubnet("Front-end")
                            .withAddressPrefix("172.16.1.0/24")
                            .attach()
                        .defineSubnet("Back-end")
                            .withAddressPrefix("172.16.3.0/24")
                            .attach()
                        .create();

                System.out.println("Created a virtual network");
                // Print the virtual network details
                Utils.print(network);

                //=============================================================
                // Create a public IP address
                System.out.println("Creating a public IP address...");

                PublicIpAddress publicIpAddress = azure.publicIpAddresses().define(publicIpName)
                        .withRegion(Region.US_EAST)
                        .withExistingResourceGroup(rgName)
                        .withLeafDomainLabel(publicIpName)
                        .create();

                System.out.println("Created a public IP address");
                // Print the virtual network details
                Utils.print(publicIpAddress);

                //=============================================================
                // Create an Internet facing load balancer
                // Create a frontend IP address
                // Two backend address pools which contain network interfaces for the virtual
                //  machines to receive HTTP and HTTPS network traffic from the load balancer
                // Two load balancing rules for HTTP and HTTPS to map public ports on the load
                //  balancer to ports in the backend address pool
                // Two probes which contain HTTP and HTTPS health probes used to check availability
                //  of virtual machines in the backend address pool
                // Two inbound NAT rules which contain rules that map a public port on the load
                //  balancer to a port for a specific virtual machine in the backend address pool
                //  - this provides direct VM connectivity for SSH to port 22 and TELNET to port 23

                System.out.println("Creating a Internet facing load balancer with ...");
                System.out.println("- A frontend IP address");
                System.out.println("- Two backend address pools which contain network interfaces for the virtual\n"
                                   + "  machines to receive HTTP and HTTPS network traffic from the load balancer");
                System.out.println("- Two load balancing rules for HTTP and HTTPS to map public ports on the load\n"
                                   + "  balancer to ports in the backend address pool");
                System.out.println("- Two probes which contain HTTP and HTTPS health probes used to check availability\n"
                                   + "  of virtual machines in the backend address pool");
                System.out.println("- Two inbound NAT rules which contain rules that map a public port on the load\n"
                                   + "  balancer to a port for a specific virtual machine in the backend address pool\n"
                                   + "  - this provides direct VM connectivity for SSH to port 22 and TELNET to port 23");

                LoadBalancer loadBalancer1 = azure.loadBalancers().define(loadBalancerName1)
                        .withRegion(Region.US_EAST)
                        .withExistingResourceGroup(rgName)
                        .definePublicFrontend(frontendName)
                            .withExistingPublicIpAddress(publicIpAddress)
                            .attach()
                        // Add two backend one per rule
                        .defineBackend(backendPoolName1)
                            .attach()
                        .defineBackend(backendPoolName2)
                            .attach()
                        // Add two probes one per rule
                        .defineHttpProbe(httpProbe)
                            .withRequestPath("/")
                            .withPort(80)
                            .attach()
                        .defineHttpProbe(httpsProbe)
                            .withRequestPath("/")
                            .withPort(443)
                            .attach()
                        // Add two rules that uses above backend and probe
                        .defineLoadBalancingRule(httpLoadBalancingRule)
                            .withProtocol(TransportProtocol.TCP)
                            .withFrontend(frontendName)
                            .withFrontendPort(80)
                            .withProbe(httpProbe)
                            .withBackend(backendPoolName1)
                            .attach()
                        .defineLoadBalancingRule(httpsLoadBalancingRule)
                            .withProtocol(TransportProtocol.TCP)
                            .withFrontend(frontendName)
                            .withFrontendPort(443)
                            .withProbe(httpsProbe)
                            .withBackend(backendPoolName2)
                            .attach()
                        // Add two nat pools to enable direct VM connectivity for
                        //  SSH to port 22 and TELNET to port 23
                        .defineInboundNatRule(natRule5000to22forVM1)
                            .withProtocol(TransportProtocol.TCP)
                            .withFrontend(frontendName)
                            .withFrontendPort(5000)
                            .withBackendPort(22)
                            .attach()
                        .defineInboundNatRule(natRule5001to23forVM1)
                            .withProtocol(TransportProtocol.TCP)
                            .withFrontend(frontendName)
                            .withFrontendPort(5001)
                            .withBackendPort(23)
                            .attach()
                        .defineInboundNatRule(natRule5002to22forVM2)
                            .withProtocol(TransportProtocol.TCP)
                            .withFrontend(frontendName)
                            .withFrontendPort(5002)
                            .withBackendPort(22)
                            .attach()
                        .defineInboundNatRule(natRule5003to23forVM2)
                            .withProtocol(TransportProtocol.TCP)
                            .withFrontend(frontendName)
                            .withFrontendPort(5003)
                            .withBackendPort(23)
                            .attach()
                        .create();

                // Print load balancer details
                System.out.println("Created a load balancer");
                Utils.print(loadBalancer1);

                //=============================================================
                // Create two network interfaces in the frontend subnet
                //  associate network interfaces to NAT rules, backend pools

                System.out.println("Creating two network interfaces in the frontend subnet ...");
                System.out.println("- And associating network interfaces to backend pools and NAT rules");

                List <Creatable<NetworkInterface>> networkInterfaceCreatables = new ArrayList<Creatable<NetworkInterface>>();

                Creatable<NetworkInterface> networkInterface1Creatable;
                Creatable<NetworkInterface> networkInterface2Creatable;


                networkInterface1Creatable = azure.networkInterfaces()
                        .define(networkInterfaceName1)
                        .withRegion(Region.US_EAST)
                        .withNewResourceGroup(rgName)
                        .withExistingPrimaryNetwork(network)
                        .withSubnet("Front-end")
                        .withPrimaryPrivateIpAddressDynamic()
                        .withExistingLoadBalancerBackend(loadBalancer1, backendPoolName1)
                        .withExistingLoadBalancerBackend(loadBalancer1, backendPoolName2)
                        .withExistingLoadBalancerInboundNatRule(loadBalancer1, natRule5000to22forVM1)
                        .withExistingLoadBalancerInboundNatRule(loadBalancer1, natRule5001to23forVM1);

                networkInterfaceCreatables.add(networkInterface1Creatable);

                networkInterface2Creatable = azure.networkInterfaces()
                        .define(networkInterfaceName2)
                        .withRegion(Region.US_EAST)
                        .withNewResourceGroup(rgName)
                        .withExistingPrimaryNetwork(network)
                        .withSubnet("Front-end")
                        .withPrimaryPrivateIpAddressDynamic()
                        .withExistingLoadBalancerBackend(loadBalancer1, backendPoolName1)
                        .withExistingLoadBalancerBackend(loadBalancer1, backendPoolName2)
                        .withExistingLoadBalancerInboundNatRule(loadBalancer1, natRule5002to22forVM2)
                        .withExistingLoadBalancerInboundNatRule(loadBalancer1, natRule5003to23forVM2);

                networkInterfaceCreatables.add(networkInterface2Creatable);

                List <NetworkInterface> networkInterfaces1 = azure.networkInterfaces().create(networkInterfaceCreatables);

                // Print network interface details
                System.out.println("Created two network interfaces");
                System.out.println("Network Interface ONE -");
                Utils.print(networkInterfaces1.get(0));
                System.out.println();
                System.out.println("Network Interface TWO -");
                Utils.print(networkInterfaces1.get(1));


                //=============================================================
                // Create an availability set

                System.out.println("Creating an availability set ...");

                AvailabilitySet availSet1 = azure.availabilitySets().define(availSetName)
                        .withRegion(Region.US_EAST)
                        .withNewResourceGroup(rgName)
                        .withFaultDomainCount(2)
                        .withUpdateDomainCount(4)
                        .create();

                System.out.println("Created first availability set: " + availSet1.id());
                Utils.print(availSet1);


                //=============================================================
                // Create two virtual machines and assign network interfaces

                System.out.println("Creating two virtual machines in the frontend subnet ...");
                System.out.println("- And assigning network interfaces");

                List <Creatable<VirtualMachine>> virtualMachineCreateables1 = new ArrayList<Creatable<VirtualMachine>>();
                Creatable<VirtualMachine> virtualMachine1Creatable;
                Creatable<VirtualMachine> virtualMachine2Creatable;

                virtualMachine1Creatable = azure.virtualMachines()
                        .define(vmName1)
                        .withRegion(Region.US_EAST)
                        .withExistingResourceGroup(rgName)
                        .withExistingPrimaryNetworkInterface(networkInterfaces1.get(0))
                        .withPopularLinuxImage(KnownLinuxVirtualMachineImage.UBUNTU_SERVER_16_04_LTS)
                        .withRootUserName(userName)
                        .withSsh(sshKey)
                        .withSize(VirtualMachineSizeTypes.STANDARD_D3_V2)
                        .withExistingAvailabilitySet(availSet1);

                virtualMachineCreateables1.add(virtualMachine1Creatable);

                virtualMachine2Creatable = azure.virtualMachines()
                        .define(vmName2)
                        .withRegion(Region.US_EAST)
                        .withExistingResourceGroup(rgName)
                        .withExistingPrimaryNetworkInterface(networkInterfaces1.get(1))
                        .withPopularLinuxImage(KnownLinuxVirtualMachineImage.UBUNTU_SERVER_16_04_LTS)
                        .withRootUserName(userName)
                        .withSsh(sshKey)
                        .withSize(VirtualMachineSizeTypes.STANDARD_D3_V2)
                        .withExistingAvailabilitySet(availSet1);

                virtualMachineCreateables1.add(virtualMachine2Creatable);

                Date t1 = new Date();
                List <VirtualMachine> virtualMachines = azure.virtualMachines().create(virtualMachineCreateables1);

                Date t2 = new Date();
                System.out.println("Created 2 Linux VMs: (took " + ((t2.getTime() - t1.getTime()) / 1000) + " seconds) ");
                System.out.println();

                // Print virtual machine details
                System.out.println("Virtual Machine ONE -");
                Utils.print(virtualMachines.get(0));
                System.out.println();
                System.out.println("Virtual Machine TWO - ");
                Utils.print(virtualMachines.get(1));

            } catch (Exception f) {

                System.out.println(f.getMessage());
                f.printStackTrace();

            } finally {
                try {
                    System.out.println("Deleting Resource Group: " + rgName);
                    azure.resourceGroups().delete(rgName);
                    System.out.println("Deleted Resource Group: " + rgName);
                } catch (NullPointerException npe) {
                    System.out.println("Did not create any resources in Azure. No clean up is necessary");
                } catch (Exception g) {
                    g.printStackTrace();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    private ManageInternetFacingLoadBalancer() {

    }
}
