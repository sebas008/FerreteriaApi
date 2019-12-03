package edu.cibertec.interfaces;

import java.util.ArrayList;

import edu.cibertec.dto.UsuarioDTO;

public interface UsuarioDAO
{
	public ArrayList<UsuarioDTO> listado();
	
	public ArrayList<UsuarioDTO> usuariosConMasCompras();
	
	public UsuarioDTO login(String email, String clave);
	
	public int registrar(UsuarioDTO u);
	
	public int actualizar(UsuarioDTO u);
	
	public String ultimoCodUsuario();
	
	public ArrayList<UsuarioDTO> usuariosXproducto(String producto);
}
