package Test;


import DAO.TblUsuarioimp;

import model.TblUsuariocl2;

public class TestResgistro {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TblUsuariocl2 usurio = new TblUsuariocl2();
		TblUsuarioimp crud=new TblUsuarioimp();
		
		usurio.setUsuriocl2("aldair");
		usurio.setPasswordcl2("123");
		
		crud.RegistrarUsuario(usurio);
		

	}
	
}
