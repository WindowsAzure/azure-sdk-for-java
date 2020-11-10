/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.monitor.v2019_11_01.implementation.DiagnosticSettingsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing DiagnosticSettings.
 */
public interface DiagnosticSettings extends SupportsCreating<DiagnosticSettingsResource.DefinitionStages.Blank>, HasInner<DiagnosticSettingsInner> {
    /**
     * Gets the active diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DiagnosticSettingsResource> getAsync(String resourceUri, String name);

    /**
     * Deletes existing diagnostic settings for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceUri, String name);

    /**
     * Gets the active diagnostic settings list for the specified resource.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DiagnosticSettingsResourceCollection> listAsync(String resourceUri);

}
