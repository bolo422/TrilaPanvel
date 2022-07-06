package br.com.panvel.gerenciador.servlet.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import br.com.panvel.gerenciador.servlet.actions.IAction;


public class ControllerFilter extends HttpFilter implements Filter {
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		System.out.println("EntryFilter");
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		try {
			// reflection api
			IAction action = (IAction)Class.forName("br.com.panvel.gerenciador.servlet.actions." + request.getParameter("action")).getDeclaredConstructor().newInstance();
			
			String[] act = action.execute(request, response).split(":");
			
			switch(act[0])
			{
				case "forward": RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + act[1]);
					rd.forward(request, response);
					break;
				case "redirect": response.sendRedirect(act[1]);
					break;
			}
			
		}catch (InstantiationException | IllegalAccessException | ClassNotFoundException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
			throw new ServletException(e);
		}catch(NullPointerException e){
			throw new NullPointerException(" ->> Parâmetro inválido { " + e.getMessage() + " } <<-");
		}		
		
	}


}
