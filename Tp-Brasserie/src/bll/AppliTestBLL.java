package bll;

import bo.Biere;
import dal.DALException;

public class AppliTestBLL {

	public static void main(String[] args) {
	IBrasserieManager managerBrasserie	= BrasserieManagerSingleton.getInstance();
	 
		try {
			Biere b = managerBrasserie.biereById(1);
			managerBrasserie.noterBiere(b, 4);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
////			for (Biere b : managerBrasserie.recupererBieres()) {
////				int nombreAleatoire = 1 + (int)(Math.random() * ((5 - 1) + 1));
////				managerBrasserie.noterBiere(b, nombreAleatoire);
////			}
//		} catch (DALException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			managerBrasserie.supprimerAnciennesBieres();
			managerBrasserie.supprimerBieresMauvaisesNotes();
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
