package Interfaces;

import java.util.List;


import model.TblProductocl2;;

public interface IProducto {

	public void RegistrarProducto(TblProductocl2 producto);
	public List<TblProductocl2> ListarProducto();

	
}
