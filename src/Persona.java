import static org.junit.Assert.*;

import org.junit.Test;

public class Persona {

		  public String nombre;
		  public String apellidos;
		  
		  public void testsame() {
		  Persona p1 = new Persona();
		  p1.nombre = "Paco";
		  p1.apellidos = "Petardos";
		  
		  Persona p2 = new Persona();
		  p2.nombre = "Chema";
		  p2.apellidos = "chispas";
		  }
		  @Test
		    public void AssertSame(){
		         
				Object p1 = null;
				assertSame(p1, p1);
				asserEquals(p1, p1);
				Object p2 = null;
				assertNotSame(p1, p2);
				assertNotEquals(p1, p2);
		    }
		private boolean asserEquals(Object p1, Object p12) {
			// TODO Auto-generated method stub
		        boolean status = false;	
		        if(p1 == p12){
		            status = true;
		        }
		        return status;
		}
}