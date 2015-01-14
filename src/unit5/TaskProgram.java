
package unit5;

import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;

public class TaskProgram extends javax.swing.JFrame {
 ArrayList list;
ListIterator li;
int curtask, tottask;
Task t;

    public TaskProgram() {
        initComponents();
        list = new ArrayList();
        li=list.listIterator();
        curtask=0;
        tottask=0;
    
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        txtName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblcurrent = new javax.swing.JLabel();
        lblctask = new javax.swing.JLabel();
        lblttasku89 = new javax.swing.JLabel();
        lblttask = new javax.swing.JLabel();
        btnfarleft = new javax.swing.JButton();
        btnleft = new javax.swing.JButton();
        btnright = new javax.swing.JButton();
        btnfarright = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnushowall = new javax.swing.JMenuItem();
        mnuexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuremove = new javax.swing.JMenuItem();
        mnurestore = new javax.swing.JMenuItem();
        mnuclear = new javax.swing.JMenuItem();
        jMenuItem2ActionPerformed = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        mnubefore = new javax.swing.JMenuItem();
        mnuafter = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        jMenu9.setText("File");
        jMenuBar5.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar5.add(jMenu10);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        jLabel1.setText("Name: ");

        jLabel2.setText("Description");

        lblcurrent.setText("Current Task");

        lblctask.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblctask.setText("n/a");
        lblctask.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblttasku89.setText("Total Tasks");

        lblttask.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblttask.setText("0");
        lblttask.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnfarleft.setText("|<");
        btnfarleft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfarleftActionPerformed(evt);
            }
        });

        btnleft.setText("<");
        btnleft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnleftActionPerformed(evt);
            }
        });

        btnright.setText(">");
        btnright.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrightActionPerformed(evt);
            }
        });

        btnfarright.setText(">|");
        btnfarright.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfarrightActionPerformed(evt);
            }
        });

        jMenu1.setText("Program");

        mnushowall.setText("Show All Tasks");
        mnushowall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnushowallActionPerformed(evt);
            }
        });
        jMenu1.add(mnushowall);

        mnuexit.setText("Exit");
        mnuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mnuremove.setText("Remove Current Task");
        mnuremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuremoveActionPerformed(evt);
            }
        });
        jMenu2.add(mnuremove);

        mnurestore.setText("Restore Current Task To Screen");
        mnurestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnurestoreActionPerformed(evt);
            }
        });
        jMenu2.add(mnurestore);

        mnuclear.setText("Clear Screen");
        mnuclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuclearActionPerformed(evt);
            }
        });
        jMenu2.add(mnuclear);

        jMenuItem2ActionPerformed.setText("Replace This as Current Task");
        jMenuItem2ActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformedActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2ActionPerformed);

        jMenuBar1.add(jMenu2);

        jMenu11.setText("Insert");

        mnubefore.setText("Before Current Task");
        mnubefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnubeforeActionPerformed(evt);
            }
        });
        jMenu11.add(mnubefore);

        mnuafter.setText("After Current Task");
        mnuafter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuafterActionPerformed(evt);
            }
        });
        jMenu11.add(mnuafter);

        jMenuBar1.add(jMenu11);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblcurrent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblctask, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblttasku89)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblttask, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 42, Short.MAX_VALUE)
                        .addComponent(btnfarleft)
                        .addGap(34, 34, 34)
                        .addComponent(btnleft)
                        .addGap(33, 33, 33)
                        .addComponent(btnright)
                        .addGap(18, 18, 18)
                        .addComponent(btnfarright)
                        .addGap(78, 78, 78))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcurrent)
                    .addComponent(lblctask)
                    .addComponent(lblttasku89)
                    .addComponent(lblttask))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnfarleft)
                    .addComponent(btnleft)
                    .addComponent(btnright)
                    .addComponent(btnfarright))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnushowallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnushowallActionPerformed
    String result = "";
    for(int x=0; x<list.size(); x++)
    {
        t=(Task)list.get(x);
        result+="Task " +(x+1)+":\n" + t.toString()+"\n";
    }
    JOptionPane.showMessageDialog(this, result);
    }//GEN-LAST:event_mnushowallActionPerformed

    private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
    System.exit(0);
    }//GEN-LAST:event_mnuexitActionPerformed

    private void mnuafterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuafterActionPerformed
      String nm=txtName.getText();
      String d=txtDescription.getText();
      Task t = new Task(nm, d);
      if(t.validate()==false){
          JOptionPane.showMessageDialog(this, "Error - must enter all information");
          return;
      }
      if (tottask>0) li.next();
     
      li.add(t);
      li.previous();
      curtask++;
      tottask++;
      lblttask.setText(""+tottask);
      lblctask.setText(""+curtask);
      JOptionPane.showMessageDialog(this, "Task added");
    }//GEN-LAST:event_mnuafterActionPerformed

    private void btnfarleftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfarleftActionPerformed

    
      if(curtask==1)return;
       while(li.hasPrevious())
           t = (Task) li.previous();
       
       curtask=1;
       lblctask.setText(""+curtask);
       txtName.setText(t.getName());
       txtDescription.setText(t.getDescription());
    }//GEN-LAST:event_btnfarleftActionPerformed

    private void btnrightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrightActionPerformed
    if(curtask==tottask) return;
    curtask++;
    lblctask.setText(""+curtask);
    li.next();
    li.next();
    t=(Task)li.previous();
    txtName.setText(t.getName());
    txtDescription.setText(t.getDescription());
    }//GEN-LAST:event_btnrightActionPerformed

    private void mnuremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuremoveActionPerformed
    if(tottask==0)return;
    li.next();
    li.remove();
    tottask--;
    lblttask.setText(""+tottask);
    if(tottask==0)
    {
        txtName.setText("");
        txtDescription.setText("");
        curtask=0;
        lblctask.setText("n/a");
        return;
    
    }
    if (tottask>1)
    {
        li.next();
        t=(Task)li.previous();
        
    }
    else if(tottask==1)
        
    {
        t=(Task)li.previous();
        curtask=1;
        lblctask.setText(""+curtask);
        
    }
    
    txtName.setText(t.getName());
    txtDescription.setText(t.getDescription());
    }//GEN-LAST:event_mnuremoveActionPerformed

    private void jMenuItem2ActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformedActionPerformed
       
        if(tottask==0){
           JOptionPane.showMessageDialog(this, "No task to replace thsi with, use Insert instead");
           return;
       }
       
       String nm=txtName.getText();
       String d=txtDescription.getText();
       Task t = new Task(nm, d);
       if(t.validate() == false){
           JOptionPane.showMessageDialog(this, "Error - Must enter all information");
       return;
        }
       li.next();
       li.set(t);
       li.previous();
       
       
       
       
    }//GEN-LAST:event_jMenuItem2ActionPerformedActionPerformed

    private void mnuclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuclearActionPerformed
        txtName.setText("");
       txtDescription.setText("");
       JOptionPane.showMessageDialog(this, "finally cleared");
    }//GEN-LAST:event_mnuclearActionPerformed

    private void mnurestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnurestoreActionPerformed
       txtName.setText(t.getName());
       txtDescription.setText(t.getDescription());
    }//GEN-LAST:event_mnurestoreActionPerformed

    private void mnubeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnubeforeActionPerformed
            String nm=txtName.getText();
      String d=txtDescription.getText();
      Task t = new Task(nm, d);
      if(t.validate()==false){
          JOptionPane.showMessageDialog(this, "Error - must enter all information");
          return;
      }
      if (tottask<0) li.previous();
     
      li.add(t);
      li.previous();
      curtask++;
      tottask++;
      lblttask.setText(""+tottask);
      lblctask.setText(""+curtask);
      JOptionPane.showMessageDialog(this, "Task added");
    }//GEN-LAST:event_mnubeforeActionPerformed

    private void btnleftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnleftActionPerformed
        if(curtask==1) return;
    curtask--;
    lblctask.setText(""+curtask);
   
    t=(Task)li.previous();
    txtName.setText(t.getName());
    txtDescription.setText(t.getDescription());
    }//GEN-LAST:event_btnleftActionPerformed

    private void btnfarrightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfarrightActionPerformed
   if(curtask==tottask)return;
       while(li.hasNext())
           li.next();
       t=(Task)li.previous();
       curtask=tottask;
       lblctask.setText(""+curtask);
       txtName.setText(t.getName());
       txtDescription.setText(t.getDescription());
    }//GEN-LAST:event_btnfarrightActionPerformed

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
            java.util.logging.Logger.getLogger(TaskProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfarleft;
    private javax.swing.JButton btnfarright;
    private javax.swing.JButton btnleft;
    private javax.swing.JButton btnright;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2ActionPerformed;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblctask;
    private javax.swing.JLabel lblcurrent;
    private javax.swing.JLabel lblttask;
    private javax.swing.JLabel lblttasku89;
    private javax.swing.JMenuItem mnuafter;
    private javax.swing.JMenuItem mnubefore;
    private javax.swing.JMenuItem mnuclear;
    private javax.swing.JMenuItem mnuexit;
    private javax.swing.JMenuItem mnuremove;
    private javax.swing.JMenuItem mnurestore;
    private javax.swing.JMenuItem mnushowall;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
