/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package werdna;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import werdna.items.Whisky;

/**
 *
 * @author Andre
 */
public class UI {
    public static JButton getProductButton()
    {
        JButton btn = new JButton();
        btn.setBounds(10, 10, 110, 110);
        return btn;
    }
    public static JButton getProductButton(String name)
    {
        JButton btn = new JButton();
        btn.setBounds(10, 10, 110, 110);
        btn.setText(name);
        return btn;
    }
    
    public static ArrayList<JButton> getProductButtons(String[] names)
    {
        ArrayList<JButton> btns = new ArrayList();
        int x = 10;
        int y = 10;
        
        for(String name : names)
        {
            JButton btn = getProductButton(name);
            btn.setBounds(x, y, 110, 110);
            
            btns.add(btn);
            x+= 120;
            if(x >360)
            {
                x = 10;
                y += 120;
            }
        }
        
        return btns;
    }
    
    public void actionPerformed(String name)
    {
        System.out.print(name);
    }
    
    
}
