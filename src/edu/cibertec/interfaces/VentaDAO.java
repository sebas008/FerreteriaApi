package edu.cibertec.interfaces;

import java.util.ArrayList;

import edu.cibertec.dto.CarritoDTO;
import edu.cibertec.dto.VentaDTO;

public interface VentaDAO 
{
	public int transaccion(VentaDTO venta, ArrayList<CarritoDTO> detalleVenta);
	
	public String ultimoNumVenta();
	
	public VentaDTO ultimaVentaXUsuario(String codigoU);
	
	public ArrayList<VentaDTO> ventasXusuario(String codigoU);
}
