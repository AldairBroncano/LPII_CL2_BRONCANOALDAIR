package Test;

import DAO.TblProductoimp;

import model.TblProductocl2;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TblProductocl2 producto=new TblProductocl2();
		TblProductoimp crud=new TblProductoimp();
		
		producto.setNombrecl2("Leche");
		producto.setPrecioventacl2(3);
		producto.setPreciocompcl2(5);
		producto.setEstadocl2("virg");
		producto.setDescripcl2("oferta");
		
		crud.RegistrarProducto(producto);
		

	}

}
