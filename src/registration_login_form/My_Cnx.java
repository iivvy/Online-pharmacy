/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registration_login_form;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class My_Cnx {
    
    private static String servername = "localhost";
    private static String email = "root";
    private static String dbname = "users_db";
    private static Integer portnumber = 8889;
    private static String password="root";
    
    public static Connection getConnection(){
        Connection cnx = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(email);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            cnx = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(" Get Connection -> " + My_Cnx.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cnx;
    }
}
