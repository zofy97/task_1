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
    
    public BuchTest() {
    }
    
    @Before
    public void setUp() {
        Buch instance = new Buch("1", "Hans Wurst", "Hallo", "192902", Verlag.VERLAG_5, 1998);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Buch.
     */
    @Test
    public void testGetId() {
        Buch instance = new Buch("1", "Hans Wurst", "Hallo", "192902", Verlag.VERLAG_5, 1998);
        System.out.println("getId");
        String expResult = "1";
        String result = instance.getId();
        System.out.println(result);
        assertTrue(result.equals(expResult));
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Buch.
     */
    @Test
    public void testSetId() {
        Buch instance = new Buch("1", "Hans Wurst", "Hallo", "192902", Verlag.VERLAG_5, 1998);
        System.out.println("setId");
        String id = "1";
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutor method, of class Buch.
     */
    @Test
    public void testGetAutor() {
        Buch instance = new Buch("1", "Hans Wurst", "Hallo", "192902", Verlag.VERLAG_5, 1998);
        System.out.println("getAutor");
        String expResult = "Hans Wurst";
        String result = instance.getAutor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAutor method, of class Buch.
     */
    @Test
    public void testSetAutor() {
        Buch instance = new Buch("1", "Hans Wurst", "Hallo", "192902", Verlag.VERLAG_5, 1998);
        System.out.println("setAutor");
        String autor = "Hans Wurst";
        instance.setAutor(autor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitel method, of class Buch.
     */
    @Test
    public void testGetTitel() {
        System.out.println("getTitel");
        Buch instance = new Buch("1", "Hans Wurst", "Hallo", "192902", Verlag.VERLAG_5, 1998);
        String expResult = "Hallo";
        String result = instance.getTitel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitel method, of class Buch.
     */
    @Test
    public void testSetTitel() {
        System.out.println("setTitel");
        String titel = "Hallo";
        Buch instance = new Buch("1", "Hans Wurst", "Hallo", "192902", Verlag.VERLAG_5, 1998);
        instance.setTitel(titel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIsbn method, of class Buch.
     */
    @Test
    public void testGetIsbn() {
        System.out.println("getIsbn");
        Buch instance = new Buch("1", "Hans Wurst", "Hallo", "192902", Verlag.VERLAG_5, 1998);
        String expResult = "192902";
        String result = instance.getIsbn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsbn method, of class Buch.
     */
    @Test
    public void testSetIsbn() {
        System.out.println("setIsbn");
        String isbn = "192902";
        Buch instance = new Buch("1", "Hans Wurst", "Hallo", "192902", Verlag.VERLAG_5, 1998);
        instance.setIsbn(isbn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVerlag method, of class Buch.
     */
    @Test
    public void testGetVerlag() {
        System.out.println("getVerlag");
        Buch instance = new Buch("1", "Hans Wurst", "Hallo", "192902", Verlag.VERLAG_5, 1998);
        Verlag expResult = Verlag.VERLAG_5;
        Verlag result = instance.getVerlag();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVerlag method, of class Buch.
     */
    @Test
    public void testSetVerlag() {
        System.out.println("setVerlag");
        Verlag verlag = Verlag.VERLAG_5;
        Buch instance = new Buch("1", "Hans Wurst", "Hallo", "192902", Verlag.VERLAG_5, 1998);
        instance.setVerlag(verlag);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJahr method, of class Buch.
     */
    @Test
    public void testGetJahr() {
        System.out.println("getJahr");
        Buch instance = new Buch("1", "Hans Wurst", "Hallo", "192902", Verlag.VERLAG_5, 1998);
        int expResult = 1998;
        int result = instance.getJahr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
