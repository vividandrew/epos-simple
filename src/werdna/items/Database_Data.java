/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package werdna.items;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Andre
 */
public class Database_Data {
            
    
    public static boolean foundDrivers()
    {
        
        try 
            {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                return true;
            } 
        catch(ClassNotFoundException e) 
            {
                return false;
            }
    }
    
    public static Connection getConnection()
    {
        try
        {
            if(foundDrivers())
            {
                return DriverManager.getConnection("jdbc:ucanaccess://Data\\EPOS.accdb");
            }else{
                return null;
            }
        }catch(SQLException e)
        {
            System.out.print("[!] Error:" + e);
            return null;
        }
    }
}
