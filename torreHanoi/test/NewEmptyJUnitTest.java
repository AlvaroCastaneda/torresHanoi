/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.ScoreDao;
import javax.transaction.Transaction;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Score;
import hbm.HibernateUtil;

/**
 *
 * @author tank3
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void  hello() {
         
         ScoreDao sd = new ScoreDao();
         sd.saveScore(new Score("tanke",3,1));
         sd.saveScore(new Score("tanke",4,1));
         sd.saveScore(new Score("tanke",5,1));
         sd.saveScore(new Score("tanke",6,1));
         sd.saveScore(new Score("tanke",7,1));
         sd.saveScore(new Score("tanke",8,1));
         sd.saveScore(new Score("tanke",9,1));
         sd.saveScore(new Score("tanke",10,1));
         sd.saveScore(new Score("tanke",11,1));
         sd.saveScore(new Score("tanke",12,1));
         sd.saveScore(new Score("tanke",13,1));
         sd.saveScore(new Score("tanke",14,1));
         sd.saveScore(new Score("tanke",15,1));
         sd.saveScore(new Score("tanke",16,1));
         sd.saveScore(new Score("tanke",17,1));
         sd.saveScore(new Score("tanke",18,1));
         sd.saveScore(new Score("tanke",19,1));
         sd.saveScore(new Score("tanke",20,1));
         sd.saveScore(new Score("tanke",21,1));
         sd.saveScore(new Score("tanke",22,1));
         sd.saveScore(new Score("tanke",23,1));
         sd.saveScore(new Score("tanke",24,1));
         sd.saveScore(new Score("tanke",25,1));
         sd.saveScore(new Score("tanke",26,1));
         sd.saveScore(new Score("tanke",27,1));
         sd.saveScore(new Score("tanke",28,1));
         sd.saveScore(new Score("tanke",29,1));
         sd.saveScore(new Score("tanke",30,1));
         
         
         
  
     }
}
