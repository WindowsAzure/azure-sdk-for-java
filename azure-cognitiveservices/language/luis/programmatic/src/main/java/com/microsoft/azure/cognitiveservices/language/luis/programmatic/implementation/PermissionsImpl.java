/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.programmatic.implementation;

import com.microsoft.azure.cognitiveservices.language.luis.programmatic.models.AddOptionalParameter;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.models.DeleteOptionalParameter;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.models.UpdatePermissionsOptionalParameter;
import retrofit2.Retrofit;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.Permissions;
import com.google.common.base.Joiner;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.models.AzureRegions;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.models.CollaboratorsArray;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.models.ErrorResponseException;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.models.OperationStatus;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.models.UserAccessList;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.models.UserCollaborator;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Permissions.
 */
public class PermissionsImpl implements Permissions {
    /** The Retrofit service to perform REST calls. */
    private PermissionsService service;
    /** The service client containing this operation class. */
    private LUISProgrammaticAPIImpl client;

    /**
     * Initializes an instance of PermissionsImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PermissionsImpl(Retrofit retrofit, LUISProgrammaticAPIImpl client) {
        this.service = retrofit.create(PermissionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Permissions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PermissionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.language.luis.programmatic.Permissions listPermissions" })
        @GET("apps/{appId}/permissions")
        Observable<Response<ResponseBody>> listPermissions(@Path("appId") UUID appId, @Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.language.luis.programmatic.Permissions add" })
        @POST("apps/{appId}/permissions")
        Observable<Response<ResponseBody>> add(@Path("appId") UUID appId, @Header("accept-language") String acceptLanguage, @Body UserCollaborator userToAdd, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.language.luis.programmatic.Permissions delete" })
        @HTTP(path = "apps/{appId}/permissions", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("appId") UUID appId, @Header("accept-language") String acceptLanguage, @Body UserCollaborator userToDelete, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.language.luis.programmatic.Permissions updatePermissions" })
        @PUT("apps/{appId}/permissions")
        Observable<Response<ResponseBody>> updatePermissions(@Path("appId") UUID appId, @Header("accept-language") String acceptLanguage, @Body CollaboratorsArray collaborators, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the list of user emails that have permissions to access your application.
     *
     * @param appId The application ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UserAccessList object if successful.
     */
    public UserAccessList listPermissions(UUID appId) {
        return listPermissionsWithServiceResponseAsync(appId).toBlocking().single().body();
    }

