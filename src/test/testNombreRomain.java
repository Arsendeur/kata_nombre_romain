import org.junit.Test;
import NombreRomain.NombreRomain;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: arsendeur
 * Date: 13/02/13
 * Time: 10:58
 * To change this template use File | Settings | File Templates.
 */
public class testNombreRomain {

    @Test
    public void peutAfficher1()
    {
        NombreRomain unNombreRomain = new NombreRomain();

        assertEquals(unNombreRomain.RomainToNombre("I"), 1);
    }

    @Test
    public void peutAfficher5()
    {
        NombreRomain unNombreRomain = new NombreRomain();

        assertEquals(unNombreRomain.RomainToNombre("V"), 5);
    }
}
