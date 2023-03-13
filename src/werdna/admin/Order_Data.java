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
import java.util.ArrayList;
import javax.swing.JLabel;
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
            ResultSet rs = stat.executeQuery("SELECT * FROM Orders ORDER BY OrderID DESC");
            rs.next();
            return new Order(rs.getInt("ID"),rs.getInt("OrderID"), bi.getWhiskyID(), bi.getQuantity());
            
        }catch(SQLException e)
        {
            System.out.println("[!] Error: " + e);
            return null;
        }
    }
    
    public static void addOrder(Order o)
    {
        if(!Database_Data.foundDrivers()){return;}
        
        try
        {
            Connection con = Database_Data.getConnection();
            Statement stat = con.createStatement();
            stat.executeUpdate("INSERT INTO Orders (id, OrderId, ItemID, Quantity)"
                    + "VALUES("
                    + String.valueOf(o.getId())
                    + ", "
                    + String.valueOf(o.ItemID)
                    + ", "
                    + String.valueOf(o.Quantity)
                    + ")");            
        }catch(SQLException e)
        {
            System.out.println("[!] Error: " + e);
            return;
        }
    }
    
    public static ArrayList<Order> getOrderByID(int id)
    {
        ArrayList<Order> orders = new ArrayList();
        if(Database_Data.foundDrivers())
        {
            try
            {
                Connection con = Database_Data.getConnection();
                Statement stat = con.createStatement();
                ResultSet rs = stat.executeQuery("SELECT * FROM Orders WHERE OrderId=" + String.valueOf(id));
                
                while(rs.next())
                {
                    orders.add(new Order(rs.getInt("id"), rs.getInt("OrderID"), rs.getInt("ItemID"), rs.getByte("Quantity")));
                }
            }catch(SQLException e)
            {
                System.out.println("[!] Error: " + e);
            }
        }
        return orders;
    }
    
    public static int getLastID()
    {
        return 0;
    }
        
    public static JLabel[] getLabels( int y, JLabel orderid, JLabel total, double totalCost, int orderId)
    {
        JLabel[] labels = new JLabel[2];
        labels[0] = new JLabel(String.valueOf(orderId));
        labels[0].setBounds(orderid.getBounds().x, y, 100, 10);
        
        labels[1] = new JLabel(String.valueOf(totalCost));
        labels[1].setBounds(total.getBounds().x, y, 100, 10);
        
        return labels;
    }
}
