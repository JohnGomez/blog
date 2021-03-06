/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.CategoriaDao;
import dao.PostagemDao;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author John
 */
@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PostagemDao pd= new PostagemDao();
        req.setAttribute("postagens", pd.getPostagemPorCategoria(req.getParameter("id")));
        RequestDispatcher reqDisp = req.getRequestDispatcher("/home.jsp");
        reqDisp.forward(req, resp);
        
    }

    
    
    
}
