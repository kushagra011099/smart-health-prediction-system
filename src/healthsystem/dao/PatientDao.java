/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthsystem.dao;

import healthsystem.DBUtil.DBConnection;
import healthsystem.pojo.Patient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class PatientDao {
    public static boolean addRec(Patient p)throws SQLException
    {
         Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into patient values(?,?,?)");
        ps.setString(1,p.getPname());
        ps.setString(2,p.getDisease());
        ps.setString(3,p.getDoctorname());
        int ans=ps.executeUpdate();
        if(ans==1)
            return true;
        return false;
    }
    public static ArrayList<Patient> getallData() throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ArrayList<Patient> patientlist=new ArrayList<>();
        ResultSet rs=st.executeQuery("select * from patient");
        while(rs.next())
        {
            String username=rs.getString(1);
            String disease=rs.getString(2);
            String docname=rs.getString(3);
            Patient p=new Patient(username,disease,docname);
            patientlist.add(p);
        }
        return patientlist;
    }
}
