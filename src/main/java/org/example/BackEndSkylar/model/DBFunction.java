package org.example.BackEndSkylar.model;

import java.sql.*;

public class DBFunction {


    //hier müssen die Zugangsdaten des Datenbanksnutzers eingegeben werden!!
    private static final String url = "jdbc:mysql://localhost:3306/skylardatabase";
    private static final String user = "root";
    private static final String password = "root";


    public static void securePW(User userPW){

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stat = conn.createStatement();

            stat.executeUpdate("set @hash = md5((select password from user where id = "+userPW.getId()+"))");
            stat.executeUpdate("update user set password = @hash where id = "+ userPW.getId() );


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static String comparePW(String loginPW){
        ResultSet rs;
        String rs1 ="";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stat = conn.createStatement();

            stat.executeUpdate("create table if not exists tempUser(hashedPW varchar(255)) ");
            stat.executeUpdate("set @hash = md5(('"+ loginPW +"')) ");
            stat.executeUpdate("insert into tempuser(hashedPW) VALUES(@hash) ");
            rs = stat.executeQuery("select hashedPW from tempUser");

            while(rs.next()){
                rs1 = rs.getString("hashedPW");
            }

            stat.executeUpdate("drop table tempUser");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return rs1;
    }


}
