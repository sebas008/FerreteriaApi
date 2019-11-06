package edu.cibertec.services;

import java.util.ArrayList;

import edu.cibertec.dao.DAOFactory;
import edu.cibertec.dto.CarritoDTO;
import edu.cibertec.dto.VentaDTO;
import edu.cibertec.interfaces.VentaDAO;

public class VentaService implements VentaDAO
{
	DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	VentaDAO dao = fabrica.getVentaDAO();
	
	@Override
	public int transaccion(VentaDTO venta, ArrayList<CarritoDTO> detalleVenta) 
	{
		return dao.transaccion(venta, detalleVenta);
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
