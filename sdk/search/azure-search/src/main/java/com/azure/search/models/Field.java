// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Represents a field in an index definition, which describes the name, data
 * type, and search behavior of a field.
 */
@Fluent
public final class Field {
    /*
     * The name of the field, which must be unique within the fields collection
     * of the index or parent field.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The data type of the field. Possible values include: 'Edm.String',
     * 'Edm.Int32', 'Edm.Int64', 'Edm.Double', 'Edm.Boolean',
     * 'Edm.DateTimeOffset', 'Edm.GeographyPoint', 'Edm.ComplexType'
     */
    @JsonProperty(value = "type", required = true)
    private DataType type;

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
     * The name of the language analyzer to use for the field. This option can
     * be used only with searchable fields and it can't be set together with
     * either searchAnalyzer or indexAnalyzer. Once the analyzer is chosen, it
     * cannot be changed for the field. Must be null for complex fields.
     * Possible values include: 'ar.microsoft', 'ar.lucene', 'hy.lucene',
     * 'bn.microsoft', 'eu.lucene', 'bg.microsoft', 'bg.lucene',
     * 'ca.microsoft', 'ca.lucene', 'zh-Hans.microsoft', 'zh-Hans.lucene',
     * 'zh-Hant.microsoft', 'zh-Hant.lucene', 'hr.microsoft', 'cs.microsoft',
     * 'cs.lucene', 'da.microsoft', 'da.lucene', 'nl.microsoft', 'nl.lucene',
     * 'en.microsoft', 'en.lucene', 'et.microsoft', 'fi.microsoft',
     * 'fi.lucene', 'fr.microsoft', 'fr.lucene', 'gl.lucene', 'de.microsoft',
     * 'de.lucene', 'el.microsoft', 'el.lucene', 'gu.microsoft',
     * 'he.microsoft', 'hi.microsoft', 'hi.lucene', 'hu.microsoft',
     * 'hu.lucene', 'is.microsoft', 'id.microsoft', 'id.lucene', 'ga.lucene',
     * 'it.microsoft', 'it.lucene', 'ja.microsoft', 'ja.lucene',
     * 'kn.microsoft', 'ko.microsoft', 'ko.lucene', 'lv.microsoft',
     * 'lv.lucene', 'lt.microsoft', 'ml.microsoft', 'ms.microsoft',
     * 'mr.microsoft', 'nb.microsoft', 'no.lucene', 'fa.lucene',
     * 'pl.microsoft', 'pl.lucene', 'pt-BR.microsoft', 'pt-BR.lucene',
     * 'pt-PT.microsoft', 'pt-PT.lucene', 'pa.microsoft', 'ro.microsoft',
     * 'ro.lucene', 'ru.microsoft', 'ru.lucene', 'sr-cyrillic.microsoft',
     * 'sr-latin.microsoft', 'sk.microsoft', 'sl.microsoft', 'es.microsoft',
     * 'es.lucene', 'sv.microsoft', 'sv.lucene', 'ta.microsoft',
     * 'te.microsoft', 'th.microsoft', 'th.lucene', 'tr.microsoft',
     * 'tr.lucene', 'uk.microsoft', 'ur.microsoft', 'vi.microsoft',
     * 'standard.lucene', 'standardasciifolding.lucene', 'keyword', 'pattern',
     * 'simple', 'stop', 'whitespace'
     */
    @JsonProperty(value = "analyzer")
    private AnalyzerName analyzer;

    /*
     * The name of the analyzer used at search time for the field. This option
     * can be used only with searchable fields. It must be set together with
     * indexAnalyzer and it cannot be set together with the analyzer option.
     * This analyzer can be updated on an existing field. Must be null for
     * complex fields.
     */
    @JsonProperty(value = "searchAnalyzer")
    private String searchAnalyzer;

    /*
     * The name of the analyzer used at indexing time for the field. This
     * option can be used only with searchable fields. It must be set together
     * with searchAnalyzer and it cannot be set together with the analyzer
     * option. Once the analyzer is chosen, it cannot be changed for the field.
     * Must be null for complex fields.
     */
    @JsonProperty(value = "indexAnalyzer")
    private String indexAnalyzer;

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
    private List<Field> fields;

    /**
     * Get the name property: The name of the field, which must be unique
     * within the fields collection of the index or parent field.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the field, which must be unique
     * within the fields collection of the index or parent field.
     *
     * @param name the name value to set.
     * @return the Field object itself.
     */
    public Field setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The data type of the field. Possible values
     * include: 'Edm.String', 'Edm.Int32', 'Edm.Int64', 'Edm.Double',
     * 'Edm.Boolean', 'Edm.DateTimeOffset', 'Edm.GeographyPoint',
     * 'Edm.ComplexType'.
     *
     * @return the type value.
     */
    public DataType getType() {
        return this.type;
    }

