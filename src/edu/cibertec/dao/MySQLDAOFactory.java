package edu.cibertec.dao;

import edu.cibertec.interfaces.CarritoDAO;
import edu.cibertec.interfaces.DistritoDAO;
import edu.cibertec.interfaces.ProductoDAO;
import edu.cibertec.interfaces.UsuarioDAO;
import edu.cibertec.interfaces.VentaDAO;

public class MySQLDAOFactory extends DAOFactory
{
	@Override
	public UsuarioDAO getUsuarioDAO() 
	{
		return new MySQLUsuarioDAO();
	}

	@Override
	public DistritoDAO getDistritoDAO() 
	{
		return new MySQLDistritoDAO();
	}

	@Override
	public ProductoDAO getProductoDAO() 
	{
		return new MySQLProductoDAO();
	}

	@Override
	public CarritoDAO getCarritoDAO() 
	{
		return new MySQLCarritoDAO();
	}

	@Override
	public VentaDAO getVentaDAO() 
	{
		return new MySQLVentaDAO();
	}
}
