package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;
import model.TblUsuariocl2;

public class TblUsuarioimp implements IUsuario{

	public void RegistrarUsuario(TblUsuariocl2 usuario) {
		// TODO Auto-generated method stub
		EntityManagerFactory fabri=Persistence.createEntityManagerFactory("LPII_CL2_BRONCANOALDAIR");
		//permite gestionar entidades..
		EntityManager eman=fabri.createEntityManager();
		//iniciar transaccion...
		eman.getTransaction().begin();
		//registramos
		eman.persist(usuario);
		//emitimos mensaje por pantalla
		System.out.println("usuario registrado en la base de datos");
		//confirmamos
		eman.getTransaction().commit();
		//cerramos la transaccion...
		eman.close();
	}

}
