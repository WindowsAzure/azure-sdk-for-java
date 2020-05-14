package com.azure.storage.blob.specialized

import com.azure.storage.blob.APISpec
import com.azure.storage.blob.BlobClient
import com.azure.storage.blob.models.*
import com.azure.storage.common.ErrorReceiver
import com.azure.storage.common.ProgressReceiver
import com.azure.storage.common.implementation.Constants
import reactor.core.Exceptions
import spock.lang.Requires
import spock.lang.Unroll

class BlobBaseAPITest extends APISpec {

    BlobClient bc
    String blobName

    def setup() {
        blobName = generateBlobName()
        bc = cc.getBlobClient(blobName)
        bc.upload(new ByteArrayInputStream(new byte[0]), 0)
    }

    /* Quick Query Tests. */

    // Generates and uploads a CSV file
    def uploadCsv(BlobQueryDelimitedSerialization s, int numCopies) {
        String header = String.join(new String(s.getColumnSeparator()), "rn1", "rn2", "rn3", "rn4")
            .concat(new String(s.getRecordSeparator()))
        byte[] headers = header.getBytes()

        String csv = String.join(new String(s.getColumnSeparator()), "100", "200", "300", "400")
            .concat(new String(s.getRecordSeparator()))
            .concat(String.join(new String(s.getColumnSeparator()), "300", "400", "500", "600")
                .concat(new String(s.getRecordSeparator())))

        byte[] csvData = csv.getBytes()

        int headerLength = s.isHeadersPresent() ? headers.length : 0
        byte[] data = new byte[headerLength + csvData.length * numCopies]
        if (s.isHeadersPresent()) {
            System.arraycopy(headers, 0, data, 0, headers.length)
        }

        for (int i = 0; i < numCopies; i++) {
            int o = i * csvData.length + headerLength;
            System.arraycopy(csvData, 0, data, o, csvData.length)
        }

        InputStream inputStream = new ByteArrayInputStream(data)

        bc.upload(inputStream, data.length, true)
    }

    def uploadSmallJson(int numCopies) {
        StringBuilder b = new StringBuilder()
        b.append('{\n')
        for(int i = 0; i < numCopies; i++) {
            b.append(String.format('\t"name%d": "owner%d",\n', i, i))
        }
        b.append('}')

        InputStream inputStream = new ByteArrayInputStream(b.toString().getBytes())

        bc.upload(inputStream, b.length(), true)
    }

    byte[] readFromInputStream(InputStream stream, int numBytesToRead) {
        byte[] queryData = new byte[numBytesToRead]

        def totalRead = 0
        def bytesRead = 0
        def length = numBytesToRead

        while (bytesRead != -1 && totalRead < numBytesToRead) {
            bytesRead = stream.read(queryData, totalRead, length)
            if (bytesRead != -1) {
                totalRead += bytesRead
                length -= bytesRead
            }
        }

        stream.close()
        return queryData
    }

    @Unroll
    def "Query min"() {
        setup:
        BlobQueryDelimitedSerialization ser = new BlobQueryDelimitedSerialization()
            .setRecordSeparator('\n' as char)
            .setColumnSeparator(',' as char)
            .setEscapeChar('\0' as char)
            .setFieldQuote('\0' as char)
            .setHeadersPresent(false)
        uploadCsv(ser, numCopies)
        def expression = "SELECT * from BlobStorage"

        ByteArrayOutputStream downloadData = new ByteArrayOutputStream()
        bc.download(downloadData)
        byte[] downloadedData = downloadData.toByteArray()

        /* Input Stream. */
        when:
        InputStream qqStream = bc.openQueryInputStream(expression)
        byte[] queryData = readFromInputStream(qqStream, downloadedData.length)

        then:
        notThrown(IOException)
        for (int j = 0; j < downloadedData.length; j++) {
            assert queryData[j] == downloadedData[j]
        }

        /* Output Stream. */
        when:
        OutputStream os = new ByteArrayOutputStream()
        bc.query(os, expression)
        byte[] osData = os.toByteArray()

        then:
        notThrown(BlobStorageException)
        for (int j = 0; j < downloadedData.length; j++) {
            assert osData[j] == downloadedData[j]
        }

        // To calculate the size of data being tested = numCopies * 32 bytes
        where:
        numCopies | _
        1         | _ // 32 bytes
        32        | _ // 1 KB
        256       | _ // 8 KB
        400       | _ // 12 ish KB
        4000      | _ // 125 KB
    }

