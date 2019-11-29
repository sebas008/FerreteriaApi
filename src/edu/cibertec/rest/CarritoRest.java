package edu.cibertec.rest;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.dto.CarritoDTO;
import edu.cibertec.services.CarritoService;

@Path("/carritoRest")
public class CarritoRest
{
	// http://localhost:8080/ApiFerreteriaSaravia/carritoRest/listarXcliente
	@GET
	@Path("/listarXcliente/{codigo}")
	@Produces(MediaType.APPLICATION_JSON)
	public CarritoDTO[] listarXcliente(@PathParam("codigo") String codigo)
	{
		try
		{
			ArrayList<CarritoDTO> carrito = new CarritoService().listarXcliente(codigo);
			return carrito.toArray(new CarritoDTO[] {});
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	// http://localhost:8080/ApiFerreteriaSaravia/carritoRest/listarXclienteXventa
	@GET
	@Path("/listarXclienteXventa/{cliente}/{venta}")
	@Produces(MediaType.APPLICATION_JSON)
	public CarritoDTO[] listarXclienteXventa(@PathParam("cliente") String cliente, @PathParam("venta") String venta)
	{
		try
		{
			ArrayList<CarritoDTO> carrito = new CarritoService().listarXclienteXventa(cliente, venta);
			return carrito.toArray(new CarritoDTO[] {});
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}

	// http://localhost:8080/ApiFerreteriaSaravia/carritoRest/listarXfecha
	@GET
	@Path("/listarXfecha/{cliente}/{fecha}")
	@Produces(MediaType.APPLICATION_JSON)
	public CarritoDTO[] listarXfecha(@PathParam("cliente") String cliente, @PathParam("fecha") String fecha)
	{
		try
		{
			ArrayList<CarritoDTO> carrito = new CarritoService().listarXfecha(cliente, fecha);
			return carrito.toArray(new CarritoDTO[] {});
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	// http://localhost:8080/ApiFerreteriaSaravia/carritoRest/listarUltimaVenta
	@GET
	@Path("/listarUltimaVenta/{venta}/{cliente}")
	@Produces(MediaType.APPLICATION_JSON)
	public CarritoDTO[] listarUltimaVenta(@PathParam("venta") String venta, @PathParam("cliente") String cliente)
	{
		try
		{
			ArrayList<CarritoDTO> carrito = new CarritoService().listarUltimaVenta(venta, cliente);
			return carrito.toArray(new CarritoDTO[] {});
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}
}
















