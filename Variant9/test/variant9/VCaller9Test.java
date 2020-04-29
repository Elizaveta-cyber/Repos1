/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variant9;

import java.util.ArrayList;
import java.util.TreeSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author пк
 */
public class VCaller9Test
{
    
    public VCaller9Test()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of getSubs method, of class VCaller9.
     */
    @Test
    public void testGetSubs()
    {    
        System.out.println("getSubs");
        TreeSet<String> strings= new TreeSet<>();
        strings.add("Liza");
        strings.add("Roma");
        strings.add("Elizaveta");
        
        String s = "za";
        VCaller9 instance = new VCaller9();
       
        ArrayList<String> expResult =new ArrayList<>();
      
        expResult.add("Elizaveta");
        expResult.add("Liza");
        ArrayList<String> result = instance.getSubs(strings,s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addMore method, of class VCaller9.
     */
    @Test
   public void testAddMore()
    {
        System.out.println("addMore");
        ArrayList<String> list = new ArrayList<>();
        list.add("Liza");
        list.add("Roma");
        
        VCaller9 instance = new VCaller9();
        boolean expResult = true;
        boolean result = instance.addMore(list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
