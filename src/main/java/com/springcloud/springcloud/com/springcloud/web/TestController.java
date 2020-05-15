package com.springcloud.springcloud.com.springcloud.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangjiabao
 * @data 2020/5/14/0014
 * @time 15:32:14
 */
@Api(tags = "测试controller")
@RestController
@Log4j2
@RequestMapping("/test")
public class TestController {
    @ApiOperation(value = "测试",notes = "测试")
    @GetMapping("test")
    public String testHello(){
        return "index";
    }
}
