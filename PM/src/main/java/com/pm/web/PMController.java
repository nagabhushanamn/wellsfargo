package com.pm.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pm.dao.JdbcProductDAOImpl;
import com.pm.model.Product;

/**
 * Servlet implementation class PMController
 */

public class PMController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		JdbcProductDAOImpl productDAO = new JdbcProductDAOImpl();
		List<Product> products = productDAO.findAll();

		request.setAttribute("allProducts", products);
		
		request.getRequestDispatcher("pm.jsp").forward(request, response);

	}

}