    /* Note: Input delimited tested everywhere else. */
    @Unroll
    def "Query Input json"() {
        setup:
        BlobQueryJsonSerialization ser = new BlobQueryJsonSerialization()
            .setRecordSeparator(recordSeparator as char)
        uploadSmallJson(numCopies)
        def expression = "SELECT * from BlobStorage"

        ByteArrayOutputStream downloadData = new ByteArrayOutputStream()
        bc.download(downloadData)
        byte[] downloadedData = downloadData.toByteArray()
        BlobQueryOptions options = new BlobQueryOptions().setInputSerialization(ser).setOutputSerialization(ser)

        /* Input Stream. */
        when:
        InputStream qqStream = bc.openQueryInputStream(expression, options)
        byte[] queryData = readFromInputStream(qqStream, downloadedData.length)

        then:
        notThrown(IOException)
        for (int j = 0; j < downloadedData.length; j++) {
            assert queryData[j] == downloadedData[j]
        }

        /* Output Stream. */
        when:
        OutputStream os = new ByteArrayOutputStream()
        bc.queryWithResponse(os, expression, options, null, null)
        byte[] osData = os.toByteArray()

        then:
        notThrown(BlobStorageException)
        for (int j = 0; j < downloadedData.length; j++) {
            assert osData[j] == downloadedData[j]
        }

        where:
        numCopies | recordSeparator || _
        0         | '\n'            || _
        10        | '\n'            || _
        100       | '\n'            || _
        1000      | '\n'            || _
    }

    def "Query Input csv Output json"() {
        setup:
        BlobQueryDelimitedSerialization inSer = new BlobQueryDelimitedSerialization()
            .setRecordSeparator('\n' as char)
            .setColumnSeparator(',' as char)
            .setEscapeChar('\0' as char)
            .setFieldQuote('\0' as char)
            .setHeadersPresent(false)
        uploadCsv(inSer, 1)
        BlobQueryJsonSerialization outSer = new BlobQueryJsonSerialization()
            .setRecordSeparator('\n' as char)
        def expression = "SELECT * from BlobStorage"
        byte[] expectedData = "{\"_1\":\"100\",\"_2\":\"200\",\"_3\":\"300\",\"_4\":\"400\"}".getBytes()
        BlobQueryOptions options = new BlobQueryOptions().setInputSerialization(inSer).setOutputSerialization(outSer)

        /* Input Stream. */
        when:
        InputStream qqStream = bc.openQueryInputStream(expression, options)
        byte[] queryData = readFromInputStream(qqStream, expectedData.length)

        then:
        notThrown(IOException)
        for (int j = 0; j < expectedData.length; j++) {
            assert queryData[j] == expectedData[j]
        }

        /* Output Stream. */
        when:
        OutputStream os = new ByteArrayOutputStream()
        bc.queryWithResponse(os, expression, options, null, null)
        byte[] osData = os.toByteArray()

        then:
        notThrown(BlobStorageException)
        for (int j = 0; j < expectedData.length; j++) {
            assert osData[j] == expectedData[j]
        }
    }

