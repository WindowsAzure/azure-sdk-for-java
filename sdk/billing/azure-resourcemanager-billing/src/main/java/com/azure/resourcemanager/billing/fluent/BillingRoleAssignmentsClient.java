// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.billing.fluent.models.BillingRoleAssignmentInner;

/** An instance of this class provides access to all the operations defined in BillingRoleAssignmentsClient. */
public interface BillingRoleAssignmentsClient {
    /**
     * Gets a role assignment for the caller on a billing account. The operation is supported for billing accounts with
     * agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingRoleAssignmentName The ID that uniquely identifies a role assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a role assignment for the caller on a billing account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BillingRoleAssignmentInner getByBillingAccount(String billingAccountName, String billingRoleAssignmentName);

    /**
     * Gets a role assignment for the caller on a billing account. The operation is supported for billing accounts with
     * agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingRoleAssignmentName The ID that uniquely identifies a role assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a role assignment for the caller on a billing account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BillingRoleAssignmentInner> getByBillingAccountWithResponse(
        String billingAccountName, String billingRoleAssignmentName, Context context);

    /**
     * Deletes a role assignment for the caller on a billing account. The operation is supported for billing accounts
     * with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingRoleAssignmentName The ID that uniquely identifies a role assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the role assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BillingRoleAssignmentInner deleteByBillingAccount(String billingAccountName, String billingRoleAssignmentName);

    /**
     * Deletes a role assignment for the caller on a billing account. The operation is supported for billing accounts
     * with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingRoleAssignmentName The ID that uniquely identifies a role assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the role assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BillingRoleAssignmentInner> deleteByBillingAccountWithResponse(
        String billingAccountName, String billingRoleAssignmentName, Context context);

    /**
     * Gets a role assignment for the caller on an invoice section. The operation is supported for billing accounts with
     * agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param billingRoleAssignmentName The ID that uniquely identifies a role assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a role assignment for the caller on an invoice section.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BillingRoleAssignmentInner getByInvoiceSection(
        String billingAccountName,
        String billingProfileName,
        String invoiceSectionName,
        String billingRoleAssignmentName);

    /**
     * Gets a role assignment for the caller on an invoice section. The operation is supported for billing accounts with
     * agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param billingRoleAssignmentName The ID that uniquely identifies a role assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a role assignment for the caller on an invoice section.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BillingRoleAssignmentInner> getByInvoiceSectionWithResponse(
        String billingAccountName,
        String billingProfileName,
        String invoiceSectionName,
        String billingRoleAssignmentName,
        Context context);

    /**
     * Deletes a role assignment for the caller on an invoice section. The operation is supported for billing accounts
     * with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param billingRoleAssignmentName The ID that uniquely identifies a role assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the role assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BillingRoleAssignmentInner deleteByInvoiceSection(
        String billingAccountName,
        String billingProfileName,
        String invoiceSectionName,
        String billingRoleAssignmentName);

    /**
     * Deletes a role assignment for the caller on an invoice section. The operation is supported for billing accounts
     * with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param billingRoleAssignmentName The ID that uniquely identifies a role assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the role assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BillingRoleAssignmentInner> deleteByInvoiceSectionWithResponse(
        String billingAccountName,
        String billingProfileName,
        String invoiceSectionName,
        String billingRoleAssignmentName,
        Context context);

    /**
     * Gets a role assignment for the caller on a billing profile. The operation is supported for billing accounts with
     * agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param billingRoleAssignmentName The ID that uniquely identifies a role assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a role assignment for the caller on a billing profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BillingRoleAssignmentInner getByBillingProfile(
        String billingAccountName, String billingProfileName, String billingRoleAssignmentName);

    /**
     * Gets a role assignment for the caller on a billing profile. The operation is supported for billing accounts with
     * agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param billingRoleAssignmentName The ID that uniquely identifies a role assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a role assignment for the caller on a billing profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BillingRoleAssignmentInner> getByBillingProfileWithResponse(
        String billingAccountName, String billingProfileName, String billingRoleAssignmentName, Context context);

    /**
     * Deletes a role assignment for the caller on a billing profile. The operation is supported for billing accounts
     * with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param billingRoleAssignmentName The ID that uniquely identifies a role assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the role assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BillingRoleAssignmentInner deleteByBillingProfile(
        String billingAccountName, String billingProfileName, String billingRoleAssignmentName);

    /**
     * Deletes a role assignment for the caller on a billing profile. The operation is supported for billing accounts
     * with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param billingRoleAssignmentName The ID that uniquely identifies a role assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the role assignment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BillingRoleAssignmentInner> deleteByBillingProfileWithResponse(
        String billingAccountName, String billingProfileName, String billingRoleAssignmentName, Context context);

    /**
     * Lists the role assignments for the caller on a billing account. The operation is supported for billing accounts
     * with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of role assignments.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BillingRoleAssignmentInner> listByBillingAccount(String billingAccountName);

    /**
     * Lists the role assignments for the caller on a billing account. The operation is supported for billing accounts
     * with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of role assignments.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BillingRoleAssignmentInner> listByBillingAccount(String billingAccountName, Context context);

    /**
     * Lists the role assignments for the caller on an invoice section. The operation is supported for billing accounts
     * with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of role assignments.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BillingRoleAssignmentInner> listByInvoiceSection(
        String billingAccountName, String billingProfileName, String invoiceSectionName);

    /**
     * Lists the role assignments for the caller on an invoice section. The operation is supported for billing accounts
     * with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of role assignments.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BillingRoleAssignmentInner> listByInvoiceSection(
        String billingAccountName, String billingProfileName, String invoiceSectionName, Context context);

    /**
     * Lists the role assignments for the caller on a billing profile. The operation is supported for billing accounts
     * with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of role assignments.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BillingRoleAssignmentInner> listByBillingProfile(
        String billingAccountName, String billingProfileName);

    /**
     * Lists the role assignments for the caller on a billing profile. The operation is supported for billing accounts
     * with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of role assignments.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BillingRoleAssignmentInner> listByBillingProfile(
        String billingAccountName, String billingProfileName, Context context);
}
