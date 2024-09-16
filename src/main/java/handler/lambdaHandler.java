package handler;

import com.amazonaws.services.lambda.runtime.Context;

public class lambdaHandler {

    public String handleRequest(String input, Context context) {
        context.getLogger().log("User input: " + input);
        return "Hello, Lambda function, " + input;
    }
}
