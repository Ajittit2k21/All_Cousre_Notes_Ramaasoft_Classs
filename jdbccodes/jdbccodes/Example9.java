
package jdbccodes;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;


public class Example9 {
    public static void main(String[] args) {
        Connection conn=null;
        try{
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-BDJ7I7H:1521/xe", "advjavabatch2", "mystudents");
            System.out.println("Connected successfully to the DB");
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("Select ename,hiredate from employees order by hiredate");
            SimpleDateFormat sdf=new SimpleDateFormat("dd-MMMM-yyyy");
            while(rs.next()){
                String ename=rs.getString(1);
                Date hd=rs.getDate(2);
                String dateStr=sdf.format(hd);
                System.out.println(ename+"\t"+dateStr);
                
            }
            
            
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
