package NombreRomain;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: arsendeur
 * Date: 13/02/13
 * Time: 11:08
 * To change this template use File | Settings | File Templates.
 */
public class NombreRomain {
    private Map<String, Integer> listeDesNombresRomain = new HashMap<String, Integer>();
    private int nombreTotal;
    private int nombrePrecedent;

    public NombreRomain()
    {
        listeDesNombresRomain.put("I", 1);
        listeDesNombresRomain.put("V", 5);
        listeDesNombresRomain.put("X", 10);
        listeDesNombresRomain.put("L", 50);
        listeDesNombresRomain.put("C", 100);
        listeDesNombresRomain.put("D", 500);
        listeDesNombresRomain.put("M", 1000);
    }

    public int  RomainToNombre(String nombreRomainAConvertir)
    {
        nombreTotal = 0;
        nombrePrecedent = 0;
        for(final char nombreRomain : nombreRomainAConvertir.toCharArray())
        {
            additionneLeNombreTotalAvecLeNombreRomainDonne(nombreRomain);
        }
        return nombreTotal;
    }

    private void additionneLeNombreTotalAvecLeNombreRomainDonne(char nombreRomain) {
        if(LeNombrePrecedenEstPlusPetitQueLeNombreRomain(nombreRomain))
        {
            EnleverLeNombreRomainAuNombreTotal(nombreRomain);
        }
        else
        {
            AjouterLeNombreRomainAuNombreTotal(nombreRomain);
        }
        miseAJourDuNombrePrecedent(nombreRomain);
    }

    private void miseAJourDuNombrePrecedent(char nombreRomain) {
        nombrePrecedent = listeDesNombresRomain.get(Character.toString(nombreRomain));
    }

    private void AjouterLeNombreRomainAuNombreTotal(char nombreRomain) {
        nombreTotal += listeDesNombresRomain.get(Character.toString(nombreRomain));
    }

    private void EnleverLeNombreRomainAuNombreTotal(char nombreRomain) {
        nombreTotal += listeDesNombresRomain.get(Character.toString(nombreRomain)) - (nombrePrecedent*2);
    }

    private boolean LeNombrePrecedenEstPlusPetitQueLeNombreRomain(char nombreRomain) {
        return nombrePrecedent < listeDesNombresRomain.get(Character.toString(nombreRomain));
    }

}
