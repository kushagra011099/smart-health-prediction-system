
package healthsystem.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DBConnection {
    private static Connection conn=null;
    static 
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-RB2GUV5U:1521/XE","HEALTHSYSTEM","456");
            JOptionPane.showMessageDialog(null,"Connection Open to the DB","Sucess",JOptionPane.INFORMATION_MESSAGE);
            
        }
        
        catch(ClassNotFoundException ex)
        {
           JOptionPane.showMessageDialog(null,"Driver Cannot be Loaded","Error",JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
        }
         catch(SQLException ex)
        {
           JOptionPane.showMessageDialog(null,"Cannot open Connection","Error",JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
        }
        
    }
    public static Connection getConnection()
    {
        return conn;
    }
    public static void CloseConnection()
    {
        if(conn!=null)
        {
        try
        {
         conn.close();
         JOptionPane.showMessageDialog(null," Connection Closed","Sucess",JOptionPane.INFORMATION_MESSAGE);

        }
         catch(SQLException ex)
        {
           JOptionPane.showMessageDialog(null,"Connot open Connection","Error",JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
        }
    }
    }
}
