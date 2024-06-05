/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbccodes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author SCALive
 */
public class Example12 {

    public static void main(String[] args) {
        Connection conn = null;
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter path to the image");
        String imgPath=kb.nextLine();
        File imgFile=new File(imgPath);
        try {
            FileInputStream fin=new FileInputStream(imgPath);
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-BDJ7I7H:1521/xe", "advjavabatch2", "mystudents");
            PreparedStatement ps = conn.prepareStatement("Insert into allmovies values(?,?)");
            ps.setBinaryStream(2, fin,(int)imgFile.length());
            int indexOfFwdSl=imgPath.lastIndexOf("/");
            int lastDotPos=imgPath.lastIndexOf(".");
            String movName=imgPath.substring(indexOfFwdSl+1,lastDotPos);
            ps.setString(1,movName);
            int ans=ps.executeUpdate();
            System.out.println("Rec inserted:"+ans);
            
        }catch(FileNotFoundException fnf){
            System.out.println("File not present:"+fnf.getMessage());
        } 
        
        catch (SQLException ex) {
            System.out.println("Exeception in DB:" + ex.getMessage());
        } 
       
        finally {
            try {
                if (conn != null) {
                    conn.close();
                    System.out.println("Disconnected successfully with the DB");
                }
            } catch (SQLException ex) {
                System.out.println("Exception in closing the connection:" + ex.getMessage());
            }
        }
    }

}
