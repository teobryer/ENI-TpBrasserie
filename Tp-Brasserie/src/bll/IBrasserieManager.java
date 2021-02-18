package bll;

import java.util.List;

import bo.Biere;
import bo.Brasserie;
import dal.DALException;

public interface IBrasserieManager {

	List<Biere> recupererBiereByType(String type) throws DALException;

	List<Biere> recupererBiereByRegion(String region) throws DALException;

	List<Biere> recupererBiereByBrasserie(int id) throws DALException;

	List<Biere> recupererBiereByBrasserie(Brasserie brasserie) throws DALException;

	void supprimerAnciennesBieres() throws DALException;

	void supprimerBieresMauvaisesNotes() throws DALException;

	void noterBiere(Biere biere, int note) throws DALException;

	Biere biereById(int id) throws DALException;
	
	List<Biere> recupererBieres() throws DALException;

}
