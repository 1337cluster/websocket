package sudoku.demo;


import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class ResponseDebugFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
                
        // n5aliw request tkamal tri9ha w t3amr response
        filterChain.doFilter(request, response);

        // mli tsali request w tkon response wajda, nbriw nchofo ach fiha
        System.out.println("\n--------------------------------------------------");
        System.out.println("🔥 [OUTGOING RESPONSE DEBUG] 🔥");
        System.out.println("Status Code : " + response.getStatus());
        System.out.println("Content-Type: " + response.getContentType());
        System.out.println("--------------------------------------------------\n");
    }
}
