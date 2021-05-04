// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.managedapplications {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.managedapplications;
    exports com.azure.resourcemanager.managedapplications.fluent;
    exports com.azure.resourcemanager.managedapplications.fluent.models;
    exports com.azure.resourcemanager.managedapplications.models;

    opens com.azure.resourcemanager.managedapplications.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.managedapplications.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
