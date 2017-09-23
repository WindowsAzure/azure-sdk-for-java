/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.network.implementation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import com.google.common.io.BaseEncoding;
import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.network.ApplicationGateway;
import com.microsoft.azure.management.network.ApplicationGatewayAuthenticationCertificate;
import com.microsoft.azure.management.resources.fluentcore.arm.models.implementation.ChildResourceImpl;

/**
 *  Implementation for ApplicationGatewayAuthenticationCertificate.
 */
@LangDefinition
class ApplicationGatewayAuthenticationCertificateImpl
    extends ChildResourceImpl<
        ApplicationGatewayAuthenticationCertificateInner,
        ApplicationGatewayImpl,
        ApplicationGateway>
    implements
        ApplicationGatewayAuthenticationCertificate,
        ApplicationGatewayAuthenticationCertificate.Definition<ApplicationGateway.DefinitionStages.WithCreate>,
        ApplicationGatewayAuthenticationCertificate.UpdateDefinition<ApplicationGateway.Update>,
        ApplicationGatewayAuthenticationCertificate.Update {

    ApplicationGatewayAuthenticationCertificateImpl(ApplicationGatewayAuthenticationCertificateInner inner, ApplicationGatewayImpl parent) {
        super(inner, parent);
    }

    // Helpers

    // Getters

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String data() {
        return this.inner().data();
    }

    // Verbs

    @Override
    public ApplicationGatewayImpl attach() {
        this.parent().withAuthenticationCertificate(this);
        return this.parent();
    }

    // Withers

    @Override
    public ApplicationGatewayAuthenticationCertificateImpl fromBytes(byte[] data) {
        String encoded = new String(BaseEncoding.base64().encode(data));
        this.inner().withData(encoded);
        return this;
    }

    @Override
    public ApplicationGatewayAuthenticationCertificateImpl fromFile(File certificateFile) throws IOException {
        if (certificateFile == null) {
            return null;
        }

        byte[] content = Files.readAllBytes(certificateFile.toPath());
        return (content != null) ? this.fromBytes(content) : null;
    }
}
