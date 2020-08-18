// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SearchField model. */
@Fluent
public final class SearchField {
    /*
     * The name of the field, which must be unique within the fields collection
     * of the index or parent field.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The data type of the field.
     */
    @JsonProperty(value = "type", required = true)
    private SearchFieldDataType type;

    /*
     * A value indicating whether the field uniquely identifies documents in
     * the index. Exactly one top-level field in each index must be chosen as
     * the key field and it must be of type Edm.String. Key fields can be used
     * to look up documents directly and update or delete specific documents.
     * Default is false for simple fields and null for complex fields.
     */
    @JsonProperty(value = "key")
    private Boolean key;

    /*
     * A value indicating whether the field can be returned in a search result.
     * You can disable this option if you want to use a field (for example,
     * margin) as a filter, sorting, or scoring mechanism but do not want the
     * field to be visible to the end user. This property must be true for key
     * fields, and it must be null for complex fields. This property can be
     * changed on existing fields. Enabling this property does not cause any
     * increase in index storage requirements. Default is true for simple
     * fields and null for complex fields.
     */
    @JsonProperty(value = "retrievable")
    private Boolean retrievable;

    /*
     * A value indicating whether the field is full-text searchable. This means
     * it will undergo analysis such as word-breaking during indexing. If you
     * set a searchable field to a value like "sunny day", internally it will
     * be split into the individual tokens "sunny" and "day". This enables
     * full-text searches for these terms. Fields of type Edm.String or
     * Collection(Edm.String) are searchable by default. This property must be
     * false for simple fields of other non-string data types, and it must be
     * null for complex fields. Note: searchable fields consume extra space in
     * your index since Azure Cognitive Search will store an additional
     * tokenized version of the field value for full-text searches. If you want
     * to save space in your index and you don't need a field to be included in
     * searches, set searchable to false.
     */
    @JsonProperty(value = "searchable")
    private Boolean searchable;

    /*
     * A value indicating whether to enable the field to be referenced in
     * $filter queries. filterable differs from searchable in how strings are
     * handled. Fields of type Edm.String or Collection(Edm.String) that are
     * filterable do not undergo word-breaking, so comparisons are for exact
     * matches only. For example, if you set such a field f to "sunny day",
     * $filter=f eq 'sunny' will find no matches, but $filter=f eq 'sunny day'
     * will. This property must be null for complex fields. Default is true for
     * simple fields and null for complex fields.
     */
    @JsonProperty(value = "filterable")
    private Boolean filterable;

    /*
     * A value indicating whether to enable the field to be referenced in
     * $orderby expressions. By default Azure Cognitive Search sorts results by
     * score, but in many experiences users will want to sort by fields in the
     * documents. A simple field can be sortable only if it is single-valued
     * (it has a single value in the scope of the parent document). Simple
     * collection fields cannot be sortable, since they are multi-valued.
     * Simple sub-fields of complex collections are also multi-valued, and
     * therefore cannot be sortable. This is true whether it's an immediate
     * parent field, or an ancestor field, that's the complex collection.
     * Complex fields cannot be sortable and the sortable property must be null
     * for such fields. The default for sortable is true for single-valued
     * simple fields, false for multi-valued simple fields, and null for
     * complex fields.
     */
    @JsonProperty(value = "sortable")
    private Boolean sortable;

    /*
     * A value indicating whether to enable the field to be referenced in facet
     * queries. Typically used in a presentation of search results that
     * includes hit count by category (for example, search for digital cameras
     * and see hits by brand, by megapixels, by price, and so on). This
     * property must be null for complex fields. Fields of type
     * Edm.GeographyPoint or Collection(Edm.GeographyPoint) cannot be
     * facetable. Default is true for all other simple fields.
     */
    @JsonProperty(value = "facetable")
    private Boolean facetable;

