package edu.cibertec.interfaces;

import java.util.ArrayList;

import edu.cibertec.dto.CarritoDTO;

public interface CarritoDAO 
{
	ArrayList<CarritoDTO> listarXcliente(String codigo);
	ArrayList<CarritoDTO> listarXclienteXventa(String cliente, String venta);
	ArrayList<CarritoDTO> listarXfecha(String cliente, String fecha);
	ArrayList<CarritoDTO> listarUltimaVenta(String venta, String cliente);
}
