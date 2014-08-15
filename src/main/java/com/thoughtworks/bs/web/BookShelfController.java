package com.thoughtworks.bs.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hjli on 8/12/14.
 */
@Controller
public class BookShelfController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    @ResponseBody
    public String getBook(){
        return "hello world";
    }
}
