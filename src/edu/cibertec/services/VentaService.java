package edu.cibertec.services;

import java.util.ArrayList;

import edu.cibertec.dao.DAOFactory;
import edu.cibertec.dto.VentaDTO;
import edu.cibertec.interfaces.VentaDAO;

public class VentaService implements VentaDAO
{
	DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	VentaDAO dao = fabrica.getVentaDAO();
	
	@Override
	public int transaccion(VentaDTO venta) 
	{
		return dao.transaccion(venta);
	}
	
	@Override
	public String ultimoNumVenta() 
	{
		return dao.ultimoNumVenta();
	}

	@Override
	public VentaDTO ultimaVentaXUsuario(String codigoU) 
	{
		return dao.ultimaVentaXUsuario(codigoU);
	}

	@Override
	public ArrayList<VentaDTO> ventasXusuario(String codigoU)
	{
		return dao.ventasXusuario(codigoU);
	}
}
