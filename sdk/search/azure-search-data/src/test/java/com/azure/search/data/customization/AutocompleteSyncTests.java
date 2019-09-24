// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.search.data.customization;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.search.data.SearchIndexClient;
import com.azure.search.data.common.AutoCompletePagedResponse;
import com.azure.search.data.generated.models.AutocompleteItem;
import com.azure.search.data.generated.models.AutocompleteMode;
import com.azure.search.data.generated.models.AutocompleteParameters;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import static com.azure.search.data.customization.SearchTestBase.HOTELS_INDEX_NAME;

public class AutocompleteSyncTests extends AutocompleteTestBase {

    private SearchIndexClient client;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Override
    protected void initializeClient() {
        client = builderSetup().indexName(HOTELS_INDEX_NAME).buildClient();

        uploadDocumentsJson(client, HOTELS_INDEX_NAME, HOTELS_DATA_JSON);
    }

    @Test
    public void canAutocompleteThrowsWhenGivenBadSuggesterName() {
        thrown.expect(HttpResponseException.class);
        thrown.expectMessage("The specified suggester name 'Invalid suggester' does not exist in this index definition.\\r\\nParameter name: name");

        AutocompleteParameters params = new AutocompleteParameters();
        params.autocompleteMode(AutocompleteMode.ONE_TERM);

        PagedIterable<AutocompleteItem> results = client.autocomplete("very po", "Invalid suggester", null, params);
        results.iterableByPage().iterator().next();
    }

    @Override
    public void canAutocompleteDefaultsToOneTermMode() {
        List<String> expectedText = Arrays.asList("point", "police", "polite", "pool", "popular");
        List<String> expectedQueryPlusText = Arrays.asList("point", "police", "polite", "pool", "popular");

        PagedIterable<AutocompleteItem> results = client.autocomplete("po", "sg");
        results.iterableByPage().iterator().next();

        Assert.assertNotNull(results);
        validateResults(results, expectedText, expectedQueryPlusText);
    }

    @Override
    public void canAutocompleteOneTermWithContext() {
        List<String> expectedText = Arrays.asList("very police", "very polite", "very popular");
        List<String> expectedQueryPlusText = Arrays.asList("looking for very police", "looking for very polite", "looking for very popular");

        AutocompleteParameters params = new AutocompleteParameters();
        params.autocompleteMode(AutocompleteMode.ONE_TERM_WITH_CONTEXT);

        PagedIterable<AutocompleteItem> results = client.autocomplete("looking for very po", "sg", null, params);
        results.iterableByPage().iterator().next();

        Assert.assertNotNull(results);
        validateResults(results, expectedText, expectedQueryPlusText);
    }

    @Test
    public void canAutocompleteExcludesFieldsNotInSuggester() {
        AutocompleteParameters params = new AutocompleteParameters();
        params.autocompleteMode(AutocompleteMode.ONE_TERM);
        params.searchFields(Arrays.asList("HotelName"));

        PagedIterable<AutocompleteItem> results = client.autocomplete("luxu", "sg", null, params);
        Assert.assertNotNull(results);
        Assert.assertNotNull(results.iterableByPage().iterator().next());
        List allItems = results.streamByPage().collect(Collectors.toList());
        // One page, with 0 items
        Assert.assertEquals(allItems.size(), 1);
        Assert.assertEquals(((AutoCompletePagedResponse) allItems.get(0)).items().size(), 0);
    }

    @Test
    public void canAutocompleteFuzzyIsOffByDefault() {
        AutocompleteParameters params = new AutocompleteParameters();
        params.autocompleteMode(AutocompleteMode.ONE_TERM);

        PagedIterable<AutocompleteItem> results = client.autocomplete("pi", "sg", null, params);
        Assert.assertNotNull(results);
        Assert.assertNotNull(results.iterableByPage().iterator().next());
        List allItems = results.streamByPage().collect(Collectors.toList());
        // One page, with 0 items
        Assert.assertEquals(allItems.size(), 1);
        Assert.assertEquals(((AutoCompletePagedResponse) allItems.get(0)).items().size(), 0);
    }

    @Test
    public void canAutocompleteOneTerm() {
        List<String> expectedText = Arrays.asList("point", "police", "polite", "pool", "popular");
        List<String> expectedQueryPlusText = Arrays.asList("point", "police", "polite", "pool", "popular");

        AutocompleteParameters params = new AutocompleteParameters();
        params.autocompleteMode(AutocompleteMode.ONE_TERM);

        PagedIterable<AutocompleteItem> results = client.autocomplete("po", "sg", null, params);
        results.iterableByPage().iterator().next();

        Assert.assertNotNull(results);
        validateResults(results, expectedText, expectedQueryPlusText);
    }

