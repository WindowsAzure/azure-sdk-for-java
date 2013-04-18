/**
 * Copyright Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.microsoft.windowsazure.services.media.implementation;

import java.util.Arrays;

import com.microsoft.windowsazure.services.blob.BlobContract;
import com.microsoft.windowsazure.services.blob.implementation.BlobOperationRestProxy;
import com.microsoft.windowsazure.services.blob.implementation.RFC1123DateConverter;
import com.microsoft.windowsazure.services.core.ServiceFilter;
import com.sun.jersey.api.client.Client;

/**
 * Rest proxy for blob operations that's specialized for working
 * with the blobs created by and for Media Services storage.
 * 
 */
class MediaBlobRestProxy extends BlobOperationRestProxy {
    private final SASTokenFilter tokenFilter;

    /**
     * Construct instance of MediaBlobRestProxy with given parameters.
     * 
     * @param channel
     *            Jersey Client object used to communicate with blob service
     * @param accountName
     *            Account name for blob storage
     * @param url
     *            URL for blob storage
     * @param tokenFilter
     *            filter used to add SAS tokens to requests.
     */
    public MediaBlobRestProxy(Client channel, String accountName, String url, SASTokenFilter tokenFilter) {
        super(channel, accountName, url);

        this.tokenFilter = tokenFilter;
        channel.addFilter(tokenFilter);
    }

    /**
     * Construct instance of MediaBlobRestProxy with given parameters.
     * 
     * @param channel
     *            Jersey Client object used to communicate with blob service
     * @param filters
     *            Additional ServiceFilters to manipulate requests and responses
     * @param accountName
     *            Account name for blob storage
     * @param url
     *            URL for blob storage
     * @param dateMapper
     *            date conversion helper object
     */
    public MediaBlobRestProxy(Client channel, ServiceFilter[] filters, String accountName, String url,
            SASTokenFilter tokenFilter, RFC1123DateConverter dateMapper) {
        super(channel, filters, accountName, url, dateMapper);

        this.tokenFilter = tokenFilter;
    }

    /* (non-Javadoc)
     * @see com.microsoft.windowsazure.services.blob.implementation.BlobOperationRestProxy#withFilter(com.microsoft.windowsazure.services.core.ServiceFilter)
     */
    @Override
    public BlobContract withFilter(ServiceFilter filter) {
        ServiceFilter[] currentFilters = getFilters();
        ServiceFilter[] newFilters = Arrays.copyOf(currentFilters, currentFilters.length + 1);
        newFilters[currentFilters.length] = filter;
        return new MediaBlobRestProxy(getChannel(), newFilters, getAccountName(), getUrl(), this.tokenFilter,
                getDateMapper());
    }
}
