/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package consumption.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for CategoryType.
 */
public final class CategoryType extends ExpandableStringEnum<CategoryType> {
    /** Static value Cost for CategoryType. */
    public static final CategoryType COST = fromString("Cost");

    /** Static value Usage for CategoryType. */
    public static final CategoryType USAGE = fromString("Usage");

    /**
     * Creates or finds a CategoryType from its string representation.
     * @param name a name to look for
     * @return the corresponding CategoryType
     */
    @JsonCreator
    public static CategoryType fromString(String name) {
        return fromString(name, CategoryType.class);
    }

    /**
     * @return known CategoryType values
     */
    public static Collection<CategoryType> values() {
        return values(CategoryType.class);
    }
}
