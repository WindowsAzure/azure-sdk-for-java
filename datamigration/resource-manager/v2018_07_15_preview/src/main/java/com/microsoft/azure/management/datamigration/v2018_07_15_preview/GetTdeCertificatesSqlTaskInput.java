/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input for the task that gets TDE certificates in Base64 encoded format.
 */
public class GetTdeCertificatesSqlTaskInput {
    /**
     * Connection information for SQL Server.
     */
    @JsonProperty(value = "connectionInfo", required = true)
    private SqlConnectionInfo connectionInfo;

    /**
     * Backup file share information for file share to be used for temporarily
     * storing files.
     */
    @JsonProperty(value = "backupFileShare", required = true)
    private FileShare backupFileShare;

    /**
     * List containing certificate names and corresponding password to use for
     * encrypting the exported certificate.
     */
    @JsonProperty(value = "selectedCertificates", required = true)
    private List<SelectedCertificateInput> selectedCertificates;

    /**
     * Get connection information for SQL Server.
     *
     * @return the connectionInfo value
     */
    public SqlConnectionInfo connectionInfo() {
        return this.connectionInfo;
    }

    /**
     * Set connection information for SQL Server.
     *
     * @param connectionInfo the connectionInfo value to set
     * @return the GetTdeCertificatesSqlTaskInput object itself.
     */
    public GetTdeCertificatesSqlTaskInput withConnectionInfo(SqlConnectionInfo connectionInfo) {
        this.connectionInfo = connectionInfo;
        return this;
    }

    /**
     * Get backup file share information for file share to be used for temporarily storing files.
     *
     * @return the backupFileShare value
     */
    public FileShare backupFileShare() {
        return this.backupFileShare;
    }

    /**
     * Set backup file share information for file share to be used for temporarily storing files.
     *
     * @param backupFileShare the backupFileShare value to set
     * @return the GetTdeCertificatesSqlTaskInput object itself.
     */
    public GetTdeCertificatesSqlTaskInput withBackupFileShare(FileShare backupFileShare) {
        this.backupFileShare = backupFileShare;
        return this;
    }

    /**
     * Get list containing certificate names and corresponding password to use for encrypting the exported certificate.
     *
     * @return the selectedCertificates value
     */
    public List<SelectedCertificateInput> selectedCertificates() {
        return this.selectedCertificates;
    }

    /**
     * Set list containing certificate names and corresponding password to use for encrypting the exported certificate.
     *
     * @param selectedCertificates the selectedCertificates value to set
     * @return the GetTdeCertificatesSqlTaskInput object itself.
     */
    public GetTdeCertificatesSqlTaskInput withSelectedCertificates(List<SelectedCertificateInput> selectedCertificates) {
        this.selectedCertificates = selectedCertificates;
        return this;
    }

}
