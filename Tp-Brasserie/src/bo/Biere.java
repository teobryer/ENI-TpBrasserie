package bo;

import java.util.Calendar;

import dal.DALException;
import dal.DAOFact;

public class Biere {

	private int idBiere;
	private String nom;
	private Brasserie brasserie;
	private String type;
	private Calendar dateInsert;
	private int note;
	
	
	
	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	/**
	 * Constructeur
	 * @param idBiere idBiere
	 * @param nom nom bi�re
	 * @param brasserie brasserie de la bi�re
	 * @param type type de bi�re
	 * @param dateInsert date d'ajout de la bi�re
	 */
	public Biere(int idBiere, String nom, Brasserie brasserie, String type, Calendar dateInsert) {
		super();
		this.idBiere = idBiere;
		this.nom = nom;
		this.brasserie = brasserie;
		this.type = type;
		this.dateInsert = dateInsert;
		this.note = 0;
	}
	
	
	
	public Biere(int idBiere, String nom, Brasserie brasserie, String type, Calendar dateInsert, int note) {
		super();
		this.idBiere = idBiere;
		this.nom = nom;
		this.brasserie = brasserie;
		this.type = type;
		this.dateInsert = dateInsert;
		this.note = note;
	}

	public Biere( String nom, Brasserie brasserie, String type, Calendar dateInsert) {
		super();
		
		this.nom = nom;
		this.brasserie = brasserie;
		this.type = type;
		this.dateInsert = dateInsert;
		this.note = 0;
	}
	
	public Biere( String nom, int idBrasserie, String type, Calendar dateInsert) throws DALException {
		super();
		
		this.nom = nom;
		this.brasserie = DAOFact.getBrasserieDAO().selectById(idBrasserie);
		this.type = type;
		this.dateInsert = dateInsert;
		this.note = 0;
	}
	
	public int getIdBiere() {
		return idBiere;
	}
	@Override
	public String toString() {
		return "Biere [idBiere=" + idBiere + ", nom=" + nom + ", brasserie=" + brasserie + ", type=" + type
				+ ", dateInsert=" + dateInsert.getTime() + "]";
	}

	public void setIdBiere(int idBiere) {
		this.idBiere = idBiere;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Brasserie getBrasserie() {
		return brasserie;
	}
	public void setBrasserie(Brasserie brasserie) {
		this.brasserie = brasserie;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Calendar getDateInsert() {
		return dateInsert;
	}
	public void setDateInsert(Calendar dateInsert) {
		this.dateInsert = dateInsert;
	}
	
	
}
