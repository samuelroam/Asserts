import org.junit.Test;
import static org.junit.Assert.*;

public class Main {

		 @Test
		    public void AssertArrayEquals(){
			 
			 
			 String[] array1 = {"apple", "mango", "grape"};
			 
		     String[] array2 = {"apple", "mango", "grape"};
		     assertArrayEquals(array1, array2);
		 }

		 public class AssertFalse {
			 
			    public boolean espar(int numero){
			         
			        boolean result = false;
			        if(numero%2 == 0){
			            result = true;
			        }
			        return result;
			    }
			     
			    @Test
			    public void NumeroTest(){
			        AssertFalse numero = new AssertFalse();
			        assertFalse(numero.espar(3));
			    }
		 }

		 public class AssertTrue {
			 
			    public boolean espar(int numero){
			         
			        boolean result = false;
			        if(numero%2 == 0){
			            result = true;
			        }
			        return result;
			    }
			     
			    @Test
			    public void NumeroTest(){
			        AssertTrue numero = new AssertTrue();
			        assertTrue(numero.espar(3));
			    }
		 }
		
}