
package CONTROL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {
    
    Connection enlazar = null ;
    
    public Connection conectar(){  
        

        try 
        {
            // establecemos quien es el driver del motor de BD
           Class.forName("com.mysql.jdbc.Driver");
           enlazar = DriverManager.getConnection("jdbc:mysql://localhost/bd_ibed","root","");
        } catch (Exception e) 
        { 
            JOptionPane.showMessageDialog(null, "No se conecto");
        }
        return enlazar;
    }
}
