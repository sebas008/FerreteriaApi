package edu.cibertec.interfaces;

import java.util.ArrayList;

import edu.cibertec.dto.ProductoDTO;

public interface ProductoDAO 
{
	public ProductoDTO buscar(String codigo);
	
	public ArrayList<ProductoDTO> productosMasVendidos();
	
	public int actualizarProducto(ProductoDTO p);
}