    @Test
    public void canAutocompleteStaticallyTypedDocuments() {
        List<String> expectedText = Arrays.asList("point", "police", "polite", "pool", "popular");
        List<String> expectedQueryPlusText = Arrays.asList("very point", "very police", "very polite", "very pool", "very popular");

        AutocompleteParameters params = new AutocompleteParameters();
        params.autocompleteMode(AutocompleteMode.ONE_TERM);
        params.useFuzzyMatching(false);

        PagedIterable<AutocompleteItem> results = client.autocomplete("very po", "sg", null, params);
        results.iterableByPage().iterator().next();

        Assert.assertNotNull(results);
        validateResults(results, expectedText, expectedQueryPlusText);
    }

    @Test
    public void canAutocompleteThrowsWhenRequestIsMalformed() {
        thrown.expect(HttpResponseException.class);
        thrown.expectMessage("Cannot find fields enabled for suggestions. Please provide a value for 'suggesterName' in the query.\\r\\nParameter name: suggestions");

        PagedIterable<AutocompleteItem> results = client.autocomplete("very po", "");
        results.iterableByPage().iterator().next();
    }

    @Override
    public void canAutocompleteTwoTerms() {
        List<String> expectedText = Arrays.asList("point motel", "police station", "polite staff", "pool a", "popular hotel");
        List<String> expectedQueryPlusText = Arrays.asList("point motel", "police station", "polite staff", "pool a", "popular hotel");

        AutocompleteParameters params = new AutocompleteParameters();
        params.autocompleteMode(AutocompleteMode.TWO_TERMS);

        PagedIterable<AutocompleteItem> results = client.autocomplete("po", "sg", null, params);
        results.iterableByPage().iterator().next();

        Assert.assertNotNull(results);
        validateResults(results, expectedText, expectedQueryPlusText);
    }

    @Override
    public void testAutocompleteCanUseHitHighlighting() {
        List<String> expectedText = Arrays.asList("pool", "popular");
        List<String> expectedQueryPlusText = Arrays.asList("<b>pool</b>", "<b>popular</b>");

        AutocompleteParameters params = new AutocompleteParameters()
            .autocompleteMode(AutocompleteMode.ONE_TERM)
            .filter("HotelName eq 'EconoStay' or HotelName eq 'Fancy Stay'")
            .highlightPreTag("<b>")
            .highlightPostTag("</b>");

        PagedIterable<AutocompleteItem> results = client.autocomplete("po", "sg", null, params);
        results.iterableByPage().iterator().next();

        Assert.assertNotNull(results);
        validateResults(results, expectedText, expectedQueryPlusText);
    }

    @Override
    public void testAutocompleteWithMultipleSelectedFields() throws Exception {
        List<String> expectedText = Arrays.asList("model", "modern");
        List<String> expectedQueryPlusText = Arrays.asList("model", "modern");

        AutocompleteParameters params = new AutocompleteParameters()
            .autocompleteMode(AutocompleteMode.ONE_TERM)
            .searchFields(Arrays.asList("HotelName", "Description"));

        PagedIterable<AutocompleteItem> results = client.autocomplete("mod", "sg", null, params);
        results.iterableByPage().iterator().next();

        Assert.assertNotNull(results);
        validateResults(results, expectedText, expectedQueryPlusText);
    }

    @Override
    public void testAutocompleteWithSelectedFields() throws Exception {
        List<String> expectedText = Arrays.asList("modern");
        List<String> expectedQueryPlusText = Arrays.asList("modern");

        AutocompleteParameters params = new AutocompleteParameters()
            .autocompleteMode(AutocompleteMode.ONE_TERM)
            .searchFields(Arrays.asList("HotelName"))
            .filter("HotelId eq '7'");

        PagedIterable<AutocompleteItem> results = client.autocomplete("mod", "sg", null, params);
        results.iterableByPage().iterator().next();

        Assert.assertNotNull(results);
        validateResults(results, expectedText, expectedQueryPlusText);
    }

