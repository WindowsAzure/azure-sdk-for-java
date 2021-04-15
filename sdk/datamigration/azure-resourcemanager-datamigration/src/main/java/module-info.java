// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.datamigration {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.datamigration;
    exports com.azure.resourcemanager.datamigration.fluent;
    exports com.azure.resourcemanager.datamigration.fluent.models;
    exports com.azure.resourcemanager.datamigration.models;

    opens com.azure.resourcemanager.datamigration.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.datamigration.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
