/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbccodes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author SCALive
 */
public class Example4 {
    
    public static void main(String[] args) {
        Connection conn=null;
        try{
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-BDJ7I7H:1521/xe", "advjavabatch2", "mystudents");
            Statement st=conn.createStatement();
            String query="insert into employees values(107,'Jayant',40000,30)";
            int res;
            res=st.executeUpdate(query);
            System.out.println("No of rows affected:"+res);
            
        }catch(SQLException ex){
            System.out.println("Exeception in DB:"+ex.getMessage());
        }finally{
            try{
                if(conn!=null){
                    conn.close();
                    System.out.println("Disconnected successfully with the DB");
                }
            }catch(SQLException ex){
                System.out.println("Exception in closing the connection:"+ex.getMessage());
            }
        }
    }
    
}
