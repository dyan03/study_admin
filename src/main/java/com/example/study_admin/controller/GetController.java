package com.example.study_admin.controller;

import com.example.study_admin.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") //localhost:8080/api
public class GetController {

    //    @RequestMapping(method= RequestMethod.GET, path="/getMethod")
    @GetMapping("/getMethod")
    public String getRequest() {
        return "hi getMethod by getMapping";
    }

    @GetMapping("/getParameter")
    public String getParameter(@RequestParam String id, @RequestParam(name = "password") String pwd) {
        System.out.println("id : " + id);
        System.out.println("password : " + pwd);

        return id + pwd;
    }

    //localhost:8080/api/getMultiParameter?account=abcd&email=study@gmail.com@page=1
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam) {
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        return searchParam;
    }

}
