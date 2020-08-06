/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.PremierAddOnInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.CertificateRegistrationManager;
import java.util.Map;

/**
 * Type representing PremierAddOn.
 */
public interface PremierAddOn extends HasInner<PremierAddOnInner>, Indexable, Refreshable<PremierAddOn>, Updatable<PremierAddOn.Update>, HasManager<CertificateRegistrationManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the marketplaceOffer value.
     */
    String marketplaceOffer();

    /**
     * @return the marketplacePublisher value.
     */
    String marketplacePublisher();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the product value.
     */
    String product();

    /**
     * @return the sku value.
     */
    String sku();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the vendor value.
     */
    String vendor();

    /**
     * The entirety of the PremierAddOn definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithSite, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PremierAddOn definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PremierAddOn definition.
         */
        interface Blank extends WithSite {
        }

        /**
         * The stage of the premieraddon definition allowing to specify Site.
         */
        interface WithSite {
           /**
            * Specifies resourceGroupName, name.
            * @param resourceGroupName Name of the resource group to which the resource belongs
            * @param name Name of the app
            * @return the next definition stage
            */
            WithLocation withExistingSite(String resourceGroupName, String name);
        }

        /**
         * The stage of the premieraddon definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location Resource Location
            * @return the next definition stage
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the premieraddon definition allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Kind of resource
             * @return the next definition stage
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the premieraddon definition allowing to specify MarketplaceOffer.
         */
        interface WithMarketplaceOffer {
            /**
             * Specifies marketplaceOffer.
             * @param marketplaceOffer Premier add on Marketplace offer
             * @return the next definition stage
             */
            WithCreate withMarketplaceOffer(String marketplaceOffer);
        }

        /**
         * The stage of the premieraddon definition allowing to specify MarketplacePublisher.
         */
        interface WithMarketplacePublisher {
            /**
             * Specifies marketplacePublisher.
             * @param marketplacePublisher Premier add on Marketplace publisher
             * @return the next definition stage
             */
            WithCreate withMarketplacePublisher(String marketplacePublisher);
        }

        /**
         * The stage of the premieraddon definition allowing to specify Product.
         */
        interface WithProduct {
            /**
             * Specifies product.
             * @param product Premier add on Product
             * @return the next definition stage
             */
            WithCreate withProduct(String product);
        }

        /**
         * The stage of the premieraddon definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku Premier add on SKU
             * @return the next definition stage
             */
            WithCreate withSku(String sku);
        }

        /**
         * The stage of the premieraddon definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the premieraddon definition allowing to specify Vendor.
         */
        interface WithVendor {
            /**
             * Specifies vendor.
             * @param vendor Premier add on Vendor
             * @return the next definition stage
             */
            WithCreate withVendor(String vendor);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<PremierAddOn>, DefinitionStages.WithKind, DefinitionStages.WithMarketplaceOffer, DefinitionStages.WithMarketplacePublisher, DefinitionStages.WithProduct, DefinitionStages.WithSku, DefinitionStages.WithTags, DefinitionStages.WithVendor {
        }
    }
    /**
     * The template for a PremierAddOn update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PremierAddOn>, UpdateStages.WithKind, UpdateStages.WithMarketplaceOffer, UpdateStages.WithMarketplacePublisher, UpdateStages.WithProduct, UpdateStages.WithSku, UpdateStages.WithVendor {
    }

    /**
     * Grouping of PremierAddOn update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the premieraddon update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Kind of resource
             * @return the next update stage
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the premieraddon update allowing to specify MarketplaceOffer.
         */
        interface WithMarketplaceOffer {
            /**
             * Specifies marketplaceOffer.
             * @param marketplaceOffer Premier add on Marketplace offer
             * @return the next update stage
             */
            Update withMarketplaceOffer(String marketplaceOffer);
        }

        /**
         * The stage of the premieraddon update allowing to specify MarketplacePublisher.
         */
        interface WithMarketplacePublisher {
            /**
             * Specifies marketplacePublisher.
             * @param marketplacePublisher Premier add on Marketplace publisher
             * @return the next update stage
             */
            Update withMarketplacePublisher(String marketplacePublisher);
        }

        /**
         * The stage of the premieraddon update allowing to specify Product.
         */
        interface WithProduct {
            /**
             * Specifies product.
             * @param product Premier add on Product
             * @return the next update stage
             */
            Update withProduct(String product);
        }

        /**
         * The stage of the premieraddon update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku Premier add on SKU
             * @return the next update stage
             */
            Update withSku(String sku);
        }

        /**
         * The stage of the premieraddon update allowing to specify Vendor.
         */
        interface WithVendor {
            /**
             * Specifies vendor.
             * @param vendor Premier add on Vendor
             * @return the next update stage
             */
            Update withVendor(String vendor);
        }

    }
}
