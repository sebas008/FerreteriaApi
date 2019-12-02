package edu.cibertec.rest;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.dto.DistritoDTO;
import edu.cibertec.services.DistritoService;

@Path("/distritoRest")
public class DistritoRest
{
	// http://localhost:8080/ApiFerreteriaSaravia/distritoRest/listar
	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public DistritoDTO[] listar()
	{
		try
		{
			ArrayList<DistritoDTO> distritos = new DistritoService().lista();
			return distritos.toArray(new DistritoDTO[] {});
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	// http://localhost:8080/ApiFerreteriaSaravia/distritoRest/buscar
	@GET
	@Path("/buscar/{codigo}")
	@Produces(MediaType.APPLICATION_JSON)
	public DistritoDTO buscar(@PathParam("codigo") String codigo)
	{
		try
		{
			return new DistritoService().buscar(codigo);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}
}















