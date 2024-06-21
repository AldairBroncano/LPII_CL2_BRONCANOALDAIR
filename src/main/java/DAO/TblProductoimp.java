package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;

import model.TblProductocl2;

public class TblProductoimp implements IProducto {

	public void RegistrarProducto(TblProductocl2 producto) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory fabri=Persistence.createEntityManagerFactory("LPII_CL2_BRONCANOALDAIR");
		//permite gestionar entidades..
		EntityManager eman=fabri.createEntityManager();
		//iniciar transaccion...
		eman.getTransaction().begin();
		//registramos
		eman.persist(producto);
		//emitimos mensaje por pantalla
		System.out.println("producto registrado en la base de datos");
		//confirmamos
		eman.getTransaction().commit();
		//cerramos la transaccion...
		eman.close();
		
		
	}

	public List<TblProductocl2> ListarProducto() {
		// TODO Auto-generated method stub
		EntityManagerFactory fab = Persistence.createEntityManagerFactory("LPII_CL2_BRONCANOALDAIR");
		//gestionamos las entidades
		EntityManager em=fab.createEntityManager();
		//iniciamos la tran
		em.getTransaction().begin();
		
		//recuperamos la data
		List<TblProductocl2> listado = em.createQuery("SELECT t FROM TblProductocl2 t", TblProductocl2.class).getResultList();
		
		em.getTransaction();
		
		em.close();
		
		return listado;
	}

}
