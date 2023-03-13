/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package werdna.admin;

/**
 *
 * @author Andrew
 */
public class Report {
    private int OrderID;
    private double Total;
    
    public Report(int OrderID, double Total)
    {
        this.OrderID = OrderID;
        this.Total = Total;
    }
    
    public int getOrderID(){return this.OrderID;}
    public double getTotal(){return this.Total;}
    
    @Override
    public String toString()
    {
        String str = String.valueOf(this.OrderID);
        str += " - ";
        str += String.valueOf(this.Total);
        str += "\n";
        return str;
    }
}
