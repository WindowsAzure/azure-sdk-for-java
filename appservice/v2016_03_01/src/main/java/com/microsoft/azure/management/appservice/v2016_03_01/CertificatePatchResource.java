/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * ARM resource for a certificate.
 */
@JsonFlatten
public class CertificatePatchResource extends ProxyOnlyResource {
    /**
     * Friendly name of the certificate.
     */
    @JsonProperty(value = "properties.friendlyName", access = JsonProperty.Access.WRITE_ONLY)
    private String friendlyName;

    /**
     * Subject name of the certificate.
     */
    @JsonProperty(value = "properties.subjectName", access = JsonProperty.Access.WRITE_ONLY)
    private String subjectName;

    /**
     * Host names the certificate applies to.
     */
    @JsonProperty(value = "properties.hostNames")
    private List<String> hostNames;

    /**
     * Pfx blob.
     */
    @JsonProperty(value = "properties.pfxBlob")
    private byte[] pfxBlob;

    /**
     * App name.
     */
    @JsonProperty(value = "properties.siteName", access = JsonProperty.Access.WRITE_ONLY)
    private String siteName;

    /**
     * Self link.
     */
    @JsonProperty(value = "properties.selfLink", access = JsonProperty.Access.WRITE_ONLY)
    private String selfLink;

    /**
     * Certificate issuer.
     */
    @JsonProperty(value = "properties.issuer", access = JsonProperty.Access.WRITE_ONLY)
    private String issuer;