    /*
     * The name of the analyzer to use for the field. This option can be used
     * only with searchable fields and it can't be set together with either
     * searchAnalyzer or indexAnalyzer. Once the analyzer is chosen, it cannot
     * be changed for the field. Must be null for complex fields.
     */
    @JsonProperty(value = "analyzer")
    private LexicalAnalyzerName analyzer;

    /*
     * The name of the analyzer used at search time for the field. This option
     * can be used only with searchable fields. It must be set together with
     * indexAnalyzer and it cannot be set together with the analyzer option.
     * This property cannot be set to the name of a language analyzer; use the
     * analyzer property instead if you need a language analyzer. This analyzer
     * can be updated on an existing field. Must be null for complex fields.
     */
    @JsonProperty(value = "searchAnalyzer")
    private LexicalAnalyzerName searchAnalyzer;

    /*
     * The name of the analyzer used at indexing time for the field. This
     * option can be used only with searchable fields. It must be set together
     * with searchAnalyzer and it cannot be set together with the analyzer
     * option.  This property cannot be set to the name of a language analyzer;
     * use the analyzer property instead if you need a language analyzer. Once
     * the analyzer is chosen, it cannot be changed for the field. Must be null
     * for complex fields.
     */
    @JsonProperty(value = "indexAnalyzer")
    private LexicalAnalyzerName indexAnalyzer;

    /*
     * A list of the names of synonym maps to associate with this field. This
     * option can be used only with searchable fields. Currently only one
     * synonym map per field is supported. Assigning a synonym map to a field
     * ensures that query terms targeting that field are expanded at query-time
     * using the rules in the synonym map. This attribute can be changed on
     * existing fields. Must be null or an empty collection for complex fields.
     */
    @JsonProperty(value = "synonymMaps")
    private List<String> synonymMaps;

    /*
     * A list of sub-fields if this is a field of type Edm.ComplexType or
     * Collection(Edm.ComplexType). Must be null or empty for simple fields.
     */
    @JsonProperty(value = "fields")
    private List<SearchField> fields;

    /** Creates an instance of SearchField class. */
    @JsonCreator
    public SearchField(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "type", required = true) SearchFieldDataType type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Get the name property: The name of the field, which must be unique within the fields collection of the index or
     * parent field.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the field, which must be unique within the fields collection of the index or
     * parent field.
     *
     * @param name the name value to set.
     * @return the SearchField object itself.
     */
    /**
     * Get the type property: The data type of the field.
     *
     * @return the type value.
     */
    public SearchFieldDataType getType() {
        return this.type;
    }

    /**
     * Set the type property: The data type of the field.
     *
     * @param type the type value to set.
     * @return the SearchField object itself.
     */
    /**
     * Get the key property: A value indicating whether the field uniquely identifies documents in the index. Exactly
     * one top-level field in each index must be chosen as the key field and it must be of type Edm.String. Key fields
     * can be used to look up documents directly and update or delete specific documents. Default is false for simple
     * fields and null for complex fields.
     *
     * @return the key value.
     */
    public Boolean isKey() {
        return this.key;
    }

    /**
     * Set the key property: A value indicating whether the field uniquely identifies documents in the index. Exactly
     * one top-level field in each index must be chosen as the key field and it must be of type Edm.String. Key fields
     * can be used to look up documents directly and update or delete specific documents. Default is false for simple
     * fields and null for complex fields.
     *
     * @param key the key value to set.
     * @return the SearchField object itself.
     */
    public SearchField setKey(Boolean key) {
        this.key = key;
        return this;
    }

    /**
     * Get the retrievable property: A value indicating whether the field can be returned in a search result. You can
     * disable this option if you want to use a field (for example, margin) as a filter, sorting, or scoring mechanism
     * but do not want the field to be visible to the end user. This property must be true for key fields, and it must
     * be null for complex fields. This property can be changed on existing fields. Enabling this property does not
     * cause any increase in index storage requirements. Default is true for simple fields and null for complex fields.
     *
     * @return the retrievable value.
     */
    public Boolean isRetrievable() {
        return this.retrievable;
    }

