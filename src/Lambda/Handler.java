package Lambda;

import Basic.SeleniumTest;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

//lambda handler name: Lambda.Handler::handleRequest
public class Handler implements RequestHandler<String, String> {

    public String handleRequest(String request, Context context) {
        context.getLogger().log("Inside the Lambda Handler.");
        SeleniumTest objSeleniumTest = new SeleniumTest();
        if(request.contains("title")) {
            context.getLogger().log("Received title as a input.");
            String title= objSeleniumTest.GetTitle();

            context.getLogger().log("Title received from the Selenium automation - ."+ title);

            context.getLogger().log("Test Case Successful");
            return title;
        }
        else {
            context.getLogger().log("Request not supported. Please enter 'title' as a request. Request is - "+request);
            return "Request not supported. Please enter 'title' as a request";
        }
    }
}
