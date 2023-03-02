/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package werdna;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import static werdna.UI.getProductButton;
import werdna.admin.Order;
import werdna.admin.Order_Data;
import werdna.items.Basket_Item;
import werdna.items.Whisky;
import werdna.items.Whisky_Data;

/**
 *
 * @author Andre
 */
public class epos extends javax.swing.JFrame {

    /**
     * Creates new form epos
     */
    JButton buttonTemplate;
    ArrayList<Basket_Item> basket = new ArrayList();
    
    
    public epos() {
        initComponents();
        setTabs();
        //TestData();
    }
    
    private void TestData()
    {
        Whisky whisky = new Whisky(0, "Test Data", "", "", 53.99);
        
        basket.add(new Basket_Item(whisky, Byte.valueOf("3")));
        
        JLabel[] titles = {lblProductTitle, lblAmountTitle, lblCostTitle};
        
        JLabel[] item = basket.get(0).getLabels(titles, 10);
        JButton[] btns = basket.get(0).getButtons(titles, 10);
        
        
        pnlBasketItems.add(item[0]);
        pnlBasketItems.add(item[1]);
        pnlBasketItems.add(item[2]);
        
        pnlBasketItems.add(btns[0]);
        pnlBasketItems.add(btns[1]);
    }
    
    private void setTabs()
    {
        setButton();
        setSelected();
    }
    
    private void setSelected()
    {
        txtCountSelected.setBounds(64, 27, txtCountSelected.getX(), txtCountSelected.getY());
        txtCountSelected.setHorizontalAlignment(JTextField.CENTER);
        tabs.setEnabledAt(1, false);
    }
    
