package pizza;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Casper
 */
public class AdderTest {
    
    public AdderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Adder.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 0;
        int b = 1;
        int expResult = 1;
        int result = Adder.add(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAdd2() {
        System.out.println("add");
        int a = 0;
        int b = 1;
        int expResult = 1;
        int result = Adder.add(a, b);
        assertEquals(expResult, result);
    }
}