    def "Query Input json Output csv"() {
        setup:
        BlobQueryJsonSerialization inSer = new BlobQueryJsonSerialization()
            .setRecordSeparator('\n' as char)
        uploadSmallJson(2)
        BlobQueryDelimitedSerialization outSer = new BlobQueryDelimitedSerialization()
            .setRecordSeparator('\n' as char)
            .setColumnSeparator(',' as char)
            .setEscapeChar('\0' as char)
            .setFieldQuote('\0' as char)
            .setHeadersPresent(false)
        def expression = "SELECT * from BlobStorage"
        byte[] expectedData = "owner0,owner1\n".getBytes()
        BlobQueryOptions options = new BlobQueryOptions().setInputSerialization(inSer).setOutputSerialization(outSer)

        /* Input Stream. */
        when:
        InputStream qqStream = bc.openQueryInputStream(expression, options)
        byte[] queryData = readFromInputStream(qqStream, expectedData.length)

        then:
        notThrown(IOException)
        for (int j = 0; j < expectedData.length; j++) {
            assert queryData[j] == expectedData[j]
        }

        /* Output Stream. */
        when:
        OutputStream os = new ByteArrayOutputStream()
        bc.queryWithResponse(os, expression, options, null, null)
        byte[] osData = os.toByteArray()

        then:
        notThrown(BlobStorageException)
        for (int j = 0; j < expectedData.length; j++) {
            assert osData[j] == expectedData[j]
        }
    }

    def "Query non fatal error"() {
        setup:
        BlobQueryDelimitedSerialization base = new BlobQueryDelimitedSerialization()
            .setRecordSeparator('\n' as char)
            .setEscapeChar('\0' as char)
            .setFieldQuote('\0' as char)
            .setHeadersPresent(false)
        uploadCsv(base.setColumnSeparator('.' as char), 32)
        MockErrorReceiver receiver = new MockErrorReceiver("InvalidColumnOrdinal")
        def expression = "SELECT _1 from BlobStorage WHERE _2 > 250"
        BlobQueryOptions options = new BlobQueryOptions()
            .setInputSerialization(base.setColumnSeparator(',' as char))
            .setOutputSerialization(base.setColumnSeparator(',' as char))
            .setErrorReceiver(receiver)

        /* Input Stream. */
        when:
        InputStream qqStream = bc.openQueryInputStream(expression, options)
        readFromInputStream(qqStream, Constants.KB)

        then:
        receiver.numErrors > 0
        notThrown(IOException)

        /* Output Stream. */
        when:
        receiver = new MockErrorReceiver("InvalidColumnOrdinal")
        options = new BlobQueryOptions()
            .setInputSerialization(base.setColumnSeparator(',' as char))
            .setOutputSerialization(base.setColumnSeparator(',' as char))
            .setErrorReceiver(receiver)
        bc.queryWithResponse(new ByteArrayOutputStream(), expression, options, null, null)

        then:
        notThrown(IOException)
        receiver.numErrors > 0
    }

    def "Query fatal error"() {
        setup:
        BlobQueryDelimitedSerialization base = new BlobQueryDelimitedSerialization()
            .setRecordSeparator('\n' as char)
            .setEscapeChar('\0' as char)
            .setFieldQuote('\0' as char)
            .setHeadersPresent(true)
        uploadCsv(base.setColumnSeparator('.' as char), 32)
        def expression = "SELECT * from BlobStorage"
        BlobQueryOptions options = new BlobQueryOptions()
            .setInputSerialization(new BlobQueryJsonSerialization())

        /* Input Stream. */
        when:
        InputStream qqStream = bc.openQueryInputStream(expression, options)
        readFromInputStream(qqStream, Constants.KB)

        then:
        thrown(Throwable)

        /* Output Stream. */
        when:
        bc.queryWithResponse(new ByteArrayOutputStream(), expression, options, null, null)

        then:
        thrown(Exceptions.ReactiveException)
    }

    def "Query progress receiver"() {
        setup:
        BlobQueryDelimitedSerialization base = new BlobQueryDelimitedSerialization()
            .setRecordSeparator('\n' as char)
            .setEscapeChar('\0' as char)
            .setFieldQuote('\0' as char)
            .setHeadersPresent(false)

        uploadCsv(base.setColumnSeparator('.' as char), 32)

        def mockReceiver = new MockProgressReceiver()
        def sizeofBlobToRead = bc.getProperties().getBlobSize()
        def expression = "SELECT * from BlobStorage"
        BlobQueryOptions options = new BlobQueryOptions()
            .setProgressReceiver(mockReceiver as ProgressReceiver)

        /* Input Stream. */
        when:
        InputStream qqStream = bc.openQueryInputStream(expression, options)

        /* The QQ Avro stream has the following pattern
           n * (data record -> progress record) -> end record */
        // 1KB of data will only come back as a single data record.
        /* Pretend to read more data because the input stream will not parse records following the data record if it
         doesn't need to. */
        readFromInputStream(qqStream, Constants.MB)

        then:
        // At least the size of blob to read will be in the progress list
        mockReceiver.progressList.contains(sizeofBlobToRead)

        /* Output Stream. */
        when:
        mockReceiver = new MockProgressReceiver()
        options = new BlobQueryOptions()
            .setProgressReceiver(mockReceiver as ProgressReceiver)
        bc.queryWithResponse(new ByteArrayOutputStream(), expression, options, null, null)

        then:
        mockReceiver.progressList.contains(sizeofBlobToRead)
    }

