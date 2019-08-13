// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.queue.spock

import com.azure.storage.queue.models.AccessPolicy
import com.azure.storage.queue.models.DequeuedMessage
import com.azure.storage.queue.models.SignedIdentifier
import com.azure.storage.queue.models.StorageErrorCode
import com.azure.storage.queue.models.StorageErrorException
import org.junit.Assert
import org.junit.Ignore
import reactor.test.StepVerifier
import spock.lang.Unroll

import java.time.Duration
import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.ZoneOffset

import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertFalse
import static org.junit.Assert.assertNull

class QueueAPITests extends APISpec {
    def queueClient

    static def testMetadata = Collections.singletonMap("metadata", "value")
    static def createMetadata = Collections.singletonMap("metadata1", "value")

    def setup() {
        primaryQueueServiceClient = queueServiceBuilderHelper(interceptorManager).buildClient()
        queueClient = primaryQueueServiceClient.getQueueClient(testResourceName.randomName("queue", 16))
    }

    def "Create queue with shared key from queue client"() {
        when:
        def createQueueResponse = queueClient.create()

        then:
        QueueTestHelper.assertResponseStatusCode(createQueueResponse, 201)
    }

    // TODO: Will implement the test after introduce the sas token generator
    @Ignore
    def "Create queue with sas token from queue client"() {

    }

    def "Create async queue with same metadata from queue client"() {
        when:
        def createQueueResponse1 = queueClient.create(testMetadata)
        def createQueueResponse2 = queueClient.create(testMetadata)
        then:
        QueueTestHelper.assertResponseStatusCode(createQueueResponse1, 201)
        QueueTestHelper.assertResponseStatusCode(createQueueResponse2, 204)
    }

    def "Create queue with diff metadata from queue client"() {
        when:
        def createQueueResponse1 = queueClient.create()
        queueClient.create(testMetadata)
        then:
        QueueTestHelper.assertResponseStatusCode(createQueueResponse1, 201)
        def e = thrown(StorageException)
        QueueTestHelper.assertExceptionStatusCodeAndMessage(e, 409, StorageErrorCode.QUEUE_ALREADY_EXISTS)

    }

