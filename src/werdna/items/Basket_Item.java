/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package werdna.items;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import werdna.Logic;

/**
 *
 * @author Andre
 */
public class Basket_Item {
    private int orderID;
    final Whisky whisky;
    private byte quantity;
    private JButton btnInc;
    private JButton btnDec;
    private JLabel lbl;
    
    public Basket_Item(Whisky whisky, byte quantity)
    {
        this.whisky = whisky;
        this.quantity = quantity;
        this.lbl = new JLabel(String.valueOf(this.quantity));
        initButtons();
    }
    public Basket_Item(int id, Whisky whisky, byte quantity)
    {
        this.orderID = id;
        this.whisky = whisky;
        this.quantity = quantity;
        this.lbl = new JLabel(String.valueOf(this.quantity));
        initButtons();
    }
    
    private void initButtons()
    {
        btnInc = new JButton(">");
        btnDec = new JButton("<");
        
        btnInc.setText(">");
        btnDec.setText("<");
        
        btnInc.addActionListener(evt ->{                             
            // TODO add your handling code here:
            try
            {
                byte count = Byte.parseByte(lbl.getText());
                count++;
                if (count > 126) {count = 126;}
                this.quantity = count;
                lbl.setText(String.valueOf(count));
            }catch(NumberFormatException e)
            {
                lbl.setText("120");
                System.out.print("[!] Caught misplacedInput");
            }
        }
        );
        
        btnDec.addActionListener(evt ->{                             
            // TODO add your handling code here:
            try
            {
                byte count = Byte.parseByte(lbl.getText());
                count--;
                if(count < 0){count = 0;}
                this.quantity = count;
                lbl.setText(String.valueOf(count));
            }catch(NumberFormatException e)
            {
                lbl.setText("1");
                System.out.print("[!] Caught misplacedInput");
            }
        }
        );
    }
    
    public JButton[] getButtons(JLabel[] titles, int y)
    {
        btnInc.setBounds(titles[1].getBounds().x+25, y-5, 35, 20);
        btnDec.setBounds(titles[1].getBounds().x-35, y-5, 35, 20);
        
        JButton[] btns = new JButton[2];
        btns[0] = btnInc;
        btns[1] = btnDec;
        
        return btns;
    }
    
    public JLabel[] getLabels(JLabel[] titles, int y)
    {
        JLabel[] labels = new JLabel[3];
        labels[0] = new JLabel(this.whisky.getName());
        labels[0].setBounds(titles[0].getBounds().x-20, y, 100, 10);
        
        labels[1] = lbl;
        lbl.setText(String.valueOf(this.quantity));
        labels[1].setBounds(titles[1].getBounds().x, y, 100, 10);
        
        labels[2] = new JLabel(String.valueOf(this.whisky.getPrice() * this.quantity));
        labels[2].setBounds(titles[2].getBounds().x-20, y, 100, 10);
        return labels;
    }
    
    public void addQuantity(byte quantity)
    {
        if(this.quantity + quantity > 126)
        {
            this.quantity = 126;
        }else if(quantity < 1)
        {
            return;
        }else{
            this.quantity += quantity;
        }
        
        
    }
    
    public double getPrice(){return this.whisky.getPrice() * this.quantity;}
    public int getID(){return this.whisky.getId();}
    
    public byte getQuantity(){return this.quantity;}
    public void setQuantity(byte quantity)
    {
        if(quantity >= 126){return;}
        this.quantity = quantity;
    }
    
    public int getWhiskyID(){return this.whisky.getId();}
}
