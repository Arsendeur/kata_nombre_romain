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

    public NombreRomain()
    {
        listeDesNombresRomain.put("I", 1);
        listeDesNombresRomain.put("V", 5);
    }

    public int  RomainToNombre(String nombreRomainAConvertir)
    {
        return listeDesNombresRomain.get(nombreRomainAConvertir);
    }
}
