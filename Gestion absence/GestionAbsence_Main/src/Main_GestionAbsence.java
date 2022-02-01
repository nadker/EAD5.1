import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import DAOConnection.DBConnection;
import Domaine.AvoirAbsence;
import Domaine.Etudiant;
import Domaine.Matiere;
import IDAO.IDAO_AvoirAbsence;
import IDAO.IDAO_Matiere;
import Service.GererAbsence;
import DAOImplement.Imp_AvoirAbsence;
//import DAOImp.DAOImpGererEtudiant;
//import DAOImp.DAOImpGererMatiere;


public class Main_GestionAbsence {
	
	private static final GererAbsence AbsenceBusiness =  new GererAbsence(new  Imp_AvoirAbsence());

	public  static void main(String[] args) throws IOException
    {
		//GererAbsence AbsenceBusiness = new GererAbsence(new  Imp_AvoirAbsence());
	 int keyboard;
    do {    	
    	keyboard=menu();
    	} while ((keyboard != 1)&&(keyboard != 2)&&(keyboard != 3)&&(keyboard != 4));
    switch (keyboard)
    {
        case 1:
        	
           ; break;
        case 2:
          ; break;
        case 3:
            ; break;
        case 4:
            ; break;
    }}

	
private static int menu()throws IOException {
	
	int choix=0 ;
	String input="";
	Scanner in = new Scanner(System.in);
	 	
	System.out.println("---------->>>>>> GESTION   ABSCENCE <<<<<<----------");
    System.out.println(" \n                   BIENVENUE ");
    System.out.println("\n");
    System.out.println("\n++++++++++++++++++++++ MENU ++++++++++++++++++++++");
  	System.out.println("Tapez 1 pour afficher la liste des absences");
	System.out.println("Tapez 2 pour afficher les Nombres d'abscences");
	System.out.println("Tapez 3 pour afficher les Etudiant elimin� ");
	System.out.println("Tapez 4 pour quitter le programme ");
	
	System.out.println(".........Attente de saisie.........");
	input=in.next();
	
		if ( (input=="1")||(input=="2")||(input=="3")||(input=="4"))
		   choix = Integer.parseInt(input);
	   else	{
		   choix=0;
		   System.out.println(" ****** Erreur de saisie *******");
		   System.out.println(" *******************************");
		   System.out.println(" *********** Reload ************");
	    }
 	return choix;
}

private static void Afficher_liste_abscence() throws SQLException
{
	List <AvoirAbsence> AfficherAbsence=AbsenceBusiness.AfficherAbsence(null, null, 0, 0);
			
}
}