    private void setButton()
    {
        //<editor-fold defaultstate="collapsed" desc="Example of buttons working">
        /*String[] exampleList = {
            "whisky1", 
            "whisky2", 
            "whisky3", 
            "whisky4", 
            "whisky5", 
            "whisky6", 
            "whisky7", 
            "whisky8", 
            "whisky9", 
            "whisky10",
            "whisky11", 
            "whisky12", 
            "whisky13", 
            "whisky14", 
            "whisky15", 
            "whisky16", 
            "whisky17", 
            "whisky18", 
            "whisky19", 
            "whisky20",
            "whisky1", 
            "whisky2", 
            "whisky3", 
            "whisky4", 
            "whisky5", 
            "whisky6", 
            "whisky7", 
            "whisky8", 
            "whisky9", 
            "whisky10",
            "whisky11", 
            "whisky12", 
            "whisky13", 
            "whisky14", 
            "whisky15", 
            "whisky16", 
            "whisky17", 
            "whisky18", 
            "whisky19", 
            "whisky20"
        };*/
        
        //Example ArrayList<JButton> btns = UI.getProductButtons(exampleList);
        //</editor-fold>
        
        ArrayList<JButton> btns = getProductButtons(Whisky_Data.getWhiskys());
        pnlProducts.setPreferredSize(new Dimension(380,(btns.size()/3)*130));
        for(JButton btn : btns)
        {
            pnlProducts.add(btn);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        tabs = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlProducts = new javax.swing.JPanel();
        pnlSelectedItem = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        btnAddBasket = new javax.swing.JButton();
        txtCountSelected = new javax.swing.JTextField();
        btnIncSelected = new javax.swing.JButton();
        btnDecSelected = new javax.swing.JButton();
        lblSelectedProductName = new javax.swing.JLabel();
        pnlBasket = new javax.swing.JPanel();
        lblProductTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        pnlBasketItems = new javax.swing.JPanel();
        lblCostTitle = new javax.swing.JLabel();
        lblAmountTitle = new javax.swing.JLabel();
        btnUpdateBasket = new javax.swing.JButton();
        btnPurchase = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuAdmin = new javax.swing.JMenu();
        mnuExit = new javax.swing.JMenu();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        pnlProducts.setPreferredSize(new java.awt.Dimension(380, 1000));

        javax.swing.GroupLayout pnlProductsLayout = new javax.swing.GroupLayout(pnlProducts);
        pnlProducts.setLayout(pnlProductsLayout);
        pnlProductsLayout.setHorizontalGroup(
            pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );
        pnlProductsLayout.setVerticalGroup(
            pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pnlProducts);

        tabs.addTab("Products", jScrollPane1);

        txtDescription.setEditable(false);
        txtDescription.setColumns(20);
        txtDescription.setLineWrap(true);
        txtDescription.setRows(5);
        jScrollPane3.setViewportView(txtDescription);

        btnAddBasket.setText("Add to Basket");
        btnAddBasket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBasketActionPerformed(evt);
            }
        });

        txtCountSelected.setText("1");
        txtCountSelected.setAutoscrolls(false);
        txtCountSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCountSelectedActionPerformed(evt);
            }
        });

        btnIncSelected.setText(">");
        btnIncSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncSelectedActionPerformed(evt);
            }
        });

        btnDecSelected.setText("<");
        btnDecSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecSelectedActionPerformed(evt);
            }
        });

        lblSelectedProductName.setText("productName");

        javax.swing.GroupLayout pnlSelectedItemLayout = new javax.swing.GroupLayout(pnlSelectedItem);
        pnlSelectedItem.setLayout(pnlSelectedItemLayout);
        pnlSelectedItemLayout.setHorizontalGroup(
            pnlSelectedItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSelectedItemLayout.createSequentialGroup()
                .addGroup(pnlSelectedItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSelectedItemLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlSelectedItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddBasket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSelectedItemLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnDecSelected)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCountSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIncSelected)
                                .addGap(19, 19, 19)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSelectedItemLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSelectedProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlSelectedItemLayout.setVerticalGroup(
            pnlSelectedItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSelectedItemLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlSelectedItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlSelectedItemLayout.createSequentialGroup()
                        .addComponent(lblSelectedProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlSelectedItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCountSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIncSelected)
                            .addComponent(btnDecSelected))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddBasket))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tabs.addTab("Selected Item", pnlSelectedItem);

        lblProductTitle.setText("Product");

        jLabel2.setText("Total:");

        lblTotal.setText("0.00");

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout pnlBasketItemsLayout = new javax.swing.GroupLayout(pnlBasketItems);
        pnlBasketItems.setLayout(pnlBasketItemsLayout);
        pnlBasketItemsLayout.setHorizontalGroup(
            pnlBasketItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );
        pnlBasketItemsLayout.setVerticalGroup(
            pnlBasketItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );

        jScrollPane4.setViewportView(pnlBasketItems);

        lblCostTitle.setText("Cost");

        lblAmountTitle.setText("amount");

        btnUpdateBasket.setText("Update");
        btnUpdateBasket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateBasketActionPerformed(evt);
            }
        });

        btnPurchase.setText("Purchase");
        btnPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBasketLayout = new javax.swing.GroupLayout(pnlBasket);
        pnlBasket.setLayout(pnlBasketLayout);
        pnlBasketLayout.setHorizontalGroup(
            pnlBasketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBasketLayout.createSequentialGroup()
                .addGroup(pnlBasketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBasketLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(pnlBasketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addGroup(pnlBasketLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(lblProductTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(lblAmountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCostTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))))
                    .addGroup(pnlBasketLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPurchase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdateBasket)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(76, 76, 76)
                        .addComponent(lblTotal)))
                .addGap(35, 35, 35))
        );
        pnlBasketLayout.setVerticalGroup(
            pnlBasketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBasketLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBasketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductTitle)
                    .addComponent(lblCostTitle)
                    .addComponent(lblAmountTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBasketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblTotal)
                    .addComponent(btnUpdateBasket)
                    .addComponent(btnPurchase))
                .addContainerGap())
        );

        tabs.addTab("Basket", pnlBasket);

        mnuAdmin.setText("Login");
        jMenuBar1.add(mnuAdmin);

        mnuExit.setText("Exit");
        mnuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuExit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuExitMouseClicked
        // TODO add your handling code here:7
        System.exit(0);
    }//GEN-LAST:event_mnuExitMouseClicked

    private void btnIncSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncSelectedActionPerformed
        // TODO add your handling code here:
        try
        {
            int count = Integer.parseInt(txtCountSelected.getText());
            count++;
            if(count > 126){ count = 126;}
            txtCountSelected.setText(String.valueOf(count));
        }catch(NumberFormatException e)
        {
            txtCountSelected.setText("1");
            System.out.print("[!] Caught misplacedInput");
        }
    }//GEN-LAST:event_btnIncSelectedActionPerformed

    private void txtCountSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCountSelectedActionPerformed
        // TODO add your handling code here:
        String text = txtCountSelected.getText();
        for(char c : text.toCharArray())
        {
            if(!Logic.isNumber(c))
            {
                txtCountSelected.setText("1");
                break;
            }
        }
    }//GEN-LAST:event_txtCountSelectedActionPerformed

    private void btnDecSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecSelectedActionPerformed
        // TODO add your handling code here:
        try
        {
            int count = Integer.parseInt(txtCountSelected.getText());
            count--;
            if(count < 0){count = 0;}
            txtCountSelected.setText(String.valueOf(count));
        }catch(NumberFormatException e)
        {
            txtCountSelected.setText("1");
            System.out.println("[!] Caught misplacedInput");
        }
    }//GEN-LAST:event_btnDecSelectedActionPerformed

    private void btnAddBasketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBasketActionPerformed
        // TODO add your handling code here:
        Whisky whisky = Whisky_Data.getSelectedWhisky(btnAddBasket.getActionCommand());
        Double total = Double.valueOf(lblTotal.getText());
        
        String count = txtCountSelected.getText();
        for(char c : count.toCharArray())
        {
            if(!Logic.isNumber(c))
            {
                txtCountSelected.setText("1");
                break;
            }
        }
        byte amount = 0;
        try{
            amount = Byte.valueOf(count);
        }
        catch(NumberFormatException e)
        {
            System.out.print(e);
        }
        
        if (amount <= 0){return;}
        if (amount > 126){ amount = 126;}
        double toAdd = whisky.getPrice() * amount;
        total += toAdd;
        
        
        if(basket.size() > 0){
        for(int i = 0; i < basket.size(); i++)
        {
            if(basket.get(i).getID() == whisky.getId())
            {
                basket.get(i).addQuantity(amount);
                updateBasket();
                return;
            }
        }}
        
        basket.add(new Basket_Item(whisky, amount));
        
        JLabel[] titles = {lblProductTitle, lblAmountTitle, lblCostTitle};
        
        JLabel[] item = basket.get(basket.size()-1).getLabels(titles, ((basket.size()-1)*20)+5);
        JButton[] btns = basket.get(basket.size()-1).getButtons(titles, ((basket.size()-1)*20)+5);
        
        
        pnlBasketItems.add(item[0]);
        pnlBasketItems.add(item[1]);
        pnlBasketItems.add(item[2]);
        
        pnlBasketItems.add(btns[0]);
        pnlBasketItems.add(btns[1]);
        
        lblTotal.setText(String.format(String.valueOf(total),"£0.00"));
    }//GEN-LAST:event_btnAddBasketActionPerformed

    private void btnUpdateBasketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateBasketActionPerformed
        // TODO add your handling code here:
        updateBasket();
    }//GEN-LAST:event_btnUpdateBasketActionPerformed

    private void btnPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseActionPerformed
        // TODO add your handling code here:
        if(basket.isEmpty()){return;}
        
        for(int i = 0; i < basket.size(); i++)
        {
            Order order = Order_Data.createnewOrder(basket.get(i));
            // TODO: Add way to add to access database
        }
    }//GEN-LAST:event_btnPurchaseActionPerformed

    
    public void updateBasket()
    {
                                                      
        // TODO add your handling code here:
        JLabel[] titles = {lblProductTitle, lblAmountTitle, lblCostTitle};
        pnlBasketItems.removeAll();
        double total = 0.00;
        for(int i = 0; i < basket.size(); i++)
        {
            if(basket.get(i).getQuantity() == 0)
            {
                basket.remove(basket.get(i));
                continue;
            }
            
            
            total += basket.get(i).getPrice();
            
            JLabel[] item = basket.get(i).getLabels(titles, (i*20)+5);
            JButton[] btns = basket.get(i).getButtons(titles, (i*20)+5);
            
            basket.get(i).getQuantity();

            pnlBasketItems.add(item[0]);
            pnlBasketItems.add(item[1]);
            pnlBasketItems.add(item[2]);

            pnlBasketItems.add(btns[0]);
            pnlBasketItems.add(btns[1]);
        }
        
        lblTotal.setText(String.format(String.valueOf(total),"£0.00"));
        pnlBasketItems.updateUI();
    }
    public ArrayList<JButton> getProductButtons(ArrayList<Whisky> whiskys)
    {
        ArrayList<JButton> btns = new ArrayList();
        int x = 10;
        int y = 10;
        
        for(Whisky whisky : whiskys)
        {
            JButton btn = getProductButton(whisky.getName());
            btn.setActionCommand(String.valueOf(whisky.getId()));
            btn.setBounds(x, y, 110, 110);
            btn.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    setSelectedItem(e.getActionCommand());
                }
            });
            
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
    
    public void setSelectedItem(String id)
    {
        tabs.setEnabledAt(1, true);
        Whisky whisky = Whisky_Data.getSelectedWhisky(id);
        if(whisky == null){return;}
        lblSelectedProductName.setText(whisky.getName());
        txtDescription.setText(whisky.getDescription());
        txtCountSelected.setText("1");
        btnAddBasket.setActionCommand(id);
        
        tabs.setSelectedIndex(1);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(epos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(epos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(epos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(epos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new epos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBasket;
    private javax.swing.JButton btnDecSelected;
    private javax.swing.JButton btnIncSelected;
    private javax.swing.JButton btnPurchase;
    private javax.swing.JButton btnUpdateBasket;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAmountTitle;
    private javax.swing.JLabel lblCostTitle;
    private javax.swing.JLabel lblProductTitle;
    private javax.swing.JLabel lblSelectedProductName;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JMenu mnuAdmin;
    private javax.swing.JMenu mnuExit;
    private javax.swing.JPanel pnlBasket;
    private javax.swing.JPanel pnlBasketItems;
    private javax.swing.JPanel pnlProducts;
    private javax.swing.JPanel pnlSelectedItem;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTextField txtCountSelected;
    private javax.swing.JTextArea txtDescription;
    // End of variables declaration//GEN-END:variables
}
