package com.azure.core.polling;


import com.azure.core.exception.HttpResponseException;
import reactor.core.publisher.Mono;

import java.io.*;
import java.util.Base64;

/**
 * Example Use case1 :
 *        // Lambda Runnable
 *         Runnable callWhenDone = () -> {
 *             System.out.println(Thread.currentThread().getName() + " is running. Callback when done.");
 *         };
 *
 *         Runnable callToCancel = () -> {
 *             System.out.println(Thread.currentThread().getName() + " is running. Callback to cancel.");
 *         };
 *
 *         final PollResponse pollResponseFromSupplier = new MyPollResponse();
 *         SerializableSupplier<PollResponse> serviceSupplier = () -> pollResponseFromSupplier;
 *
 *         Poller poller =  new Poller(1000*60*5,serviceSupplier,callWhenDone,callToCancel,false); // 5 minutes
 *
 *         PollResponse pollResponse = null;
 *         while (pollResponse == null || pollResponse.isOperationInProgress()) {
 *             pollResponse = poller.pollOnce();
 *             Thread.sleep(1000*2);//wait 2 second
 *         }
 *         System.out.println(" Polling Complete with "+pollResponse);
 * **/
public class Poller implements Serializable{

    /*This will save last poll response.*/
    private PollResponse pollResponse;

    private static final long serialversionUID =139448132L;

    private int timeoutInMilliSeconds;

    private int pollIntervalInMillis;

    /*This will ensure that poll interval grow exponentially by factor specified here.
    * This should always be more than 1.*/
    private float poolIntervalGrowthFactor =1.0f;

    private boolean operationAllowedToCancel;

    private SerializableSupplier<PollResponse> serviceSupplier;

    /*We will call this when we are done*/
    private Runnable callbackWhenDone;

    /* We will call this to cancel the operation*/
    private Runnable callbackToCancelOperation;

    /*If consumer do not want to poll. This will not stop the Service Operation.*/
    private boolean stopPolling;

    /**
     * @param timeoutInMilliSeconds This is the max time after that poller will giveup and not poll anymore.
     * @param pollIntervalInMillis  This will ensure that poll happens only once in pollIntervalInMillis
     * @param poolIntervalGrowthFactor  This will ensure that poll interval grow exponentially by factor specified here.
     *                                  This should always be more than 1.
     * @param serviceSupplier
     * @param callbackWhenDone
     * @param callbackToCancelOperation
     * @param operationAllowedToCancel Indicate if this operation could be cancelled.
     *                                 Not all the Azure Service Operation could be cancelled.
     * **/
    public Poller(int timeoutInMilliSeconds
                            , int pollIntervalInMillis
                            , float poolIntervalGrowthFactor
                            , SerializableSupplier<PollResponse> serviceSupplier
                            , Runnable callbackWhenDone
                            , Runnable callbackToCancelOperation
                            , boolean operationAllowedToCancel ){

        this.timeoutInMilliSeconds = timeoutInMilliSeconds;
        this.poolIntervalGrowthFactor =poolIntervalGrowthFactor;
        this.pollIntervalInMillis = pollIntervalInMillis;
        this.callbackWhenDone = callbackWhenDone;
        this.callbackToCancelOperation = callbackToCancelOperation;
        this.serviceSupplier = serviceSupplier;
        this.operationAllowedToCancel = operationAllowedToCancel;
    }

    public boolean isDone() {
        //First time we will not have poll response data.
        if (pollResponse == null)
            return false;
        return !pollResponse.isOperationInProgress();
    }

    /**This will cancel polling from Azure Service if supported by service ***/
    public void cancelOperation() {
       new Thread(callbackToCancelOperation).start();
    }

    //TODO : Make sure we do not pool every cpu cycle. Polling must be throttle by parameter defined in PollingType i.e interval or expeonential polling
    /**This will poll once. If you had stopped polling erlier, we will enable polling again.**/
    public Mono<PollResponse> pollOnce() {

        return Mono.defer(() -> {
            setStopPolling(false);
            return Mono.just(serviceSupplier.get());
        });
    }

    /**This will keep polling until it is done.**/
    public Mono<PollResponse> pollUntilDone() {

        return Mono.defer(() -> {
            setStopPolling(false);
            while (!isDone() && !isPollingStopped()) {
                System.out.println("Poller.pollUntilDone Invoking Azure Service , checking Operation status");
                pollResponse = serviceSupplier.get();
            }
            if (callbackWhenDone != null) {
                try {
                    new Thread(callbackWhenDone).start();
                } catch (Exception ex) {
                    //TODO handle Exception
                    Mono.error(ex);
                }
            }
            return Mono.just(pollResponse);
        });
    }

    /**This will stop polling**/
    public void  stopPolling() {
       setStopPolling(true);
    }

    private void setStopPolling(boolean stop){
        this.stopPolling =stop;
    }

    public boolean isPollingStopped(){
        return this.stopPolling;
    }

    public boolean operationAllowedToCancel(){
        return operationAllowedToCancel;
    }

    static String serializePoller(Poller poller) {
        String serializedObject = "";
        try {
            ByteArrayOutputStream bArrOutStream = new ByteArrayOutputStream();
            ObjectOutputStream objOutStream = new ObjectOutputStream(bArrOutStream);
            objOutStream.writeObject(poller);
            objOutStream.flush();
            serializedObject = new String(Base64.getEncoder().encode(bArrOutStream.toByteArray()));
        } catch (Exception ex) {
            //TODO Handle Exception
        }
        return serializedObject;
    }

    /**This will deserialize the string data into poller**/
    static Poller deserializePoller(String serializedPoller) {
        Poller poller = null;
        try {
            byte b[] = Base64.getDecoder().decode(serializedPoller.getBytes());
            ByteArrayInputStream bi = new ByteArrayInputStream(b);
            ObjectInputStream si = new ObjectInputStream(bi);
            poller = (Poller) si.readObject();
        } catch (Exception e) {
            //TODO Handle Exception
        }
        return poller;
    }
}
