/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package werdna.items;

// SQL IMPORTS
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// EXTRA
import java.util.ArrayList;

/**
 *
 * @author Andre
 */
public class Whisky_Data {
    
    public static ArrayList<Whisky> getWhiskys()
    {
        ArrayList<Whisky> whiskys = new ArrayList();
        try
        {
            Connection con = Database_Data.getConnection();
            if(con == null){return null;}
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("Select * FROM Whiskys");
            
            while(rs.next())
            {
                whiskys.add(new Whisky(
                        rs.getInt("ID"),
                        rs.getString("Name"), 
                        rs.getString("Image"), 
                        rs.getString("Description"),
                        rs.getDouble("Price"))
                );
            }
        }catch(SQLException e)
        {
            System.out.print("[!] Error: " + e);
        }
        return whiskys;
    }
    
    public static ArrayList<Whisky> getWhiskys(int limit)
    {
        ArrayList<Whisky> whiskys = new ArrayList();
        try
        {
            Connection con = Database_Data.getConnection();
            if(con == null){return null;}
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("Select * FROM Whiskys limit " + limit);
            
            while(rs.next())
            {
                whiskys.add(new Whisky(
                        rs.getInt("ID"),
                        rs.getString("Name"), 
                        rs.getString("Image"), 
                        rs.getString("Description"),
                        rs.getDouble("Price"))
                );
            }
        }catch(SQLException e)
        {
            System.out.print("[!] Error: " + e);
        }
        return whiskys;
    }
    
    public static ArrayList<Whisky> getWhiskys(int limit, int start)
    {
        ArrayList<Whisky> whiskys = new ArrayList();
        try
        {
            Connection con = Database_Data.getConnection();
            if(con == null){return null;}
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("Select * FROM Whiskys limit " + start + ", " + limit);
            
            while(rs.next())
            {
                whiskys.add(new Whisky(
                        rs.getInt("ID"),
                        rs.getString("Name"), 
                        rs.getString("Image"), 
                        rs.getString("Description"),
                        rs.getDouble("Price"))
                );
            }
        }catch(SQLException e)
        {
            System.out.print("[!] Error: " + e);
        }
        return whiskys;
    }
    
    
    public static ArrayList<Whisky> GetWhiskyContaining(String searched)
    {
        ArrayList<Whisky> whiskys = new ArrayList();
        try
        {
            Connection con = Database_Data.getConnection();
            if(con == null){return null;}
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("Select * FROM Whiskys LIKE '%" + searched + "%'");
            
            while(rs.next())
            {
                whiskys.add(new Whisky(
                        rs.getInt("ID"),
                        rs.getString("Name"), 
                        rs.getString("Image"), 
                        rs.getString("Description"),
                        rs.getDouble("Price"))
                );
            }
        }catch(SQLException e)
        {
            System.out.print("[!] Error: " + e);
        }
        return whiskys;
    }
    
    
    public static Whisky getSelectedWhisky(String id)
    {
        Whisky whisky = null;
        try{
            Connection con = Database_Data.getConnection();
            if(con == null){return null;}
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("Select * FROM Whiskys WHERE ID=" + id);
            
            rs.next();
            whisky = new Whisky(
                rs.getInt("ID"),
                rs.getString("Name"), 
                rs.getString("Image"), 
                rs.getString("Description"),
                rs.getDouble("Price"));
        }catch(SQLException e)
        {
            System.out.print("[!] Error: " + e);
        }
        return whisky;
    }
    
    /* Used for Array List, 
    public static boolean contains(String s, String w)
    {
        //S for searched string, W for whisky name string
        boolean found = false;
        char[] searched = s.toCharArray();
        char[] whisky = s.toCharArray();
        byte is = 0;
        
        for(byte iw = 0; iw < w.length(); iw++)
        {
            if(is == searched.length)
            {
                found = true;
                break;
            }
            if(whisky[iw] == searched[is])
            {
                is++;
            }else{
                is = 0; // Reset to start search again
            }
        }
        return found;
    }*/
}
