/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package werdna.admin;

import javax.swing.JLabel;
import werdna.items.Whisky_Data;

/**
 *
 * @author Andrew
 * To be saved for the final addition to the project
 * Viewing Orders
 */
public class Order {
    final int id;
    final int OrderID;
    final int ItemID;
    final byte Quantity;
    
    public Order(int id, int OrderID, int ItemID, byte Quantity)
    {
        this.id = id;
        this.OrderID = OrderID;
        this.ItemID = ItemID;
        this.Quantity = Quantity;
    }
    
    public double getTotal()
    {        
        return Whisky_Data.getSelectedWhisky(String.valueOf(this.ItemID)).getPrice() * this.Quantity;
    }
    
    public int getId(){return this.id;}
    public int getOrderID(){return this.OrderID;}
}
