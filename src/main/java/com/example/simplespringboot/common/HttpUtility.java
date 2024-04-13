package com.example.simplespringboot.common;

import jakarta.servlet.http.HttpServletRequest;

public class HttpUtility {

    private HttpUtility(){}

    public static String getReturnUrl(HttpServletRequest request) throws Exception {
//        String retrul = request.getRequestURI().substring(contextSize, request.getRequestURI().length());
        String retrul = request.getRequestURI();
        return retrul;
    }

}
