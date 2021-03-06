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
    public void peutAfficherNombresBasiques()
    {
        NombreRomain unNombreRomain = new NombreRomain();

        assertEquals(unNombreRomain.RomainToNombre("I"), 1);
        assertEquals(unNombreRomain.RomainToNombre("V"), 5);
        assertEquals(unNombreRomain.RomainToNombre("X"), 10);
        assertEquals(unNombreRomain.RomainToNombre("L"), 50);
        assertEquals(unNombreRomain.RomainToNombre("C"), 100);
        assertEquals(unNombreRomain.RomainToNombre("D"), 500);
        assertEquals(unNombreRomain.RomainToNombre("M"), 1000);

    }

    @Test
    public void peutAfficherDesNombresPlusCompliques()
    {
        NombreRomain unNombreRomain = new NombreRomain();

        assertEquals(unNombreRomain.RomainToNombre("II"), 2);
        assertEquals(unNombreRomain.RomainToNombre("VIII"), 8);
        assertEquals(unNombreRomain.RomainToNombre("MDCLXVII"), 1667);
    }

    @Test
    public void peutAfficheDesNombresEnSoustraction()
    {
        NombreRomain unNombreRomain = new NombreRomain();

        assertEquals(unNombreRomain.RomainToNombre("IV"), 4);
        assertEquals(unNombreRomain.RomainToNombre("IX"), 9);
        assertEquals(unNombreRomain.RomainToNombre("CMXLIV"), 944);
        assertEquals(unNombreRomain.RomainToNombre("MMMMCMXCIX"), 4999);
    }

}
