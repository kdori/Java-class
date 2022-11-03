
package test;

import java.sql.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
    
        Class<?> forName = Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");          
     String url = "jdbc:ucanaccess://C:/Users/ÉN/Documents/gmliszt.accdb";
            Connection conctn = DriverManager.getConnection(url);
            Statement statmnt = conctn.createStatement();
            String sql = "SELECT * FROM gmliszt";
            ResultSet rsltSet = statmnt.executeQuery(sql);
            while(rsltSet.next())
            {
                Double azon= rsltSet.getDouble("azon");
                String nev = rsltSet.getString("nev");
                Double altar = rsltSet.getDouble("altar");
                Double kedvsz= rsltSet.getDouble("kedvsz");
                Double aktar= rsltSet.getDouble("aktar");
                
            }    
            
            System.out.println(azon);
        
    }
    
    
}
