/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01.implementation;

import java.util.Map;
import com.microsoft.azure.management.appservice.v2020_09_01.AppServiceCertificate;
import com.microsoft.azure.management.appservice.v2020_09_01.CertificateProductType;
import com.microsoft.azure.management.appservice.v2020_09_01.ProvisioningState;
import com.microsoft.azure.management.appservice.v2020_09_01.CertificateOrderStatus;
import com.microsoft.azure.management.appservice.v2020_09_01.CertificateDetails;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.appservice.v2020_09_01.SystemData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * SSL certificate purchase order.
 */
@JsonFlatten
public class AppServiceCertificateOrderInner extends Resource {
    /**
     * State of the Key Vault secret.
     */
    @JsonProperty(value = "properties.certificates")
    private Map<String, AppServiceCertificate> certificates;

    /**
     * Certificate distinguished name.
     */
    @JsonProperty(value = "properties.distinguishedName")
    private String distinguishedName;

    /**
     * Domain verification token.
     */
    @JsonProperty(value = "properties.domainVerificationToken", access = JsonProperty.Access.WRITE_ONLY)
    private String domainVerificationToken;

    /**
     * Duration in years (must be between 1 and 3).
     */
    @JsonProperty(value = "properties.validityInYears")
    private Integer validityInYears;

    /**
     * Certificate key size.
     */
    @JsonProperty(value = "properties.keySize")
    private Integer keySize;

    /**
     * Certificate product type. Possible values include:
     * 'StandardDomainValidatedSsl', 'StandardDomainValidatedWildCardSsl'.
     */
    @JsonProperty(value = "properties.productType", required = true)
    private CertificateProductType productType;