    /**
     * Set the retrievable property: A value indicating whether the field can be returned in a search result. You can
     * disable this option if you want to use a field (for example, margin) as a filter, sorting, or scoring mechanism
     * but do not want the field to be visible to the end user. This property must be true for key fields, and it must
     * be null for complex fields. This property can be changed on existing fields. Enabling this property does not
     * cause any increase in index storage requirements. Default is true for simple fields and null for complex fields.
     *
     * @param retrievable the retrievable value to set.
     * @return the SearchField object itself.
     */
    public SearchField setRetrievable(Boolean retrievable) {
        this.retrievable = retrievable;
        return this;
    }

    /**
     * Get the searchable property: A value indicating whether the field is full-text searchable. This means it will
     * undergo analysis such as word-breaking during indexing. If you set a searchable field to a value like "sunny
     * day", internally it will be split into the individual tokens "sunny" and "day". This enables full-text searches
     * for these terms. Fields of type Edm.String or Collection(Edm.String) are searchable by default. This property
     * must be false for simple fields of other non-string data types, and it must be null for complex fields. Note:
     * searchable fields consume extra space in your index since Azure Cognitive Search will store an additional
     * tokenized version of the field value for full-text searches. If you want to save space in your index and you
     * don't need a field to be included in searches, set searchable to false.
     *
     * @return the searchable value.
     */
    public Boolean isSearchable() {
        return this.searchable;
    }

    /**
     * Set the searchable property: A value indicating whether the field is full-text searchable. This means it will
     * undergo analysis such as word-breaking during indexing. If you set a searchable field to a value like "sunny
     * day", internally it will be split into the individual tokens "sunny" and "day". This enables full-text searches
     * for these terms. Fields of type Edm.String or Collection(Edm.String) are searchable by default. This property
     * must be false for simple fields of other non-string data types, and it must be null for complex fields. Note:
     * searchable fields consume extra space in your index since Azure Cognitive Search will store an additional
     * tokenized version of the field value for full-text searches. If you want to save space in your index and you
     * don't need a field to be included in searches, set searchable to false.
     *
     * @param searchable the searchable value to set.
     * @return the SearchField object itself.
     */
    public SearchField setSearchable(Boolean searchable) {
        this.searchable = searchable;
        return this;
    }

    /**
     * Get the filterable property: A value indicating whether to enable the field to be referenced in $filter queries.
     * filterable differs from searchable in how strings are handled. Fields of type Edm.String or
     * Collection(Edm.String) that are filterable do not undergo word-breaking, so comparisons are for exact matches
     * only. For example, if you set such a field f to "sunny day", $filter=f eq 'sunny' will find no matches, but
     * $filter=f eq 'sunny day' will. This property must be null for complex fields. Default is true for simple fields
     * and null for complex fields.
     *
     * @return the filterable value.
     */
    public Boolean isFilterable() {
        return this.filterable;
    }

    /**
     * Set the filterable property: A value indicating whether to enable the field to be referenced in $filter queries.
     * filterable differs from searchable in how strings are handled. Fields of type Edm.String or
     * Collection(Edm.String) that are filterable do not undergo word-breaking, so comparisons are for exact matches
     * only. For example, if you set such a field f to "sunny day", $filter=f eq 'sunny' will find no matches, but
     * $filter=f eq 'sunny day' will. This property must be null for complex fields. Default is true for simple fields
     * and null for complex fields.
     *
     * @param filterable the filterable value to set.
     * @return the SearchField object itself.
     */
    public SearchField setFilterable(Boolean filterable) {
        this.filterable = filterable;
        return this;
    }

