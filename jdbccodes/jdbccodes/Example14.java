/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbccodes;

import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author SCALive
 */
public class Example14 {

    public static void main(String[] args) {
        Connection conn = null;
        boolean error=false;
       
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-BDJ7I7H:1521/xe", "advjavabatch2", "mystudents");
            Statement st = conn.createStatement();
            conn.setAutoCommit(false);
            st.addBatch("update employees set sal=sal+500 where deptno=20");
            st.addBatch("Insert into allbooks values(102,'Mastering Adv Java',800)");
            st.addBatch("delete from product where prodid>=102");
            int []arr=st.executeBatch();
            for(int i=0;i<arr.length;i++){
                System.out.println("Query no "+(i+1)+" effected "+arr[i]+" rows");
            }
            
        }
        catch(BatchUpdateException buex){
            int []arr=buex.getUpdateCounts();
            System.out.println("Query no:"+(arr.length+1)+" generated exception");
            System.out.println("BatchUpdateException:"+buex.getMessage());
            
            
            error=true;
        }
        catch (SQLException ex) {
            System.out.println("Exeception in DB:" + ex.getMessage());
            error=true;
        } 
       
        finally {
            try {
                if(conn!=null){
                if(!error){
                    conn.commit();
                    System.out.println("Done! Records sent and changes made!");
                }else{
                    conn.rollback();
                    System.out.println("Sorry! some query in the batch failed, so we rolled back");
                }
                }
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