    @Requires( { liveMode() } ) // Large amount of data.
    def "Query multiple records with progress receiver"() {
        setup:
        BlobQueryDelimitedSerialization ser = new BlobQueryDelimitedSerialization()
            .setRecordSeparator('\n' as char)
            .setColumnSeparator(',' as char)
            .setEscapeChar('\0' as char)
            .setFieldQuote('\0' as char)
            .setHeadersPresent(false)
        uploadCsv(ser, 512000)

        def mockReceiver = new MockProgressReceiver()
        def expression = "SELECT * from BlobStorage"
        BlobQueryOptions options = new BlobQueryOptions()
            .setProgressReceiver(mockReceiver as ProgressReceiver)

        /* Input Stream. */
        when:
        InputStream qqStream = bc.openQueryInputStream(expression, options)

        /* The Avro stream has the following pattern
           n * (data record -> progress record) -> end record */
        // 1KB of data will only come back as a single data record.
        /* Pretend to read more data because the input stream will not parse records following the data record if it
         doesn't need to. */
        readFromInputStream(qqStream, 16 * Constants.MB)

        then:
        long temp = 0
        // Make sure theyre all increasingly bigger
        for (long progress : mockReceiver.progressList) {
            assert progress >= temp
            temp = progress
        }

        /* Output Stream. */
        when:
        mockReceiver = new MockProgressReceiver()
        temp = 0
        options = new BlobQueryOptions()
            .setProgressReceiver(mockReceiver as ProgressReceiver)
        bc.queryWithResponse(new ByteArrayOutputStream(), expression, options, null, null)

        then:
        // Make sure theyre all increasingly bigger
        for (long progress : mockReceiver.progressList) {
            assert progress >= temp
            temp = progress
        }
    }

    class MockProgressReceiver implements ProgressReceiver {

        List<Long> progressList

        MockProgressReceiver() {
            this.progressList = new ArrayList<>()
        }

        @Override
        void reportProgress(long bytesRead) {
            progressList.add(bytesRead)
        }
    }

    class MockErrorReceiver implements ErrorReceiver<BlobQueryError> {

        String expectedType
        int numErrors

        MockErrorReceiver(String expectedType) {
            this.expectedType = expectedType
            this.numErrors = 0
        }

        @Override
        void reportError(BlobQueryError nonFatalError) {
            assert !nonFatalError.isFatal()
            assert nonFatalError.getName() == expectedType
            numErrors++
        }
    }

    def "Query snapshot"() {
        setup:
        BlobQueryDelimitedSerialization ser = new BlobQueryDelimitedSerialization()
            .setRecordSeparator('\n' as char)
            .setColumnSeparator(',' as char)
            .setEscapeChar('\0' as char)
            .setFieldQuote('\0' as char)
            .setHeadersPresent(false)
        uploadCsv(ser, 32)
        def expression = "SELECT * from BlobStorage"

        /* Create snapshot of blob. */
        def snapshotClient = bc.createSnapshot()
        bc.upload(new ByteArrayInputStream(new byte[0]), 0, true) /* Make the blob empty. */

        ByteArrayOutputStream downloadData = new ByteArrayOutputStream()
        snapshotClient.download(downloadData)
        byte[] downloadedData = downloadData.toByteArray()

        /* Input Stream. */
        when:
        InputStream qqStream = snapshotClient.openQueryInputStream(expression)
        byte[] queryData = readFromInputStream(qqStream, downloadedData.length)

        then:
        notThrown(IOException)
        for (int j = 0; j < downloadedData.length; j++) {
            assert queryData[j] == downloadedData[j]
        }

        /* Output Stream. */
        when:
        OutputStream os = new ByteArrayOutputStream()
        snapshotClient.query(os, expression)
        byte[] osData = os.toByteArray()

        then:
        notThrown(BlobStorageException)
        for (int j = 0; j < downloadedData.length; j++) {
            assert osData[j] == downloadedData[j]
        }
    }