    /**
     * Get the sortable property: A value indicating whether to enable the field to be referenced in $orderby
     * expressions. By default Azure Cognitive Search sorts results by score, but in many experiences users will want to
     * sort by fields in the documents. A simple field can be sortable only if it is single-valued (it has a single
     * value in the scope of the parent document). Simple collection fields cannot be sortable, since they are
     * multi-valued. Simple sub-fields of complex collections are also multi-valued, and therefore cannot be sortable.
     * This is true whether it's an immediate parent field, or an ancestor field, that's the complex collection. Complex
     * fields cannot be sortable and the sortable property must be null for such fields. The default for sortable is
     * true for single-valued simple fields, false for multi-valued simple fields, and null for complex fields.
     *
     * @return the sortable value.
     */
    public Boolean isSortable() {
        return this.sortable;
    }

    /**
     * Set the sortable property: A value indicating whether to enable the field to be referenced in $orderby
     * expressions. By default Azure Cognitive Search sorts results by score, but in many experiences users will want to
     * sort by fields in the documents. A simple field can be sortable only if it is single-valued (it has a single
     * value in the scope of the parent document). Simple collection fields cannot be sortable, since they are
     * multi-valued. Simple sub-fields of complex collections are also multi-valued, and therefore cannot be sortable.
     * This is true whether it's an immediate parent field, or an ancestor field, that's the complex collection. Complex
     * fields cannot be sortable and the sortable property must be null for such fields. The default for sortable is
     * true for single-valued simple fields, false for multi-valued simple fields, and null for complex fields.
     *
     * @param sortable the sortable value to set.
     * @return the SearchField object itself.
     */
    public SearchField setSortable(Boolean sortable) {
        this.sortable = sortable;
        return this;
    }

    /**
     * Get the facetable property: A value indicating whether to enable the field to be referenced in facet queries.
     * Typically used in a presentation of search results that includes hit count by category (for example, search for
     * digital cameras and see hits by brand, by megapixels, by price, and so on). This property must be null for
     * complex fields. Fields of type Edm.GeographyPoint or Collection(Edm.GeographyPoint) cannot be facetable. Default
     * is true for all other simple fields.
     *
     * @return the facetable value.
     */
    public Boolean isFacetable() {
        return this.facetable;
    }

    /**
     * Set the facetable property: A value indicating whether to enable the field to be referenced in facet queries.
     * Typically used in a presentation of search results that includes hit count by category (for example, search for
     * digital cameras and see hits by brand, by megapixels, by price, and so on). This property must be null for
     * complex fields. Fields of type Edm.GeographyPoint or Collection(Edm.GeographyPoint) cannot be facetable. Default
     * is true for all other simple fields.
     *
     * @param facetable the facetable value to set.
     * @return the SearchField object itself.
     */
    public SearchField setFacetable(Boolean facetable) {
        this.facetable = facetable;
        return this;
    }

    /**
     * Get the analyzer property: The name of the analyzer to use for the field. This option can be used only with
     * searchable fields and it can't be set together with either searchAnalyzer or indexAnalyzer. Once the analyzer is
     * chosen, it cannot be changed for the field. Must be null for complex fields.
     *
     * @return the analyzer value.
     */
    public LexicalAnalyzerName getAnalyzer() {
        return this.analyzer;
    }

    /**
     * Set the analyzer property: The name of the analyzer to use for the field. This option can be used only with
     * searchable fields and it can't be set together with either searchAnalyzer or indexAnalyzer. Once the analyzer is
     * chosen, it cannot be changed for the field. Must be null for complex fields.
     *
     * @param analyzer the analyzer value to set.
     * @return the SearchField object itself.
     */
    public SearchField setAnalyzer(LexicalAnalyzerName analyzer) {
        this.analyzer = analyzer;
        return this;
    }

    /**
     * Get the searchAnalyzer property: The name of the analyzer used at search time for the field. This option can be
     * used only with searchable fields. It must be set together with indexAnalyzer and it cannot be set together with
     * the analyzer option. This property cannot be set to the name of a language analyzer; use the analyzer property
     * instead if you need a language analyzer. This analyzer can be updated on an existing field. Must be null for
     * complex fields.
     *
     * @return the searchAnalyzer value.
     */
    public LexicalAnalyzerName getSearchAnalyzer() {
        return this.searchAnalyzer;
    }

