package com.microsoft.azure.servicebus;

public abstract class TestMessageHandler implements IMessageHandler {

	@Override
	public void notifyException(Throwable exception, ExceptionPhase phase) {
		//exception.printStackTrace();
		System.out.println(phase + "-" + exception.getMessage());
	}
}
