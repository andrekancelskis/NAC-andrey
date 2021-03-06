package com.andreymasiero.gerenciamento_empresas.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.andreymasiero.gerenciamento_empresas.dao.UsuarioDAO;

/**
 * 
 * Classe que executa o login do usuário após receber a requisição.
 *
 */
@WebServlet(urlPatterns ="/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 8358808977406161971L;
	
	/**
	 * 
	 *  Esse método efetua o login do usuário, consultando um método
	 *  da classe DAO.
	 *  
	 *  Em caso de autenticacao realizada com sucesso, deve armazenar o
	 *  usuário na sessão e redirecionar para a página gerenciador.jsp.
	 *  
	 *  Em caso de falha na autenticacao, um atributo erro deve ser adicionado
	 *  e retornando na própria index.jsp informando o erro.
	 * 
	 *  @param HttpServletRequest
	 *  @param HttpServletResponse
	 *  @throws ServletException, IOException
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		UsuarioDAO u = new UsuarioDAO();
		
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");

		
		
		
		
		
	}

}
