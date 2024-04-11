package com.example.simplespringboot.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/index")
    public String main(HttpServletRequest httpServletRequest){

        // 서블릿은 개발자가 http 요청 메시지를 편리하게 사용할 수 있도록 개발자 대신 메시지를 파싱
        // 파싱한 결과를 HttpServletRequest객체에 담아서 제공

        System.out.println(httpServletRequest);

        return "/index.html";

    }

}
