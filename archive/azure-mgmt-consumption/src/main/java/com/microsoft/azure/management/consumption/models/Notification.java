/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package consumption.models;

import java.math.BigDecimal;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The notification associated with a budget.
 */
public class Notification {
    /**
     * The notification is enabled or not.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /**
     * The comparison operator. Possible values include: 'EqualTo',
     * 'GreaterThan', 'GreaterThanOrEqualTo'.
     */
    @JsonProperty(value = "operator", required = true)
    private OperatorType operator;

    /**
     * Threshold value associated with a notification. Notification is sent
     * when the cost exceeded the threshold. It is always percent and has to be
     * between 0 and 1000.
     */
    @JsonProperty(value = "threshold", required = true)
    private BigDecimal threshold;

    /**
     * Email addresses to send the budget notification to when the threshold is
     * exceeded.
     */
    @JsonProperty(value = "contactEmails", required = true)
    private List<String> contactEmails;

    /**
     * Contact roles to send the budget notification to when the threshold is
     * exceeded.
     */
    @JsonProperty(value = "contactRoles")
    private List<String> contactRoles;

    /**
     * Action groups to send the budget notification to when the threshold is
     * exceeded.
     */
    @JsonProperty(value = "contactGroups")
    private List<String> contactGroups;

    /**
     * Get the enabled value.
     *
     * @return the enabled value
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set
     * @return the Notification object itself.
     */
    public Notification withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the operator value.
     *
     * @return the operator value
     */
    public OperatorType operator() {
        return this.operator;
    }

    /**
     * Set the operator value.
     *
     * @param operator the operator value to set
     * @return the Notification object itself.
     */
    public Notification withOperator(OperatorType operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the threshold value.
     *
     * @return the threshold value
     */
    public BigDecimal threshold() {
        return this.threshold;
    }

    /**
     * Set the threshold value.
     *
     * @param threshold the threshold value to set
     * @return the Notification object itself.
     */
    public Notification withThreshold(BigDecimal threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * Get the contactEmails value.
     *
     * @return the contactEmails value
     */
    public List<String> contactEmails() {
        return this.contactEmails;
    }

    /**
     * Set the contactEmails value.
     *
     * @param contactEmails the contactEmails value to set
     * @return the Notification object itself.
     */
    public Notification withContactEmails(List<String> contactEmails) {
        this.contactEmails = contactEmails;
        return this;
    }

    /**
     * Get the contactRoles value.
     *
     * @return the contactRoles value
     */
    public List<String> contactRoles() {
        return this.contactRoles;
    }

    /**
     * Set the contactRoles value.
     *
     * @param contactRoles the contactRoles value to set
     * @return the Notification object itself.
     */
    public Notification withContactRoles(List<String> contactRoles) {
        this.contactRoles = contactRoles;
        return this;
    }

    /**
     * Get the contactGroups value.
     *
     * @return the contactGroups value
     */
    public List<String> contactGroups() {
        return this.contactGroups;
    }

    /**
     * Set the contactGroups value.
     *
     * @param contactGroups the contactGroups value to set
     * @return the Notification object itself.
     */
    public Notification withContactGroups(List<String> contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }

}
