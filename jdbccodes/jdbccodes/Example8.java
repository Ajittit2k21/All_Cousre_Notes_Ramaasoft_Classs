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
public class Example8 {
    
    public static void main(String[] args) {
        Connection conn=null;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter depno");
        int dno=kb.nextInt();
        
        try{
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-BDJ7I7H:1521/xe", "advjavabatch2", "mystudents");
            PreparedStatement ps=conn.prepareStatement("Delete from employees where deptno=?");
            ps.setInt(1, dno);
            int ans;
            ans=ps.executeUpdate();
            if(ans==0)
                    System.out.println("No records deleted");
            else
                    System.out.println(ans + " records were deleted");
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
