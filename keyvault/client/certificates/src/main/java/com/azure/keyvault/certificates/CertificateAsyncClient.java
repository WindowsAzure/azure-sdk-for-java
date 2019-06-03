package com.azure.keyvault.certificates;

import com.azure.core.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.VoidResponse;
import com.azure.core.implementation.RestProxy;
import com.azure.keyvault.certificates.models.*;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class CertificateAsyncClient extends ServiceClient {
    static final String API_VERSION = "7.0";
    static final String ACCEPT_LANGUAGE = "en-US";
    static final int DEFAULT_MAX_PAGE_RESULTS = 25;
    static final String CONTENT_TYPE_HEADER_VALUE = "application/json";
    private String endpoint;
    private final CertificateService service;

    /**
     * Creates a CertificateAsyncClient that uses {@code pipeline} to service requests
     *
     * @param endpoint URL for the Azure KeyVault service.
     * @param pipeline HttpPipeline that the HTTP requests and responses flow through.
     */
    CertificateAsyncClient(URL endpoint, HttpPipeline pipeline) {
        super(pipeline);
        Objects.requireNonNull(endpoint, KeyVaultErrorCodeStrings.getErrorString(KeyVaultErrorCodeStrings.VAULT_END_POINT_REQUIRED));
        this.endpoint = endpoint.toString();
        this.service = RestProxy.create(CertificateService.class, this);
    }

    /**
     * Creates a builder that can configure options for the CertificateAsyncClient before creating an instance of it.
     * @return A new builder to create a CertificateAsyncClient from.
     */
    public static CertificateAsyncClientBuilder builder() {
        return new CertificateAsyncClientBuilder();
    }


    public Mono<Response<CertificateOperation>> createCertificate(Certificate certificate) {
        CertificateRequestParameters certificateRequestParameters = new CertificateRequestParameters()
                .withCertificateAttributes(new CertificateRequestAttributes(certificate))
                .withCertificatePolicy(new CertificatePolicyRequest(certificate.certificatePolicy()))
                .withTags(certificate.tags());
        return service.createCertificate(endpoint, certificate.name(), API_VERSION, ACCEPT_LANGUAGE, certificateRequestParameters, CONTENT_TYPE_HEADER_VALUE);
    }

    public Mono<Response<Certificate>> getCertificate(String name) {
        return service.getCertificate(endpoint, name, "", API_VERSION, ACCEPT_LANGUAGE, CONTENT_TYPE_HEADER_VALUE);
    }

    public Mono<Response<Certificate>> updateCertificate(CertificateBase certificateBase) {
        return  null;
    }


    public Mono<Response<Certificate>> getSecret(String name, String version) {
        String certificateVersion = "";
        if (version != null) {
            certificateVersion = version;
        }
        return  null;
    }


    public Mono<Response<Certificate>> getCertificate(CertificateBase certificateBase) {
        Objects.requireNonNull(certificateBase, "The Secret Base parameter cannot be null.");
        return  null;
    }

    public Mono<Response<Certificate>> getCertifciate(String name) {
        //return getCertificate(name, "");
        return  null;
    }


    public Mono<Response<CertificatePolicy>> updateCertificatePolicy(CertificatePolicy certificate) {
        Objects.requireNonNull(certificate, "The certificate input parameter cannot be null.");
        return  null;
    }


    public Mono<Response<DeletedCertificate>> deleteCertificate(String name) {
        return  null;
    }


    public Mono<Response<DeletedCertificate>> getDeletedCertificate(String name) {
        return  null;
    }


    public Mono<VoidResponse> purgeDeletedCertificate(String name) {
        return  null;
    }


    public Mono<Response<Certificate>> recoverDeletedCertificate(String name) {
        return  null;
    }


    public Mono<Response<byte[]>> backupCertificate(String name) {
        return  null;
    }


    public Mono<Response<Certificate>> restoreCertificate(byte[] backup) {
        return  null;
    }


    public Flux<CertificateBase> listSecrets() {
        return  null;
    }


    public Flux<DeletedCertificate> listDeletedSecrets() {
        return  null;
    }


    public Flux<CertificateBase> listSecretVersions(String name) {
        return  null;
    }


    private Flux<CertificateBase> listSecretsNext(String nextPageLink) {
        return  null;
    }

    private Publisher<CertificateBase> extractAndFetchSecrets(PagedResponse<CertificateBase> page) {
        return extractAndFetch(page, this::listSecretsNext);
    }


    private Flux<DeletedCertificate> listDeletedSecretsNext(String nextPageLink) {
        return  null;
    }

    private Publisher<DeletedCertificate> extractAndFetchDeletedSecrets(PagedResponse<DeletedCertificate> page) {
        return extractAndFetch(page, this::listDeletedSecretsNext);
    }

    public Mono<Response<byte[]>> getPendingCertificateSigningRequest(String certificateName) {
        return null;
    }
    public Mono<Response<String>> mergeCertificate(String name, List<byte[]> x509Certificates) {
        return null;
    }
    public Mono<Response<Certificate>> mergeCertificate(MergeCertificateConfig mergeCertificateConfig){
        return null;
    }

    // Certificate Policy
    public Mono<Response<CertificateBase>> getCertificatePolicy(String certificateName) {
        return null;
    }
    public Mono<Response<CertificateBase>> updateCertificatePolicy(String certificateName, CertificateBase certificate) {
        return null;
    }



    // Certificate Issuer methods
    public Mono<Response<Issuer>> createCertificateIssuer(String name, String provider) {
        return null;
    }
    public Mono<Response<Issuer>> createCertificateIssuer(Issuer issuer) {
        return null;
    }

    public Mono<Response<Issuer>> getCertificateIssuer(String name){
        return null;
    }

    public Mono<Response<Issuer>> deleteCertificateIssuer(String name){
        return null;
    }

    public Flux<IssuerBase> listCertificateIssuers(){
        return null;
    }

    public Mono<Response<Issuer>> updateIssuer(Issuer issuer){
        return null;
    }

    // Certificate Contacts methods
    public Flux<Contact> setCertificateContacts(List<Contact> contacts) {
        return null;
    }

    public Flux<Contact> listCertificateContacts() {
        return null;
    }

    public Flux<Contact> deleteCertificateContacts() {
        return null;
    }

    // Certificate Operation methods
    public Mono<Response<CertificateOperation>> getCertificateOperation(String certificateName) {
        return null;
    }

    public Mono<Response<CertificateOperation>> deleteCertificateOperation(String certificateName) {
        return null;
    }

    public Mono<Response<CertificateOperation>> updateCertificateOperation(String certificateName, boolean cancellationRequested) {
        return null;
    }


    //TODO: Extract this in azure-core ImplUtils and use from there
    private <T> Publisher<T> extractAndFetch(PagedResponse<T> page, Function<String, Publisher<T>> content) {
        String nextPageLink = page.nextLink();
        if (nextPageLink == null) {
            return Flux.fromIterable(page.items());
        }
        return Flux.fromIterable(page.items()).concatWith(content.apply(nextPageLink));
    }
}
