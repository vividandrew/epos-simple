/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package werdna.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import werdna.items.Basket_Item;

import werdna.items.Database_Data;

/**
 *
 * @author Andrew
 */
public class Order_Data {
    public static Order createnewOrder(Basket_Item bi)
    {
        if(!Database_Data.foundDrivers()){return null;}
        try
        {
            Connection con = Database_Data.getConnection();
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM Orders ORDER BY OrderID DEC");
            rs.next();
            return new Order(rs.getInt("ID"),rs.getInt("OrderID"), bi.getWhiskyID(), bi.getQuantity());
            
        }catch(SQLException e)
        {
            System.out.println("[!] Error: " + e);
            return null;
        }
    }
}
