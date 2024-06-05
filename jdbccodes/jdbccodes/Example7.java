/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbccodes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author SCALive
 */
public class Example7 {
    
    public static void main(String[] args) {
        Connection conn=null;
        Scanner kb=new Scanner(System.in);
        
        
        
        System.out.println("Enter ther increment amoount");
        double amt=kb.nextDouble();
        
        System.out.println("Enter depno");
        int dno=kb.nextInt();
        
        try{
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-BDJ7I7H:1521/xe", "advjavabatch2", "mystudents");
            PreparedStatement ps=conn.prepareStatement("Update employees set sal=sal + ? where deptno=?");
            ps.setDouble(1, amt);
            ps.setInt(2, dno);
            int ans;
            ans=ps.executeUpdate();
            if(ans==0)
                    System.out.println("No records updated");
            else
                    System.out.println(ans + " records updated");
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
