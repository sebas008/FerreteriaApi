package edu.cibertec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import edu.cibertec.dto.ProductoDTO;
import edu.cibertec.interfaces.ProductoDAO;
import edu.cibertec.utils.MySQLConexion;

public class MySQLProductoDAO implements ProductoDAO
{
	@Override
	public ProductoDTO buscar(String codigo) 
	{
		ProductoDTO p = null;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try
		{
			con = MySQLConexion.getConexion();
			String sql = "select * from tb_producto where cod_prod = ?;";
			pst = con.prepareStatement(sql);
			pst.setString(1, codigo);
			rs = pst.executeQuery();
			while(rs.next())
			{
				p = new ProductoDTO();
				p.setCodigo(rs.getString(1));
				p.setCodCategoria(rs.getString(2));
				p.setDescripcion(rs.getString(3));
				p.setMarca(rs.getString(4));
				p.setUniMed(rs.getString(5));
				p.setStockAct(rs.getInt(6));
				p.setStockMin(rs.getInt(7));
				p.setPrecio(rs.getDouble(8));
			}
		}
		catch(Exception e)
		{
			System.out.println("Error al buscar, " + e.getMessage());
		}
		finally
		{
			try
			{
				if(con != null) con.close();
				if(pst != null) pst.close();
			}
			catch(Exception e)
			{
				System.out.println("Error al cerrar");
			}
		}
		return p;
	}

	@Override
	public ArrayList<ProductoDTO> productosMasVendidos()
	{
		ArrayList<ProductoDTO> productos = new ArrayList<>();
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try
		{
			con = MySQLConexion.getConexion();
			String sql = "{call sp_productos_mas_vendidos()}";
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next())
			{
				ProductoDTO p = new ProductoDTO();
				p.setCodigo(rs.getString(1));
				p.setCodCategoria(rs.getString(2));
				p.setDescripcion(rs.getString(3));
				p.setMarca(rs.getString(4));
				p.setUniMed(rs.getString(5));
				p.setStockAct(rs.getInt(6));
				p.setStockMin(rs.getInt(7));
				p.setPrecio(rs.getDouble(8));
				p.setCantidadVendida(rs.getInt(9));
				
				productos.add(p);
			}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				if(con != null) con.close();
				if(pst != null) pst.close();
			}
			catch(Exception e)
			{
				System.out.println("Error al cerrar");
			}
		}
		return productos;
	}

	@Override
	public int actualizarProducto(ProductoDTO p)
	{
		int rs = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		try
		{
			con = MySQLConexion.getConexion();
			String sql = "{call sp_actualizar_producto(?,?,?,?,?,?,?,?)}";
			pst = con.prepareStatement(sql);
			pst.setString(1, p.getCodigo());
			pst.setString(2, p.getCodCategoria());
			pst.setString(3, p.getDescripcion());
			pst.setString(4, p.getMarca());
			pst.setString(5, p.getUniMed());
			pst.setInt(6, p.getStockAct());
			pst.setInt(7, p.getStockMin());
			pst.setDouble(8, p.getPrecio());
			
			rs = pst.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				if(con != null) con.close();
				if(pst != null) pst.close();
			}
			catch(Exception e)
			{
				System.out.println("Error al cerrar");
			}
		}
		
		return rs;
	}
}

























