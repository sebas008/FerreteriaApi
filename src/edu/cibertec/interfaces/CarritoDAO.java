package edu.cibertec.interfaces;

import java.util.ArrayList;

import edu.cibertec.dto.CarritoDTO;

public interface CarritoDAO 
{
	ArrayList<CarritoDTO> listarXcliente(String codigo);
	ArrayList<CarritoDTO> listarXclienteXventa(String codigo, String venta);
	ArrayList<CarritoDTO> listarXfecha(String codigo, String fecha);
	ArrayList<CarritoDTO> listarUltimaVenta(String numVenta, String codUsuario);
}
