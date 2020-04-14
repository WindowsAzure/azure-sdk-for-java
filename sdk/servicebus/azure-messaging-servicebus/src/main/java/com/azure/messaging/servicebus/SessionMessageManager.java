package com.azure.messaging.servicebus;

import java.nio.ByteBuffer;
import java.util.Map;

/**
 * This provides a way to settle the message from session enabled Service Bus entity.
 */
public class SessionMessageManager {
    public ByteBuffer getSessionState() { return null;}
    public void setSessionState(ByteBuffer sessionState) {}
    public void abandon(MessageLockToken lockToken) {}
    public void abandon(MessageLockToken lockToken, Map<String, Object> propertiesToModify) {}
    public void complete(MessageLockToken lockToken) { }
    public void defer(MessageLockToken lockToken) { }
    public void defer(MessageLockToken lockToken, Map<String, Object> propertiesToModify) { }
    public void deadLetter(MessageLockToken lockToken) { }
    public void deadLetter(MessageLockToken lockToken, DeadLetterOptions deadLetterOptions) { }
}
