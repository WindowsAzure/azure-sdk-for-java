/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.v2019_09_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contact Details.
 */
public class ContactDetails {
    /**
     * Contact name of the person.
     */
    @JsonProperty(value = "contactName", required = true)
    private String contactName;

    /**
     * Phone number of the contact person.
     */
    @JsonProperty(value = "phone", required = true)
    private String phone;

    /**
     * Phone extension number of the contact person.
     */
    @JsonProperty(value = "phoneExtension")
    private String phoneExtension;

    /**
     * Mobile number of the contact person.
     */
    @JsonProperty(value = "mobile")
    private String mobile;

    /**
     * List of Email-ids to be notified about job progress.
     */
    @JsonProperty(value = "emailList", required = true)
    private List<String> emailList;

    /**
     * Notification preference for a job stage.
     */
    @JsonProperty(value = "notificationPreference")
    private List<NotificationPreference> notificationPreference;

    /**
     * Get contact name of the person.
     *
     * @return the contactName value
     */
    public String contactName() {
        return this.contactName;
    }

    /**
     * Set contact name of the person.
     *
     * @param contactName the contactName value to set
     * @return the ContactDetails object itself.
     */
    public ContactDetails withContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }

    /**
     * Get phone number of the contact person.
     *
     * @return the phone value
     */
    public String phone() {
        return this.phone;
    }

    /**
     * Set phone number of the contact person.
     *
     * @param phone the phone value to set
     * @return the ContactDetails object itself.
     */
    public ContactDetails withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get phone extension number of the contact person.
     *
     * @return the phoneExtension value
     */
    public String phoneExtension() {
        return this.phoneExtension;
    }

    /**
     * Set phone extension number of the contact person.
     *
     * @param phoneExtension the phoneExtension value to set
     * @return the ContactDetails object itself.
     */
    public ContactDetails withPhoneExtension(String phoneExtension) {
        this.phoneExtension = phoneExtension;
        return this;
    }

    /**
     * Get mobile number of the contact person.
     *
     * @return the mobile value
     */
    public String mobile() {
        return this.mobile;
    }

    /**
     * Set mobile number of the contact person.
     *
     * @param mobile the mobile value to set
     * @return the ContactDetails object itself.
     */
    public ContactDetails withMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    /**
     * Get list of Email-ids to be notified about job progress.
     *
     * @return the emailList value
     */
    public List<String> emailList() {
        return this.emailList;
    }

    /**
     * Set list of Email-ids to be notified about job progress.
     *
     * @param emailList the emailList value to set
     * @return the ContactDetails object itself.
     */
    public ContactDetails withEmailList(List<String> emailList) {
        this.emailList = emailList;
        return this;
    }

    /**
     * Get notification preference for a job stage.
     *
     * @return the notificationPreference value
     */
    public List<NotificationPreference> notificationPreference() {
        return this.notificationPreference;
    }

    /**
     * Set notification preference for a job stage.
     *
     * @param notificationPreference the notificationPreference value to set
     * @return the ContactDetails object itself.
     */
    public ContactDetails withNotificationPreference(List<NotificationPreference> notificationPreference) {
        this.notificationPreference = notificationPreference;
        return this;
    }

}
