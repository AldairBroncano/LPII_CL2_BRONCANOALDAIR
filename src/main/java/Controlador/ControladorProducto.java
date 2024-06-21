package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.TblProductoimp;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		TblProductocl2 producto=new TblProductocl2();
		TblProductoimp crud=new TblProductoimp();
		List<TblProductocl2>listadoproducto = crud.ListarProducto();
		

		

		request.setAttribute("listadoproductos", listadoproducto);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nombre=request.getParameter("nombrecl2");
		double precioven = Double.parseDouble(request.getParameter("precioventacl2")) ;
		double precioComp = Double.parseDouble(request.getParameter("preciocompcl2")) ;		
		String estado=request.getParameter("estadocl2");
		String descripcion=request.getParameter("descripcl2");
		
		TblProductocl2 producto = new TblProductocl2();
		TblProductoimp crud=new TblProductoimp();
		
		producto.setNombrecl2(nombre);
		producto.setPrecioventacl2(precioven);
		producto.setPreciocompcl2(precioComp);
		producto.setEstadocl2(estado);
		producto.setDescripcl2(descripcion);
		
		crud.RegistrarProducto(producto);
		
		
		List<TblProductocl2>listadoproducto = crud.ListarProducto();
		request.setAttribute("listadoproductos", listadoproducto);
		
		
		request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
		
	}

}
