package com.thoughtworks.bs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hjli on 7/24/14.
 */

@Controller
public class HelloWorldController {
    @RequestMapping(value ="/", method = RequestMethod.GET)
    @ResponseBody
    public String returnQueryResult() {
        return "hello";
    }
}
