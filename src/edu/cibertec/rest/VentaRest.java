package edu.cibertec.rest;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.dto.UsuarioDTO;
import edu.cibertec.dto.VentaDTO;
import edu.cibertec.services.UsuarioService;
import edu.cibertec.services.VentaService;

@Path("/ventaRest")
public class VentaRest
{
	// http://localhost:8080/ApiFerreteriaSaravia/ventaRest/transaccion
	@POST
	@Path("/transaccion")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public int transaccion(VentaDTO venta)
	{
		try
		{
			VentaService servicio = new VentaService();
			
			venta.setNumVenta(servicio.ultimoNumVenta());
			return servicio.transaccion(venta);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return 0;
		}
	}
	
	// http://localhost:8080/ApiFerreteriaSaravia/ventaRest/ultimaVentaXUsuario
	@GET
	@Path("/ultimaVentaXUsuario/{codigoU}")
	@Produces(MediaType.APPLICATION_JSON)
	public VentaDTO ultimaVentaXUsuario(@PathParam("codigoU") String codigoU) 
	{
		try
		{
			return new VentaService().ultimaVentaXUsuario(codigoU);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}

	// http://localhost:8080/ApiFerreteriaSaravia/ventaRest/ventasXUsuario
	@GET
	@Path("/ventasXUsuario/{cliente}")
	@Produces(MediaType.APPLICATION_JSON)
	public VentaDTO[] ventasXusuario(@PathParam("cliente") String cliente)
	{
		try
		{
			ArrayList<VentaDTO> ventas = new VentaService().ventasXusuario(cliente);
			return ventas.toArray(new VentaDTO[] {});
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}
}
