/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.fluentcore.model;

// Represents refreshable objects
public interface Refreshable<T> {
	T refresh() throws Exception;
}
