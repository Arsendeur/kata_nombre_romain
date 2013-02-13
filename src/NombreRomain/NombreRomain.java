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
        for(final char nombreRomain : nombreRomainAConvertir.toCharArray())
        {
            nombreTotal += listeDesNombresRomain.get(Character.toString(nombreRomain));
        }
        return nombreTotal;
    }
}
