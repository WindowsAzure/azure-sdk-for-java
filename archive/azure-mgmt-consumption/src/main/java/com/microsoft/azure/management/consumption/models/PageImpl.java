/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package consumption.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.Page;
import java.util.List;

/**
 * An instance of this class defines a page of Azure resources and a link to
 * get the next page of resources, if any.
 *
 * @param <T> type of Azure resource
 */
public class PageImpl<T> implements Page<T> {
    /**
     * The link to the next page.
     */
    @JsonProperty("nextLink")
    private String nextPageLink;

    /**
     * The list of items.
     */
    @JsonProperty("value")
    private List<T> items;

    /**
     * Gets the link to the next page.
     *
     * @return the link to the next page.
     */
    @Override
    public String nextPageLink() {
        return this.nextPageLink;
    }

    /**
     * Gets the list of items.
     *
     * @return the list of items in {@link List}.
     */
    @Override
    public List<T> items() {
        return items;
    }

    /**
     * Sets the link to the next page.
     *
     * @param nextPageLink the link to the next page.
     * @return this Page object itself.
     */
    public PageImpl<T> setNextPageLink(String nextPageLink) {
        this.nextPageLink = nextPageLink;
        return this;
    }

    /**
     * Sets the list of items.
     *
     * @param items the list of items in {@link List}.
     * @return this Page object itself.
     */
    public PageImpl<T> setItems(List<T> items) {
        this.items = items;
        return this;
    }
}
