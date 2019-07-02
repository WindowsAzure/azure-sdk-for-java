/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

<<<<<<< HEAD
=======
<<<<<<< HEAD:eventhubs/resource-manager/v2017_04_01/src/main/java/com/microsoft/azure/management/eventhubs/v2017_04_01/implementation/OperationImpl.java
package com.microsoft.azure.management.eventhubs.v2017_04_01.implementation;

import com.microsoft.azure.management.eventhubs.v2017_04_01.Operation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.eventhubs.v2017_04_01.OperationDisplay;
=======
>>>>>>> upstream/master
package com.microsoft.azure.management.eventhubs.v2015_08_01.implementation;

import com.microsoft.azure.management.eventhubs.v2015_08_01.Operation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.eventhubs.v2015_08_01.OperationDisplay;
<<<<<<< HEAD
=======
>>>>>>> upstream/master:eventhubs/resource-manager/v2015_08_01/src/main/java/com/microsoft/azure/management/eventhubs/v2015_08_01/implementation/OperationImpl.java
>>>>>>> upstream/master

class OperationImpl extends WrapperImpl<OperationInner> implements Operation {
    private final EventHubsManager manager;
    OperationImpl(OperationInner inner, EventHubsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public EventHubsManager manager() {
        return this.manager;
    }

    @Override
    public OperationDisplay display() {
        return this.inner().display();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

}
