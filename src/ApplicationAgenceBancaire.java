import java.util.ArrayList;

import action.Action;
import action.ActionAjouterCompte;
import action.ActionContext;
import action.ActionDeposerArgent;
import action.ActionList;
import action.ActionListeDesComptes;
import action.ActionSupprimerCompte;
import action.ActionVoirCompteNumero;
import actionList.ActionListAgenceBancaire;
import banque.AgenceBancaire;

public class ApplicationAgenceBancaire {



	public static void main(String argv[]) {
		AgenceBancaire ab = new AgenceBancaire("Caisse ecureuil", "Pibrac");
		Action<AgenceBancaire> a1 = new ActionListeDesComptes<AgenceBancaire>("Afficher les comptes de l'agence");
		Action<AgenceBancaire> a2 = new ActionVoirCompteNumero<AgenceBancaire>("Afficher le compte (par son numéro)");
		Action<AgenceBancaire> a3 = new ActionAjouterCompte<AgenceBancaire>("Ajouter un compte");
		Action<AgenceBancaire> a4 = new ActionSupprimerCompte<AgenceBancaire>("Supprimer un compte");
		Action<AgenceBancaire> a5 = new ActionDeposerArgent<AgenceBancaire>("Deposer");
		Action<AgenceBancaire> a6 = new ActionRetirerArgent<>("Retirer");

		ArrayList<Action<AgenceBancaire>> liste1 = new ArrayList<Action<AgenceBancaire>>();
		ArrayList<Action<AgenceBancaire>> liste2 = new ArrayList<Action<AgenceBancaire>>();
		ArrayList<Action<AgenceBancaire>> liste3 = new ArrayList<Action<AgenceBancaire>>();

		liste2.add(a5);
		liste2.add(a6);

		liste3.add(a3);
		liste3.add(a4);

		Action<AgenceBancaire> m1 = new ActionListAgenceBancaire<AgenceBancaire>("Afficher le menu des opérations sur comptes", "Opérations comptes", liste2);
		Action<AgenceBancaire> m2 = new ActionListAgenceBancaire<AgenceBancaire>("Afficher le menu de gestion des comptes", "Gestions comptes", liste3);



		liste1.add(a1);
		liste1.add(a2);
		liste1.add(m1);
		liste1.add(m2);

		ActionList<AgenceBancaire> al = new ActionListAgenceBancaire<AgenceBancaire>("Menu principal","Général", liste1);
		try {
			al.execute(ab);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}