    /**
     * Set the type property: The data type of the field. Possible values
     * include: 'Edm.String', 'Edm.Int32', 'Edm.Int64', 'Edm.Double',
     * 'Edm.Boolean', 'Edm.DateTimeOffset', 'Edm.GeographyPoint',
     * 'Edm.ComplexType'.
     *
     * @param type the type value to set.
     * @return the Field object itself.
     */
    public Field setType(DataType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the key property: A value indicating whether the field uniquely
     * identifies documents in the index. Exactly one top-level field in each
     * index must be chosen as the key field and it must be of type Edm.String.
     * Key fields can be used to look up documents directly and update or
     * delete specific documents. Default is false for simple fields and null
     * for complex fields.
     *
     * @return the key value.
     */
    public Boolean isKey() {
        return this.key;
    }

    /**
     * Set the key property: A value indicating whether the field uniquely
     * identifies documents in the index. Exactly one top-level field in each
     * index must be chosen as the key field and it must be of type Edm.String.
     * Key fields can be used to look up documents directly and update or
     * delete specific documents. Default is false for simple fields and null
     * for complex fields.
     *
     * @param key the key value to set.
     * @return the Field object itself.
     */
    public Field setKey(Boolean key) {
        this.key = key;
        return this;
    }

    /**
     * Get the retrievable property: A value indicating whether the field can
     * be returned in a search result. You can disable this option if you want
     * to use a field (for example, margin) as a filter, sorting, or scoring
     * mechanism but do not want the field to be visible to the end user. This
     * property must be true for key fields, and it must be null for complex
     * fields. This property can be changed on existing fields. Enabling this
     * property does not cause any increase in index storage requirements.
     * Default is true for simple fields and null for complex fields.
     *
     * @return the retrievable value.
     */
    public Boolean isRetrievable() {
        return this.retrievable;
    }

    /**
     * Set the retrievable property: A value indicating whether the field can
     * be returned in a search result. You can disable this option if you want
     * to use a field (for example, margin) as a filter, sorting, or scoring
     * mechanism but do not want the field to be visible to the end user. This
     * property must be true for key fields, and it must be null for complex
     * fields. This property can be changed on existing fields. Enabling this
     * property does not cause any increase in index storage requirements.
     * Default is true for simple fields and null for complex fields.
     *
     * @param retrievable the retrievable value to set.
     * @return the Field object itself.
     */
    public Field setRetrievable(Boolean retrievable) {
        this.retrievable = retrievable;
        return this;
    }

    /**
     * Get the searchable property: A value indicating whether the field is
     * full-text searchable. This means it will undergo analysis such as
     * word-breaking during indexing. If you set a searchable field to a value
     * like "sunny day", internally it will be split into the individual tokens
     * "sunny" and "day". This enables full-text searches for these terms.
     * Fields of type Edm.String or Collection(Edm.String) are searchable by
     * default. This property must be false for simple fields of other
     * non-string data types, and it must be null for complex fields. Note:
     * searchable fields consume extra space in your index since Azure
     * Cognitive Search will store an additional tokenized version of the field
     * value for full-text searches. If you want to save space in your index
     * and you don't need a field to be included in searches, set searchable to
     * false.
     *
     * @return the searchable value.
     */
    public Boolean isSearchable() {
        return this.searchable;
    }

    /**
     * Set the searchable property: A value indicating whether the field is
     * full-text searchable. This means it will undergo analysis such as
     * word-breaking during indexing. If you set a searchable field to a value
     * like "sunny day", internally it will be split into the individual tokens
     * "sunny" and "day". This enables full-text searches for these terms.
     * Fields of type Edm.String or Collection(Edm.String) are searchable by
     * default. This property must be false for simple fields of other
     * non-string data types, and it must be null for complex fields. Note:
     * searchable fields consume extra space in your index since Azure
     * Cognitive Search will store an additional tokenized version of the field
     * value for full-text searches. If you want to save space in your index
     * and you don't need a field to be included in searches, set searchable to
     * false.
     *
     * @param searchable the searchable value to set.
     * @return the Field object itself.
     */
    public Field setSearchable(Boolean searchable) {
        this.searchable = searchable;
        return this;
    }

    /**
     * Get the filterable property: A value indicating whether to enable the
     * field to be referenced in $filter queries. filterable differs from
     * searchable in how strings are handled. Fields of type Edm.String or
     * Collection(Edm.String) that are filterable do not undergo word-breaking,
     * so comparisons are for exact matches only. For example, if you set such
     * a field f to "sunny day", $filter=f eq 'sunny' will find no matches, but
     * $filter=f eq 'sunny day' will. This property must be null for complex
     * fields. Default is true for simple fields and null for complex fields.
     *
     * @return the filterable value.
     */
    public Boolean isFilterable() {
        return this.filterable;
    }

    /**
     * Set the filterable property: A value indicating whether to enable the
     * field to be referenced in $filter queries. filterable differs from
     * searchable in how strings are handled. Fields of type Edm.String or
     * Collection(Edm.String) that are filterable do not undergo word-breaking,
     * so comparisons are for exact matches only. For example, if you set such
     * a field f to "sunny day", $filter=f eq 'sunny' will find no matches, but
     * $filter=f eq 'sunny day' will. This property must be null for complex
     * fields. Default is true for simple fields and null for complex fields.
     *
     * @param filterable the filterable value to set.
     * @return the Field object itself.
     */
    public Field setFilterable(Boolean filterable) {
        this.filterable = filterable;
        return this;
    }

    /**
     * Get the sortable property: A value indicating whether to enable the
     * field to be referenced in $orderby expressions. By default Azure
     * Cognitive Search sorts results by score, but in many experiences users
     * will want to sort by fields in the documents. A simple field can be
     * sortable only if it is single-valued (it has a single value in the scope
     * of the parent document). Simple collection fields cannot be sortable,
     * since they are multi-valued. Simple sub-fields of complex collections
     * are also multi-valued, and therefore cannot be sortable. This is true
     * whether it's an immediate parent field, or an ancestor field, that's the
     * complex collection. Complex fields cannot be sortable and the sortable
     * property must be null for such fields. The default for sortable is true
     * for single-valued simple fields, false for multi-valued simple fields,
     * and null for complex fields.
     *
     * @return the sortable value.
     */
    public Boolean isSortable() {
        return this.sortable;
    }

    /**
     * Set the sortable property: A value indicating whether to enable the
     * field to be referenced in $orderby expressions. By default Azure
     * Cognitive Search sorts results by score, but in many experiences users
     * will want to sort by fields in the documents. A simple field can be
     * sortable only if it is single-valued (it has a single value in the scope
     * of the parent document). Simple collection fields cannot be sortable,
     * since they are multi-valued. Simple sub-fields of complex collections
     * are also multi-valued, and therefore cannot be sortable. This is true
     * whether it's an immediate parent field, or an ancestor field, that's the
     * complex collection. Complex fields cannot be sortable and the sortable
     * property must be null for such fields. The default for sortable is true
     * for single-valued simple fields, false for multi-valued simple fields,
     * and null for complex fields.
     *
     * @param sortable the sortable value to set.
     * @return the Field object itself.
     */
    public Field setSortable(Boolean sortable) {
        this.sortable = sortable;
        return this;
    }

    /**
     * Get the facetable property: A value indicating whether to enable the
     * field to be referenced in facet queries. Typically used in a
     * presentation of search results that includes hit count by category (for
     * example, search for digital cameras and see hits by brand, by
     * megapixels, by price, and so on). This property must be null for complex
     * fields. Fields of type Edm.GeographyPoint or
     * Collection(Edm.GeographyPoint) cannot be facetable. Default is true for
     * all other simple fields.
     *
     * @return the facetable value.
     */
    public Boolean isFacetable() {
        return this.facetable;
    }

    /**
     * Set the facetable property: A value indicating whether to enable the
     * field to be referenced in facet queries. Typically used in a
     * presentation of search results that includes hit count by category (for
     * example, search for digital cameras and see hits by brand, by
     * megapixels, by price, and so on). This property must be null for complex
     * fields. Fields of type Edm.GeographyPoint or
     * Collection(Edm.GeographyPoint) cannot be facetable. Default is true for
     * all other simple fields.
     *
     * @param facetable the facetable value to set.
     * @return the Field object itself.
     */
    public Field setFacetable(Boolean facetable) {
        this.facetable = facetable;
        return this;
    }

    /**
     * Get the analyzer property: The name of the language analyzer to use for
     * the field. This option can be used only with searchable fields and it
     * can't be set together with either searchAnalyzer or indexAnalyzer. Once
     * the analyzer is chosen, it cannot be changed for the field. Must be null
     * for complex fields. Possible values include: 'ar.microsoft',
     * 'ar.lucene', 'hy.lucene', 'bn.microsoft', 'eu.lucene', 'bg.microsoft',
     * 'bg.lucene', 'ca.microsoft', 'ca.lucene', 'zh-Hans.microsoft',
     * 'zh-Hans.lucene', 'zh-Hant.microsoft', 'zh-Hant.lucene', 'hr.microsoft',
     * 'cs.microsoft', 'cs.lucene', 'da.microsoft', 'da.lucene',
     * 'nl.microsoft', 'nl.lucene', 'en.microsoft', 'en.lucene',
     * 'et.microsoft', 'fi.microsoft', 'fi.lucene', 'fr.microsoft',
     * 'fr.lucene', 'gl.lucene', 'de.microsoft', 'de.lucene', 'el.microsoft',
     * 'el.lucene', 'gu.microsoft', 'he.microsoft', 'hi.microsoft',
     * 'hi.lucene', 'hu.microsoft', 'hu.lucene', 'is.microsoft',
     * 'id.microsoft', 'id.lucene', 'ga.lucene', 'it.microsoft', 'it.lucene',
     * 'ja.microsoft', 'ja.lucene', 'kn.microsoft', 'ko.microsoft',
     * 'ko.lucene', 'lv.microsoft', 'lv.lucene', 'lt.microsoft',
     * 'ml.microsoft', 'ms.microsoft', 'mr.microsoft', 'nb.microsoft',
     * 'no.lucene', 'fa.lucene', 'pl.microsoft', 'pl.lucene',
     * 'pt-BR.microsoft', 'pt-BR.lucene', 'pt-PT.microsoft', 'pt-PT.lucene',
     * 'pa.microsoft', 'ro.microsoft', 'ro.lucene', 'ru.microsoft',
     * 'ru.lucene', 'sr-cyrillic.microsoft', 'sr-latin.microsoft',
     * 'sk.microsoft', 'sl.microsoft', 'es.microsoft', 'es.lucene',
     * 'sv.microsoft', 'sv.lucene', 'ta.microsoft', 'te.microsoft',
     * 'th.microsoft', 'th.lucene', 'tr.microsoft', 'tr.lucene',
     * 'uk.microsoft', 'ur.microsoft', 'vi.microsoft', 'standard.lucene',
     * 'standardasciifolding.lucene', 'keyword', 'pattern', 'simple', 'stop',
     * 'whitespace'.
     *
     * @return the analyzer value.
     */
    public AnalyzerName getAnalyzer() {
        return this.analyzer;
    }

    /**
     * Set the analyzer property: The name of the language analyzer to use for
     * the field. This option can be used only with searchable fields and it
     * can't be set together with either searchAnalyzer or indexAnalyzer. Once
     * the analyzer is chosen, it cannot be changed for the field. Must be null
     * for complex fields. Possible values include: 'ar.microsoft',
     * 'ar.lucene', 'hy.lucene', 'bn.microsoft', 'eu.lucene', 'bg.microsoft',
     * 'bg.lucene', 'ca.microsoft', 'ca.lucene', 'zh-Hans.microsoft',
     * 'zh-Hans.lucene', 'zh-Hant.microsoft', 'zh-Hant.lucene', 'hr.microsoft',
     * 'cs.microsoft', 'cs.lucene', 'da.microsoft', 'da.lucene',
     * 'nl.microsoft', 'nl.lucene', 'en.microsoft', 'en.lucene',
     * 'et.microsoft', 'fi.microsoft', 'fi.lucene', 'fr.microsoft',
     * 'fr.lucene', 'gl.lucene', 'de.microsoft', 'de.lucene', 'el.microsoft',
     * 'el.lucene', 'gu.microsoft', 'he.microsoft', 'hi.microsoft',
     * 'hi.lucene', 'hu.microsoft', 'hu.lucene', 'is.microsoft',
     * 'id.microsoft', 'id.lucene', 'ga.lucene', 'it.microsoft', 'it.lucene',
     * 'ja.microsoft', 'ja.lucene', 'kn.microsoft', 'ko.microsoft',
     * 'ko.lucene', 'lv.microsoft', 'lv.lucene', 'lt.microsoft',
     * 'ml.microsoft', 'ms.microsoft', 'mr.microsoft', 'nb.microsoft',
     * 'no.lucene', 'fa.lucene', 'pl.microsoft', 'pl.lucene',
     * 'pt-BR.microsoft', 'pt-BR.lucene', 'pt-PT.microsoft', 'pt-PT.lucene',
     * 'pa.microsoft', 'ro.microsoft', 'ro.lucene', 'ru.microsoft',
     * 'ru.lucene', 'sr-cyrillic.microsoft', 'sr-latin.microsoft',
     * 'sk.microsoft', 'sl.microsoft', 'es.microsoft', 'es.lucene',
     * 'sv.microsoft', 'sv.lucene', 'ta.microsoft', 'te.microsoft',
     * 'th.microsoft', 'th.lucene', 'tr.microsoft', 'tr.lucene',
     * 'uk.microsoft', 'ur.microsoft', 'vi.microsoft', 'standard.lucene',
     * 'standardasciifolding.lucene', 'keyword', 'pattern', 'simple', 'stop',
     * 'whitespace'.
     *
     * @param analyzer the analyzer value to set.
     * @return the Field object itself.
     */
    public Field setAnalyzer(AnalyzerName analyzer) {
        this.analyzer = analyzer;
        return this;
    }

    /**
     * Get the searchAnalyzer property: The name of the analyzer used at search
     * time for the field. This option can be used only with searchable fields.
     * It must be set together with indexAnalyzer and it cannot be set together
     * with the analyzer option. This analyzer can be updated on an existing
     * field. Must be null for complex fields.
     *
     * @return the searchAnalyzer value.
     */
    public String getSearchAnalyzer() {
        return this.searchAnalyzer;
    }

    /**
     * Set the searchAnalyzer property: The name of the analyzer used at search
     * time for the field. This option can be used only with searchable fields.
     * It must be set together with indexAnalyzer and it cannot be set together
     * with the analyzer option. This analyzer can be updated on an existing
     * field. Must be null for complex fields.
     *
     * @param searchAnalyzer the searchAnalyzer value to set.
     * @return the Field object itself.
     */
    public Field setSearchAnalyzer(String searchAnalyzer) {
        this.searchAnalyzer = searchAnalyzer;
        return this;
    }

    /**
     * Get the indexAnalyzer property: The name of the analyzer used at
     * indexing time for the field. This option can be used only with
     * searchable fields. It must be set together with searchAnalyzer and it
     * cannot be set together with the analyzer option. Once the analyzer is
     * chosen, it cannot be changed for the field. Must be null for complex
     * fields.
     *
     * @return the indexAnalyzer value.
     */
    public String getIndexAnalyzer() {
        return this.indexAnalyzer;
    }

    /**
     * Set the indexAnalyzer property: The name of the analyzer used at
     * indexing time for the field. This option can be used only with
     * searchable fields. It must be set together with searchAnalyzer and it
     * cannot be set together with the analyzer option. Once the analyzer is
     * chosen, it cannot be changed for the field. Must be null for complex
     * fields.
     *
     * @param indexAnalyzer the indexAnalyzer value to set.
     * @return the Field object itself.
     */
    public Field setIndexAnalyzer(String indexAnalyzer) {
        this.indexAnalyzer = indexAnalyzer;
        return this;
    }

    /**
     * Get the synonymMaps property: A list of the names of synonym maps to
     * associate with this field. This option can be used only with searchable
     * fields. Currently only one synonym map per field is supported. Assigning
     * a synonym map to a field ensures that query terms targeting that field
     * are expanded at query-time using the rules in the synonym map. This
     * attribute can be changed on existing fields. Must be null or an empty
     * collection for complex fields.
     *
     * @return the synonymMaps value.
     */
    public List<String> getSynonymMaps() {
        return this.synonymMaps;
    }

    /**
     * Set the synonymMaps property: A list of the names of synonym maps to
     * associate with this field. This option can be used only with searchable
     * fields. Currently only one synonym map per field is supported. Assigning
     * a synonym map to a field ensures that query terms targeting that field
     * are expanded at query-time using the rules in the synonym map. This
     * attribute can be changed on existing fields. Must be null or an empty
     * collection for complex fields.
     *
     * @param synonymMaps the synonymMaps value to set.
     * @return the Field object itself.
     */
    public Field setSynonymMaps(List<String> synonymMaps) {
        this.synonymMaps = synonymMaps;
        return this;
    }

    /**
     * Get the fields property: A list of sub-fields if this is a field of type
     * Edm.ComplexType or Collection(Edm.ComplexType). Must be null or empty
     * for simple fields.
     *
     * @return the fields value.
     */
    public List<Field> getFields() {
        return this.fields;
    }

    /**
     * Set the fields property: A list of sub-fields if this is a field of type
     * Edm.ComplexType or Collection(Edm.ComplexType). Must be null or empty
     * for simple fields.
     *
     * @param fields the fields value to set.
     * @return the Field object itself.
     */
    public Field setFields(List<Field> fields) {
        this.fields = fields;
        return this;
    }
}
