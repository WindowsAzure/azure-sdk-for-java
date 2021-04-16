// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.consumption.fluent.models.BudgetInner;

/** An instance of this class provides access to all the operations defined in BudgetsClient. */
public interface BudgetsClient {
    /**
     * Lists all budgets for the defined scope.
     *
     * @param scope The scope associated with budget operations. This includes '/subscriptions/{subscriptionId}/' for
     *     subscription scope, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup
     *     scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId}' for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     *     invoiceSection scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing budgets.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BudgetInner> list(String scope);

    /**
     * Lists all budgets for the defined scope.
     *
     * @param scope The scope associated with budget operations. This includes '/subscriptions/{subscriptionId}/' for
     *     subscription scope, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup
     *     scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId}' for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     *     invoiceSection scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing budgets.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BudgetInner> list(String scope, Context context);

    /**
     * Gets the budget for the scope by budget name.
     *
     * @param scope The scope associated with budget operations. This includes '/subscriptions/{subscriptionId}/' for
     *     subscription scope, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup
     *     scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId}' for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     *     invoiceSection scope.
     * @param budgetName Budget Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the budget for the scope by budget name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BudgetInner get(String scope, String budgetName);

    /**
     * Gets the budget for the scope by budget name.
     *
     * @param scope The scope associated with budget operations. This includes '/subscriptions/{subscriptionId}/' for
     *     subscription scope, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup
     *     scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId}' for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     *     invoiceSection scope.
     * @param budgetName Budget Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the budget for the scope by budget name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BudgetInner> getWithResponse(String scope, String budgetName, Context context);

    /**
     * The operation to create or update a budget. You can optionally provide an eTag if desired as a form of
     * concurrency control. To obtain the latest eTag for a given budget, perform a get operation prior to your put
     * operation.
     *
     * @param scope The scope associated with budget operations. This includes '/subscriptions/{subscriptionId}/' for
     *     subscription scope, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup
     *     scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId}' for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     *     invoiceSection scope.
     * @param budgetName Budget Name.
     * @param parameters Parameters supplied to the Create Budget operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a budget resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BudgetInner createOrUpdate(String scope, String budgetName, BudgetInner parameters);

    /**
     * The operation to create or update a budget. You can optionally provide an eTag if desired as a form of
     * concurrency control. To obtain the latest eTag for a given budget, perform a get operation prior to your put
     * operation.
     *
     * @param scope The scope associated with budget operations. This includes '/subscriptions/{subscriptionId}/' for
     *     subscription scope, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup
     *     scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId}' for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     *     invoiceSection scope.
     * @param budgetName Budget Name.
     * @param parameters Parameters supplied to the Create Budget operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a budget resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BudgetInner> createOrUpdateWithResponse(
        String scope, String budgetName, BudgetInner parameters, Context context);

    /**
     * The operation to delete a budget.
     *
     * @param scope The scope associated with budget operations. This includes '/subscriptions/{subscriptionId}/' for
     *     subscription scope, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup
     *     scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId}' for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     *     invoiceSection scope.
     * @param budgetName Budget Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String scope, String budgetName);

    /**
     * The operation to delete a budget.
     *
     * @param scope The scope associated with budget operations. This includes '/subscriptions/{subscriptionId}/' for
     *     subscription scope, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup
     *     scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId}' for
     *     Management Group scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     *     invoiceSection scope.
     * @param budgetName Budget Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String scope, String budgetName, Context context);
}
