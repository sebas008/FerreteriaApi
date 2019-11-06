package edu.cibertec.dao;

import edu.cibertec.interfaces.CarritoDAO;
import edu.cibertec.interfaces.DistritoDAO;
import edu.cibertec.interfaces.ProductoDAO;
import edu.cibertec.interfaces.UsuarioDAO;
import edu.cibertec.interfaces.VentaDAO;

public abstract class DAOFactory 
{
	public static final int MYSQL = 1;
	
	public abstract UsuarioDAO getUsuarioDAO();
	public abstract DistritoDAO getDistritoDAO();
	public abstract ProductoDAO getProductoDAO();
	public abstract CarritoDAO getCarritoDAO();
	public abstract VentaDAO getVentaDAO();
	
	//CONSTRUCTOR DE UNA CLASE ABSTRACTA
	public static DAOFactory getDAOFactory(int db)
	{
		switch(db)
		{
			case MYSQL:
				return new MySQLDAOFactory();
			default:
				return null;
		}
	}
}
