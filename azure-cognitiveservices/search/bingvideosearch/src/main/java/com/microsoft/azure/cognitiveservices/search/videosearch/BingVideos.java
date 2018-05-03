/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.videosearch;

import com.microsoft.azure.cognitiveservices.search.videosearch.models.SearchOptionalParameter;
import com.microsoft.azure.cognitiveservices.search.videosearch.models.DetailsOptionalParameter;
import com.microsoft.azure.cognitiveservices.search.videosearch.models.TrendingOptionalParameter;
import com.microsoft.azure.cognitiveservices.search.videosearch.models.ErrorResponseException;
import com.microsoft.azure.cognitiveservices.search.videosearch.models.TrendingVideos;
import com.microsoft.azure.cognitiveservices.search.videosearch.models.VideoDetails;
import com.microsoft.azure.cognitiveservices.search.videosearch.models.VideosModel;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BingVideos.
 */
public interface BingVideos {
    /**
     * The Video Search API lets you send a search query to Bing and get back a list of videos that are relevant to
     *  the search query. This section provides technical details about the query parameters and headers that you
     *  use to request videos and the JSON response objects that contain them. For examples that show how to make
     *  requests, see [Searching the Web for
     *  Videos](https://docs.microsoft.com/azure/cognitive-services/bing-video-search/search-the-web).
     *
     * @param query The user's search query string. The query string cannot be empty. The query string may contain [Bing
     *  Advanced Operators](http://msdn.microsoft.com/library/ff795620.aspx). For example, to limit videos to a
     *  specific domain, use the [site:](http://msdn.microsoft.com/library/ff795613.aspx) operator. Use this
     *  parameter only with the Video Search API. Do not specify this parameter when calling the Trending Videos
     *  API.
     * @param searchOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VideosModel object if successful.
     */
    VideosModel search(String query, SearchOptionalParameter searchOptionalParameter);

    /**
     * The Video Search API lets you send a search query to Bing and get back a list of videos that are relevant to
     *  the search query. This section provides technical details about the query parameters and headers that you
     *  use to request videos and the JSON response objects that contain them. For examples that show how to make
     *  requests, see [Searching the Web for
     *  Videos](https://docs.microsoft.com/azure/cognitive-services/bing-video-search/search-the-web).
     *
     * @param query The user's search query string. The query string cannot be empty. The query string may contain [Bing
     *  Advanced Operators](http://msdn.microsoft.com/library/ff795620.aspx). For example, to limit videos to a
     *  specific domain, use the [site:](http://msdn.microsoft.com/library/ff795613.aspx) operator. Use this
     *  parameter only with the Video Search API. Do not specify this parameter when calling the Trending Videos
     *  API.
     * @param searchOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VideosModel object
     */
    Observable<VideosModel> searchAsync(String query, SearchOptionalParameter searchOptionalParameter);

    /**
     * The Video Detail Search API lets you search on Bing and get back insights about a video, such as related
     *  videos. This section provides technical details about the query parameters and headers that you use to
     *  request insights of videos and the JSON response objects that contain them. For examples that show how to
     *  make requests, see [Searching the Web for
     *  Videos](https://docs.microsoft.com/azure/cognitive-services/bing-video-search/search-the-web).
     *
     * @param query The user's search query string. The query string cannot be empty. The query string may contain [Bing
     *  Advanced Operators](http://msdn.microsoft.com/library/ff795620.aspx). For example, to limit videos to a
     *  specific domain, use the [site:](http://msdn.microsoft.com/library/ff795613.aspx) operator. Use this
     *  parameter only with the Video Search API. Do not specify this parameter when calling the Trending Videos
     *  API.
     * @param detailsOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VideoDetails object if successful.
     */
    VideoDetails details(String query, DetailsOptionalParameter detailsOptionalParameter);

    /**
     * The Video Detail Search API lets you search on Bing and get back insights about a video, such as related
     *  videos. This section provides technical details about the query parameters and headers that you use to
     *  request insights of videos and the JSON response objects that contain them. For examples that show how to
     *  make requests, see [Searching the Web for
     *  Videos](https://docs.microsoft.com/azure/cognitive-services/bing-video-search/search-the-web).
     *
     * @param query The user's search query string. The query string cannot be empty. The query string may contain [Bing
     *  Advanced Operators](http://msdn.microsoft.com/library/ff795620.aspx). For example, to limit videos to a
     *  specific domain, use the [site:](http://msdn.microsoft.com/library/ff795613.aspx) operator. Use this
     *  parameter only with the Video Search API. Do not specify this parameter when calling the Trending Videos
     *  API.
     * @param detailsOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VideoDetails object
     */
    Observable<VideoDetails> detailsAsync(String query, DetailsOptionalParameter detailsOptionalParameter);

    /**
     * The Video Trending Search API lets you search on Bing and get back a list of videos that are trending based
     *  on search requests made by others. The videos are broken out into different categories. For example, Top
     *  Music Videos. For a list of markets that support trending videos, see [Trending
     *  Videos](https://docs.microsoft.com/azure/cognitive-services/bing-video-search/trending-videos).
     *
     * @param trendingOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TrendingVideos object if successful.
     */
    TrendingVideos trending(TrendingOptionalParameter trendingOptionalParameter);

    /**
     * The Video Trending Search API lets you search on Bing and get back a list of videos that are trending based
     *  on search requests made by others. The videos are broken out into different categories. For example, Top
     *  Music Videos. For a list of markets that support trending videos, see [Trending
     *  Videos](https://docs.microsoft.com/azure/cognitive-services/bing-video-search/trending-videos).
     *
     * @param trendingOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TrendingVideos object
     */
    Observable<TrendingVideos> trendingAsync(TrendingOptionalParameter trendingOptionalParameter);

}
