package bg.tuvarna.usp.filters;

import java.io.IOException;

import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class RedirectFilter implements Filter {
	private static final int domain = 22;
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String url = null;
		try {
			url = req.getRequestURL().substring(domain);
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("url length is less than " + domain + ": " + req.getRequestURL());
			
			chain.doFilter(request, response);
			return;
		}
		String redirect = switch(url.toLowerCase()){
		case "login.jsp"->"/login";
		case "index.jsp"->"/";
		case "register.jsp"->"/register";
		case "announcements.jsp"->"/announcements";
		case "createannouncement.jsp", "createannouncements.jsp"->"/create-announcement";
		case "viewannouncement.jsp", "viewannouncements.jsp"->"/view-announcement";
		
		default -> null;
		};
		
		if(redirect != null) {
			res.sendRedirect(redirect);
		}
		
		chain.doFilter(request, response);
	}
	
}
