package edu.cibertec.services;

import java.util.ArrayList;

import edu.cibertec.dao.DAOFactory;
import edu.cibertec.dto.ProductoDTO;
import edu.cibertec.interfaces.ProductoDAO;

public class ProductoService implements ProductoDAO
{
	DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	
	ProductoDAO dao = fabrica.getProductoDAO();

	@Override
	public ProductoDTO buscar(String codigo) 
	{
		return dao.buscar(codigo);
	}

	@Override
	public ArrayList<ProductoDTO> productosMasVendidos()
	{
		return dao.productosMasVendidos();
	}

	@Override
	public int actualizarProducto(ProductoDTO p)
	{
		return dao.actualizarProducto(p);
	}
}
