package com.microsoft.azure.v3;

import com.microsoft.rest.v3.InvalidReturnTypeException;
import com.microsoft.rest.v3.http.ContentType;
import com.microsoft.rest.v3.RestException;
import com.microsoft.rest.v3.RestResponseBase;
import com.microsoft.rest.v3.http.HttpPipeline;
import com.microsoft.rest.v3.http.HttpPipelineOptions;
import com.microsoft.rest.v3.serializer.SerializerAdapter;
import com.microsoft.rest.v3.serializer.jackson.JacksonAdapter;
import com.microsoft.rest.v3.annotations.BodyParam;
import com.microsoft.rest.v3.annotations.DELETE;
import com.microsoft.rest.v3.annotations.ExpectedResponses;
import com.microsoft.rest.v3.annotations.GET;
import com.microsoft.rest.v3.annotations.HEAD;
import com.microsoft.rest.v3.annotations.HeaderParam;
import com.microsoft.rest.v3.annotations.Headers;
import com.microsoft.rest.v3.annotations.Host;
import com.microsoft.rest.v3.annotations.HostParam;
import com.microsoft.rest.v3.annotations.PATCH;
import com.microsoft.rest.v3.annotations.POST;
import com.microsoft.rest.v3.annotations.PUT;
import com.microsoft.rest.v3.annotations.PathParam;
import com.microsoft.rest.v3.annotations.QueryParam;
import com.microsoft.rest.v3.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v3.http.HttpClient;
import com.microsoft.rest.v3.http.HttpHeaders;
import org.junit.Assert;
import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.LinkedHashMap;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public abstract class AzureProxyToRestProxyTests {
    /**
     * Get the HTTP client that will be used for each test. This will be called once per test.
     * @return The HTTP client to use for each test.
     */
    protected abstract HttpClient createHttpClient();

    @Host("http://httpbin.org")
    private interface Service1 {
        @GET("bytes/100")
        @ExpectedResponses({200})
        byte[] getByteArray();

        @GET("bytes/100")
        @ExpectedResponses({200})
        Mono<byte[]> getByteArrayAsync();

        @GET("bytes/100")
        Mono<byte[]> getByteArrayAsyncWithNoExpectedResponses();
    }

    @Test
    public void SyncRequestWithByteArrayReturnType() {
        final byte[] result = createService(Service1.class)
                .getByteArray();
        assertNotNull(result);
        assertEquals(result.length, 100);
    }

    @Test
    public void AsyncRequestWithByteArrayReturnType() {
        final byte[] result = createService(Service1.class)
                .getByteArrayAsync()
                .block();
        assertNotNull(result);
        assertEquals(result.length, 100);
    }

    @Test
    public void getByteArrayAsyncWithNoExpectedResponses() {
        final byte[] result = createService(Service1.class)
                .getByteArrayAsyncWithNoExpectedResponses()
                .block();
        assertNotNull(result);
        assertEquals(result.length, 100);
    }

    @Host("http://{hostName}.org")
    private interface Service2 {
        @GET("bytes/{numberOfBytes}")
        @ExpectedResponses({200})
        byte[] getByteArray(@HostParam("hostName") String host, @PathParam("numberOfBytes") int numberOfBytes);

        @GET("bytes/{numberOfBytes}")
        @ExpectedResponses({200})
        Mono<byte[]> getByteArrayAsync(@HostParam("hostName") String host, @PathParam("numberOfBytes") int numberOfBytes);
    }

    @Test
    public void SyncRequestWithByteArrayReturnTypeAndParameterizedHostAndPath() {
        final byte[] result = createService(Service2.class)
                .getByteArray("httpbin", 50);
        assertNotNull(result);
        assertEquals(result.length, 50);
    }

    @Test
    public void AsyncRequestWithByteArrayReturnTypeAndParameterizedHostAndPath() {
        final byte[] result = createService(Service2.class)
                .getByteArrayAsync("httpbin", 50)
                .block();
        assertNotNull(result);
        assertEquals(result.length, 50);
    }

    @Host("http://httpbin.org")
    private interface Service3 {
        @GET("bytes/2")
        @ExpectedResponses({200})
        void getNothing();

        @GET("bytes/2")
        @ExpectedResponses({200})
        Mono<Void> getNothingAsync();
    }

    @Test
    public void SyncGetRequestWithNoReturn() {
        createService(Service3.class).getNothing();
    }

    @Test
    public void AsyncGetRequestWithNoReturn() {
        createService(Service3.class)
                .getNothingAsync()
                .block();
    }

    @Host("http://httpbin.org")
    private interface Service5 {
        @GET("anything")
        @ExpectedResponses({200})
        HttpBinJSON getAnything();

        @GET("anything/with+plus")
        @ExpectedResponses({200})
        HttpBinJSON getAnythingWithPlus();

        @GET("anything/{path}")
        @ExpectedResponses({200})
        HttpBinJSON getAnythingWithPathParam(@PathParam("path") String pathParam);

        @GET("anything/{path}")
        @ExpectedResponses({200})
        HttpBinJSON getAnythingWithEncodedPathParam(@PathParam(value="path", encoded=true) String pathParam);

        @GET("anything")
        @ExpectedResponses({200})
        Mono<HttpBinJSON> getAnythingAsync();
    }

    @Test
    public void SyncGetRequestWithAnything() {
        final HttpBinJSON json = createService(Service5.class)
                .getAnything();
        assertNotNull(json);
        assertMatchWithHttpOrHttps("httpbin.org/anything", json.url);
    }

    @Test
    public void SyncGetRequestWithAnythingWithPlus() {
        final HttpBinJSON json = createService(Service5.class)
                .getAnythingWithPlus();
        assertNotNull(json);
        assertMatchWithHttpOrHttps("httpbin.org/anything/with+plus", json.url);
    }

    @Test
    public void SyncGetRequestWithAnythingWithPathParam() {
        final HttpBinJSON json = createService(Service5.class)
                .getAnythingWithPathParam("withpathparam");
        assertNotNull(json);
        assertMatchWithHttpOrHttps("httpbin.org/anything/withpathparam", json.url);
    }

    @Test
    public void SyncGetRequestWithAnythingWithPathParamWithSpace() {
        final HttpBinJSON json = createService(Service5.class)
                .getAnythingWithPathParam("with path param");
        assertNotNull(json);
        assertMatchWithHttpOrHttps("httpbin.org/anything/with path param", json.url);
    }

    @Test
    public void SyncGetRequestWithAnythingWithPathParamWithPlus() {
        final HttpBinJSON json = createService(Service5.class)
                .getAnythingWithPathParam("with+path+param");
        assertNotNull(json);
        assertMatchWithHttpOrHttps("httpbin.org/anything/with+path+param", json.url);
    }

    @Test
    public void SyncGetRequestWithAnythingWithEncodedPathParam() {
        final HttpBinJSON json = createService(Service5.class)
                .getAnythingWithEncodedPathParam("withpathparam");
        assertNotNull(json);
        assertMatchWithHttpOrHttps("httpbin.org/anything/withpathparam", json.url);
    }

    @Test
    public void SyncGetRequestWithAnythingWithEncodedPathParamWithPercent20() {
        final HttpBinJSON json = createService(Service5.class)
                .getAnythingWithEncodedPathParam("with%20path%20param");
        assertNotNull(json);
        assertMatchWithHttpOrHttps("httpbin.org/anything/with path param", json.url);
    }

    @Test
    public void SyncGetRequestWithAnythingWithEncodedPathParamWithPlus() {
        final HttpBinJSON json = createService(Service5.class)
                .getAnythingWithEncodedPathParam("with+path+param");
        assertNotNull(json);
        assertMatchWithHttpOrHttps("httpbin.org/anything/with+path+param", json.url);
    }

    @Test
    public void AsyncGetRequestWithAnything() {
        final HttpBinJSON json = createService(Service5.class)
                .getAnythingAsync()
                .block();
        assertNotNull(json);
        assertMatchWithHttpOrHttps("httpbin.org/anything", json.url);
    }

    @Host("http://httpbin.org")
    private interface Service6 {
        @GET("anything")
        @ExpectedResponses({200})
        HttpBinJSON getAnything(@QueryParam("a") String a, @QueryParam("b") int b);

        @GET("anything")
        @ExpectedResponses({200})
        HttpBinJSON getAnythingWithEncoded(@QueryParam(value="a", encoded=true) String a, @QueryParam("b") int b);

        @GET("anything")
        @ExpectedResponses({200})
        Mono<HttpBinJSON> getAnythingAsync(@QueryParam("a") String a, @QueryParam("b") int b);
    }

    @Test
    public void SyncGetRequestWithQueryParametersAndAnything() {
        final HttpBinJSON json = createService(Service6.class)
                .getAnything("A", 15);
        assertNotNull(json);
        assertMatchWithHttpOrHttps("httpbin.org/anything?a=A&b=15", json.url);
    }

    @Test
    public void SyncGetRequestWithQueryParametersAndAnythingWithPercent20() {
        final HttpBinJSON json = createService(Service6.class)
                .getAnything("A%20Z", 15);
        assertNotNull(json);
        assertMatchWithHttpOrHttps("httpbin.org/anything?a=A%2520Z&b=15", json.url);
    }

    @Test
    public void SyncGetRequestWithQueryParametersAndAnythingWithEncodedWithPercent20() {
        final HttpBinJSON json = createService(Service6.class)
                .getAnythingWithEncoded("x%20y", 15);
        assertNotNull(json);
        assertMatchWithHttpOrHttps("httpbin.org/anything?a=x y&b=15", json.url);
    }

    @Test
    public void AsyncGetRequestWithQueryParametersAndAnything() {
        final HttpBinJSON json = createService(Service6.class)
                .getAnythingAsync("A", 15)
                .block();
        assertNotNull(json);
        assertMatchWithHttpOrHttps("httpbin.org/anything?a=A&b=15", json.url);
    }

    @Host("http://httpbin.org")
    private interface Service7 {
        @GET("anything")
        @ExpectedResponses({200})
        HttpBinJSON getAnything(@HeaderParam("a") String a, @HeaderParam("b") int b);

        @GET("anything")
        @ExpectedResponses({200})
        Mono<HttpBinJSON> getAnythingAsync(@HeaderParam("a") String a, @HeaderParam("b") int b);
    }

    @Test
    public void SyncGetRequestWithHeaderParametersAndAnythingReturn() {
        final HttpBinJSON json = createService(Service7.class)
                .getAnything("A", 15);
        assertNotNull(json);
        assertMatchWithHttpOrHttps("httpbin.org/anything", json.url);
        assertNotNull(json.headers);
        final HttpHeaders headers = new HttpHeaders(json.headers);
        assertEquals("A", headers.value("A"));
        assertArrayEquals(new String[]{"A"}, headers.values("A"));
        assertEquals("15", headers.value("B"));
        assertArrayEquals(new String[]{"15"}, headers.values("B"));
    }

    @Test
    public void AsyncGetRequestWithHeaderParametersAndAnything() {
        final HttpBinJSON json = createService(Service7.class)
                .getAnythingAsync("A", 15)
                .block();
        assertNotNull(json);
        assertMatchWithHttpOrHttps("httpbin.org/anything", json.url);
        assertNotNull(json.headers);
        final HttpHeaders headers = new HttpHeaders(json.headers);
        assertEquals("A", headers.value("A"));
        assertArrayEquals(new String[]{"A"}, headers.values("A"));
        assertEquals("15", headers.value("B"));
        assertArrayEquals(new String[]{"15"}, headers.values("B"));
    }

    @Host("http://httpbin.org")
    private interface Service8 {
        @POST("post")
        @ExpectedResponses({200})
        HttpBinJSON post(@BodyParam(ContentType.APPLICATION_OCTET_STREAM) String postBody);

        @POST("post")
        @ExpectedResponses({200})
        Mono<HttpBinJSON> postAsync(@BodyParam(ContentType.APPLICATION_OCTET_STREAM) String postBody);
    }

    @Test
    public void SyncPostRequestWithStringBody() {
        final HttpBinJSON json = createService(Service8.class)
                .post("I'm a post body!");
        assertEquals(String.class, json.data.getClass());
        assertEquals("I'm a post body!", (String)json.data);
    }

    @Test
    public void AsyncPostRequestWithStringBody() {
        final HttpBinJSON json = createService(Service8.class)
                .postAsync("I'm a post body!")
                .block();
        assertEquals(String.class, json.data.getClass());
        assertEquals("I'm a post body!", (String)json.data);
    }

    @Host("http://httpbin.org")
    private interface Service9 {
        @PUT("put")
        @ExpectedResponses({200})
        HttpBinJSON put(@BodyParam(ContentType.APPLICATION_OCTET_STREAM) int putBody);

        @PUT("put")
        @ExpectedResponses({200})
        Mono<HttpBinJSON> putAsync(@BodyParam(ContentType.APPLICATION_OCTET_STREAM) int putBody);

        @PUT("put")
        @ExpectedResponses({201})
        HttpBinJSON putWithUnexpectedResponse(@BodyParam(ContentType.APPLICATION_OCTET_STREAM) String putBody);

        @PUT("put")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(MyAzureException.class)
        HttpBinJSON putWithUnexpectedResponseAndExceptionType(@BodyParam(ContentType.APPLICATION_OCTET_STREAM) String putBody);
    }

    @Test
    public void SyncPutRequestWithIntBody() {
        final HttpBinJSON json = createService(Service9.class)
                .put(42);
        assertEquals(String.class, json.data.getClass());
        assertEquals("42", (String)json.data);
    }

    @Test
    public void AsyncPutRequestWithIntBody() {
        final HttpBinJSON json = createService(Service9.class)
                .putAsync(42)
                .block();
        assertEquals(String.class, json.data.getClass());
        assertEquals("42", (String)json.data);
    }

    @Test
    public void SyncPutRequestWithUnexpectedResponse() {
        try {
            createService(Service9.class)
                    .putWithUnexpectedResponse("I'm the body!");
            fail("Expected RestException would be thrown.");
        } catch (RestException e) {
            assertNotNull(e.body());
            assertTrue(e.body() instanceof LinkedHashMap);

            final LinkedHashMap<String,String> expectedBody = (LinkedHashMap<String, String>)e.body();
            assertEquals("I'm the body!", expectedBody.get("data"));
        }
    }

    @Test
    public void SyncPutRequestWithUnexpectedResponseAndExceptionType() {
        try {
            createService(Service9.class)
                    .putWithUnexpectedResponseAndExceptionType("I'm the body!");
            fail("Expected RestException would be thrown.");
        } catch (MyAzureException e) {
            assertNotNull(e.body());
            assertEquals("I'm the body!", e.body().data);
        } catch (Throwable e) {
            fail("Throwable of wrong type thrown.");
        }
    }

    @Host("http://httpbin.org")
    private interface Service10 {
        @HEAD("anything")
        @ExpectedResponses({200})
        RestResponseBase<Void, Void> restResponseHead();


        @HEAD("anything")
        @ExpectedResponses({200})
        void voidHead();

        @HEAD("anything")
        @ExpectedResponses({200})
        Mono<RestResponseBase<Void, Void>> restResponseHeadAsync();

        @HEAD("anything")
        @ExpectedResponses({200})
        Mono<Void> completableHeadAsync();
    }

    @Test
    public void SyncRestResponseHeadRequest() {
        RestResponseBase<?, ?> res = createService(Service10.class)
                .restResponseHead();
        assertNull(res.body());
    }

    @Test
    public void SyncVoidHeadRequest() {
        createService(Service10.class)
                .voidHead();
    }

    @Test
    public void AsyncRestResponseHeadRequest() {
        RestResponseBase<?, ?> res = createService(Service10.class)
                .restResponseHeadAsync()
                .block();

        assertNull(res.body());
    }

    @Test
    public void AsyncCompletableHeadRequest() {
        createService(Service10.class)
                .completableHeadAsync()
                .block();
    }

    @Host("http://httpbin.org")
    private interface Service11 {
        @DELETE("delete")
        @ExpectedResponses({200})
        HttpBinJSON delete(@BodyParam(ContentType.APPLICATION_JSON) boolean bodyBoolean);

        @DELETE("delete")
        @ExpectedResponses({200})
        Mono<HttpBinJSON> deleteAsync(@BodyParam(ContentType.APPLICATION_JSON) boolean bodyBoolean);
    }

    @Test
    public void SyncDeleteRequest() {
        final HttpBinJSON json = createService(Service11.class)
                .delete(false);
        assertEquals(String.class, json.data.getClass());
        assertEquals("false", (String)json.data);
    }

    @Test
    public void AsyncDeleteRequest() {
        final HttpBinJSON json = createService(Service11.class)
                .deleteAsync(false)
                .block();
        assertEquals(String.class, json.data.getClass());
        assertEquals("false", (String)json.data);
    }

    @Host("http://httpbin.org")
    private interface Service12 {
        @PATCH("patch")
        @ExpectedResponses({200})
        HttpBinJSON patch(@BodyParam(ContentType.APPLICATION_OCTET_STREAM) String bodyString);

        @PATCH("patch")
        @ExpectedResponses({200})
        Mono<HttpBinJSON> patchAsync(@BodyParam(ContentType.APPLICATION_OCTET_STREAM) String bodyString);
    }

    @Test
    public void SyncPatchRequest() {
        final HttpBinJSON json = createService(Service12.class)
                .patch("body-contents");
        assertEquals(String.class, json.data.getClass());
        assertEquals("body-contents", (String)json.data);
    }

    @Test
    public void AsyncPatchRequest() {
        final HttpBinJSON json = createService(Service12.class)
                .patchAsync("body-contents")
                .block();
        assertEquals(String.class, json.data.getClass());
        assertEquals("body-contents", (String)json.data);
    }

    @Host("http://httpbin.org")
    private interface Service13 {
        @GET("anything")
        @ExpectedResponses({200})
        @Headers({ "MyHeader:MyHeaderValue", "MyOtherHeader:My,Header,Value" })
        HttpBinJSON get();

        @GET("anything")
        @ExpectedResponses({200})
        @Headers({ "MyHeader:MyHeaderValue", "MyOtherHeader:My,Header,Value" })
        Mono<HttpBinJSON> getAsync();
    }

    @Test
    public void SyncHeadersRequest() {
        final HttpBinJSON json = createService(Service13.class)
                .get();
        assertNotNull(json);
        assertMatchWithHttpOrHttps("httpbin.org/anything", json.url);
        assertNotNull(json.headers);
        final HttpHeaders headers = new HttpHeaders(json.headers);
        assertEquals("MyHeaderValue", headers.value("MyHeader"));
        assertArrayEquals(new String[]{"MyHeaderValue"}, headers.values("MyHeader"));
        assertEquals("My,Header,Value", headers.value("MyOtherHeader"));
        assertArrayEquals(new String[]{"My", "Header", "Value"}, headers.values("MyOtherHeader"));
    }

    @Test
    public void AsyncHeadersRequest() {
        final HttpBinJSON json = createService(Service13.class)
                .getAsync()
                .block();
        assertNotNull(json);
        assertMatchWithHttpOrHttps("httpbin.org/anything", json.url);
        assertNotNull(json.headers);
        final HttpHeaders headers = new HttpHeaders(json.headers);
        assertEquals("MyHeaderValue", headers.value("MyHeader"));
        assertArrayEquals(new String[]{"MyHeaderValue"}, headers.values("MyHeader"));
    }

    @Host("https://httpbin.org")
    private interface Service14 {
        @GET("anything")
        @ExpectedResponses({200})
        @Headers({ "MyHeader:MyHeaderValue" })
        HttpBinJSON get();

        @GET("anything")
        @ExpectedResponses({200})
        @Headers({ "MyHeader:MyHeaderValue" })
        Mono<HttpBinJSON> getAsync();
    }

    @Test
    public void AsyncHttpsHeadersRequest() {
        final HttpBinJSON json = createService(Service14.class)
                .getAsync()
                .block();
        assertNotNull(json);
        assertMatchWithHttpOrHttps("httpbin.org/anything", json.url);
        assertNotNull(json.headers);
        final HttpHeaders headers = new HttpHeaders(json.headers);
        assertEquals("MyHeaderValue", headers.value("MyHeader"));
    }

    @Host("https://httpbin.org")
    private interface Service15 {
        @GET("anything")
        @ExpectedResponses({200})
        Flux<HttpBinJSON> get();
    }

    @Test
    public void service15Get() {
        final Service15 service = createService(Service15.class);
        try {
            service.get();
            fail("Expected exception.");
        }
        catch (InvalidReturnTypeException e) {
            assertContains(e.getMessage(), "reactor.core.publisher.Flux<com.microsoft.azure.v3.HttpBinJSON>");
            assertContains(e.getMessage(), "AzureProxyToRestProxyTests$Service15.get()");
        }
    }

    @Host("http://httpbin.org")
    private interface Service16 {
        @PUT("put")
        @ExpectedResponses({200})
        HttpBinJSON put(@BodyParam(ContentType.APPLICATION_OCTET_STREAM) byte[] putBody);

        @PUT("put")
        @ExpectedResponses({200})
        Mono<HttpBinJSON> putAsync(@BodyParam(ContentType.APPLICATION_OCTET_STREAM) byte[] putBody);
    }

    @Test
    public void service16Put() {
        final Service16 service = createService(Service16.class);
        final HttpBinJSON result = service.put(new byte[] { 0, 1, 2, 3, 4, 5 });
        assertNotNull(result);
        assertMatchWithHttpOrHttps("httpbin.org/put", result.url);
        assertTrue(result.data instanceof String);
        assertArrayEquals(new byte[] { 0, 1, 2, 3, 4, 5 }, ((String)result.data).getBytes());
    }

    @Test
    public void service16PutAsync() {
        final Service16 service = createService(Service16.class);
        final HttpBinJSON result = service.putAsync(new byte[] { 0, 1, 2, 3, 4, 5 })
                .block();
        assertNotNull(result);
        assertMatchWithHttpOrHttps("httpbin.org/put", result.url);
        assertTrue(result.data instanceof String);
        assertArrayEquals(new byte[] { 0, 1, 2, 3, 4, 5 }, ((String)result.data).getBytes());
    }

    @Host("http://{hostPart1}{hostPart2}.org")
    private interface Service17 {
        @GET("get")
        @ExpectedResponses({200})
        HttpBinJSON get(@HostParam("hostPart1") String hostPart1, @HostParam("hostPart2") String hostPart2);

        @GET("get")
        @ExpectedResponses({200})
        Mono<HttpBinJSON> getAsync(@HostParam("hostPart1") String hostPart1, @HostParam("hostPart2") String hostPart2);
    }

    @Test
    public void SyncRequestWithMultipleHostParams() {
        final Service17 service17 = createService(Service17.class);
        final HttpBinJSON result = service17.get("http", "bin");
        assertNotNull(result);
        assertMatchWithHttpOrHttps("httpbin.org/get", result.url);
    }

    @Test
    public void AsyncRequestWithMultipleHostParams() {
        final Service17 service17 = createService(Service17.class);
        final HttpBinJSON result = service17.getAsync("http", "bin").block();
        assertNotNull(result);
        assertMatchWithHttpOrHttps("httpbin.org/get", result.url);
    }

    @Host("https://httpbin.org")
    private interface Service18 {
        @GET("status/200")
        void getStatus200();

        @GET("status/200")
        @ExpectedResponses({200})
        void getStatus200WithExpectedResponse200();

        @GET("status/300")
        void getStatus300();

        @GET("status/300")
        @ExpectedResponses({300})
        void getStatus300WithExpectedResponse300();

        @GET("status/400")
        void getStatus400();

        @GET("status/400")
        @ExpectedResponses({400})
        void getStatus400WithExpectedResponse400();

        @GET("status/500")
        void getStatus500();

        @GET("status/500")
        @ExpectedResponses({500})
        void getStatus500WithExpectedResponse500();
    }

    @Test
    public void service18GetStatus200() {
        createService(Service18.class)
                .getStatus200();
    }

    @Test
    public void service18GetStatus200WithExpectedResponse200() {
        createService(Service18.class)
                .getStatus200WithExpectedResponse200();
    }

    @Test
    public void service18GetStatus300() {
        createService(Service18.class)
                .getStatus300();
    }

    @Test
    public void service18GetStatus300WithExpectedResponse300() {
        createService(Service18.class)
                .getStatus300WithExpectedResponse300();
    }

    @Test(expected = RestException.class)
    public void service18GetStatus400() {
        createService(Service18.class)
                .getStatus400();
    }

    @Test
    public void service18GetStatus400WithExpectedResponse400() {
        createService(Service18.class)
                .getStatus400WithExpectedResponse400();
    }

    @Test(expected = RestException.class)
    public void service18GetStatus500() {
        createService(Service18.class)
                .getStatus500();
    }

    @Test
    public void service18GetStatus500WithExpectedResponse500() {
        createService(Service18.class)
                .getStatus500WithExpectedResponse500();
    }

    private <T> T createService(Class<T> serviceClass) {
        HttpPipeline pipeline = new HttpPipeline(createHttpClient(),
                new HttpPipelineOptions(null));
        //
        return AzureProxy.create(serviceClass, null, pipeline, serializer);
    }

    private static void assertContains(String value, String expectedSubstring) {
        assertTrue("Expected \"" + value + "\" to contain \"" + expectedSubstring + "\".", value.contains(expectedSubstring));
    }

    private static void assertMatchWithHttpOrHttps(String url1, String url2) {
        final String s1 = "http://" + url1;
        if (s1.equalsIgnoreCase(url2)) {
            return;
        }
        final String s2 = "https://" + url1;
        if (s2.equalsIgnoreCase(url2)) {
            return;
        }
        Assert.assertTrue("'" + url2 + "' does not match with '" + s1 + "' or '" + s2 + "'." , false);
    }

    private static final SerializerAdapter serializer = new JacksonAdapter();
}
