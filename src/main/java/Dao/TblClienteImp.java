package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.ICliente;
import model.TblCliente;

public class TblClienteImp implements ICliente{

	@Override
	public void RegistrarCliente(TblCliente cliente) {
		//establecemo conexion con la unidad de persistencia...
		EntityManagerFactory fabri=Persistence.createEntityManagerFactory("ProyectoMavenJpaLPII");
		//permite gestionar entidades..
		EntityManager eman=fabri.createEntityManager();
		//iniciar transaccion...
		eman.getTransaction().begin();
		//registramos
		eman.persist(cliente);
		//emitimos mensaje por pantalla
		System.out.println("cliente registrado en la base de datos");
		//confirmamos
		eman.getTransaction().commit();
		//cerramos la transaccion...
		eman.close();
		
	}

	@Override
	public void ActualizarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TblCliente BuscarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TblCliente> ListarCliente() {
		//Establecemos la conexion con la unidad de persistencia
		EntityManagerFactory fab = Persistence.createEntityManagerFactory("ProyectoMavenJpaLPII");
		//Gestionamos las entidades
		EntityManager em =fab.createEntityManager();
		//Iniciamos la transaccion
		em.getTransaction().begin();
		//Recuperamos la data de la base de datos
		List<TblCliente> listado = em.createQuery("select c from TblCliente c", TblCliente.class).getResultList();
		//Confirmamos la transaccion
		em.getTransaction().commit();
		//Cerramos
		em.close();
		//Retornamos el listado
		return listado;
	}

	
}  //fin de la clase....
