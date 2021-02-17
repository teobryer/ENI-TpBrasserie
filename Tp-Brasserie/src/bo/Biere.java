package bo;

import java.util.Calendar;

public class Biere {

	private int idBiere;
	private String nom;
	private Brasserie brasserie;
	private String type;
	private Calendar dateInsert;
	
	
	
	
	public Biere(int idBiere, String nom, Brasserie brasserie, String type, Calendar dateInsert) {
		super();
		this.idBiere = idBiere;
		this.nom = nom;
		this.brasserie = brasserie;
		this.type = type;
		this.dateInsert = dateInsert;
	}
	
	public int getIdBiere() {
		return idBiere;
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
