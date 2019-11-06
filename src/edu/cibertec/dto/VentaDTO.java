package edu.cibertec.dto;

import java.util.ArrayList;

public class VentaDTO
{
	String numVenta, codCliente, fecha;
	ArrayList<CarritoDTO> detalle;

	public String getNumVenta()
	{
		return numVenta;
	}

	public void setNumVenta(String numVenta)
	{
		this.numVenta = numVenta;
	}

	public String getCodCliente()
	{
		return codCliente;
	}

	public void setCodCliente(String codCliente)
	{
		this.codCliente = codCliente;
	}

	public String getFecha()
	{
		return fecha;
	}

	public void setFecha(String fecha)
	{
		this.fecha = fecha;
	}

	public ArrayList<CarritoDTO> getDetalle()
	{
		return detalle;
	}

	public void setDetalle(ArrayList<CarritoDTO> detalle)
	{
		this.detalle = detalle;
	}
}
