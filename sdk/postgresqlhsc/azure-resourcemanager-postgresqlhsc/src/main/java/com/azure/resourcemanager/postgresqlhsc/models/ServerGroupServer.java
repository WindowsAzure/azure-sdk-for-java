// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlhsc.models;

import com.azure.resourcemanager.postgresqlhsc.fluent.models.ServerGroupServerInner;

/** An immutable client-side representation of ServerGroupServer. */
public interface ServerGroupServer {
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
     * Gets the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the serverEdition property: The edition of a server (default: GeneralPurpose).
     *
     * @return the serverEdition value.
     */
    ServerEdition serverEdition();

    /**
     * Gets the storageQuotaInMb property: The storage of a server in MB (max: 2097152 = 2TiB).
     *
     * @return the storageQuotaInMb value.
     */
    Long storageQuotaInMb();

    /**
     * Gets the vCores property: The vCores count of a server (max: 64).
     *
     * @return the vCores value.
     */
    Long vCores();

    /**
     * Gets the enableHa property: If high availability is enabled or not for the server.
     *
     * @return the enableHa value.
     */
    Boolean enableHa();

    /**
     * Gets the enablePublicIp property: If public IP is requested or not for a server.
     *
     * @return the enablePublicIp value.
     */
    Boolean enablePublicIp();

    /**
     * Gets the fullyQualifiedDomainName property: The fully qualified domain name of a server.
     *
     * @return the fullyQualifiedDomainName value.
     */
    String fullyQualifiedDomainName();

    /**
     * Gets the role property: The role of server in the server group.
     *
     * @return the role value.
     */
    ServerRole role();

    /**
     * Gets the state property: A state of a server that is visible to user.
     *
     * @return the state value.
     */
    ServerState state();

    /**
     * Gets the haState property: A state of a server group that is visible to user for HA feature.
     *
     * @return the haState value.
     */
    ServerHaState haState();

    /**
     * Gets the administratorLogin property: The administrator's login name of a servers in server group.
     *
     * @return the administratorLogin value.
     */
    String administratorLogin();

    /**
     * Gets the postgresqlVersion property: The PostgreSQL version of server.
     *
     * @return the postgresqlVersion value.
     */
    PostgreSqlVersion postgresqlVersion();

    /**
     * Gets the citusVersion property: The Citus version of server.
     *
     * @return the citusVersion value.
     */
    CitusVersion citusVersion();

    /**
     * Gets the availabilityZone property: Availability Zone information of the server group.
     *
     * @return the availabilityZone value.
     */
    String availabilityZone();

    /**
     * Gets the standbyAvailabilityZone property: Standby Availability Zone information of the server group.
     *
     * @return the standbyAvailabilityZone value.
     */
    String standbyAvailabilityZone();

    /**
     * Gets the inner com.azure.resourcemanager.postgresqlhsc.fluent.models.ServerGroupServerInner object.
     *
     * @return the inner object.
     */
    ServerGroupServerInner innerModel();
}
