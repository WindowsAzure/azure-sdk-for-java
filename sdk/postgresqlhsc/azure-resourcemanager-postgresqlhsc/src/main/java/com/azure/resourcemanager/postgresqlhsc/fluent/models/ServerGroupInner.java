// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlhsc.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresqlhsc.models.CitusVersion;
import com.azure.resourcemanager.postgresqlhsc.models.CreateMode;
import com.azure.resourcemanager.postgresqlhsc.models.MaintenanceWindow;
import com.azure.resourcemanager.postgresqlhsc.models.PostgreSqlVersion;
import com.azure.resourcemanager.postgresqlhsc.models.ResourceProviderType;
import com.azure.resourcemanager.postgresqlhsc.models.ServerGroupPropertiesDelegatedSubnetArguments;
import com.azure.resourcemanager.postgresqlhsc.models.ServerRoleGroup;
import com.azure.resourcemanager.postgresqlhsc.models.ServerState;
import com.azure.resourcemanager.postgresqlhsc.models.SystemData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Represents a server group for create. */
@JsonFlatten
@Fluent
public class ServerGroupInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerGroupInner.class);

    /*
     * The system metadata relating to this resource
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The mode to create a new server group.
     */
    @JsonProperty(value = "properties.createMode")
    private CreateMode createMode;

    /*
     * The administrator's login name of servers in server group. Can only be
     * specified when the server is being created (and is required for
     * creation).
     */
    @JsonProperty(value = "properties.administratorLogin")
    private String administratorLogin;

    /*
     * The password of the administrator login.
     */
    @JsonProperty(value = "properties.administratorLoginPassword")
    private String administratorLoginPassword;

    /*
     * The backup retention days for server group.
     */
    @JsonProperty(value = "properties.backupRetentionDays")
    private Integer backupRetentionDays;

    /*
     * The PostgreSQL version of server group.
     */
    @JsonProperty(value = "properties.postgresqlVersion")
    private PostgreSqlVersion postgresqlVersion;

    /*
     * The Citus version of server group.
     */
    @JsonProperty(value = "properties.citusVersion")
    private CitusVersion citusVersion;

    /*
     * If Citus MX is enabled or not for the server group.
     */
    @JsonProperty(value = "properties.enableMx")
    private Boolean enableMx;

    /*
     * If ZFS compression is enabled or not for the server group.
     */
    @JsonProperty(value = "properties.enableZfs")
    private Boolean enableZfs;

    /*
     * If shards on coordinator is enabled or not for the server group.
     */
    @JsonProperty(value = "properties.enableShardsOnCoordinator")
    private Boolean enableShardsOnCoordinator;

    /*
     * A state of a server group that is visible to user.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private ServerState state;

    /*
     * The earliest restore point time (ISO8601 format) for server group.
     */
    @JsonProperty(value = "properties.earliestRestoreTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime earliestRestoreTime;

    /*
     * The resource provider type of server group.
     */
    @JsonProperty(value = "properties.resourceProviderType", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceProviderType resourceProviderType;

    /*
     * The list of server role groups.
     */
    @JsonProperty(value = "properties.serverRoleGroups")
    private List<ServerRoleGroup> serverRoleGroups;

    /*
     * Maintenance window of a server group.
     */
    @JsonProperty(value = "properties.maintenanceWindow")
    private MaintenanceWindow maintenanceWindow;

    /*
     * Availability Zone information of the server group.
     */
    @JsonProperty(value = "properties.availabilityZone")
    private String availabilityZone;

    /*
     * Standby Availability Zone information of the server group.
     */
    @JsonProperty(value = "properties.standbyAvailabilityZone")
    private String standbyAvailabilityZone;

    /*
     * The delegated subnet arguments for a server group.
     */
    @JsonProperty(value = "properties.delegatedSubnetArguments")
    private ServerGroupPropertiesDelegatedSubnetArguments delegatedSubnetArguments;

    /*
     * The source subscription id to restore from. It's required when
     * 'createMode' is 'PointInTimeRestore'
     */
    @JsonProperty(value = "properties.sourceSubscriptionId")
    private String sourceSubscriptionId;

    /*
     * The source resource group name to restore from. It's required when
     * 'createMode' is 'PointInTimeRestore'
     */
    @JsonProperty(value = "properties.sourceResourceGroupName")
    private String sourceResourceGroupName;

    /*
     * The source server group name to restore from. It's required when
     * 'createMode' is 'PointInTimeRestore'
     */
    @JsonProperty(value = "properties.sourceServerGroupName")
    private String sourceServerGroupName;

    /*
     * The source server group location to restore from. It's required when
     * 'createMode' is 'PointInTimeRestore'
     */
    @JsonProperty(value = "properties.sourceLocation")
    private String sourceLocation;

    /*
     * Restore point creation time (ISO8601 format), specifying the time to
     * restore from. It's required when 'createMode' is 'PointInTimeRestore'
     */
    @JsonProperty(value = "properties.pointInTimeUTC")
    private OffsetDateTime pointInTimeUtc;

    /**
     * Get the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the createMode property: The mode to create a new server group.
     *
     * @return the createMode value.
     */
    public CreateMode createMode() {
        return this.createMode;
    }

    /**
     * Set the createMode property: The mode to create a new server group.
     *
     * @param createMode the createMode value to set.
     * @return the ServerGroupInner object itself.
     */
    public ServerGroupInner withCreateMode(CreateMode createMode) {
        this.createMode = createMode;
        return this;
    }

    /**
     * Get the administratorLogin property: The administrator's login name of servers in server group. Can only be
     * specified when the server is being created (and is required for creation).
     *
     * @return the administratorLogin value.
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }

    /**
     * Set the administratorLogin property: The administrator's login name of servers in server group. Can only be
     * specified when the server is being created (and is required for creation).
     *
     * @param administratorLogin the administratorLogin value to set.
     * @return the ServerGroupInner object itself.
     */
    public ServerGroupInner withAdministratorLogin(String administratorLogin) {
        this.administratorLogin = administratorLogin;
        return this;
    }

    /**
     * Get the administratorLoginPassword property: The password of the administrator login.
     *
     * @return the administratorLoginPassword value.
     */
    public String administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * Set the administratorLoginPassword property: The password of the administrator login.
     *
     * @param administratorLoginPassword the administratorLoginPassword value to set.
     * @return the ServerGroupInner object itself.
     */
    public ServerGroupInner withAdministratorLoginPassword(String administratorLoginPassword) {
        this.administratorLoginPassword = administratorLoginPassword;
        return this;
    }

    /**
     * Get the backupRetentionDays property: The backup retention days for server group.
     *
     * @return the backupRetentionDays value.
     */
    public Integer backupRetentionDays() {
        return this.backupRetentionDays;
    }

    /**
     * Set the backupRetentionDays property: The backup retention days for server group.
     *
     * @param backupRetentionDays the backupRetentionDays value to set.
     * @return the ServerGroupInner object itself.
     */
    public ServerGroupInner withBackupRetentionDays(Integer backupRetentionDays) {
        this.backupRetentionDays = backupRetentionDays;
        return this;
    }

    /**
     * Get the postgresqlVersion property: The PostgreSQL version of server group.
     *
     * @return the postgresqlVersion value.
     */
    public PostgreSqlVersion postgresqlVersion() {
        return this.postgresqlVersion;
    }

    /**
     * Set the postgresqlVersion property: The PostgreSQL version of server group.
     *
     * @param postgresqlVersion the postgresqlVersion value to set.
     * @return the ServerGroupInner object itself.
     */
    public ServerGroupInner withPostgresqlVersion(PostgreSqlVersion postgresqlVersion) {
        this.postgresqlVersion = postgresqlVersion;
        return this;
    }

    /**
     * Get the citusVersion property: The Citus version of server group.
     *
     * @return the citusVersion value.
     */
    public CitusVersion citusVersion() {
        return this.citusVersion;
    }

    /**
     * Set the citusVersion property: The Citus version of server group.
     *
     * @param citusVersion the citusVersion value to set.
     * @return the ServerGroupInner object itself.
     */
    public ServerGroupInner withCitusVersion(CitusVersion citusVersion) {
        this.citusVersion = citusVersion;
        return this;
    }

    /**
     * Get the enableMx property: If Citus MX is enabled or not for the server group.
     *
     * @return the enableMx value.
     */
    public Boolean enableMx() {
        return this.enableMx;
    }

    /**
     * Set the enableMx property: If Citus MX is enabled or not for the server group.
     *
     * @param enableMx the enableMx value to set.
     * @return the ServerGroupInner object itself.
     */
    public ServerGroupInner withEnableMx(Boolean enableMx) {
        this.enableMx = enableMx;
        return this;
    }

    /**
     * Get the enableZfs property: If ZFS compression is enabled or not for the server group.
     *
     * @return the enableZfs value.
     */
    public Boolean enableZfs() {
        return this.enableZfs;
    }

    /**
     * Set the enableZfs property: If ZFS compression is enabled or not for the server group.
     *
     * @param enableZfs the enableZfs value to set.
     * @return the ServerGroupInner object itself.
     */
    public ServerGroupInner withEnableZfs(Boolean enableZfs) {
        this.enableZfs = enableZfs;
        return this;
    }

    /**
     * Get the enableShardsOnCoordinator property: If shards on coordinator is enabled or not for the server group.
     *
     * @return the enableShardsOnCoordinator value.
     */
    public Boolean enableShardsOnCoordinator() {
        return this.enableShardsOnCoordinator;
    }

    /**
     * Set the enableShardsOnCoordinator property: If shards on coordinator is enabled or not for the server group.
     *
     * @param enableShardsOnCoordinator the enableShardsOnCoordinator value to set.
     * @return the ServerGroupInner object itself.
     */
    public ServerGroupInner withEnableShardsOnCoordinator(Boolean enableShardsOnCoordinator) {
        this.enableShardsOnCoordinator = enableShardsOnCoordinator;
        return this;
    }

    /**
     * Get the state property: A state of a server group that is visible to user.
     *
     * @return the state value.
     */
    public ServerState state() {
        return this.state;
    }

    /**
     * Get the earliestRestoreTime property: The earliest restore point time (ISO8601 format) for server group.
     *
     * @return the earliestRestoreTime value.
     */
    public OffsetDateTime earliestRestoreTime() {
        return this.earliestRestoreTime;
    }

    /**
     * Get the resourceProviderType property: The resource provider type of server group.
     *
     * @return the resourceProviderType value.
     */
    public ResourceProviderType resourceProviderType() {
        return this.resourceProviderType;
    }

    /**
     * Get the serverRoleGroups property: The list of server role groups.
     *
     * @return the serverRoleGroups value.
     */
    public List<ServerRoleGroup> serverRoleGroups() {
        return this.serverRoleGroups;
    }

    /**
     * Set the serverRoleGroups property: The list of server role groups.
     *
     * @param serverRoleGroups the serverRoleGroups value to set.
     * @return the ServerGroupInner object itself.
     */
    public ServerGroupInner withServerRoleGroups(List<ServerRoleGroup> serverRoleGroups) {
        this.serverRoleGroups = serverRoleGroups;
        return this;
    }

    /**
     * Get the maintenanceWindow property: Maintenance window of a server group.
     *
     * @return the maintenanceWindow value.
     */
    public MaintenanceWindow maintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * Set the maintenanceWindow property: Maintenance window of a server group.
     *
     * @param maintenanceWindow the maintenanceWindow value to set.
     * @return the ServerGroupInner object itself.
     */
    public ServerGroupInner withMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }

    /**
     * Get the availabilityZone property: Availability Zone information of the server group.
     *
     * @return the availabilityZone value.
     */
    public String availabilityZone() {
        return this.availabilityZone;
    }

    /**
     * Set the availabilityZone property: Availability Zone information of the server group.
     *
     * @param availabilityZone the availabilityZone value to set.
     * @return the ServerGroupInner object itself.
     */
    public ServerGroupInner withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * Get the standbyAvailabilityZone property: Standby Availability Zone information of the server group.
     *
     * @return the standbyAvailabilityZone value.
     */
    public String standbyAvailabilityZone() {
        return this.standbyAvailabilityZone;
    }

    /**
     * Set the standbyAvailabilityZone property: Standby Availability Zone information of the server group.
     *
     * @param standbyAvailabilityZone the standbyAvailabilityZone value to set.
     * @return the ServerGroupInner object itself.
     */
    public ServerGroupInner withStandbyAvailabilityZone(String standbyAvailabilityZone) {
        this.standbyAvailabilityZone = standbyAvailabilityZone;
        return this;
    }

    /**
     * Get the delegatedSubnetArguments property: The delegated subnet arguments for a server group.
     *
     * @return the delegatedSubnetArguments value.
     */
    public ServerGroupPropertiesDelegatedSubnetArguments delegatedSubnetArguments() {
        return this.delegatedSubnetArguments;
    }

    /**
     * Set the delegatedSubnetArguments property: The delegated subnet arguments for a server group.
     *
     * @param delegatedSubnetArguments the delegatedSubnetArguments value to set.
     * @return the ServerGroupInner object itself.
     */
    public ServerGroupInner withDelegatedSubnetArguments(
        ServerGroupPropertiesDelegatedSubnetArguments delegatedSubnetArguments) {
        this.delegatedSubnetArguments = delegatedSubnetArguments;
        return this;
    }

    /**
     * Get the sourceSubscriptionId property: The source subscription id to restore from. It's required when
     * 'createMode' is 'PointInTimeRestore'.
     *
     * @return the sourceSubscriptionId value.
     */
    public String sourceSubscriptionId() {
        return this.sourceSubscriptionId;
    }

    /**
     * Set the sourceSubscriptionId property: The source subscription id to restore from. It's required when
     * 'createMode' is 'PointInTimeRestore'.
     *
     * @param sourceSubscriptionId the sourceSubscriptionId value to set.
     * @return the ServerGroupInner object itself.
     */
    public ServerGroupInner withSourceSubscriptionId(String sourceSubscriptionId) {
        this.sourceSubscriptionId = sourceSubscriptionId;
        return this;
    }

    /**
     * Get the sourceResourceGroupName property: The source resource group name to restore from. It's required when
     * 'createMode' is 'PointInTimeRestore'.
     *
     * @return the sourceResourceGroupName value.
     */
    public String sourceResourceGroupName() {
        return this.sourceResourceGroupName;
    }

    /**
     * Set the sourceResourceGroupName property: The source resource group name to restore from. It's required when
     * 'createMode' is 'PointInTimeRestore'.
     *
     * @param sourceResourceGroupName the sourceResourceGroupName value to set.
     * @return the ServerGroupInner object itself.
     */
    public ServerGroupInner withSourceResourceGroupName(String sourceResourceGroupName) {
        this.sourceResourceGroupName = sourceResourceGroupName;
        return this;
    }

    /**
     * Get the sourceServerGroupName property: The source server group name to restore from. It's required when
     * 'createMode' is 'PointInTimeRestore'.
     *
     * @return the sourceServerGroupName value.
     */
    public String sourceServerGroupName() {
        return this.sourceServerGroupName;
    }

    /**
     * Set the sourceServerGroupName property: The source server group name to restore from. It's required when
     * 'createMode' is 'PointInTimeRestore'.
     *
     * @param sourceServerGroupName the sourceServerGroupName value to set.
     * @return the ServerGroupInner object itself.
     */
    public ServerGroupInner withSourceServerGroupName(String sourceServerGroupName) {
        this.sourceServerGroupName = sourceServerGroupName;
        return this;
    }

    /**
     * Get the sourceLocation property: The source server group location to restore from. It's required when
     * 'createMode' is 'PointInTimeRestore'.
     *
     * @return the sourceLocation value.
     */
    public String sourceLocation() {
        return this.sourceLocation;
    }

    /**
     * Set the sourceLocation property: The source server group location to restore from. It's required when
     * 'createMode' is 'PointInTimeRestore'.
     *
     * @param sourceLocation the sourceLocation value to set.
     * @return the ServerGroupInner object itself.
     */
    public ServerGroupInner withSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
        return this;
    }

    /**
     * Get the pointInTimeUtc property: Restore point creation time (ISO8601 format), specifying the time to restore
     * from. It's required when 'createMode' is 'PointInTimeRestore'.
     *
     * @return the pointInTimeUtc value.
     */
    public OffsetDateTime pointInTimeUtc() {
        return this.pointInTimeUtc;
    }

    /**
     * Set the pointInTimeUtc property: Restore point creation time (ISO8601 format), specifying the time to restore
     * from. It's required when 'createMode' is 'PointInTimeRestore'.
     *
     * @param pointInTimeUtc the pointInTimeUtc value to set.
     * @return the ServerGroupInner object itself.
     */
    public ServerGroupInner withPointInTimeUtc(OffsetDateTime pointInTimeUtc) {
        this.pointInTimeUtc = pointInTimeUtc;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerGroupInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerGroupInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (systemData() != null) {
            systemData().validate();
        }
        if (serverRoleGroups() != null) {
            serverRoleGroups().forEach(e -> e.validate());
        }
        if (maintenanceWindow() != null) {
            maintenanceWindow().validate();
        }
        if (delegatedSubnetArguments() != null) {
            delegatedSubnetArguments().validate();
        }
    }
}
