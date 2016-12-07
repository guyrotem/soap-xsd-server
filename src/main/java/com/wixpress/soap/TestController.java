package com.wixpress.soap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
  * Created on 07/12/2016.
  */
@Controller
class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String test1() {
        return "a";
    }
}
