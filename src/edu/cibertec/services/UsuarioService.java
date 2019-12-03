package edu.cibertec.services;

import java.util.ArrayList;

import edu.cibertec.dao.DAOFactory;
import edu.cibertec.dto.UsuarioDTO;
import edu.cibertec.interfaces.UsuarioDAO;

public class UsuarioService implements UsuarioDAO
{
	DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	
	UsuarioDAO dao = fabrica.getUsuarioDAO();

	@Override
	public UsuarioDTO login(String email, String clave) 
	{
		return dao.login(email, clave);
	}

	@Override
	public int registrar(UsuarioDTO u) 
	{
		return dao.registrar(u);
	}

	@Override
	public String ultimoCodUsuario() 
	{
		return dao.ultimoCodUsuario();
	}

	@Override
	public ArrayList<UsuarioDTO> listado() 
	{
		return dao.listado();
	}

	@Override
	public int actualizar(UsuarioDTO u) 
	{
		return dao.actualizar(u);
	}

	@Override
	public ArrayList<UsuarioDTO> usuariosConMasCompras()
	{
		return dao.usuariosConMasCompras();
	}

	@Override
	public ArrayList<UsuarioDTO> usuariosXproducto(String producto)
	{
		return dao.usuariosXproducto(producto);
	}
}
