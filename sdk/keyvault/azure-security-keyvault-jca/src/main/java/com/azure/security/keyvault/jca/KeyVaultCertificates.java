// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.jca;

import java.security.Key;
import java.security.cert.Certificate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Date;
import java.util.Collections;
import java.util.Objects;

/**
 * Store certificates information.
 */
public class KeyVaultCertificates {

    /**
     * Stores the list of aliases.
     */
    private List<String> aliases;

    /**
     * Stores the certificates by alias.
     */
    private final Map<String, Certificate> certificates = new HashMap<>();

    /**
     * Stores the certificate keys by alias.
     */
    private final HashMap<String, Key> certificateKeys = new HashMap<>();

    /**
     * Stores the last time refresh certificates and alias
     */
    private Date lastRefreshTime;

    /**
     * Stores the overall refresh time.
     */
    private static volatile Date overallRefreshTime = new Date();

    private KeyVaultClient keyVaultClient;

    private final long refreshInterval;

    void setKeyVaultClient(KeyVaultClient keyVaultClient) {
        this.keyVaultClient = keyVaultClient;
    }

    KeyVaultCertificates(long refreshInterval, KeyVaultClient keyVaultClient) {
        this.refreshInterval = refreshInterval;
        this.keyVaultClient = keyVaultClient;
    }

    boolean certificatesNeedRefresh() {
        if (lastRefreshTime == null || overallRefreshTime.after(lastRefreshTime)) {
            return true;
        }
        if (refreshInterval > 0) {
            return lastRefreshTime.getTime() + refreshInterval < new Date().getTime();
        }
        return false;
    }

    List<String> getAliases() {
        refreshCertificatesIfNeeded();
        return aliases;
    }

    Map<String, Certificate> getCertificates() {
        refreshCertificatesIfNeeded();
        return certificates;
    }

    Map<String, Key> getCertificateKeys() {
        refreshCertificatesIfNeeded();
        return certificateKeys;
    }

    private void refreshCertificatesIfNeeded() {
        if (certificatesNeedRefresh()) {
            refreshCertificates();
        }
    }

    private void refreshCertificates() {
        aliases = keyVaultClient.getAliases();
        certificateKeys.clear();
        certificates.clear();
        Optional.ofNullable(aliases)
            .orElse(Collections.emptyList())
            .forEach(alias -> {
                Key key = keyVaultClient.getKey(alias, null);
                if (!Objects.isNull(key)) {
                    certificateKeys.put(alias, key);
                }
                Certificate certificate = keyVaultClient.getCertificate(alias);
                if (!Objects.isNull(certificate)) {
                    certificates.put(alias, certificate);
                }
            });
        lastRefreshTime = new Date();
    }

    /**
     * Get latest alias by certificate which in portal
     * @param certificate certificate got
     * @return certificate' alias if exist.
     */
    String refreshAndGetAliasByCertificate(Certificate certificate) {
        refreshCertsInfo();
        refreshCertificates();
        return getCertificates().entrySet()
                                .stream()
                                .filter(entry -> certificate.equals(entry.getValue()))
                                .findFirst()
                                .map(Map.Entry::getKey)
                                .orElse("");

    }

    /**
     * delete certificate info by alias if exits
     * @param alias deleted certificate
     */
    void deleteEntry(String alias) {
        if (aliases != null) {
            aliases.remove(alias);
        }
        certificates.remove(alias);
        certificateKeys.remove(alias);
    }

    /**
     * overall refresh certificates' info
     */
    public static void refreshCertsInfo() {
        overallRefreshTime = new Date();
    }

}
