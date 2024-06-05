/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbccodes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author SCALive
 */
public class Example5 {
    
    public static void main(String[] args) {
        Connection conn=null;
        Scanner kb=new Scanner(System.in);
        
        System.out.println("Enter emp id");
        int id=kb.nextInt();
        
        System.out.println("Enter emp name");
        String name=kb.next();
        
        System.out.println("Enter salary");
        double amt=kb.nextDouble();
        
        System.out.println("Enter depno");
        int dno=kb.nextInt();
        
        try{
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-BDJ7I7H:1521/xe", "advjavabatch2", "mystudents");
            Statement st=conn.createStatement();
            String query="insert into employees values("+id+",'"+name+"',"+amt+","+dno+")";
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
