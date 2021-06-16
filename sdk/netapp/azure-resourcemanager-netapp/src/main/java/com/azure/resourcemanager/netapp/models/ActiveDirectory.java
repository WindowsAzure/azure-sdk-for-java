// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Active Directory. */
@Fluent
public final class ActiveDirectory {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ActiveDirectory.class);

    /*
     * Id of the Active Directory
     */
    @JsonProperty(value = "activeDirectoryId")
    private String activeDirectoryId;

    /*
     * Username of Active Directory domain administrator
     */
    @JsonProperty(value = "username")
    private String username;

    /*
     * Plain text password of Active Directory domain administrator, value is
     * masked in the response
     */
    @JsonProperty(value = "password")
    private String password;

    /*
     * Name of the Active Directory domain
     */
    @JsonProperty(value = "domain")
    private String domain;

    /*
     * Comma separated list of DNS server IP addresses (IPv4 only) for the
     * Active Directory domain
     */
    @JsonProperty(value = "dns")
    private String dns;

    /*
     * Status of the Active Directory
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private ActiveDirectoryStatus status;

    /*
     * Any details in regards to the Status of the Active Directory
     */
    @JsonProperty(value = "statusDetails", access = JsonProperty.Access.WRITE_ONLY)
    private String statusDetails;

    /*
     * NetBIOS name of the SMB server. This name will be registered as a
     * computer account in the AD and used to mount volumes
     */
    @JsonProperty(value = "smbServerName")
    private String smbServerName;

    /*
     * The Organizational Unit (OU) within the Windows Active Directory
     */
    @JsonProperty(value = "organizationalUnit")
    private String organizationalUnit;

    /*
     * The Active Directory site the service will limit Domain Controller
     * discovery to
     */
    @JsonProperty(value = "site")
    private String site;

    /*
     * Users to be added to the Built-in Backup Operator active directory
     * group. A list of unique usernames without domain specifier
     */
    @JsonProperty(value = "backupOperators")
    private List<String> backupOperators;

    /*
     * Users to be added to the Built-in Administrators active directory group.
     * A list of unique usernames without domain specifier
     */
    @JsonProperty(value = "administrators")
    private List<String> administrators;

    /*
     * kdc server IP addresses for the active directory machine. This optional
     * parameter is used only while creating kerberos volume.
     */
    @JsonProperty(value = "kdcIP")
    private String kdcIp;

    /*
     * Name of the active directory machine. This optional parameter is used
     * only while creating kerberos volume
     */
    @JsonProperty(value = "adName")
    private String adName;

    /*
     * When LDAP over SSL/TLS is enabled, the LDAP client is required to have
     * base64 encoded Active Directory Certificate Service's self-signed root
     * CA certificate, this optional parameter is used only for dual protocol
     * with LDAP user-mapping volumes.
     */
    @JsonProperty(value = "serverRootCACertificate")
    private String serverRootCACertificate;

    /*
     * If enabled, AES encryption will be enabled for SMB communication.
     */
    @JsonProperty(value = "aesEncryption")
    private Boolean aesEncryption;

    /*
     * Specifies whether or not the LDAP traffic needs to be signed.
     */
    @JsonProperty(value = "ldapSigning")
    private Boolean ldapSigning;

    /*
     * Domain Users in the Active directory to be given SeSecurityPrivilege
     * privilege (Needed for SMB Continuously available shares for SQL). A list
     * of unique usernames without domain specifier
     */
    @JsonProperty(value = "securityOperators")
    private List<String> securityOperators;

    /*
     * Specifies whether or not the LDAP traffic needs to be secured via TLS.
     */
    @JsonProperty(value = "ldapOverTLS")
    private Boolean ldapOverTls;

    /*
     * If enabled, NFS client local users can also (in addition to LDAP users)
     * access the NFS volumes.
     */
    @JsonProperty(value = "allowLocalNfsUsersWithLdap")
    private Boolean allowLocalNfsUsersWithLdap;

    /**
     * Get the activeDirectoryId property: Id of the Active Directory.
     *
     * @return the activeDirectoryId value.
     */
    public String activeDirectoryId() {
        return this.activeDirectoryId;
    }

    /**
     * Set the activeDirectoryId property: Id of the Active Directory.
     *
     * @param activeDirectoryId the activeDirectoryId value to set.
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withActiveDirectoryId(String activeDirectoryId) {
        this.activeDirectoryId = activeDirectoryId;
        return this;
    }

    /**
     * Get the username property: Username of Active Directory domain administrator.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: Username of Active Directory domain administrator.
     *
     * @param username the username value to set.
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Plain text password of Active Directory domain administrator, value is masked in the
     * response.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Plain text password of Active Directory domain administrator, value is masked in the
     * response.
     *
     * @param password the password value to set.
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the domain property: Name of the Active Directory domain.
     *
     * @return the domain value.
     */
    public String domain() {
        return this.domain;
    }

    /**
     * Set the domain property: Name of the Active Directory domain.
     *
     * @param domain the domain value to set.
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Get the dns property: Comma separated list of DNS server IP addresses (IPv4 only) for the Active Directory
     * domain.
     *
     * @return the dns value.
     */
    public String dns() {
        return this.dns;
    }

    /**
     * Set the dns property: Comma separated list of DNS server IP addresses (IPv4 only) for the Active Directory
     * domain.
     *
     * @param dns the dns value to set.
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withDns(String dns) {
        this.dns = dns;
        return this;
    }

    /**
     * Get the status property: Status of the Active Directory.
     *
     * @return the status value.
     */
    public ActiveDirectoryStatus status() {
        return this.status;
    }

    /**
     * Get the statusDetails property: Any details in regards to the Status of the Active Directory.
     *
     * @return the statusDetails value.
     */
    public String statusDetails() {
        return this.statusDetails;
    }

    /**
     * Get the smbServerName property: NetBIOS name of the SMB server. This name will be registered as a computer
     * account in the AD and used to mount volumes.
     *
     * @return the smbServerName value.
     */
    public String smbServerName() {
        return this.smbServerName;
    }

    /**
     * Set the smbServerName property: NetBIOS name of the SMB server. This name will be registered as a computer
     * account in the AD and used to mount volumes.
     *
     * @param smbServerName the smbServerName value to set.
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withSmbServerName(String smbServerName) {
        this.smbServerName = smbServerName;
        return this;
    }

    /**
     * Get the organizationalUnit property: The Organizational Unit (OU) within the Windows Active Directory.
     *
     * @return the organizationalUnit value.
     */
    public String organizationalUnit() {
        return this.organizationalUnit;
    }

    /**
     * Set the organizationalUnit property: The Organizational Unit (OU) within the Windows Active Directory.
     *
     * @param organizationalUnit the organizationalUnit value to set.
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withOrganizationalUnit(String organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
        return this;
    }

    /**
     * Get the site property: The Active Directory site the service will limit Domain Controller discovery to.
     *
     * @return the site value.
     */
    public String site() {
        return this.site;
    }

    /**
     * Set the site property: The Active Directory site the service will limit Domain Controller discovery to.
     *
     * @param site the site value to set.
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withSite(String site) {
        this.site = site;
        return this;
    }

    /**
     * Get the backupOperators property: Users to be added to the Built-in Backup Operator active directory group. A
     * list of unique usernames without domain specifier.
     *
     * @return the backupOperators value.
     */
    public List<String> backupOperators() {
        return this.backupOperators;
    }

    /**
     * Set the backupOperators property: Users to be added to the Built-in Backup Operator active directory group. A
     * list of unique usernames without domain specifier.
     *
     * @param backupOperators the backupOperators value to set.
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withBackupOperators(List<String> backupOperators) {
        this.backupOperators = backupOperators;
        return this;
    }

    /**
     * Get the administrators property: Users to be added to the Built-in Administrators active directory group. A list
     * of unique usernames without domain specifier.
     *
     * @return the administrators value.
     */
    public List<String> administrators() {
        return this.administrators;
    }

    /**
     * Set the administrators property: Users to be added to the Built-in Administrators active directory group. A list
     * of unique usernames without domain specifier.
     *
     * @param administrators the administrators value to set.
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withAdministrators(List<String> administrators) {
        this.administrators = administrators;
        return this;
    }

    /**
     * Get the kdcIp property: kdc server IP addresses for the active directory machine. This optional parameter is used
     * only while creating kerberos volume.
     *
     * @return the kdcIp value.
     */
    public String kdcIp() {
        return this.kdcIp;
    }

    /**
     * Set the kdcIp property: kdc server IP addresses for the active directory machine. This optional parameter is used
     * only while creating kerberos volume.
     *
     * @param kdcIp the kdcIp value to set.
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withKdcIp(String kdcIp) {
        this.kdcIp = kdcIp;
        return this;
    }

    /**
     * Get the adName property: Name of the active directory machine. This optional parameter is used only while
     * creating kerberos volume.
     *
     * @return the adName value.
     */
    public String adName() {
        return this.adName;
    }

    /**
     * Set the adName property: Name of the active directory machine. This optional parameter is used only while
     * creating kerberos volume.
     *
     * @param adName the adName value to set.
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withAdName(String adName) {
        this.adName = adName;
        return this;
    }

    /**
     * Get the serverRootCACertificate property: When LDAP over SSL/TLS is enabled, the LDAP client is required to have
     * base64 encoded Active Directory Certificate Service's self-signed root CA certificate, this optional parameter is
     * used only for dual protocol with LDAP user-mapping volumes.
     *
     * @return the serverRootCACertificate value.
     */
    public String serverRootCACertificate() {
        return this.serverRootCACertificate;
    }

    /**
     * Set the serverRootCACertificate property: When LDAP over SSL/TLS is enabled, the LDAP client is required to have
     * base64 encoded Active Directory Certificate Service's self-signed root CA certificate, this optional parameter is
     * used only for dual protocol with LDAP user-mapping volumes.
     *
     * @param serverRootCACertificate the serverRootCACertificate value to set.
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withServerRootCACertificate(String serverRootCACertificate) {
        this.serverRootCACertificate = serverRootCACertificate;
        return this;
    }

    /**
     * Get the aesEncryption property: If enabled, AES encryption will be enabled for SMB communication.
     *
     * @return the aesEncryption value.
     */
    public Boolean aesEncryption() {
        return this.aesEncryption;
    }

    /**
     * Set the aesEncryption property: If enabled, AES encryption will be enabled for SMB communication.
     *
     * @param aesEncryption the aesEncryption value to set.
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withAesEncryption(Boolean aesEncryption) {
        this.aesEncryption = aesEncryption;
        return this;
    }

    /**
     * Get the ldapSigning property: Specifies whether or not the LDAP traffic needs to be signed.
     *
     * @return the ldapSigning value.
     */
    public Boolean ldapSigning() {
        return this.ldapSigning;
    }

    /**
     * Set the ldapSigning property: Specifies whether or not the LDAP traffic needs to be signed.
     *
     * @param ldapSigning the ldapSigning value to set.
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withLdapSigning(Boolean ldapSigning) {
        this.ldapSigning = ldapSigning;
        return this;
    }

    /**
     * Get the securityOperators property: Domain Users in the Active directory to be given SeSecurityPrivilege
     * privilege (Needed for SMB Continuously available shares for SQL). A list of unique usernames without domain
     * specifier.
     *
     * @return the securityOperators value.
     */
    public List<String> securityOperators() {
        return this.securityOperators;
    }

    /**
     * Set the securityOperators property: Domain Users in the Active directory to be given SeSecurityPrivilege
     * privilege (Needed for SMB Continuously available shares for SQL). A list of unique usernames without domain
     * specifier.
     *
     * @param securityOperators the securityOperators value to set.
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withSecurityOperators(List<String> securityOperators) {
        this.securityOperators = securityOperators;
        return this;
    }

    /**
     * Get the ldapOverTls property: Specifies whether or not the LDAP traffic needs to be secured via TLS.
     *
     * @return the ldapOverTls value.
     */
    public Boolean ldapOverTls() {
        return this.ldapOverTls;
    }

    /**
     * Set the ldapOverTls property: Specifies whether or not the LDAP traffic needs to be secured via TLS.
     *
     * @param ldapOverTls the ldapOverTls value to set.
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withLdapOverTls(Boolean ldapOverTls) {
        this.ldapOverTls = ldapOverTls;
        return this;
    }

    /**
     * Get the allowLocalNfsUsersWithLdap property: If enabled, NFS client local users can also (in addition to LDAP
     * users) access the NFS volumes.
     *
     * @return the allowLocalNfsUsersWithLdap value.
     */
    public Boolean allowLocalNfsUsersWithLdap() {
        return this.allowLocalNfsUsersWithLdap;
    }

    /**
     * Set the allowLocalNfsUsersWithLdap property: If enabled, NFS client local users can also (in addition to LDAP
     * users) access the NFS volumes.
     *
     * @param allowLocalNfsUsersWithLdap the allowLocalNfsUsersWithLdap value to set.
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withAllowLocalNfsUsersWithLdap(Boolean allowLocalNfsUsersWithLdap) {
        this.allowLocalNfsUsersWithLdap = allowLocalNfsUsersWithLdap;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
