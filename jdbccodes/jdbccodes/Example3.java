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
public class Example3 {
    
    public static void main(String[] args) {
        Connection conn=null;
        try{
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-BDJ7I7H:1521/xe", "advjavabatch2", "mystudents");
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("Select ename,sal,sum(sal),avg(sal)from employees");
            double total=0;
            int count=0;
            while(rs.next()){
                String ename=rs.getString(1);
                double sal=rs.getDouble(2);
                System.out.println(ename+"\t"+sal);
                total=total+sal;
                ++count;
            }
            System.out.println("Total salary is "+total);
            System.out.println("Avg salary is "+total/count);
            
            
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