    def "Delete exist queue from queue client"() {
        given:
        queueClient.create()
        when:
        def deleteQueueResponse = queueClient.delete()
        QueueTestHelper.sleepInRecordMode(Duration.ofSeconds(30));
        queueClient.enqueueMessage("This should fail")
        then:
        QueueTestHelper.assertResponseStatusCode(deleteQueueResponse, 204)
        def e = thrown(StorageErrorException)
        QueueTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.QUEUE_NOT_FOUND)

    }

    def "Delete not existing queue from queue client"() {
        when:
        queueClient.delete()
        then:
        def e = thrown(StorageErrorException)
        QueueTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.QUEUE_NOT_FOUND)
    }

    def "Get properties from queue client"() {
        given:
        queueClient.create(testMetadata)
        when:
        def getPropertiesResponse = queueClient.getProperties()
        then:
        QueueTestHelper.assertResponseStatusCode(getPropertiesResponse, 200)
        assertEquals(0, getPropertiesResponse.value().approximateMessagesCount())
        assertEquals(testMetadata, getPropertiesResponse.value().metadata())
    }

    def "Get properties does not exist from queue client"() {
        when:
        queueClient.getProperties()
        then:
        def e = thrown(StorageErrorException)
        QueueTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.QUEUE_NOT_FOUND)
    }

    @Unroll
    def "Set and clear metadata from queue client"() {
        given:
        queueClient.create(matadataInCreate)
        when:
        def getPropertiesResponseBefore = queueClient.getProperties()
        def setMetadataResponse = queueClient.setMetadata(metadataInSet)
        def getPropertiesResponseAfter = queueClient.getProperties()
        then:
        QueueTestHelper.assertResponseStatusCode(getPropertiesResponseBefore, 200)
        assertEquals(expectMetadataInCreate, getPropertiesResponseBefore.value().metadata())
        QueueTestHelper.assertResponseStatusCode(setMetadataResponse, 204)
        QueueTestHelper.assertResponseStatusCode(getPropertiesResponseAfter, 200)
        assertEquals(expectMetadataInSet, getPropertiesResponseAfter.value().metadata)
        where:
        matadataInCreate | metadataInSet | expectMetadataInCreate | expectMetadataInSet
        null             | testMetadata  | Collections.emptyMap() | testMetadata
        createMetadata   | testMetadata  | createMetadata         | testMetadata
        createMetadata   | null          | createMetadata         | Collections.emptyMap()
        testMetadata     | testMetadata  | testMetadata           | testMetadata
        null             | null          | Collections.emptyMap() | Collections.emptyMap()
    }

    def "Set metadata queue not exist from queue client"() {
        when:
        queueClient.setMetadata(testMetadata)
        then:
        def e = thrown(StorageErrorException)
        QueueTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.QUEUE_NOT_FOUND)
    }

    @Unroll
    def "Set invalid meta from queue client"() {
        given:
        def invalidMetadata = Collections.singletonMap(invalidKey, "value")
        queueClient.create()
        when:
        queueClient.setMetadata(invalidMetadata)
        then:
        def e = thrown(StorageErrorException)
        QueueTestHelper.assertExceptionStatusCodeAndMessage(e, statusCode, errMessage)
        where:
        invalidKey     | statusCode | errMessage
        "invalidMeta"  | 403        | StorageErrorCode.AUTHENTICATION_ERROR
        "invalid-meta" | 400        | StorageErrorCode.INVALID_METADATA
        "12345"        | 400        | StorageErrorCode.INVALID_METADATA
        ""             | 400        | StorageErrorCode.EMPTY_METADATA_KEY
    }

    def "Get access policy from queue client"() {
        given:
        queueClient.create()
        when:
        def accessPolicies = queueClient.getAccessPolicy()
        then:
        assertFalse(accessPolicies.iterator().hasNext());
    }

    def "Get access policy does not exist from queue client"() {
        when:
        queueClient.getAccessPolicy().iterator().next()
        then:
        def e = thrown(StorageErrorException)
        QueueTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.QUEUE_NOT_FOUND)
    }

    def "Set access policy from queue client"() {
        given:
        queueClient.create()
        def accessPolicy = new AccessPolicy()
            .permission("raup")
            .start(OffsetDateTime.of(LocalDateTime.of(2000, 1, 1, 0, 0), ZoneOffset.UTC))
            .expiry(OffsetDateTime.of(LocalDateTime.of(2020, 1, 1, 0, 0), ZoneOffset.UTC))
        def permission = new SignedIdentifier()
            .id("testpermission")
            .accessPolicy(accessPolicy)
        when:
        def setAccessPolicyResponse = queueClient.setAccessPolicy(Collections.singletonList(permission))
        def nextAccessPolicy = queueClient.getAccessPolicy().iterator().next()
        then:
        QueueTestHelper.assertResponseStatusCode(setAccessPolicyResponse, 204)
        QueueTestHelper.assertPermissionsAreEqual(permission, nextAccessPolicy)
    }

    def "Set access policy does not exist from queue client"() {
        given:
        def accessPolicy = new AccessPolicy()
            .permission("raup")
            .start(OffsetDateTime.of(LocalDateTime.of(2000, 1, 1, 0, 0), ZoneOffset.UTC))
            .expiry(OffsetDateTime.of(LocalDateTime.of(2020, 1, 1, 0, 0), ZoneOffset.UTC))
        def permission = new SignedIdentifier()
            .id("testpermission")
            .accessPolicy(accessPolicy)
        when:
        queueClient.setAccessPolicy(Collections.singletonList(permission))
        then:
        def e = thrown(StorageErrorException)
        QueueTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.QUEUE_NOT_FOUND)
    }

    def "Set invalid access policy from queue client"() {
        given:
        def accessPolicy = new AccessPolicy()
            .permission("r")
            .start(OffsetDateTime.of(LocalDateTime.of(2000, 1, 1, 0, 0), ZoneOffset.UTC))
            .expiry(OffsetDateTime.of(LocalDateTime.of(2020, 1, 1, 0, 0), ZoneOffset.UTC))

        def permission = new SignedIdentifier()
            .id("theidofthispermissionislongerthanwhatisallowedbytheserviceandshouldfail")
            .accessPolicy(accessPolicy)
        queueClient.create()
        when:
        queueClient.setAccessPolicy(Collections.singletonList(permission))
        then:
        def e = thrown(StorageErrorException)
        QueueTestHelper.assertExceptionStatusCodeAndMessage(e, 400, StorageErrorCode.INVALID_XML_DOCUMENT)
    }

    def "Set too many access policies from queue client"() {
        given:
        def accessPolicy = new AccessPolicy()
            .permission("r")
            .start(OffsetDateTime.of(LocalDateTime.of(2000, 1, 1, 0, 0), ZoneOffset.UTC))
            .expiry(OffsetDateTime.of(LocalDateTime.of(2020, 1, 1, 0, 0), ZoneOffset.UTC));

        def permissions = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            permissions.add(new SignedIdentifier()
                .id("policy" + i)
                .accessPolicy(accessPolicy));
        }
        queueClient.create()
        when:
        queueClient.setAccessPolicy(permissions)
        then:
        def e = thrown(StorageErrorException)
        QueueTestHelper.assertExceptionStatusCodeAndMessage(e, 400, StorageErrorCode.INVALID_XML_DOCUMENT)

    }

    def "Enqueue message from queue client"() {
        given:
        queueClient.create()
        def expectMsg = "test message"
        when:
        def enqueueMsgResponse = queueClient.enqueueMessage(expectMsg)
        def peekMsgIter = queueClient.peekMessages().iterator()
        then:
        QueueTestHelper.assertResponseStatusCode(enqueueMsgResponse, 201)
        assertEquals(expectMsg, peekMsgIter.next().messageText())
        assertFalse(peekMsgIter.hasNext())
    }

    def "Enqueue empty message from queue client" () {
        given:
        queueClient.create()
        def expectMsg = ""
        when:
        def enqueueMsgResponse = queueClient.enqueueMessage(expectMsg)
        def peekMsgIter = queueClient.peekMessages().iterator()
        then:
        QueueTestHelper.assertResponseStatusCode(enqueueMsgResponse, 201)
        assertNull(peekMsgIter.next().messageText())
        assertFalse(peekMsgIter.hasNext())
    }

    def "Enqueue short time to live from queue client"() {
        given:
        queueClient.create()
        when:
        def enqueueMsgResponse = queueClient.enqueueMessage("test message",
            Duration.ofSeconds(0), Duration.ofSeconds(2))
        QueueTestHelper.sleepInRecordMode(Duration.ofSeconds(5));
        def peekMsgResponse = queueClient.peekMessages()
        then:
        QueueTestHelper.assertResponseStatusCode(enqueueMsgResponse, 201)
        assertFalse(peekMsgResponse.iterator().hasNext())
    }

    def "Dequeue message from queue async client"() {
        given:
        queueClient.create()
        def expectMsg = "test message"
        queueClient.enqueueMessage(expectMsg)
        when:
        def dequeueMsgResponse = queueClient.dequeueMessages().iterator().next()
        then:
        Assert.assertEquals(expectMsg, dequeueMsgResponse.messageText())
    }

    def "Dequeue multiple messages from queue client"() {
        given:
        queueClient.create()
        def expectMsg1 = "test message 1"
        def expectMsg2 = "test message 2"
        queueClient.enqueueMessage(expectMsg1)
        queueClient.enqueueMessage(expectMsg2)
        when:
        def dequeueMsgIter = queueClient.dequeueMessages(2).iterator()
        then:
        assertEquals(expectMsg1, dequeueMsgIter.next().messageText())
        assertEquals(expectMsg2, dequeueMsgIter.next().messageText())
    }

    def "Dequeue too many message from queue client"() {
        given:
        queueClient.create()
        when:
        queueClient.dequeueMessages(33).iterator().next()
        then:
        def e = thrown(StorageErrorException)
        QueueTestHelper.assertExceptionStatusCodeAndMessage(e, 400, StorageErrorCode.OUT_OF_RANGE_QUERY_PARAMETER_VALUE)
    }

    def "Dequeue messages do not exist from queue client"() {
        when:
        queueClient.dequeueMessages().iterator().next()
        then:
        def e = thrown(StorageErrorException)
        QueueTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.QUEUE_NOT_FOUND)
    }

    def "Peek message from queue client"() {
        given:
        queueClient.create()
        def expectMsg = "test message"
        queueClient.enqueueMessage(expectMsg)
        when:
        def peekMsgIter = queueClient.peekMessages().iterator().next()
        then:
        assertEquals(expectMsg, peekMsgIter.messageText())
    }

    def "Peek multiple messages from queue client"() {
        given:
        queueClient.create()
        def expectMsg1 = "test message 1"
        def expectMsg2 = "test message 2"
        queueClient.enqueueMessage(expectMsg1)
        queueClient.enqueueMessage(expectMsg2)
        when:
        def peekMsgIter = queueClient.peekMessages(2).iterator()
        then:
        assertEquals(expectMsg1, peekMsgIter.next().messageText())
        assertEquals(expectMsg2, peekMsgIter.next().messageText())
        assertFalse(peekMsgIter.hasNext())
    }

    def "Peek too many message from queue client"() {
        given:
        queueClient.create()
        when:
        queueClient.peekMessages(33).iterator().next()
        then:
        def e = thrown(StorageErrorException)
        QueueTestHelper.assertExceptionStatusCodeAndMessage(e, 400, StorageErrorCode.OUT_OF_RANGE_QUERY_PARAMETER_VALUE)
    }

    def "Peek messages do not exist from queue client"() {
        when:
        queueClient.peekMessages().iterator().next()
        then:
        def e = thrown(StorageErrorException)
        QueueTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.QUEUE_NOT_FOUND)
    }

    def "Clear messages from queue client"() {
        given:
        queueClient.create()
        queueClient.enqueueMessage("test message 1")
        queueClient.enqueueMessage("test message 2")
        queueClient.enqueueMessage("test message 3")
        when:
        def getPropertiesResponse = queueClient.getProperties()
        def clearMsgResponse = queueClient.clearMessages()
        def getPropertiesAfterResponse = queueClient.getProperties()
        then:
        QueueTestHelper.assertResponseStatusCode(getPropertiesResponse, 200)
        assertEquals(3, getPropertiesResponse.value().approximateMessagesCount())
        QueueTestHelper.assertResponseStatusCode(clearMsgResponse, 204)
        QueueTestHelper.assertResponseStatusCode(getPropertiesAfterResponse, 200)
        assertEquals(0, getPropertiesAfterResponse.value().approximateMessagesCount())
    }

    def "Clear messages do not exist from queue client"() {
        when:
        StepVerifier.create(queueClient.clearMessages())
        then:
        def e = thrown(StorageErrorException)
        QueueTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.QUEUE_NOT_FOUND)
    }

    def "Delete message from queue client"() {
        given:
        queueClient.create()
        queueClient.enqueueMessage("test message 1")
        queueClient.enqueueMessage("test message 2")
        queueClient.enqueueMessage("test message 3")
        def dequeueMsg = queueClient.dequeueMessages().iterator().next()
        when:
        def getPropertiesResponse = queueClient.getProperties()
        def deleteMsgResponse = queueClient.deleteMessage(dequeueMsg.messageId(), dequeueMsg.popReceipt())
        def getPropertiesAfterResponse = queueClient.getProperties()
        then:
        QueueTestHelper.assertResponseStatusCode(getPropertiesResponse, 200)
        assertEquals(3, getPropertiesResponse.value().approximateMessagesCount())
        QueueTestHelper.assertResponseStatusCode(deleteMsgResponse, 204)
        QueueTestHelper.assertResponseStatusCode(getPropertiesAfterResponse, 200)
        assertEquals(2, getPropertiesAfterResponse.value().approximateMessagesCount())
    }

    @Unroll
    def "Delete message invalid args from queue client"() {
        given:
        queueClient.create()
        def expectMsg = "test message"
        queueClient.enqueueMessage(expectMsg)
        def dequeueMessageIter = queueClient.dequeueMessages().iterator().next()
        when:
        def deleteMessageId = messageId ? dequeueMessageIter.messageId(): dequeueMessageIter.messageId() + "Random"
        def deletePopReceipt = popReceipt ? dequeueMessageIter.popReceipt(): dequeueMessageIter.popReceipt() + "Random"
        queueClient.deleteMessage(deleteMessageId, deletePopReceipt)
        then:
        def e = thrown(StorageErrorException)
        QueueTestHelper.assertExceptionStatusCodeAndMessage(e, statusCode, errMsg)
        where:
        messageId | popReceipt | statusCode | errMsg
        true | false | 400 | StorageErrorCode.INVALID_QUERY_PARAMETER_VALUE
        false | true | 404 | StorageErrorCode.MESSAGE_NOT_FOUND
        false | false | 400 | StorageErrorCode.INVALID_QUERY_PARAMETER_VALUE
    }

    def "Delete message does not exist from client"() {
        given:
        queueClient.create()
        queueClient.enqueueMessage("test update message")
        def dequeueMsg = queueClient.dequeueMessages().iterator().next()
        queueClient.delete()
        QueueTestHelper.sleepInRecordMode(Duration.ofSeconds(30))
        when:
        queueClient.deleteMessage(dequeueMsg.messageId(), dequeueMsg.popReceipt())
        then:
        def e = thrown(StorageErrorException)
        QueueTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.QUEUE_NOT_FOUND)
    }

    def "Update message from queue client"() {
        given:
        def updateMsg = "Updated test message"
        queueClient.create()
        queueClient.enqueueMessage("test message before update")

        def dequeueMsg = queueClient.dequeueMessages().iterator().next()
        when:
        def updateMsgResponse = queueClient.updateMessage(updateMsg,
            dequeueMsg.messageId(), dequeueMsg.popReceipt(), Duration.ofSeconds(1))
        QueueTestHelper.sleepInRecordMode(Duration.ofSeconds(2));
        def peekMsgIter = queueClient.peekMessages().iterator().next()
        then:
        QueueTestHelper.assertResponseStatusCode(updateMsgResponse, 204)
        assertEquals(updateMsg, peekMsgIter.messageText())
    }

    @Unroll
    def "Update message invalid args from queue client"() {
        given:
        queueClient.create()
        def updateMsg = "Updated test message"
        queueClient.enqueueMessage("test message before update")
        def dequeueMessageIter = queueClient.dequeueMessages().iterator().next()
        when:
        def updateMessageId = messageId ? dequeueMessageIter.messageId(): dequeueMessageIter.messageId() + "Random"
        def updatePopReceipt = popReceipt ? dequeueMessageIter.popReceipt(): dequeueMessageIter.popReceipt() + "Random"
        queueClient.updateMessage(updateMsg, updateMessageId, updatePopReceipt, Duration.ofSeconds(1))
        then:
        def e = thrown(StorageErrorException)
        QueueTestHelper.assertExceptionStatusCodeAndMessage(e, statusCode, errMsg)
        where:
        messageId | popReceipt | statusCode | errMsg
        true | false | 400 | StorageErrorCode.INVALID_QUERY_PARAMETER_VALUE
        false | true | 404 | StorageErrorCode.MESSAGE_NOT_FOUND
        false | false | 400 | StorageErrorCode.INVALID_QUERY_PARAMETER_VALUE
    }

    def "Update message does not exist from client"() {
        given:
        queueClient.create()
        queueClient.enqueueMessage("test update message")
        def dequeueMsg = queueClient.dequeueMessages().iterator().next()
        queueClient.delete()
        QueueTestHelper.sleepInRecordMode(Duration.ofSeconds(30))
        when:
        queueClient.updateMessage("sometext", dequeueMsg.messageId(), dequeueMsg.popReceipt(), Duration.ofSeconds(1))
        then:
        def e = thrown(StorageErrorException)
        QueueTestHelper.assertExceptionStatusCodeAndMessage(e, 404, StorageErrorCode.QUEUE_NOT_FOUND)
    }
}
