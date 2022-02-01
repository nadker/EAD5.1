package IDAO;

import java.util.List;
import Domaine.AvoirAbsence;
import java.sql.SQLException;


public interface IDAO_AvoirAbsence {
	boolean AjoutAvAbsence(AvoirAbsence AvoirAbsence)
    throws SQLException;
	boolean ModifierAvAbsence(AvoirAbsence AvoirAbsence)
    throws SQLException;
	boolean SupprimerAvAbsence(AvoirAbsence AvoirAbsence)
    throws SQLException;
	List <AvoirAbsence> RecupererAvAbsence()
	throws SQLException;
    

	
}
