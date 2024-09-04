package JavaApigee.test_app;

import com.apigee.flow.execution.ExecutionContext;

import com.apigee.flow.execution.ExecutionResult;

import com.apigee.flow.execution.spi.Execution;

import com.apigee.flow.message.MessageContext;

//@Component

public class App implements Execution {

	public ExecutionResult execute(MessageContext messageContext, ExecutionContext executionContext) {

		try {

			messageContext.setVariable("foo", "Heloo");

			return ExecutionResult.SUCCESS;

		} catch (Exception e) {

			return ExecutionResult.ABORT;

		}

	}

}
