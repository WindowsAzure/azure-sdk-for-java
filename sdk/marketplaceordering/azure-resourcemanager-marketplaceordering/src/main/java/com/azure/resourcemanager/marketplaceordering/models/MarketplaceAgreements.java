// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.marketplaceordering.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.marketplaceordering.fluent.models.AgreementTermsInner;
import java.util.List;

/** Resource collection API of MarketplaceAgreements. */
public interface MarketplaceAgreements {
    /**
     * Get marketplace terms.
     *
     * @param offerType Offer Type, currently only virtualmachine type is supported.
     * @param publisherId Publisher identifier string of image being deployed.
     * @param offerId Offer identifier string of image being deployed.
     * @param planId Plan identifier string of image being deployed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return marketplace terms.
     */
    AgreementTerms get(OfferType offerType, String publisherId, String offerId, String planId);

    /**
     * Get marketplace terms.
     *
     * @param offerType Offer Type, currently only virtualmachine type is supported.
     * @param publisherId Publisher identifier string of image being deployed.
     * @param offerId Offer identifier string of image being deployed.
     * @param planId Plan identifier string of image being deployed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return marketplace terms.
     */
    Response<AgreementTerms> getWithResponse(
        OfferType offerType, String publisherId, String offerId, String planId, Context context);

    /**
     * Save marketplace terms.
     *
     * @param offerType Offer Type, currently only virtualmachine type is supported.
     * @param publisherId Publisher identifier string of image being deployed.
     * @param offerId Offer identifier string of image being deployed.
     * @param planId Plan identifier string of image being deployed.
     * @param parameters Parameters supplied to the Create Marketplace Terms operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return terms properties for provided Publisher/Offer/Plan tuple.
     */
    AgreementTerms create(
        OfferType offerType, String publisherId, String offerId, String planId, AgreementTermsInner parameters);

    /**
     * Save marketplace terms.
     *
     * @param offerType Offer Type, currently only virtualmachine type is supported.
     * @param publisherId Publisher identifier string of image being deployed.
     * @param offerId Offer identifier string of image being deployed.
     * @param planId Plan identifier string of image being deployed.
     * @param parameters Parameters supplied to the Create Marketplace Terms operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return terms properties for provided Publisher/Offer/Plan tuple.
     */
    Response<AgreementTerms> createWithResponse(
        OfferType offerType,
        String publisherId,
        String offerId,
        String planId,
        AgreementTermsInner parameters,
        Context context);

    /**
     * Sign marketplace terms.
     *
     * @param publisherId Publisher identifier string of image being deployed.
     * @param offerId Offer identifier string of image being deployed.
     * @param planId Plan identifier string of image being deployed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return terms properties for provided Publisher/Offer/Plan tuple.
     */
    AgreementTerms sign(String publisherId, String offerId, String planId);

    /**
     * Sign marketplace terms.
     *
     * @param publisherId Publisher identifier string of image being deployed.
     * @param offerId Offer identifier string of image being deployed.
     * @param planId Plan identifier string of image being deployed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return terms properties for provided Publisher/Offer/Plan tuple.
     */
    Response<AgreementTerms> signWithResponse(String publisherId, String offerId, String planId, Context context);

    /**
     * Cancel marketplace terms.
     *
     * @param publisherId Publisher identifier string of image being deployed.
     * @param offerId Offer identifier string of image being deployed.
     * @param planId Plan identifier string of image being deployed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return terms properties for provided Publisher/Offer/Plan tuple.
     */
    AgreementTerms cancel(String publisherId, String offerId, String planId);

    /**
     * Cancel marketplace terms.
     *
     * @param publisherId Publisher identifier string of image being deployed.
     * @param offerId Offer identifier string of image being deployed.
     * @param planId Plan identifier string of image being deployed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return terms properties for provided Publisher/Offer/Plan tuple.
     */
    Response<AgreementTerms> cancelWithResponse(String publisherId, String offerId, String planId, Context context);

    /**
     * Get marketplace agreement.
     *
     * @param publisherId Publisher identifier string of image being deployed.
     * @param offerId Offer identifier string of image being deployed.
     * @param planId Plan identifier string of image being deployed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return marketplace agreement.
     */
    AgreementTerms getAgreement(String publisherId, String offerId, String planId);

    /**
     * Get marketplace agreement.
     *
     * @param publisherId Publisher identifier string of image being deployed.
     * @param offerId Offer identifier string of image being deployed.
     * @param planId Plan identifier string of image being deployed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return marketplace agreement.
     */
    Response<AgreementTerms> getAgreementWithResponse(
        String publisherId, String offerId, String planId, Context context);

    /**
     * List marketplace agreements in the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of AgreementTerms.
     */
    List<AgreementTerms> list();

    /**
     * List marketplace agreements in the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of AgreementTerms.
     */
    Response<List<AgreementTerms>> listWithResponse(Context context);
}
