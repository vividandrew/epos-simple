/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package werdna.items;

/**
 *
 * @author Andre
 */
public class Whisky {
    
    private int id;
    private String name;
    private String image;
    private String description;
    private double price;
    
    public Whisky(int id, String name, String image, String description, double price)
    {
        this.id = id;
        this.name = name;
        this.image = image;
        this.description = description;
        this.price = price;
    }
    
    
    // =========================
    /*    GETTERS / SETTERS      */
    // =========================
    public int getId(){return this.id;}
    
    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}
    
    public String getImage(){return this.image;}
    public void setImage(String image){this.image = image;}
    
    public String getDescription(){return this.description;}
    public void setDescription(String description){this.description = description;}
    
    public double getPrice(){return this.price;}
    public void setPrice(double price){this.price = price;}
}
