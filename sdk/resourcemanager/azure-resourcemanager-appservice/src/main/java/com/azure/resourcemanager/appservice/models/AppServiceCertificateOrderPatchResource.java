// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.fluent.models.AppServiceCertificateInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** ARM resource for a certificate order that is purchased through Azure. */
@JsonFlatten
@Fluent
public class AppServiceCertificateOrderPatchResource extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AppServiceCertificateOrderPatchResource.class);

    /*
     * State of the Key Vault secret.
     */
    @JsonProperty(value = "properties.certificates")
    private Map<String, AppServiceCertificateInner> certificates;

    /*
     * Certificate distinguished name.
     */
    @JsonProperty(value = "properties.distinguishedName")
    private String distinguishedName;

    /*
     * Domain verification token.
     */
    @JsonProperty(value = "properties.domainVerificationToken", access = JsonProperty.Access.WRITE_ONLY)
    private String domainVerificationToken;

    /*
     * Duration in years (must be between 1 and 3).
     */
    @JsonProperty(value = "properties.validityInYears")
    private Integer validityInYears;

    /*
     * Certificate key size.
     */
    @JsonProperty(value = "properties.keySize")
    private Integer keySize;

    /*
     * Certificate product type.
     */
    @JsonProperty(value = "properties.productType")
    private CertificateProductType productType;

    /*
     * <code>true</code> if the certificate should be automatically renewed
     * when it expires; otherwise, <code>false</code>.
     */
    @JsonProperty(value = "properties.autoRenew")
    private Boolean autoRenew;

    /*
     * Status of certificate order.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Current order status.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateOrderStatus status;

    /*
     * Signed certificate.
     */
    @JsonProperty(value = "properties.signedCertificate", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateDetails signedCertificate;

    /*
     * Last CSR that was created for this order.
     */
    @JsonProperty(value = "properties.csr")
    private String csr;

    /*
     * Intermediate certificate.
     */
    @JsonProperty(value = "properties.intermediate", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateDetails intermediate;

    /*
     * Root certificate.
     */
    @JsonProperty(value = "properties.root", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateDetails root;

    /*
     * Current serial number of the certificate.
     */
    @JsonProperty(value = "properties.serialNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String serialNumber;

    /*
     * Certificate last issuance time.
     */
    @JsonProperty(value = "properties.lastCertificateIssuanceTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastCertificateIssuanceTime;

    /*
     * Certificate expiration time.
     */
    @JsonProperty(value = "properties.expirationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime expirationTime;

    /*
     * <code>true</code> if private key is external; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "properties.isPrivateKeyExternal", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isPrivateKeyExternal;

    /*
     * Reasons why App Service Certificate is not renewable at the current
     * moment.
     */
    @JsonProperty(
        value = "properties.appServiceCertificateNotRenewableReasons",
        access = JsonProperty.Access.WRITE_ONLY)
    private List<AppServiceCertificateOrderPatchResourcePropertiesAppServiceCertificateNotRenewableReasonsItem>
        appServiceCertificateNotRenewableReasons;

    /*
     * Time stamp when the certificate would be auto renewed next
     */
    @JsonProperty(value = "properties.nextAutoRenewalTimeStamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime nextAutoRenewalTimestamp;

    /**
     * Get the certificates property: State of the Key Vault secret.
     *
     * @return the certificates value.
     */
    public Map<String, AppServiceCertificateInner> certificates() {
        return this.certificates;
    }

    /**
     * Set the certificates property: State of the Key Vault secret.
     *
     * @param certificates the certificates value to set.
     * @return the AppServiceCertificateOrderPatchResource object itself.
     */
    public AppServiceCertificateOrderPatchResource withCertificates(
        Map<String, AppServiceCertificateInner> certificates) {
        this.certificates = certificates;
        return this;
    }

    /**
     * Get the distinguishedName property: Certificate distinguished name.
     *
     * @return the distinguishedName value.
     */
    public String distinguishedName() {
        return this.distinguishedName;
    }

    /**
     * Set the distinguishedName property: Certificate distinguished name.
     *
     * @param distinguishedName the distinguishedName value to set.
     * @return the AppServiceCertificateOrderPatchResource object itself.
     */
    public AppServiceCertificateOrderPatchResource withDistinguishedName(String distinguishedName) {
        this.distinguishedName = distinguishedName;
        return this;
    }

    /**
     * Get the domainVerificationToken property: Domain verification token.
     *
     * @return the domainVerificationToken value.
     */
    public String domainVerificationToken() {
        return this.domainVerificationToken;
    }

    /**
     * Get the validityInYears property: Duration in years (must be between 1 and 3).
     *
     * @return the validityInYears value.
     */
    public Integer validityInYears() {
        return this.validityInYears;
    }

    /**
     * Set the validityInYears property: Duration in years (must be between 1 and 3).
     *
     * @param validityInYears the validityInYears value to set.
     * @return the AppServiceCertificateOrderPatchResource object itself.
     */
    public AppServiceCertificateOrderPatchResource withValidityInYears(Integer validityInYears) {
        this.validityInYears = validityInYears;
        return this;
    }

    /**
     * Get the keySize property: Certificate key size.
     *
     * @return the keySize value.
     */
    public Integer keySize() {
        return this.keySize;
    }

    /**
     * Set the keySize property: Certificate key size.
     *
     * @param keySize the keySize value to set.
     * @return the AppServiceCertificateOrderPatchResource object itself.
     */
    public AppServiceCertificateOrderPatchResource withKeySize(Integer keySize) {
        this.keySize = keySize;
        return this;
    }

    /**
     * Get the productType property: Certificate product type.
     *
     * @return the productType value.
     */
    public CertificateProductType productType() {
        return this.productType;
    }

    /**
     * Set the productType property: Certificate product type.
     *
     * @param productType the productType value to set.
     * @return the AppServiceCertificateOrderPatchResource object itself.
     */
    public AppServiceCertificateOrderPatchResource withProductType(CertificateProductType productType) {
        this.productType = productType;
        return this;
    }

    /**
     * Get the autoRenew property: &lt;code&gt;true&lt;/code&gt; if the certificate should be automatically renewed when
     * it expires; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the autoRenew value.
     */
    public Boolean autoRenew() {
        return this.autoRenew;
    }

    /**
     * Set the autoRenew property: &lt;code&gt;true&lt;/code&gt; if the certificate should be automatically renewed when
     * it expires; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param autoRenew the autoRenew value to set.
     * @return the AppServiceCertificateOrderPatchResource object itself.
     */
    public AppServiceCertificateOrderPatchResource withAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /**
     * Get the provisioningState property: Status of certificate order.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the status property: Current order status.
     *
     * @return the status value.
     */
    public CertificateOrderStatus status() {
        return this.status;
    }

    /**
     * Get the signedCertificate property: Signed certificate.
     *
     * @return the signedCertificate value.
     */
    public CertificateDetails signedCertificate() {
        return this.signedCertificate;
    }

    /**
     * Get the csr property: Last CSR that was created for this order.
     *
     * @return the csr value.
     */
    public String csr() {
        return this.csr;
    }

    /**
     * Set the csr property: Last CSR that was created for this order.
     *
     * @param csr the csr value to set.
     * @return the AppServiceCertificateOrderPatchResource object itself.
     */
    public AppServiceCertificateOrderPatchResource withCsr(String csr) {
        this.csr = csr;
        return this;
    }

    /**
     * Get the intermediate property: Intermediate certificate.
     *
     * @return the intermediate value.
     */
    public CertificateDetails intermediate() {
        return this.intermediate;
    }

    /**
     * Get the root property: Root certificate.
     *
     * @return the root value.
     */
    public CertificateDetails root() {
        return this.root;
    }

    /**
     * Get the serialNumber property: Current serial number of the certificate.
     *
     * @return the serialNumber value.
     */
    public String serialNumber() {
        return this.serialNumber;
    }

    /**
     * Get the lastCertificateIssuanceTime property: Certificate last issuance time.
     *
     * @return the lastCertificateIssuanceTime value.
     */
    public OffsetDateTime lastCertificateIssuanceTime() {
        return this.lastCertificateIssuanceTime;
    }

    /**
     * Get the expirationTime property: Certificate expiration time.
     *
     * @return the expirationTime value.
     */
    public OffsetDateTime expirationTime() {
        return this.expirationTime;
    }

    /**
     * Get the isPrivateKeyExternal property: &lt;code&gt;true&lt;/code&gt; if private key is external; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isPrivateKeyExternal value.
     */
    public Boolean isPrivateKeyExternal() {
        return this.isPrivateKeyExternal;
    }

    /**
     * Get the appServiceCertificateNotRenewableReasons property: Reasons why App Service Certificate is not renewable
     * at the current moment.
     *
     * @return the appServiceCertificateNotRenewableReasons value.
     */
    public List<AppServiceCertificateOrderPatchResourcePropertiesAppServiceCertificateNotRenewableReasonsItem>
        appServiceCertificateNotRenewableReasons() {
        return this.appServiceCertificateNotRenewableReasons;
    }

    /**
     * Get the nextAutoRenewalTimestamp property: Time stamp when the certificate would be auto renewed next.
     *
     * @return the nextAutoRenewalTimestamp value.
     */
    public OffsetDateTime nextAutoRenewalTimestamp() {
        return this.nextAutoRenewalTimestamp;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (certificates() != null) {
            certificates()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (signedCertificate() != null) {
            signedCertificate().validate();
        }
        if (intermediate() != null) {
            intermediate().validate();
        }
        if (root() != null) {
            root().validate();
        }
    }
}
