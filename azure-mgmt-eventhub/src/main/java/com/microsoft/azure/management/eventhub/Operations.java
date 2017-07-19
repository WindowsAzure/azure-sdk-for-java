/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.eventhub;

import com.microsoft.azure.management.eventhub.models.OperationListResult;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Operations.
 */
public interface Operations {
    /**
     * Lists all of the available event hub REST API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationListResult object if successful.
     */
    OperationListResult list();

    /**
     * Lists all of the available event hub REST API operations.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<OperationListResult> listAsync(final ServiceCallback<OperationListResult> serviceCallback);

    /**
     * Lists all of the available event hub REST API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationListResult object
     */
    Observable<OperationListResult> listAsync();

    /**
     * Lists all of the available event hub REST API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationListResult object
     */
    Observable<ServiceResponse<OperationListResult>> listWithServiceResponseAsync();

}
