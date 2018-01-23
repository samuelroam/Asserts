import java.lang.reflect.Method;
import org.junit.Test;
import static org.junit.Assert.*;

class Connection {
	 private static String connection;
	 public static Method connect() {
		 connection = "Connected at 127.0.0.1";
		return null;
	 }
	 public static String getConnetion() {
		 return connection;
  }
	 @Test
	 public void sinconexion() {
		 Object getConnection = null;
		assertNotNull(getConnection);
	 }
	 
	 @Test 
	 public void conexion() {
		 Object getConnection = null;
		 assertNull(getConnection);
	 }
}