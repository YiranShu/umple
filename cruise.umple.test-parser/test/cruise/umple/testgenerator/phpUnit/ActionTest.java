/* EXPERIMENTAL CODE - NON COMPILEABLE VERSION OF Umple xUnit Model */
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE @UMPLE_VERSION@ modeling language!*/



import org.junit.*;

////---- Tests for  Action.ump----/////



public class ActionTest {
 
 
 

  @Before
  public void setup(){

  }


 

  @After
  public void teardown(){


  }


 
  @Test
  public void someTest()
  {            
            Person p1 = new Person ("John","123","someAddrss");  
            p1.setName("Jane");  
            p1.setId(321);     
            Assert.assertTrue (p1.getId()!=null);
    
  }  
  
 
 

}
