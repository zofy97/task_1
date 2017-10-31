/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe_1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FIni
 */
public class BuchTest {

    /**
     * Test of getJahr method, of class Buch.
     */
    @Test
    public void testGetJahr() {
        System.out.println("getJahr");
        Buch instance = new Buch("1", "Hans Wurst", "Hallo", "192902", Verlag.VERLAG_5, 1998);
        int expResult = 1998;
        int result = instance.getJahr();
        assertTrue(expResult == instance.getJahr());
    }

    /**
     * Test of setJahr method, of class Buch.
     */
    @Test
    public void testSetJahr() {
        System.out.println("setJahr");
        int jahr = 1998;
        Buch instance = new Buch("1", "Hans Wurst", "Hallo", "192902", Verlag.VERLAG_5, 1998);
        instance.setJahr(jahr);
    }
}
