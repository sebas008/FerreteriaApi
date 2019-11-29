package edu.cibertec.interfaces;

import java.util.ArrayList;

import edu.cibertec.dto.VentaDTO;

public interface VentaDAO 
{
	public int transaccion(VentaDTO venta);
	
	public String ultimoNumVenta();
	
	public VentaDTO ultimaVentaXUsuario(String codigoU);
	
	public ArrayList<VentaDTO> ventasXusuario(String codigoU);
}
