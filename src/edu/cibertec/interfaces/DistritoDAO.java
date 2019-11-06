package edu.cibertec.interfaces;

import java.util.ArrayList;

import edu.cibertec.dto.DistritoDTO;

public interface DistritoDAO 
{
	public ArrayList<DistritoDTO> lista();
	
	public DistritoDTO buscar(String codDistrito);
}
