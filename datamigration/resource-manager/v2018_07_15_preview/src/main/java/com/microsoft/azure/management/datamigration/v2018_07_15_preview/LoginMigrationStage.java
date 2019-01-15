/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for LoginMigrationStage.
 */
public final class LoginMigrationStage extends ExpandableStringEnum<LoginMigrationStage> {
    /** Static value None for LoginMigrationStage. */
    public static final LoginMigrationStage NONE = fromString("None");

    /** Static value Initialize for LoginMigrationStage. */
    public static final LoginMigrationStage INITIALIZE = fromString("Initialize");

    /** Static value LoginMigration for LoginMigrationStage. */
    public static final LoginMigrationStage LOGIN_MIGRATION = fromString("LoginMigration");

    /** Static value EstablishUserMapping for LoginMigrationStage. */
    public static final LoginMigrationStage ESTABLISH_USER_MAPPING = fromString("EstablishUserMapping");

    /** Static value AssignRoleMembership for LoginMigrationStage. */
    public static final LoginMigrationStage ASSIGN_ROLE_MEMBERSHIP = fromString("AssignRoleMembership");

    /** Static value AssignRoleOwnership for LoginMigrationStage. */
    public static final LoginMigrationStage ASSIGN_ROLE_OWNERSHIP = fromString("AssignRoleOwnership");

    /** Static value EstablishServerPermissions for LoginMigrationStage. */
    public static final LoginMigrationStage ESTABLISH_SERVER_PERMISSIONS = fromString("EstablishServerPermissions");

    /** Static value EstablishObjectPermissions for LoginMigrationStage. */
    public static final LoginMigrationStage ESTABLISH_OBJECT_PERMISSIONS = fromString("EstablishObjectPermissions");

    /** Static value Completed for LoginMigrationStage. */
    public static final LoginMigrationStage COMPLETED = fromString("Completed");

    /**
     * Creates or finds a LoginMigrationStage from its string representation.
     * @param name a name to look for
     * @return the corresponding LoginMigrationStage
     */
    @JsonCreator
    public static LoginMigrationStage fromString(String name) {
        return fromString(name, LoginMigrationStage.class);
    }

    /**
     * @return known LoginMigrationStage values
     */
    public static Collection<LoginMigrationStage> values() {
        return values(LoginMigrationStage.class);
    }
}
