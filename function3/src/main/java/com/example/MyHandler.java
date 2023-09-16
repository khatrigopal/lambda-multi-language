package com.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class MyHandler implements RequestHandler<String, String> {
    public String handleRequest(String input, Context context) {
        return "Hello, " + input + "!";
    }
}