    /**
     * Certificate issue Date.
     */
    @JsonProperty(value = "properties.issueDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime issueDate;

    /**
     * Certificate expriration date.
     */
    @JsonProperty(value = "properties.expirationDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime expirationDate;

    /**
     * Certificate password.
     */
    @JsonProperty(value = "properties.password", required = true)
    private String password;

    /**
     * Certificate thumbprint.
     */
    @JsonProperty(value = "properties.thumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbprint;

    /**
     * Is the certificate valid?.
     */
    @JsonProperty(value = "properties.valid", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean valid;

    /**
     * Raw bytes of .cer file.
     */
    @JsonProperty(value = "properties.cerBlob", access = JsonProperty.Access.WRITE_ONLY)
    private byte[] cerBlob;

    /**
     * Public key hash.
     */
    @JsonProperty(value = "properties.publicKeyHash", access = JsonProperty.Access.WRITE_ONLY)
    private String publicKeyHash;

    /**
     * Specification for the App Service Environment to use for the
     * certificate.
     */
    @JsonProperty(value = "properties.hostingEnvironmentProfile", access = JsonProperty.Access.WRITE_ONLY)
    private HostingEnvironmentProfile hostingEnvironmentProfile;

    /**
     * Key Vault Csm resource Id.
     */
    @JsonProperty(value = "properties.keyVaultId")
    private String keyVaultId;

    /**
     * Key Vault secret name.
     */
    @JsonProperty(value = "properties.keyVaultSecretName")
    private String keyVaultSecretName;

    /**
     * Status of the Key Vault secret. Possible values include: 'Initialized',
     * 'WaitingOnCertificateOrder', 'Succeeded', 'CertificateOrderFailed',
     * 'OperationNotPermittedOnKeyVault',
     * 'AzureServiceUnauthorizedToAccessKeyVault', 'KeyVaultDoesNotExist',
     * 'KeyVaultSecretDoesNotExist', 'UnknownError', 'ExternalPrivateKey',
     * 'Unknown'.
     */
    @JsonProperty(value = "properties.keyVaultSecretStatus", access = JsonProperty.Access.WRITE_ONLY)
    private KeyVaultSecretStatus keyVaultSecretStatus;

    /**
     * Region of the certificate.
     */
    @JsonProperty(value = "properties.geoRegion", access = JsonProperty.Access.WRITE_ONLY)
    private String geoRegion;

    /**
     * Resource ID of the associated App Service plan, formatted as:
     * "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     */
    @JsonProperty(value = "properties.serverFarmId")
    private String serverFarmId;

    /**
     * Get the friendlyName value.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Get the subjectName value.
     *
     * @return the subjectName value
     */
    public String subjectName() {
        return this.subjectName;
    }

    /**
     * Get the hostNames value.
     *
     * @return the hostNames value
     */
    public List<String> hostNames() {
        return this.hostNames;
    }

    /**
     * Set the hostNames value.
     *
     * @param hostNames the hostNames value to set
     * @return the CertificatePatchResource object itself.
     */
    public CertificatePatchResource withHostNames(List<String> hostNames) {
        this.hostNames = hostNames;
        return this;
    }

    /**
     * Get the pfxBlob value.
     *
     * @return the pfxBlob value
     */
    public byte[] pfxBlob() {
        return this.pfxBlob;
    }

    /**
     * Set the pfxBlob value.
     *
     * @param pfxBlob the pfxBlob value to set
     * @return the CertificatePatchResource object itself.
     */
    public CertificatePatchResource withPfxBlob(byte[] pfxBlob) {
        this.pfxBlob = pfxBlob;
        return this;
    }

    /**
     * Get the siteName value.
     *
     * @return the siteName value
     */
    public String siteName() {
        return this.siteName;
    }

    /**
     * Get the selfLink value.
     *
     * @return the selfLink value
     */
    public String selfLink() {
        return this.selfLink;
    }

    /**
     * Get the issuer value.
     *
     * @return the issuer value
     */
    public String issuer() {
        return this.issuer;
    }

    /**
     * Get the issueDate value.
     *
     * @return the issueDate value
     */
    public DateTime issueDate() {
        return this.issueDate;
    }

    /**
     * Get the expirationDate value.
     *
     * @return the expirationDate value
     */
    public DateTime expirationDate() {
        return this.expirationDate;
    }

    /**
     * Get the password value.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password value.
     *
     * @param password the password value to set
     * @return the CertificatePatchResource object itself.
     */
    public CertificatePatchResource withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the thumbprint value.
     *
     * @return the thumbprint value
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Get the valid value.
     *
     * @return the valid value
     */
    public Boolean valid() {
        return this.valid;
    }

    /**
     * Get the cerBlob value.
     *
     * @return the cerBlob value
     */
    public byte[] cerBlob() {
        return this.cerBlob;
    }

    /**
     * Get the publicKeyHash value.
     *
     * @return the publicKeyHash value
     */
    public String publicKeyHash() {
        return this.publicKeyHash;
    }

    /**
     * Get the hostingEnvironmentProfile value.
     *
     * @return the hostingEnvironmentProfile value
     */
    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile;
    }

    /**
     * Get the keyVaultId value.
     *
     * @return the keyVaultId value
     */
    public String keyVaultId() {
        return this.keyVaultId;
    }

    /**
     * Set the keyVaultId value.
     *
     * @param keyVaultId the keyVaultId value to set
     * @return the CertificatePatchResource object itself.
     */
    public CertificatePatchResource withKeyVaultId(String keyVaultId) {
        this.keyVaultId = keyVaultId;
        return this;
    }

    /**
     * Get the keyVaultSecretName value.
     *
     * @return the keyVaultSecretName value
     */
    public String keyVaultSecretName() {
        return this.keyVaultSecretName;
    }

    /**
     * Set the keyVaultSecretName value.
     *
     * @param keyVaultSecretName the keyVaultSecretName value to set
     * @return the CertificatePatchResource object itself.
     */
    public CertificatePatchResource withKeyVaultSecretName(String keyVaultSecretName) {
        this.keyVaultSecretName = keyVaultSecretName;
        return this;
    }

    /**
     * Get the keyVaultSecretStatus value.
     *
     * @return the keyVaultSecretStatus value
     */
    public KeyVaultSecretStatus keyVaultSecretStatus() {
        return this.keyVaultSecretStatus;
    }

    /**
     * Get the geoRegion value.
     *
     * @return the geoRegion value
     */
    public String geoRegion() {
        return this.geoRegion;
    }

    /**
     * Get the serverFarmId value.
     *
     * @return the serverFarmId value
     */
    public String serverFarmId() {
        return this.serverFarmId;
    }

    /**
     * Set the serverFarmId value.
     *
     * @param serverFarmId the serverFarmId value to set
     * @return the CertificatePatchResource object itself.
     */
    public CertificatePatchResource withServerFarmId(String serverFarmId) {
        this.serverFarmId = serverFarmId;
        return this;
    }

}
