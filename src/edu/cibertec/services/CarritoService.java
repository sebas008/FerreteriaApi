package edu.cibertec.services;

import java.util.ArrayList;

import edu.cibertec.dao.DAOFactory;
import edu.cibertec.dto.CarritoDTO;
import edu.cibertec.interfaces.CarritoDAO;

public class CarritoService implements CarritoDAO
{
	DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	CarritoDAO dao = fabrica.getCarritoDAO();
	
	@Override
	public ArrayList<CarritoDTO> listarXcliente(String codigo) 
	{
		return dao.listarXcliente(codigo);
	}
	
	@Override
	public ArrayList<CarritoDTO> listarXclienteXventa(String cliente, String venta)
	{
		return dao.listarXclienteXventa(cliente, venta);
	}

	@Override
	public ArrayList<CarritoDTO> listarXfecha(String cliente, String fecha) 
	{
		return dao.listarXfecha(cliente, fecha);
	}

	@Override
	public ArrayList<CarritoDTO> listarUltimaVenta(String venta, String cliente) 
	{
		return dao.listarUltimaVenta(venta, cliente);
	}
}