    /**
     * &lt;code&gt;true&lt;/code&gt; if the certificate should be automatically
     * renewed when it expires; otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.autoRenew")
    private Boolean autoRenew;

    /**
     * Status of certificate order. Possible values include: 'Succeeded',
     * 'Failed', 'Canceled', 'InProgress', 'Deleting'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Current order status. Possible values include: 'Pendingissuance',
     * 'Issued', 'Revoked', 'Canceled', 'Denied', 'Pendingrevocation',
     * 'PendingRekey', 'Unused', 'Expired', 'NotSubmitted'.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateOrderStatus status;

    /**
     * Signed certificate.
     */
    @JsonProperty(value = "properties.signedCertificate", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateDetails signedCertificate;

    /**
     * Last CSR that was created for this order.
     */
    @JsonProperty(value = "properties.csr")
    private String csr;

    /**
     * Intermediate certificate.
     */
    @JsonProperty(value = "properties.intermediate", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateDetails intermediate;

    /**
     * Root certificate.
     */
    @JsonProperty(value = "properties.root", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateDetails root;

    /**
     * Current serial number of the certificate.
     */
    @JsonProperty(value = "properties.serialNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String serialNumber;

    /**
     * Certificate last issuance time.
     */
    @JsonProperty(value = "properties.lastCertificateIssuanceTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastCertificateIssuanceTime;

    /**
     * Certificate expiration time.
     */
    @JsonProperty(value = "properties.expirationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime expirationTime;

    /**
     * &lt;code&gt;true&lt;/code&gt; if private key is external; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.isPrivateKeyExternal", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isPrivateKeyExternal;

    /**
     * Reasons why App Service Certificate is not renewable at the current
     * moment.
     */
    @JsonProperty(value = "properties.appServiceCertificateNotRenewableReasons", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> appServiceCertificateNotRenewableReasons;

    /**
     * Time stamp when the certificate would be auto renewed next.
     */
    @JsonProperty(value = "properties.nextAutoRenewalTimeStamp", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime nextAutoRenewalTimeStamp;

    /**
     * Kind of resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * The system metadata relating to this resource.
     */
    @JsonProperty(value = "systemData")
    private SystemData systemData;

    /**
     * Get state of the Key Vault secret.
     *
     * @return the certificates value
     */
    public Map<String, AppServiceCertificate> certificates() {
        return this.certificates;
    }

    /**
     * Set state of the Key Vault secret.
     *
     * @param certificates the certificates value to set
     * @return the AppServiceCertificateOrderInner object itself.
     */
    public AppServiceCertificateOrderInner withCertificates(Map<String, AppServiceCertificate> certificates) {
        this.certificates = certificates;
        return this;
    }

    /**
     * Get certificate distinguished name.
     *
     * @return the distinguishedName value
     */
    public String distinguishedName() {
        return this.distinguishedName;
    }

    /**
     * Set certificate distinguished name.
     *
     * @param distinguishedName the distinguishedName value to set
     * @return the AppServiceCertificateOrderInner object itself.
     */
    public AppServiceCertificateOrderInner withDistinguishedName(String distinguishedName) {
        this.distinguishedName = distinguishedName;
        return this;
    }

    /**
     * Get domain verification token.
     *
     * @return the domainVerificationToken value
     */
    public String domainVerificationToken() {
        return this.domainVerificationToken;
    }

    /**
     * Get duration in years (must be between 1 and 3).
     *
     * @return the validityInYears value
     */
    public Integer validityInYears() {
        return this.validityInYears;
    }

    /**
     * Set duration in years (must be between 1 and 3).
     *
     * @param validityInYears the validityInYears value to set
     * @return the AppServiceCertificateOrderInner object itself.
     */
    public AppServiceCertificateOrderInner withValidityInYears(Integer validityInYears) {
        this.validityInYears = validityInYears;
        return this;
    }

    /**
     * Get certificate key size.
     *
     * @return the keySize value
     */
    public Integer keySize() {
        return this.keySize;
    }

    /**
     * Set certificate key size.
     *
     * @param keySize the keySize value to set
     * @return the AppServiceCertificateOrderInner object itself.
     */
    public AppServiceCertificateOrderInner withKeySize(Integer keySize) {
        this.keySize = keySize;
        return this;
    }

    /**
     * Get certificate product type. Possible values include: 'StandardDomainValidatedSsl', 'StandardDomainValidatedWildCardSsl'.
     *
     * @return the productType value
     */
    public CertificateProductType productType() {
        return this.productType;
    }

    /**
     * Set certificate product type. Possible values include: 'StandardDomainValidatedSsl', 'StandardDomainValidatedWildCardSsl'.
     *
     * @param productType the productType value to set
     * @return the AppServiceCertificateOrderInner object itself.
     */
    public AppServiceCertificateOrderInner withProductType(CertificateProductType productType) {
        this.productType = productType;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if the certificate should be automatically renewed when it expires; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the autoRenew value
     */
    public Boolean autoRenew() {
        return this.autoRenew;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; if the certificate should be automatically renewed when it expires; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param autoRenew the autoRenew value to set
     * @return the AppServiceCertificateOrderInner object itself.
     */
    public AppServiceCertificateOrderInner withAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /**
     * Get status of certificate order. Possible values include: 'Succeeded', 'Failed', 'Canceled', 'InProgress', 'Deleting'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get current order status. Possible values include: 'Pendingissuance', 'Issued', 'Revoked', 'Canceled', 'Denied', 'Pendingrevocation', 'PendingRekey', 'Unused', 'Expired', 'NotSubmitted'.
     *
     * @return the status value
     */
    public CertificateOrderStatus status() {
        return this.status;
    }

    /**
     * Get signed certificate.
     *
     * @return the signedCertificate value
     */
    public CertificateDetails signedCertificate() {
        return this.signedCertificate;
    }

    /**
     * Get last CSR that was created for this order.
     *
     * @return the csr value
     */
    public String csr() {
        return this.csr;
    }

    /**
     * Set last CSR that was created for this order.
     *
     * @param csr the csr value to set
     * @return the AppServiceCertificateOrderInner object itself.
     */
    public AppServiceCertificateOrderInner withCsr(String csr) {
        this.csr = csr;
        return this;
    }

    /**
     * Get intermediate certificate.
     *
     * @return the intermediate value
     */
    public CertificateDetails intermediate() {
        return this.intermediate;
    }

    /**
     * Get root certificate.
     *
     * @return the root value
     */
    public CertificateDetails root() {
        return this.root;
    }

    /**
     * Get current serial number of the certificate.
     *
     * @return the serialNumber value
     */
    public String serialNumber() {
        return this.serialNumber;
    }

    /**
     * Get certificate last issuance time.
     *
     * @return the lastCertificateIssuanceTime value
     */
    public DateTime lastCertificateIssuanceTime() {
        return this.lastCertificateIssuanceTime;
    }

    /**
     * Get certificate expiration time.
     *
     * @return the expirationTime value
     */
    public DateTime expirationTime() {
        return this.expirationTime;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if private key is external; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isPrivateKeyExternal value
     */
    public Boolean isPrivateKeyExternal() {
        return this.isPrivateKeyExternal;
    }

    /**
     * Get reasons why App Service Certificate is not renewable at the current moment.
     *
     * @return the appServiceCertificateNotRenewableReasons value
     */
    public List<String> appServiceCertificateNotRenewableReasons() {
        return this.appServiceCertificateNotRenewableReasons;
    }

    /**
     * Get time stamp when the certificate would be auto renewed next.
     *
     * @return the nextAutoRenewalTimeStamp value
     */
    public DateTime nextAutoRenewalTimeStamp() {
        return this.nextAutoRenewalTimeStamp;
    }

    /**
     * Get kind of resource.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set kind of resource.
     *
     * @param kind the kind value to set
     * @return the AppServiceCertificateOrderInner object itself.
     */
    public AppServiceCertificateOrderInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the system metadata relating to this resource.
     *
     * @return the systemData value
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Set the system metadata relating to this resource.
     *
     * @param systemData the systemData value to set
     * @return the AppServiceCertificateOrderInner object itself.
     */
    public AppServiceCertificateOrderInner withSystemData(SystemData systemData) {
        this.systemData = systemData;
        return this;
    }

}
