
package jdbccodes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Example1 {
    public static void main(String[] args) {
        try{
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-BDJ7I7H:1521/xe", "advjavabatch2", "mystudents");
            System.out.println("Connected successfully to the DB");
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("Select ename,sal from employees  where deptno=10");
            while(rs.next()){
                String ename=rs.getString(1);
                double sal=rs.getDouble(2);
                System.out.println(ename+"\t"+sal);
            }
            conn.close();
            System.out.println("Disconnedted successfully with the DB");
            
        }catch(SQLException ex){
            System.out.println("Exeception in DB:"+ex.getMessage());
        }
    }
    
}
