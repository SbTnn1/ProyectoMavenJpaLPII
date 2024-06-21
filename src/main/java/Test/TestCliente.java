package Test;

import java.util.List;

import Dao.TblClienteImp;
import model.TblCliente;

public class TestCliente {

	public static void main(String[] args) {
		//realizamos las respectiva instancias..
		TblCliente cliente=new TblCliente();
		TblClienteImp crud=new TblClienteImp();
		//insertamos datos
		/*cliente.setNombre("Pablo");
		cliente.setApellido("Saravia Osas");
		cliente.setDni("10837262");
		cliente.setEmail("pablo@gmail.com");
		cliente.setTelf("938726162");
		cliente.setSexo("M");
		cliente.setNacionalidad("Argentino");
		//invocamos el metodo registrar...
		crud.RegistrarCliente(cliente);*/

		
		//*****TESTEAMOS EL LISTADO*****
		/*List<TblCliente> listado = crud.ListarCliente();
		//Aplicamos un bucle
		for(TblCliente lis:listado) {
			//Imprimimos por pantalla
			System.out.print("codigo "+lis.getIdcliente()+" nombre "+lis.getNombre()+ " apellido "+lis.getApellido()+
						     " dni "+lis.getDni());
		}*/
	}//fin del metodo principal...

}   //fin de la clase...
