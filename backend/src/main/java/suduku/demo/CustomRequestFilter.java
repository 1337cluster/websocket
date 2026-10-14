package sudoku.demo;


import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Collections;

@Component
public class CustomRequestFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
                
        System.out.println("\n--------------------------------------------------");
        System.out.println("🔥 [INCOMING REQUEST DEBUG] 🔥");
        System.out.println("Method     : " + request.getMethod());
        System.out.println("Request URI: " + request.getRequestURI());
        System.out.println("Query String: " + request.getQueryString());
        
        System.out.println("--- HEADERS ---");
        Collections.list(request.getHeaderNames()).forEach(headerName -> 
            System.out.println(headerName + " : " + request.getHeader(headerName))
        );
        
        System.out.println("--------------------------------------------------\n");

        filterChain.doFilter(request, response);
    }
}