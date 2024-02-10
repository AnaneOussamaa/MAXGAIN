package MaxGain.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDB {
    public static final String url = "jdbc:mysql://localhost:3306/test";
    public static final String user = "root";
    public static final String pwd = "";
    private Connection cnx;

    public static MyDB ct;

    public MyDB() {

        try {
            cnx = DriverManager.getConnection(url,user,pwd);
            System.out.println("ya hnee");
            System.out.println("cnxx etablie !!! ");
        }catch(SQLException e) {
            System.out.println("Hanii hnee");
            System.out.println(e.getMessage());
        }
    }


    public Connection getCnx() {
        return cnx;
    }

    public static MyDB getInstance(){

        if(ct==null){
            System.out.println("Hanoo");
            //ct = new MyDB;
        }
        return ct;
    }
}
