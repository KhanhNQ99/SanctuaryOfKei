package com.example.projectx.security;

import org.springframework.security.core.AuthenticationException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;


//Entrypoint: dùng để lọc ra những phần request nào không trả về authentication -> trả về Unauthorized
public class AuthenticationEntryPoint implements org.springframework.security.web.AuthenticationEntryPoint, Serializable {

    private static final long serialVersionUID = -785886955895324385L;

    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        httpServletResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized ");
    }
}
