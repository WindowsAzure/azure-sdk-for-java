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
import com.microsoft.windowsazure.management.sql.models.RestorableDroppedDatabaseGetResponse;
import com.microsoft.windowsazure.management.sql.models.RestorableDroppedDatabaseListResponse;
import java.io.IOException;
import java.util.concurrent.Future;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
* Contains operations for getting dropped Azure SQL Databases that can be
* restored.
*/
public interface RestorableDroppedDatabaseOperations {
    /**
    * Returns information about a dropped Azure SQL Database that can be
    * restored.
    *
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the database was hosted.
    * @param entityId Required. The entity ID of the restorable dropped Azure
    * SQL Database to be obtained.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return Contains the response to the Get Restorable Dropped Database
    * request.
    */
    RestorableDroppedDatabaseGetResponse get(String serverName, String entityId) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * Returns information about a dropped Azure SQL Database that can be
    * restored.
    *
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the database was hosted.
    * @param entityId Required. The entity ID of the restorable dropped Azure
    * SQL Database to be obtained.
    * @return Contains the response to the Get Restorable Dropped Database
    * request.
    */
    Future<RestorableDroppedDatabaseGetResponse> getAsync(String serverName, String entityId);
    
    /**
    * Returns a collection of databases that has been dropped but can still be
    * restored from a specified server.
    *
    * @param serverName Required. The name of the Azure SQL Database Server to
    * query for dropped databases that can still be restored.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return Contains the response to the List Restorable Dropped Databases
    * request.
    */
    RestorableDroppedDatabaseListResponse list(String serverName) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * Returns a collection of databases that has been dropped but can still be
    * restored from a specified server.
    *
    * @param serverName Required. The name of the Azure SQL Database Server to
    * query for dropped databases that can still be restored.
    * @return Contains the response to the List Restorable Dropped Databases
    * request.
    */
    Future<RestorableDroppedDatabaseListResponse> listAsync(String serverName);
}
