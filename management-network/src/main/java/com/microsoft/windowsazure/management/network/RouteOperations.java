/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.network;

import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.core.OperationStatusResponse;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.network.models.AddRouteTableToSubnetParameters;
import com.microsoft.windowsazure.management.network.models.CreateRouteTableParameters;
import com.microsoft.windowsazure.management.network.models.GetRouteTableForSubnetResponse;
import com.microsoft.windowsazure.management.network.models.GetRouteTableResponse;
import com.microsoft.windowsazure.management.network.models.ListRouteTablesResponse;
import com.microsoft.windowsazure.management.network.models.SetRouteParameters;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
* The Network Management API includes operations for managing the routes for
* your subscription.
*/
public interface RouteOperations {
    /**
    * Set the specified route table for the provided subnet in the provided
    * virtual network in this subscription.
    *
    * @param vnetName Required. The name of the virtual network that contains
    * the provided subnet.
    * @param subnetName Required. The name of the subnet that the route table
    * will be added to.
    * @param parameters Required. The parameters necessary to add a route table
    * to the provided subnet.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws ServiceException Thrown if the server returned an error for the
    * request.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    OperationStatusResponse addRouteTableToSubnet(String vnetName, String subnetName, AddRouteTableToSubnetParameters parameters) throws InterruptedException, ExecutionException, ServiceException, IOException;
    
    /**
    * Set the specified route table for the provided subnet in the provided
    * virtual network in this subscription.
    *
    * @param vnetName Required. The name of the virtual network that contains
    * the provided subnet.
    * @param subnetName Required. The name of the subnet that the route table
    * will be added to.
    * @param parameters Required. The parameters necessary to add a route table
    * to the provided subnet.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    Future<OperationStatusResponse> addRouteTableToSubnetAsync(String vnetName, String subnetName, AddRouteTableToSubnetParameters parameters);
    
    /**
    * Set the specified route table for the provided subnet in the provided
    * virtual network in this subscription.
    *
    * @param vnetName Required. The name of the virtual network that contains
    * the provided subnet.
    * @param subnetName Required. The name of the subnet that the route table
    * will be added to.
    * @param parameters Required. The parameters necessary to add a route table
    * to the provided subnet.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse beginAddRouteTableToSubnet(String vnetName, String subnetName, AddRouteTableToSubnetParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException;
    
    /**
    * Set the specified route table for the provided subnet in the provided
    * virtual network in this subscription.
    *
    * @param vnetName Required. The name of the virtual network that contains
    * the provided subnet.
    * @param subnetName Required. The name of the subnet that the route table
    * will be added to.
    * @param parameters Required. The parameters necessary to add a route table
    * to the provided subnet.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> beginAddRouteTableToSubnetAsync(String vnetName, String subnetName, AddRouteTableToSubnetParameters parameters);
    
    /**
    * Create the specified route table for this subscription.
    *
    * @param parameters Required. The parameters necessary to create a new
    * route table.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse beginCreateRouteTable(CreateRouteTableParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException;
    
    /**
    * Create the specified route table for this subscription.
    *
    * @param parameters Required. The parameters necessary to create a new
    * route table.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> beginCreateRouteTableAsync(CreateRouteTableParameters parameters);
    
    /**
    * Set the specified route for the provided table in this subscription.
    *
    * @param routeTableName Required. The name of the route table where the
    * provided route will be set.
    * @param routeName Required. The name of the route that will be set on the
    * provided route table.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse beginDeleteRoute(String routeTableName, String routeName) throws IOException, ServiceException;
    
    /**
    * Set the specified route for the provided table in this subscription.
    *
    * @param routeTableName Required. The name of the route table where the
    * provided route will be set.
    * @param routeName Required. The name of the route that will be set on the
    * provided route table.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> beginDeleteRouteAsync(String routeTableName, String routeName);
    
    /**
    * Delete the specified route table for this subscription.
    *
    * @param routeTableName Required. The name of the route table to delete.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse beginDeleteRouteTable(String routeTableName) throws IOException, ServiceException;
    
    /**
    * Delete the specified route table for this subscription.
    *
    * @param routeTableName Required. The name of the route table to delete.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> beginDeleteRouteTableAsync(String routeTableName);
    
    /**
    * Remove the route table from the provided subnet in the provided virtual
    * network in this subscription.
    *
    * @param vnetName Required. The name of the virtual network that contains
    * the provided subnet.
    * @param subnetName Required. The name of the subnet that the route table
    * will be removed from.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse beginRemoveRouteTableFromSubnet(String vnetName, String subnetName) throws IOException, ServiceException;
    
    /**
    * Remove the route table from the provided subnet in the provided virtual
    * network in this subscription.
    *
    * @param vnetName Required. The name of the virtual network that contains
    * the provided subnet.
    * @param subnetName Required. The name of the subnet that the route table
    * will be removed from.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> beginRemoveRouteTableFromSubnetAsync(String vnetName, String subnetName);
    
    /**
    * Set the specified route for the provided table in this subscription.
    *
    * @param routeTableName Required. The name of the route table where the
    * provided route will be set.
    * @param routeName Required. The name of the route that will be set on the
    * provided route table.
    * @param parameters Required. The parameters necessary to create a new
    * route table.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse beginSetRoute(String routeTableName, String routeName, SetRouteParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException;
    
    /**
    * Set the specified route for the provided table in this subscription.
    *
    * @param routeTableName Required. The name of the route table where the
    * provided route will be set.
    * @param routeName Required. The name of the route that will be set on the
    * provided route table.
    * @param parameters Required. The parameters necessary to create a new
    * route table.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> beginSetRouteAsync(String routeTableName, String routeName, SetRouteParameters parameters);
    
    /**
    * Create the specified route table for this subscription.
    *
    * @param parameters Required. The parameters necessary to create a new
    * route table.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws ServiceException Thrown if the server returned an error for the
    * request.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    OperationStatusResponse createRouteTable(CreateRouteTableParameters parameters) throws InterruptedException, ExecutionException, ServiceException, IOException;
    
    /**
    * Create the specified route table for this subscription.
    *
    * @param parameters Required. The parameters necessary to create a new
    * route table.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    Future<OperationStatusResponse> createRouteTableAsync(CreateRouteTableParameters parameters);
    
    /**
    * Set the specified route for the provided table in this subscription.
    *
    * @param routeTableName Required. The name of the route table where the
    * provided route will be set.
    * @param routeName Required. The name of the route that will be set on the
    * provided route table.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws ServiceException Thrown if the server returned an error for the
    * request.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    OperationStatusResponse deleteRoute(String routeTableName, String routeName) throws InterruptedException, ExecutionException, ServiceException, IOException;
    
    /**
    * Set the specified route for the provided table in this subscription.
    *
    * @param routeTableName Required. The name of the route table where the
    * provided route will be set.
    * @param routeName Required. The name of the route that will be set on the
    * provided route table.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    Future<OperationStatusResponse> deleteRouteAsync(String routeTableName, String routeName);
    
    /**
    * Delete the specified route table for this subscription.
    *
    * @param routeTableName Required. The name of the route table to delete.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws ServiceException Thrown if the server returned an error for the
    * request.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    OperationStatusResponse deleteRouteTable(String routeTableName) throws InterruptedException, ExecutionException, ServiceException, IOException;
    
    /**
    * Delete the specified route table for this subscription.
    *
    * @param routeTableName Required. The name of the route table to delete.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    Future<OperationStatusResponse> deleteRouteTableAsync(String routeTableName);
    
    /**
    * Get the specified route table for this subscription.
    *
    * @param routeTableName Required. The name of the route table in this
    * subscription to retrieve.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    GetRouteTableResponse getRouteTable(String routeTableName) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * Get the specified route table for this subscription.
    *
    * @param routeTableName Required. The name of the route table in this
    * subscription to retrieve.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<GetRouteTableResponse> getRouteTableAsync(String routeTableName);
    
    /**
    * Get the specified route table for the provided subnet in the provided
    * virtual network in this subscription.
    *
    * @param vnetName Required. The name of the virtual network that contains
    * the provided subnet.
    * @param subnetName Required. The name of the subnet.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    GetRouteTableForSubnetResponse getRouteTableForSubnet(String vnetName, String subnetName) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * Get the specified route table for the provided subnet in the provided
    * virtual network in this subscription.
    *
    * @param vnetName Required. The name of the virtual network that contains
    * the provided subnet.
    * @param subnetName Required. The name of the subnet.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<GetRouteTableForSubnetResponse> getRouteTableForSubnetAsync(String vnetName, String subnetName);
    
    /**
    * Get the specified route table for this subscription.
    *
    * @param routeTableName Required. The name of the route table in this
    * subscription to retrieve.
    * @param detailLevel Required. The amount of detail about the requested
    * route table that will be returned.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    GetRouteTableResponse getRouteTableWithDetails(String routeTableName, String detailLevel) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * Get the specified route table for this subscription.
    *
    * @param routeTableName Required. The name of the route table in this
    * subscription to retrieve.
    * @param detailLevel Required. The amount of detail about the requested
    * route table that will be returned.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<GetRouteTableResponse> getRouteTableWithDetailsAsync(String routeTableName, String detailLevel);
    
    /**
    * List the existing route tables for this subscription.
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    ListRouteTablesResponse listRouteTables() throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * List the existing route tables for this subscription.
    *
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<ListRouteTablesResponse> listRouteTablesAsync();
    
    /**
    * Remove the route table from the provided subnet in the provided virtual
    * network in this subscription.
    *
    * @param vnetName Required. The name of the virtual network that contains
    * the provided subnet.
    * @param subnetName Required. The name of the subnet that the route table
    * will be removed from.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws ServiceException Thrown if the server returned an error for the
    * request.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    OperationStatusResponse removeRouteTableFromSubnet(String vnetName, String subnetName) throws InterruptedException, ExecutionException, ServiceException, IOException;
    
    /**
    * Remove the route table from the provided subnet in the provided virtual
    * network in this subscription.
    *
    * @param vnetName Required. The name of the virtual network that contains
    * the provided subnet.
    * @param subnetName Required. The name of the subnet that the route table
    * will be removed from.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    Future<OperationStatusResponse> removeRouteTableFromSubnetAsync(String vnetName, String subnetName);
    
    /**
    * Set the specified route for the provided table in this subscription.
    *
    * @param routeTableName Required. The name of the route table where the
    * provided route will be set.
    * @param routeName Required. The name of the route that will be set on the
    * provided route table.
    * @param parameters Required. The parameters necessary to create a new
    * route table.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws ServiceException Thrown if the server returned an error for the
    * request.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    OperationStatusResponse setRoute(String routeTableName, String routeName, SetRouteParameters parameters) throws InterruptedException, ExecutionException, ServiceException, IOException;
    
    /**
    * Set the specified route for the provided table in this subscription.
    *
    * @param routeTableName Required. The name of the route table where the
    * provided route will be set.
    * @param routeName Required. The name of the route that will be set on the
    * provided route table.
    * @param parameters Required. The parameters necessary to create a new
    * route table.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    Future<OperationStatusResponse> setRouteAsync(String routeTableName, String routeName, SetRouteParameters parameters);
}
