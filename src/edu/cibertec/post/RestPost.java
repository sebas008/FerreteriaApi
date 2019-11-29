package edu.cibertec.post;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.dto.ProductoDTO;
import edu.cibertec.dto.UsuarioDTO;
import edu.cibertec.services.ProductoService;
import edu.cibertec.services.UsuarioService;

@Path("/tipopost")
public class RestPost
{
	// En POST no se usan parametros
	
	// http://localhost:8080/ApiFerreteriaSaravia/tipopost/registrarUsuario
	@POST
	@Path("/registrarUsuario")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void registrarUsuario(UsuarioDTO u) 
	{
		try
		{
			u.setCodigo(new UsuarioService().ultimoCodUsuario());
			new UsuarioService().registrar(u);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	// http://localhost:8080/ApiFerreteriaSaravia/tipopost/actualizarUsuario
	@POST
	@Path("/actualizarUsuario")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void actualizarUsuario(UsuarioDTO u) 
	{
		try
		{
			new UsuarioService().actualizar(u);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	// http://localhost:8080/ApiFerreteriaSaravia/tipopost/actualizarProducto
	@POST
	@Path("/actualizarProducto")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void actualizarProducto(ProductoDTO p) 
	{
		try
		{
			new ProductoService().actualizarProducto(p);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
