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

import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.network.models.ClientRootCertificateCreateParameters;
import com.microsoft.windowsazure.management.network.models.ClientRootCertificateGetResponse;
import com.microsoft.windowsazure.management.network.models.ClientRootCertificateListResponse;
import com.microsoft.windowsazure.management.network.models.GatewayOperationResponse;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
* The Network Management API includes operations for managing the client root
* certificates for your subscription.  (see
* http://msdn.microsoft.com/en-us/library/windowsazure/jj154113.aspx for more
* information)
*/
public interface ClientRootCertificateOperations {
    /**
    * The Upload Client Root Certificate operation is used to upload a new
    * client root certificate to Azure.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn205129.aspx for
    * more information)
    *
    * @param networkName Required. The name of the virtual network for this
    * gateway.
    * @param parameters Required. Parameters supplied to the Upload Client Root
    * Certificate Virtual Network Gateway operation.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
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
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    GatewayOperationResponse create(String networkName, ClientRootCertificateCreateParameters parameters) throws IOException, ServiceException, ParserConfigurationException, SAXException, InterruptedException, ExecutionException;
    
    /**
    * The Upload Client Root Certificate operation is used to upload a new
    * client root certificate to Azure.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn205129.aspx for
    * more information)
    *
    * @param networkName Required. The name of the virtual network for this
    * gateway.
    * @param parameters Required. Parameters supplied to the Upload Client Root
    * Certificate Virtual Network Gateway operation.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<GatewayOperationResponse> createAsync(String networkName, ClientRootCertificateCreateParameters parameters);
    
    /**
    * The Delete Client Root Certificate operation deletes a previously
    * uploaded client root certificate from Azure.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn205128.aspx for
    * more information)
    *
    * @param networkName Required. The name of the virtual network for this
    * gateway.
    * @param certificateThumbprint Required. The X509 certificate thumbprint.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
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
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    GatewayOperationResponse delete(String networkName, String certificateThumbprint) throws IOException, ServiceException, ParserConfigurationException, SAXException, InterruptedException, ExecutionException;
    
    /**
    * The Delete Client Root Certificate operation deletes a previously
    * uploaded client root certificate from Azure.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn205128.aspx for
    * more information)
    *
    * @param networkName Required. The name of the virtual network for this
    * gateway.
    * @param certificateThumbprint Required. The X509 certificate thumbprint.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<GatewayOperationResponse> deleteAsync(String networkName, String certificateThumbprint);
    
    /**
    * The Get Client Root Certificate operation returns the public portion of a
    * previously uploaded client root certificate in a base-64-encoded format
    * from Azure.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn205127.aspx for
    * more information)
    *
    * @param networkName Required. The name of the virtual network for this
    * gateway.
    * @param certificateThumbprint Required. The X509 certificate thumbprint.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return Response to the Get Client Root Certificate operation.
    */
    ClientRootCertificateGetResponse get(String networkName, String certificateThumbprint) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * The Get Client Root Certificate operation returns the public portion of a
    * previously uploaded client root certificate in a base-64-encoded format
    * from Azure.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn205127.aspx for
    * more information)
    *
    * @param networkName Required. The name of the virtual network for this
    * gateway.
    * @param certificateThumbprint Required. The X509 certificate thumbprint.
    * @return Response to the Get Client Root Certificate operation.
    */
    Future<ClientRootCertificateGetResponse> getAsync(String networkName, String certificateThumbprint);
    
    /**
    * The List Client Root Certificates operation returns a list of all the
    * client root certificates that are associated with the specified virtual
    * network in Azure.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn205130.aspx for
    * more information)
    *
    * @param networkName Required. The name of the virtual network for this
    * gateway.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return The response for the List Client Root Certificates operation.
    */
    ClientRootCertificateListResponse list(String networkName) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * The List Client Root Certificates operation returns a list of all the
    * client root certificates that are associated with the specified virtual
    * network in Azure.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn205130.aspx for
    * more information)
    *
    * @param networkName Required. The name of the virtual network for this
    * gateway.
    * @return The response for the List Client Root Certificates operation.
    */
    Future<ClientRootCertificateListResponse> listAsync(String networkName);
}
