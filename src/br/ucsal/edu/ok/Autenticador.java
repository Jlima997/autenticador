package br.ucsal.edu.ok;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Autenticador
 */
@WebServlet("/Autenticador")
public class Autenticador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Autenticador() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Usuario user = new Usuario();
		
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		user.setNome(nome);
		user.setSenha(senha);
		if (nome != null && senha != null && nome.equalsIgnoreCase(senha)) {
			request.getSession().setAttribute("user", user);
			response.sendRedirect("index2.jsp");
			
			
		} else {
			request.setAttribute("erro", "Usuario ou senha invalidos!");
			RequestDispatcher d = request.getRequestDispatcher("nome.jsp");
			d.forward(request, response);
		}
		doGet(request, response);
	}

}
