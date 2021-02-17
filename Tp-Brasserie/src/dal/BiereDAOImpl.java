package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bo.Biere;


public class BiereDAOImpl implements DAO<Biere> {
	
	
	
	private String SELECT_BY_ID = "  USE PAPETERIE_DB SELECT * FROM Articles WHERE idArticle=?";
	private String SELECT_ALL = "  USE PAPETERIE_DB SELECT * FROM Articles";
	private String UPDATE = "  USE PAPETERIE_DB UPDATE Articles SET reference = ? ,marque = ? ,designation = ? ,prixUnitaire = ? ,qteStock = ? ,grammage = ? ,couleur = ? ,type =? WHERE idArticle= ?";
	private String INSERT = " USE PAPETERIE_DB INSERT INTO Articles (reference ,marque ,designation ,prixUnitaire ,qteStock ,grammage ,couleur ,type) VALUES (?,?,?,?,?,?,?,?)";
	private String DELETE = "  USE PAPETERIE_DB DELETE FROM Articles WHERE idArticle= ?";
	@Override
	public Biere selectById(int id) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Biere> selectAll() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void update(Biere e) throws DALException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insert(Biere e) throws DALException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(int id) throws DALException {
		// TODO Auto-generated method stub
		
	}
	
		
		
	}
	
	


