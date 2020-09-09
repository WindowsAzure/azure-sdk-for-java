// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp.implementation.handler;

import com.azure.core.amqp.exception.AmqpErrorContext;
import com.azure.core.amqp.exception.LinkErrorContext;
import com.azure.core.amqp.implementation.ExceptionUtil;
import com.azure.core.util.logging.ClientLogger;
import org.apache.qpid.proton.amqp.transport.ErrorCondition;
import org.apache.qpid.proton.engine.EndpointState;
import org.apache.qpid.proton.engine.Event;
import org.apache.qpid.proton.engine.Link;

import static com.azure.core.amqp.implementation.AmqpErrorCode.TRACKING_ID_PROPERTY;
import static com.azure.core.amqp.implementation.ClientConstants.NOT_APPLICABLE;

abstract class LinkHandler extends Handler {
    private final String entityPath;
    final ClientLogger logger;

    LinkHandler(String connectionId, String hostname, String entityPath, ClientLogger logger) {
        super(connectionId, hostname);
        this.entityPath = entityPath;
        this.logger = logger;
    }

    @Override
    public void onLinkLocalClose(Event event) {
        final Link link = event.getLink();
        final ErrorCondition condition = link.getCondition();

        logger.info("onLinkLocalClose connectionId[{}], linkName[{}], errorCondition[{}], errorDescription[{}]",
            getConnectionId(),
            link.getName(),
            condition != null ? condition.getCondition() : NOT_APPLICABLE,
            condition != null ? condition.getDescription() : NOT_APPLICABLE);
    }

    @Override
    public void onLinkRemoteClose(Event event) {
        final Link link = event.getLink();
        final ErrorCondition condition = link.getRemoteCondition();

        logger.info("onLinkRemoteClose connectionId[{}], linkName[{}], errorCondition[{}], errorDescription[{}]",
            getConnectionId(), link.getName(),
            condition != null ? condition.getCondition() : NOT_APPLICABLE,
            condition != null ? condition.getDescription() : NOT_APPLICABLE);

        handleRemoteLinkClosed(event);
    }

    @Override
    public void onLinkRemoteDetach(Event event) {
        final Link link = event.getLink();
        final ErrorCondition condition = link.getCondition();

        logger.info("onLinkRemoteClose connectionId[{}], linkName[{}], errorCondition[{}], errorDescription[{}]",
            getConnectionId(), link.getName(),
            condition != null ? condition.getCondition() : NOT_APPLICABLE,
            condition != null ? condition.getDescription() : NOT_APPLICABLE);

        handleRemoteLinkClosed(event);
    }

    @Override
    public void onLinkFinal(Event event) {
        final String linkName = event != null && event.getLink() != null
            ? event.getLink().getName()
            : NOT_APPLICABLE;
        logger.info("onLinkFinal connectionId[{}], linkName[{}]", getConnectionId(), linkName);

        close();
    }

    public AmqpErrorContext getErrorContext(Link link) {
        final String referenceId;
        if (link.getRemoteProperties() != null && link.getRemoteProperties().containsKey(TRACKING_ID_PROPERTY)) {
            referenceId = link.getRemoteProperties().get(TRACKING_ID_PROPERTY).toString();
        } else {
            referenceId = link.getName();
        }

        return new LinkErrorContext(getHostname(), entityPath, referenceId, link.getCredit());
    }

    private void handleRemoteLinkClosed(final Event event) {
        final Link link = event.getLink();
        final ErrorCondition condition = link.getRemoteCondition();

        if (link.getLocalState() != EndpointState.CLOSED) {
            link.setCondition(condition);
            link.close();
        }

        logger.info("processOnClose connectionId[{}], linkName[{}], errorCondition[{}], errorDescription[{}]",
            getConnectionId(), link.getName(),
            condition != null ? condition.getCondition() : NOT_APPLICABLE,
            condition != null ? condition.getDescription() : NOT_APPLICABLE);

        if (condition != null && condition.getCondition() != null) {
            final Throwable exception = ExceptionUtil.toException(condition.getCondition().toString(),
                condition.getDescription(), getErrorContext(link));

            onError(exception);
        } else {
            onNext(EndpointState.CLOSED);
        }
    }
}
