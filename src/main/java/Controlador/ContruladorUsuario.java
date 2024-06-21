package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import DAO.TblUsuarioimp;

import model.TblUsuariocl2;

/**
 * Servlet implementation class ContruladorUsuario
 */
public class ContruladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContruladorUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		TblUsuariocl2 usurio = new TblUsuariocl2();
		TblUsuarioimp crud=new TblUsuarioimp();
		
		request.getRequestDispatcher("/RegistrarProducto.jsp").forward(request, response);
		
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usuario=request.getParameter("usuriocl2");
		String clave=request.getParameter("passwordcl2");
		
		
		TblUsuariocl2 usurio = new TblUsuariocl2();
		TblUsuarioimp crud=new TblUsuarioimp();
		
	usurio.setUsuriocl2(usuario);
	usurio.setPasswordcl2(clave);
	
	crud.RegistrarUsuario(usurio);
		
		
		request.getRequestDispatcher("/RegistrarProducto.jsp").forward(request, response);
		
	}

}
