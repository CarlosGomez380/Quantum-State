
package edu.eci.cnyt;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ParticleTest {
    
    public ParticleTest() {
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
     * Test of norm method, of class Particle.
     */
    @Test
    public void testNorm() {
        Particle v= new Particle(4);
        v.setVector(0,new Complex(-3,-1));
        v.setVector(1,new Complex(0,-2));
        v.setVector(2,new Complex(0,1));
        v.setVector(3,new Complex(2,0));
        BigDecimal bd = new BigDecimal(v.norm()).setScale(4, RoundingMode.HALF_UP);
        double newInput = bd.doubleValue();
        assertEquals(4.3589, newInput, 0.0);
    }

    /**
     * Test of findPosition method, of class Particle.
     * @throws java.lang.Exception
     */
    @Test
    public void testFindPosition() throws Exception {
        Particle v= new Particle(4);
        v.setVector(0,new Complex(-3,-1));
        v.setVector(1,new Complex(0,-2));
        v.setVector(2,new Complex(0,1));
        v.setVector(3,new Complex(2,0));
        BigDecimal bd = new BigDecimal(v.findPosition(2)).setScale(5, RoundingMode.HALF_UP);
        double newInput = bd.doubleValue();
        assertEquals(0.05263, newInput, 0.0);
    }

    /**
     * Test of amplitud method, of class Particle.
     * @throws java.lang.Exception
     */
    @Test
    public void testAmplitud2() throws Exception {
        Particle v= new Particle(2);
        v.setVector(0,new Complex(Math.sqrt(2)/2,0));
        v.setVector(1,new Complex(0,Math.sqrt(2)/2));
        Complex[] c= new Complex[2];
        c[0]= new Complex(0,Math.sqrt(2)/2);
        c[1]= new Complex(-Math.sqrt(2)/2,0);
        Complex answ=v.amplitud(c);
        Complex d= new Complex(0,-1);
        BigDecimal bd = new BigDecimal(answ.getImag()).setScale(5, RoundingMode.HALF_UP);
        double newInput = bd.doubleValue();
        answ.setImag(newInput);
        assertEquals(d,answ);
    }
     
    
    /**
     * Test of amplitud method, of class Particle.
     * @throws java.lang.Exception
     */
    @Test
    public void testAmplitud() throws Exception {
        Particle v= new Particle(2);
        v.setVector(0,new Complex(1,0));
        v.setVector(1,new Complex(0,-1));
        Complex[] c= new Complex[2];
        c[0]= new Complex(0,1);
        c[1]= new Complex(1,0);
        Complex answ=v.amplitud(c);
        Complex d= new Complex(0,-1);
        BigDecimal bd = new BigDecimal(answ.getImag()).setScale(5, RoundingMode.HALF_UP);
        double newInput = bd.doubleValue();
        answ.setImag(newInput);
        assertEquals(d,answ);
    }

   
    
}
