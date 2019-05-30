package com.azure.identity.credential;

import java.util.ArrayList;
import java.util.List;

/**
 * The base class for credentials that acquires a token from AAD.
 */
public abstract class AadCredential<T extends AadCredential<T>> extends AzureCredential {

    private String clientId;

    private String tenantId;

    private String aadEndpoint;

    /**
     * Creates an AadCredential with default AAD endpoint https://login.microsoftonline.com.
     */
    protected AadCredential() {
        aadEndpoint = "https://login.microsoftonline.com/";
    }

    /**
     * @return the client ID for authenticating to AAD.
     */
    public String clientId() {
        return clientId;
    }

    /**
     * Sets the client ID for authenticationg to AAD>
     * @param clientId
     * @return the credential itself
     */
    @SuppressWarnings("unchecked")
    public T clientId(String clientId) {
        this.clientId = clientId;
        return (T) this;
    }

    /**
     * @return the tenant ID for authenticating to AAD.
     */
    public String tenantId() {
        return tenantId;
    }

    /**
     * Sets the tenant ID for authenticating to AAD.
     * @param tenantId the tenant for authenticating to AAD
     * @return the credential itself
     */
    @SuppressWarnings("unchecked")
    public T tenantId(String tenantId) {
        this.tenantId = tenantId;
        return (T) this;
    }

    /**
     * @return the endpoint for the Azure Active Directory.
     */
    public String aadEndpoint() {
        return aadEndpoint;
    }

    /**
     * Sets the endpoint of the Azure Active Directory.
     * @param aadEndpoint the endpoint of the Azure Active Directory
     * @return the credential itself
     */
    @SuppressWarnings("unchecked")
    public T aadEndpoint(String aadEndpoint) {
        this.aadEndpoint = aadEndpoint;
        return (T) this;
    }

    protected void validate() {
        List<String> missing = new ArrayList<>();
        if (clientId == null) {
            missing.add("clientId");
        }
        if (tenantId == null) {
            missing.add("tenantId");
        }
        if (aadEndpoint == null) {
            missing.add("aadEndpoint");
        }
        if (missing.size() > 0) {
            throw new IllegalArgumentException("Must provide non-null values for " +
                String.join(", " , missing) + " properties in " + this.getClass().getSimpleName());
        }
    }
}
