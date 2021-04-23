// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.managedapplications.generated {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.managedapplications.generated;
    exports com.azure.resourcemanager.managedapplications.generated.fluent;
    exports com.azure.resourcemanager.managedapplications.generated.fluent.models;
    exports com.azure.resourcemanager.managedapplications.generated.models;

    opens com.azure.resourcemanager.managedapplications.generated.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.managedapplications.generated.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
