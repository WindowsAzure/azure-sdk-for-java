package com.azure.core.polling;

import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;
import java.util.Base64;

public abstract class GenerialPoller implements Poller{

    private PollRequestData pollRequestData;

    /*This will save last poll response.*/
    private PollResponse pollResponse;

    public GenerialPoller(PollRequestData pollRequestData ){
        this.pollRequestData = pollRequestData;
    }

    @Override
    public PollRequestData getPollRequestData() {
        return pollRequestData;
    }

    @Override
    public boolean isDone() {
        //First time we will not have poll response data.
        if (pollRequestData == null)
            return false;
        return !pollResponse.isOperationInProgress();
    }

    @Override
    public PollResponse cancelOperation() throws PollingException {
        if (!pollRequestData.operationAllowedToCancel()) {
            throw new OperationNotSupportedException();
        }
        return pollRequestData.callbackToCancelOperation().cancel();
    }

    //TODO : Make sure we do not pool every cpu cycle. Polling must be throttle by parameter defined in PollingType i.e interval or expeonential polling
    @Override
    public PollResponse poll() {
        pollRequestData.setStopPolling(false);
        return pollRequestData.serviceSupplier.get();
    }

    @Override
    public PollResponse pollUntilDone() {
        boolean done = false;
        pollRequestData.setStopPolling(false);
        while (!isDone() && !pollRequestData.isPollingStopped()) {
            pollResponse =pollRequestData.serviceSupplier().get();
        }
        if (pollRequestData.callbackWhenDone() != null) {
            try {
                pollRequestData.callbackWhenDone().execute(pollResponse);
            }catch (Exception ex){
                //TODO handle Exception
            }
        }
        return pollResponse;
    }

    @Override
    public void  stopPolling() {
        pollRequestData.setStopPolling(true);
    }

    static String serializePoller(Poller poller) {
        String serializedObject = "";
        try {
            ByteArrayOutputStream bArrOutStream = new ByteArrayOutputStream();
            ObjectOutputStream objOutStream = new ObjectOutputStream(bArrOutStream);
            objOutStream.writeObject(poller.getPollRequestData());
            objOutStream.flush();
            serializedObject = new String(Base64.getEncoder().encode(bArrOutStream.toByteArray()));
        } catch (Exception ex) {

        }
        return serializedObject;
    }
}
