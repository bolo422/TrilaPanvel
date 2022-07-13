package br.com.panvel.gerenciador.servlet.actions;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface IAction {
	String execute(HttpServletRequest req, HttpServletResponse resp);
}
