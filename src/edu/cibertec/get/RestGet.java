package edu.cibertec.get;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.dto.CarritoDTO;
import edu.cibertec.dto.ProductoDTO;
import edu.cibertec.dto.UsuarioDTO;
import edu.cibertec.dto.VentaDTO;
import edu.cibertec.services.CarritoService;
import edu.cibertec.services.ProductoService;
import edu.cibertec.services.UsuarioService;
import edu.cibertec.services.VentaService;

@Path("/tipoget")
public class RestGet
{
	// http:localhost:puerto/proyecto/path_clase/path_servicio
	
	// http://localhost:8080/ApiFerreteriaSaravia/tipoget/login/{email}/{clave}
	@GET
	@Path("/login/{email}/{clave}")
	@Produces(MediaType.APPLICATION_JSON)
	public UsuarioDTO login(@PathParam("email") String email, @PathParam("clave") String clave)
	{
		try
		{
			UsuarioDTO u = new UsuarioService().login(email, clave);
			return u;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	// http://localhost:8080/ApiFerreteriaSaravia/tipoget/historialXcliente/C001
	@GET
	@Path("/historialXcliente/{codigo}")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<CarritoDTO> historialXcliente(@PathParam("codigo") String codigo)
	{
		try
		{
			ArrayList<CarritoDTO> historial = new CarritoService().listarXcliente(codigo);
			return historial;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	// http://localhost:8080/ApiFerreteriaSaravia/tipoget/historialXfecha/C001/2018-11-02
	@GET
	@Path("/historialXfecha/{codigo}/{fecha}")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<CarritoDTO> historialXcliente(@PathParam("codigo") String codigo, @PathParam("fecha") String fecha)
	{
		try
		{
			ArrayList<CarritoDTO> historial = new CarritoService().listarXfecha(codigo, fecha);
			return historial;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	// http://localhost:8080/ApiFerreteriaSaravia/tipoget/productosMasVendidos
	@GET
	@Path("/productosMasVendidos")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<ProductoDTO> productosMasVendidos()
	{
		try
		{
			ArrayList<ProductoDTO> productos = new ProductoService().productosMasVendidos();
			return productos;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	// http://localhost:8080/ApiFerreteriaSaravia/tipoget/usuariosConMasCompras
	@GET
	@Path("/usuariosConMasCompras")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<UsuarioDTO> usuariosConMasCompras()
	{
		try
		{
			ArrayList<UsuarioDTO> usuarios = new UsuarioService().usuariosConMasCompras();
			return usuarios;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	// http://localhost:8080/ApiFerreteriaSaravia/tipoget/ventasXusuario/C001
	@GET
	@Path("/ventasXusuario/{codigoU}")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<VentaDTO> ventasXusuario(@PathParam("codigoU") String codigoU)
	{
		try
		{
			ArrayList<VentaDTO> ventas = new VentaService().ventasXusuario(codigoU);
			return ventas;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}
}


















