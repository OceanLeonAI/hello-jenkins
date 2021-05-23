package com.leon.hellojenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PROJECT_NAME: hello-jenkins
 * @CLASS_NAME: HelloJenkinsController
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021-05-23 20:54
 * @DESCRIPTION:
 **/
@RestController
@RequestMapping(value = "/helloJenkins")
public class HelloJenkinsController {
    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello jenkins";
    }
}
