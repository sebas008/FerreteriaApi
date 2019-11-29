package edu.cibertec.rest;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.dto.ProductoDTO;
import edu.cibertec.services.ProductoService;

@Path("/productoRest")
public class ProductoRest
{
	// http://localhost:8080/ApiFerreteriaSaravia/productoRest/buscar
	@GET
	@Path("/buscar/{codigo}")
	@Produces(MediaType.APPLICATION_JSON)
	public ProductoDTO buscar(@PathParam("codigo") String codigo)
	{
		try
		{
			return new ProductoService().buscar(codigo);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}

	// http://localhost:8080/ApiFerreteriaSaravia/productoRest/productoMasVendidos
	@GET
	@Path("/productoMasVendidos")
	@Produces(MediaType.APPLICATION_JSON)
	public ProductoDTO[] productoMasVendidos()
	{
		try
		{
			ArrayList<ProductoDTO> productos = new ProductoService().productosMasVendidos();
			return productos.toArray(new ProductoDTO[] {});
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}

	// http://localhost:8080/ApiFerreteriaSaravia/productoRest/actualizar
	@POST
	@Path("/actualizar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int actualizar(ProductoDTO producto)
	{
		try
		{
			return new ProductoService().actualizarProducto(producto);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return 0;
		}
	}
}