    /**
     * Gets the list of user emails that have permissions to access your application.
     *
     * @param appId The application ID.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<UserAccessList> listPermissionsAsync(UUID appId, final ServiceCallback<UserAccessList> serviceCallback) {
        return ServiceFuture.fromResponse(listPermissionsWithServiceResponseAsync(appId), serviceCallback);
    }

    /**
     * Gets the list of user emails that have permissions to access your application.
     *
     * @param appId The application ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UserAccessList object
     */
    public Observable<UserAccessList> listPermissionsAsync(UUID appId) {
        return listPermissionsWithServiceResponseAsync(appId).map(new Func1<ServiceResponse<UserAccessList>, UserAccessList>() {
            @Override
            public UserAccessList call(ServiceResponse<UserAccessList> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the list of user emails that have permissions to access your application.
     *
     * @param appId The application ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UserAccessList object
     */
    public Observable<ServiceResponse<UserAccessList>> listPermissionsWithServiceResponseAsync(UUID appId) {
        if (this.client.azureRegion() == null) {
            throw new IllegalArgumentException("Parameter this.client.azureRegion() is required and cannot be null.");
        }
        if (appId == null) {
            throw new IllegalArgumentException("Parameter appId is required and cannot be null.");
        }
        String parameterizedHost = Joiner.on(", ").join("{AzureRegion}", this.client.azureRegion());
        return service.listPermissions(appId, this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<UserAccessList>>>() {
                @Override
                public Observable<ServiceResponse<UserAccessList>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<UserAccessList> clientResponse = listPermissionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<UserAccessList> listPermissionsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<UserAccessList, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<UserAccessList>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }


    /**
     * Adds a user to the allowed list of users to access this LUIS application. Users are added using their email address.
     *
     * @param appId The application ID.
     * @param addOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatus object if successful.
     */
    public OperationStatus add(UUID appId, AddOptionalParameter addOptionalParameter) {
        return addWithServiceResponseAsync(appId, addOptionalParameter).toBlocking().single().body();
    }

    /**
     * Adds a user to the allowed list of users to access this LUIS application. Users are added using their email address.
     *
     * @param appId The application ID.
     * @param addOptionalParameter the object representing the optional parameters to be set before calling this API
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OperationStatus> addAsync(UUID appId, AddOptionalParameter addOptionalParameter, final ServiceCallback<OperationStatus> serviceCallback) {
        return ServiceFuture.fromResponse(addWithServiceResponseAsync(appId, addOptionalParameter), serviceCallback);
    }

    /**
     * Adds a user to the allowed list of users to access this LUIS application. Users are added using their email address.
     *
     * @param appId The application ID.
     * @param addOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    public Observable<OperationStatus> addAsync(UUID appId, AddOptionalParameter addOptionalParameter) {
        return addWithServiceResponseAsync(appId, addOptionalParameter).map(new Func1<ServiceResponse<OperationStatus>, OperationStatus>() {
            @Override
            public OperationStatus call(ServiceResponse<OperationStatus> response) {
                return response.body();
            }
        });
    }

    /**
     * Adds a user to the allowed list of users to access this LUIS application. Users are added using their email address.
     *
     * @param appId The application ID.
     * @param addOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    public Observable<ServiceResponse<OperationStatus>> addWithServiceResponseAsync(UUID appId, AddOptionalParameter addOptionalParameter) {
        if (this.client.azureRegion() == null) {
            throw new IllegalArgumentException("Parameter this.client.azureRegion() is required and cannot be null.");
        }
        if (appId == null) {
            throw new IllegalArgumentException("Parameter appId is required and cannot be null.");
        }
        final String email = addOptionalParameter != null ? addOptionalParameter.email() : null;
        UserCollaborator userToAdd = new UserCollaborator();
        userToAdd.withEmail(null);
        String parameterizedHost = Joiner.on(", ").join("{AzureRegion}", this.client.azureRegion());

        return addWithServiceResponseAsync(appId, email);
    }

    /**
     * Adds a user to the allowed list of users to access this LUIS application. Users are added using their email address.
     *
     * @param appId The application ID.
     * @param email The email address of the user.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    public Observable<ServiceResponse<OperationStatus>> addWithServiceResponseAsync(UUID appId, String email) {
        if (this.client.azureRegion() == null) {
            throw new IllegalArgumentException("Parameter this.client.azureRegion() is required and cannot be null.");
        }
        if (appId == null) {
            throw new IllegalArgumentException("Parameter appId is required and cannot be null.");
        }
        UserCollaborator userToAdd = new UserCollaborator();
        userToAdd.withEmail(email);
        String parameterizedHost = Joiner.on(", ").join("{AzureRegion}", this.client.azureRegion());
        return service.add(appId, this.client.acceptLanguage(), userToAdd, parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<OperationStatus>>>() {
                @Override
                public Observable<ServiceResponse<OperationStatus>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<OperationStatus> clientResponse = addDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<OperationStatus> addDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<OperationStatus, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<OperationStatus>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }


    /**
     * Removes a user from the allowed list of users to access this LUIS application. Users are removed using their email address.
     *
     * @param appId The application ID.
     * @param deleteOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatus object if successful.
     */
    public OperationStatus delete(UUID appId, DeleteOptionalParameter deleteOptionalParameter) {
        return deleteWithServiceResponseAsync(appId, deleteOptionalParameter).toBlocking().single().body();
    }

    /**
     * Removes a user from the allowed list of users to access this LUIS application. Users are removed using their email address.
     *
     * @param appId The application ID.
     * @param deleteOptionalParameter the object representing the optional parameters to be set before calling this API
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OperationStatus> deleteAsync(UUID appId, DeleteOptionalParameter deleteOptionalParameter, final ServiceCallback<OperationStatus> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(appId, deleteOptionalParameter), serviceCallback);
    }

    /**
     * Removes a user from the allowed list of users to access this LUIS application. Users are removed using their email address.
     *
     * @param appId The application ID.
     * @param deleteOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    public Observable<OperationStatus> deleteAsync(UUID appId, DeleteOptionalParameter deleteOptionalParameter) {
        return deleteWithServiceResponseAsync(appId, deleteOptionalParameter).map(new Func1<ServiceResponse<OperationStatus>, OperationStatus>() {
            @Override
            public OperationStatus call(ServiceResponse<OperationStatus> response) {
                return response.body();
            }
        });
    }

    /**
     * Removes a user from the allowed list of users to access this LUIS application. Users are removed using their email address.
     *
     * @param appId The application ID.
     * @param deleteOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    public Observable<ServiceResponse<OperationStatus>> deleteWithServiceResponseAsync(UUID appId, DeleteOptionalParameter deleteOptionalParameter) {
        if (this.client.azureRegion() == null) {
            throw new IllegalArgumentException("Parameter this.client.azureRegion() is required and cannot be null.");
        }
        if (appId == null) {
            throw new IllegalArgumentException("Parameter appId is required and cannot be null.");
        }
        final String email = deleteOptionalParameter != null ? deleteOptionalParameter.email() : null;
        UserCollaborator userToDelete = new UserCollaborator();
        userToDelete.withEmail(null);
        String parameterizedHost = Joiner.on(", ").join("{AzureRegion}", this.client.azureRegion());

        return deleteWithServiceResponseAsync(appId, email);
    }

    /**
     * Removes a user from the allowed list of users to access this LUIS application. Users are removed using their email address.
     *
     * @param appId The application ID.
     * @param email The email address of the user.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    public Observable<ServiceResponse<OperationStatus>> deleteWithServiceResponseAsync(UUID appId, String email) {
        if (this.client.azureRegion() == null) {
            throw new IllegalArgumentException("Parameter this.client.azureRegion() is required and cannot be null.");
        }
        if (appId == null) {
            throw new IllegalArgumentException("Parameter appId is required and cannot be null.");
        }
        UserCollaborator userToDelete = new UserCollaborator();
        userToDelete.withEmail(email);
        String parameterizedHost = Joiner.on(", ").join("{AzureRegion}", this.client.azureRegion());
        return service.delete(appId, this.client.acceptLanguage(), userToDelete, parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<OperationStatus>>>() {
                @Override
                public Observable<ServiceResponse<OperationStatus>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<OperationStatus> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<OperationStatus> deleteDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<OperationStatus, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<OperationStatus>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }


    /**
     * Replaces the current users access list with the one sent in the body. If an empty list is sent, all access to other users will be removed.
     *
     * @param appId The application ID.
     * @param updatePermissionsOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatus object if successful.
     */
    public OperationStatus updatePermissions(UUID appId, UpdatePermissionsOptionalParameter updatePermissionsOptionalParameter) {
        return updatePermissionsWithServiceResponseAsync(appId, updatePermissionsOptionalParameter).toBlocking().single().body();
    }

    /**
     * Replaces the current users access list with the one sent in the body. If an empty list is sent, all access to other users will be removed.
     *
     * @param appId The application ID.
     * @param updatePermissionsOptionalParameter the object representing the optional parameters to be set before calling this API
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OperationStatus> updatePermissionsAsync(UUID appId, UpdatePermissionsOptionalParameter updatePermissionsOptionalParameter, final ServiceCallback<OperationStatus> serviceCallback) {
        return ServiceFuture.fromResponse(updatePermissionsWithServiceResponseAsync(appId, updatePermissionsOptionalParameter), serviceCallback);
    }

    /**
     * Replaces the current users access list with the one sent in the body. If an empty list is sent, all access to other users will be removed.
     *
     * @param appId The application ID.
     * @param updatePermissionsOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    public Observable<OperationStatus> updatePermissionsAsync(UUID appId, UpdatePermissionsOptionalParameter updatePermissionsOptionalParameter) {
        return updatePermissionsWithServiceResponseAsync(appId, updatePermissionsOptionalParameter).map(new Func1<ServiceResponse<OperationStatus>, OperationStatus>() {
            @Override
            public OperationStatus call(ServiceResponse<OperationStatus> response) {
                return response.body();
            }
        });
    }

    /**
     * Replaces the current users access list with the one sent in the body. If an empty list is sent, all access to other users will be removed.
     *
     * @param appId The application ID.
     * @param updatePermissionsOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    public Observable<ServiceResponse<OperationStatus>> updatePermissionsWithServiceResponseAsync(UUID appId, UpdatePermissionsOptionalParameter updatePermissionsOptionalParameter) {
        if (this.client.azureRegion() == null) {
            throw new IllegalArgumentException("Parameter this.client.azureRegion() is required and cannot be null.");
        }
        if (appId == null) {
            throw new IllegalArgumentException("Parameter appId is required and cannot be null.");
        }
        final List<String> emails = updatePermissionsOptionalParameter != null ? updatePermissionsOptionalParameter.emails() : null;
        CollaboratorsArray collaborators = new CollaboratorsArray();
        collaborators.withEmails(null);
        String parameterizedHost = Joiner.on(", ").join("{AzureRegion}", this.client.azureRegion());

        return updatePermissionsWithServiceResponseAsync(appId, emails);
    }

    /**
     * Replaces the current users access list with the one sent in the body. If an empty list is sent, all access to other users will be removed.
     *
     * @param appId The application ID.
     * @param emails The email address of the users.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    public Observable<ServiceResponse<OperationStatus>> updatePermissionsWithServiceResponseAsync(UUID appId, List<String> emails) {
        if (this.client.azureRegion() == null) {
            throw new IllegalArgumentException("Parameter this.client.azureRegion() is required and cannot be null.");
        }
        if (appId == null) {
            throw new IllegalArgumentException("Parameter appId is required and cannot be null.");
        }
        Validator.validate(emails);
        CollaboratorsArray collaborators = new CollaboratorsArray();
        collaborators.withEmails(emails);
        String parameterizedHost = Joiner.on(", ").join("{AzureRegion}", this.client.azureRegion());
        return service.updatePermissions(appId, this.client.acceptLanguage(), collaborators, parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<OperationStatus>>>() {
                @Override
                public Observable<ServiceResponse<OperationStatus>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<OperationStatus> clientResponse = updatePermissionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<OperationStatus> updatePermissionsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<OperationStatus, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<OperationStatus>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
