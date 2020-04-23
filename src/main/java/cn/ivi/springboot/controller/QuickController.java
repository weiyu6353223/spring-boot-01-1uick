package cn.ivi.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wycc
 * @Create 2020-03-31 10:29
 **/

@RestController

/*@ResponseBody
@Controller*/
public class QuickController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

}
