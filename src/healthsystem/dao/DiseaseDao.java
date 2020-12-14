/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthsystem.dao;

import healthsystem.DBUtil.DBConnection;
import healthsystem.pojo.Disease;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DiseaseDao {
    public static Disease searchDisease(String sym1,String sym2,String sym3) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select name,doctorname from disease where sym1=? and sym2=? and sym3=?");
        ps.setString(1,sym1);
        ps.setString(2,sym2);
        ps.setString(3,sym3);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
           String dname=rs.getString(1);
           String doctor=rs.getString(2);
           Disease d=new Disease(dname,sym1,sym2,sym3,doctor);
           return d;
        }
        return null;
    }
}