    /**
     * Set the searchAnalyzer property: The name of the analyzer used at search time for the field. This option can be
     * used only with searchable fields. It must be set together with indexAnalyzer and it cannot be set together with
     * the analyzer option. This property cannot be set to the name of a language analyzer; use the analyzer property
     * instead if you need a language analyzer. This analyzer can be updated on an existing field. Must be null for
     * complex fields.
     *
     * @param searchAnalyzer the searchAnalyzer value to set.
     * @return the SearchField object itself.
     */
    public SearchField setSearchAnalyzer(LexicalAnalyzerName searchAnalyzer) {
        this.searchAnalyzer = searchAnalyzer;
        return this;
    }

    /**
     * Get the indexAnalyzer property: The name of the analyzer used at indexing time for the field. This option can be
     * used only with searchable fields. It must be set together with searchAnalyzer and it cannot be set together with
     * the analyzer option. This property cannot be set to the name of a language analyzer; use the analyzer property
     * instead if you need a language analyzer. Once the analyzer is chosen, it cannot be changed for the field. Must be
     * null for complex fields.
     *
     * @return the indexAnalyzer value.
     */
    public LexicalAnalyzerName getIndexAnalyzer() {
        return this.indexAnalyzer;
    }

    /**
     * Set the indexAnalyzer property: The name of the analyzer used at indexing time for the field. This option can be
     * used only with searchable fields. It must be set together with searchAnalyzer and it cannot be set together with
     * the analyzer option. This property cannot be set to the name of a language analyzer; use the analyzer property
     * instead if you need a language analyzer. Once the analyzer is chosen, it cannot be changed for the field. Must be
     * null for complex fields.
     *
     * @param indexAnalyzer the indexAnalyzer value to set.
     * @return the SearchField object itself.
     */
    public SearchField setIndexAnalyzer(LexicalAnalyzerName indexAnalyzer) {
        this.indexAnalyzer = indexAnalyzer;
        return this;
    }

    /**
     * Get the synonymMaps property: A list of the names of synonym maps to associate with this field. This option can
     * be used only with searchable fields. Currently only one synonym map per field is supported. Assigning a synonym
     * map to a field ensures that query terms targeting that field are expanded at query-time using the rules in the
     * synonym map. This attribute can be changed on existing fields. Must be null or an empty collection for complex
     * fields.
     *
     * @return the synonymMaps value.
     */
    public List<String> getSynonymMaps() {
        return this.synonymMaps;
    }

    /**
     * Set the synonymMaps property: A list of the names of synonym maps to associate with this field. This option can
     * be used only with searchable fields. Currently only one synonym map per field is supported. Assigning a synonym
     * map to a field ensures that query terms targeting that field are expanded at query-time using the rules in the
     * synonym map. This attribute can be changed on existing fields. Must be null or an empty collection for complex
     * fields.
     *
     * @param synonymMaps the synonymMaps value to set.
     * @return the SearchField object itself.
     */
    public SearchField setSynonymMaps(List<String> synonymMaps) {
        this.synonymMaps = synonymMaps;
        return this;
    }

    /**
     * Get the fields property: A list of sub-fields if this is a field of type Edm.ComplexType or
     * Collection(Edm.ComplexType). Must be null or empty for simple fields.
     *
     * @return the fields value.
     */
    public List<SearchField> getFields() {
        return this.fields;
    }

    /**
     * Set the fields property: A list of sub-fields if this is a field of type Edm.ComplexType or
     * Collection(Edm.ComplexType). Must be null or empty for simple fields.
     *
     * @param fields the fields value to set.
     * @return the SearchField object itself.
     */
    public SearchField setFields(List<SearchField> fields) {
        this.fields = fields;
        return this;
    }
}
