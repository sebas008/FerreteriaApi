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
	public ArrayList<CarritoDTO> listarXclienteXventa(String codigo, String venta)
	{
		return dao.listarXclienteXventa(codigo, venta);
	}

	@Override
	public ArrayList<CarritoDTO> listarXfecha(String codigo, String fecha) 
	{
		return dao.listarXfecha(codigo, fecha);
	}

	@Override
	public ArrayList<CarritoDTO> listarUltimaVenta(String numVenta, String codUsuario) 
	{
		return dao.listarUltimaVenta(numVenta, codUsuario);
	}
}
