import com.azure.applicationconfig.ConfigurationAsyncClient;
import com.azure.applicationconfig.credentials.ConfigurationClientCredentials;
import com.azure.applicationconfig.models.ConfigurationSetting;
import com.azure.common.http.rest.Response;
import reactor.core.publisher.Mono;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * Sample demonstrates how to add, get, and delete a configuration setting.
 */
public class HelloWorld {
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException {
        // Retrieve the connection string from the configuration store.
        // You can get the string from your Azure portal.
        String connectionString = "endpoint={endpoint_value};id={id_value};name={secret_value}";

        // Instantiate a client that will be used to call the service.
        ConfigurationAsyncClient client = ConfigurationAsyncClient.builder()
            .credentials(new ConfigurationClientCredentials(connectionString))
            .build();

        // Name of the key to add to the configuration service.
        String key = "hello";

        // setSetting adds or updates a setting to Azure Application Configuration store. Alternatively, you can call
        // addSetting which only succeeds if the setting does not exist in the store. Or, you can call updateSetting to
        // update a setting that is already present in the store.
        // We subscribe and wait for the service call to complete then print out the contents of our newly added setting.
        // If an error occurs, we print out that error. On completion of the subscription, we delete the setting.
        // .block() exists there so the program does not end before the deletion has completed.
        client.setSetting(key, "world").subscribe(result -> {
            ConfigurationSetting setting = result.value();
            System.out.println(String.format("Key: %s, Value: %s", setting.key(), setting.value()));
        }, error -> {
            System.err.println("There was an error adding the setting: " + error.toString());
        }, () -> {
            System.out.println("Completed. Deleting setting...");
            client.deleteSetting(key).block();
        });
    }
}
