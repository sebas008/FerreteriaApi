package edu.cibertec.rest;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.dto.UsuarioDTO;
import edu.cibertec.services.UsuarioService;

@Path("/usuarioRest")
public class UsuarioRest
{
	// http://localhost:8080/ApiFerreteriaSaravia/usuarioRest/listar
	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public UsuarioDTO[] listar()
	{
		try
		{
			ArrayList<UsuarioDTO> usuarios = new UsuarioService().listado();
			return usuarios.toArray(new UsuarioDTO[] {});
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	// http://localhost:8080/ApiFerreteriaSaravia/usuarioRest/login
	@POST
	@Path("/login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public UsuarioDTO login(UsuarioDTO u)
	{
		try
		{
			UsuarioDTO usuario = new UsuarioService().login(u.getEmail(), u.getClave());
			return usuario;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	// http://localhost:8080/ApiFerreteriaSaravia/usuarioRest/actualizar
	@POST
	@Path("/actualizar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public int actualizar(UsuarioDTO u)
	{
		try
		{
			return new UsuarioService().actualizar(u);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return 0;
	}
	
	// http://localhost:8080/ApiFerreteriaSaravia/usuarioRest/registrar
	@POST
	@Path("/registrar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public int registrar(UsuarioDTO u)
	{
		try
		{
			UsuarioService servicio = new UsuarioService();
			
			u.setCodigo(servicio.ultimoCodUsuario());
			return servicio.registrar(u);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return 0;
	}
	
	// http://localhost:8080/ApiFerreteriaSaravia/usuarioRest/usuariosConMasCompras
	@GET
	@Path("/usuariosConMasCompras")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<UsuarioDTO> usuariosConMasCompras()
	{
		try
		{
			return new UsuarioService().usuariosConMasCompras();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}
}