    class RandomOtherSerialization extends BlobQuerySerialization {
        @Override
        public RandomOtherSerialization setRecordSeparator(char recordSeparator) {
            this.recordSeparator = recordSeparator;
            return this;
        }
    }

    @Unroll
    def "Query input output IA"() {
        setup:
        /* Mock random impl of QQ Serialization*/
        BlobQuerySerialization ser = new RandomOtherSerialization()
        def inSer = input ? ser : null
        def outSer = output ? ser : null
        def expression = "SELECT * from BlobStorage"
        BlobQueryOptions options = new BlobQueryOptions()
            .setInputSerialization(inSer)
            .setOutputSerialization(outSer)

        when:
        InputStream stream = bc.openQueryInputStream(expression, options)
        stream.read()
        stream.close()

        then:
        def e = thrown(IOException)
        assert e.getCause() instanceof IllegalArgumentException

        when:
        bc.queryWithResponse(new ByteArrayOutputStream(), expression, options, null, null)

        then:
        thrown(IllegalArgumentException)

        where:
        input   | output   || _
        true    | false    || _
        false   | true     || _
    }

    @Unroll
    def "Query AC"() {
        setup:
        match = setupBlobMatchCondition(bc, match)
        leaseID = setupBlobLeaseCondition(bc, leaseID)
        def bac = new BlobRequestConditions()
            .setLeaseId(leaseID)
            .setIfMatch(match)
            .setIfNoneMatch(noneMatch)
            .setIfModifiedSince(modified)
            .setIfUnmodifiedSince(unmodified)
        def expression = "SELECT * from BlobStorage"
        BlobQueryOptions options = new BlobQueryOptions()
            .setRequestConditions(bac)

        when:
        InputStream stream = bc.openQueryInputStream(expression, options)
        stream.read()
        stream.close()

        then:
        notThrown(BlobStorageException)

        when:
        bc.queryWithResponse(new ByteArrayOutputStream(), expression, options,null, null)

        then:
        notThrown(BlobStorageException)

        where:
        modified | unmodified | match        | noneMatch   | leaseID
        null     | null       | null         | null        | null
        oldDate  | null       | null         | null        | null
        null     | newDate    | null         | null        | null
        null     | null       | receivedEtag | null        | null
        null     | null       | null         | garbageEtag | null
        null     | null       | null         | null        | receivedLeaseID
    }

    @Unroll
    def "Query AC fail"() {
        setup:
        setupBlobLeaseCondition(bc, leaseID)
        def bac = new BlobRequestConditions()
            .setLeaseId(leaseID)
            .setIfMatch(match)
            .setIfNoneMatch(setupBlobMatchCondition(bc, noneMatch))
            .setIfModifiedSince(modified)
            .setIfUnmodifiedSince(unmodified)
        def expression = "SELECT * from BlobStorage"
        BlobQueryOptions options = new BlobQueryOptions()
            .setRequestConditions(bac)

        when:
        InputStream stream = bc.openQueryInputStream(expression, options)
        stream.read()
        stream.close()

        then:
        def e = thrown(IOException)
        assert e.getCause() instanceof BlobStorageException

        when:
        bc.queryWithResponse(new ByteArrayOutputStream(), expression, options, null, null)

        then:
        thrown(BlobStorageException)

        where:
        modified | unmodified | match       | noneMatch    | leaseID
        newDate  | null       | null        | null         | null
        null     | oldDate    | null        | null         | null
        null     | null       | garbageEtag | null         | null
        null     | null       | null        | receivedEtag | null
        null     | null       | null        | null         | garbageLeaseID
    }
}
