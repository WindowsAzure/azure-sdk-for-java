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

package com.microsoft.windowsazure.management.sql;

import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.sql.models.RestoreDatabaseOperationCreateParameters;
import com.microsoft.windowsazure.management.sql.models.RestoreDatabaseOperationCreateResponse;
import java.io.IOException;
import java.util.concurrent.Future;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
* Contains the operation to create restore requests for Azure SQL Databases.
*/
public interface RestoreDatabaseOperations {
    /**
    * Issues a restore request for an Azure SQL Database.
    *
    * @param sourceServerName Required. The name of the Azure SQL Database
    * Server where the source database is, or was, hosted.
    * @param parameters Required. Additional parameters for the Create Restore
    * Database Operation request.
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
    * @return Contains the response to the Create Restore Database Operation
    * request.
    */
    RestoreDatabaseOperationCreateResponse create(String sourceServerName, RestoreDatabaseOperationCreateParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException;
    
    /**
    * Issues a restore request for an Azure SQL Database.
    *
    * @param sourceServerName Required. The name of the Azure SQL Database
    * Server where the source database is, or was, hosted.
    * @param parameters Required. Additional parameters for the Create Restore
    * Database Operation request.
    * @return Contains the response to the Create Restore Database Operation
    * request.
    */
    Future<RestoreDatabaseOperationCreateResponse> createAsync(String sourceServerName, RestoreDatabaseOperationCreateParameters parameters);
}