    @Override
    public void testAutocompleteTopTrimsResults() throws Exception {
        List<String> expectedText = Arrays.asList("point", "police");
        List<String> expectedQueryPlusText = Arrays.asList("point", "police");

        AutocompleteParameters params = new AutocompleteParameters()
            .autocompleteMode(AutocompleteMode.ONE_TERM)
            .top(2);

        PagedIterable<AutocompleteItem> results = client.autocomplete("po", "sg", null, params);
        results.iterableByPage().iterator().next();

        Assert.assertNotNull(results);
        validateResults(results, expectedText, expectedQueryPlusText);
    }

    @Override
    public void testAutocompleteWithFilter() throws Exception {
        List<String> expectedText = Arrays.asList("polite");
        List<String> expectedQueryPlusText = Arrays.asList("polite");

        AutocompleteParameters params = new AutocompleteParameters()
            .autocompleteMode(AutocompleteMode.ONE_TERM)
            .filter("search.in(HotelId, '6,7')");

        PagedIterable<AutocompleteItem> results = client.autocomplete("po", "sg", null, params);
        results.iterableByPage().iterator().next();

        Assert.assertNotNull(results);
        validateResults(results, expectedText, expectedQueryPlusText);
    }

    @Override
    public void testAutocompleteOneTermWithContextWithFuzzy() throws Exception {
        List<String> expectedText = Arrays.asList("very polite", "very police");
        List<String> expectedQueryPlusText = Arrays.asList("very polite", "very police");

        AutocompleteParameters params = new AutocompleteParameters()
            .autocompleteMode(AutocompleteMode.ONE_TERM_WITH_CONTEXT)
            .useFuzzyMatching(true);

        PagedIterable<AutocompleteItem> results = client.autocomplete("very polit", "sg", null, params);
        results.iterableByPage().iterator().next();

        Assert.assertNotNull(results);
        validateResults(results, expectedText, expectedQueryPlusText);
    }

    @Override
    public void testAutocompleteOneTermWithFuzzy() throws Exception {
        List<String> expectedText = Arrays.asList("model", "modern", "morel", "motel");
        List<String> expectedQueryPlusText = Arrays.asList("model", "modern", "morel", "motel");

        AutocompleteParameters params = new AutocompleteParameters()
            .autocompleteMode(AutocompleteMode.ONE_TERM)
            .useFuzzyMatching(true);

        PagedIterable<AutocompleteItem> results = client.autocomplete("mod", "sg", null, params);
        results.iterableByPage().iterator().next();

        Assert.assertNotNull(results);
        validateResults(results, expectedText, expectedQueryPlusText);
    }

    @Override
    public void testAutocompleteTwoTermsWithFuzzy() throws Exception {
        List<String> expectedText = Arrays.asList("model suites", "modern architecture", "modern stay", "morel coverings", "motel");
        List<String> expectedQueryPlusText = Arrays.asList("model suites", "modern architecture", "modern stay", "morel coverings", "motel");

        AutocompleteParameters params = new AutocompleteParameters()
            .autocompleteMode(AutocompleteMode.TWO_TERMS)
            .useFuzzyMatching(true);

        PagedIterable<AutocompleteItem> results = client.autocomplete("mod", "sg", null, params);
        results.iterableByPage().iterator().next();

        Assert.assertNotNull(results);
        validateResults(results, expectedText, expectedQueryPlusText);
    }

    @Override
    public void testAutocompleteWithFilterAndFuzzy() throws Exception {
        List<String> expectedText = Arrays.asList("modern", "motel");
        List<String> expectedQueryPlusText = Arrays.asList("modern", "motel");

        AutocompleteParameters params = new AutocompleteParameters()
            .autocompleteMode(AutocompleteMode.ONE_TERM)
            .useFuzzyMatching(true)
            .filter("HotelId ne '6' and (HotelName eq 'Modern Stay' or Tags/any(t : t eq 'budget'))");

        PagedIterable<AutocompleteItem> results = client.autocomplete("mod", "sg", null, params);
        results.iterableByPage().iterator().next();

        Assert.assertNotNull(results);
        validateResults(results, expectedText, expectedQueryPlusText);
    }

    /**
     * Compare the autocomplete results with the expected strings
     *
     * @param results
     * @param expectedText
     * @param expectedQueryPlusText
     */
    private void validateResults(PagedIterable<AutocompleteItem> results, List<String> expectedText, List<String> expectedQueryPlusText) {
        int index = 0;
        Iterator<AutocompleteItem> it = results.stream().iterator();
        while (it.hasNext()) {
            AutocompleteItem item = it.next();
            Assert.assertEquals(expectedText.get(index), item.text());
            Assert.assertEquals(expectedQueryPlusText.get(index), item.queryPlusText());
            index++;
        }
    }
}
