/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author hi-tech
 */


public class TFrame extends java.awt.Frame {

    /**
     * Creates new form TFrame
     */
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    public TFrame() {
        initComponents();
        setSize(600,700);
        try{
        Class.forName("org.gjt.mm.mysql.Driver");
         con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/school","root","");
        ch1.add(" ");   
        ch1.add("Science");
        ch1.add("Maths");
        ch1.add("English");
        ch1.add("Hindhi");
        ch1.add("sst");
        ch1.add("computer");
        ch2.add("");for(int i=1;i<=10;i++){ch2.add(i+"");}
        }catch(Exception ee){System.out.println("ee:"+ee);}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        ch1 = new java.awt.Choice();
        label2 = new java.awt.Label();
        hod = new java.awt.TextField();
        label3 = new java.awt.Label();
        t4 = new java.awt.TextField();
        t1 = new java.awt.TextField();
        t3 = new java.awt.TextField();
        label5 = new java.awt.Label();
        exit = new java.awt.Button();
        UP = new java.awt.Button();
        sav = new java.awt.Button();
        l1 = new java.awt.List();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        dd = new java.awt.Label();
        ch2 = new java.awt.Choice();
        t2 = new java.awt.TextField();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(null);

        label1.setText("Department");
        add(label1);
        label1.setBounds(20, 40, 70, 20);

        ch1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ch1ItemStateChanged(evt);
            }
        });
        add(ch1);
        ch1.setBounds(90, 40, 120, 20);

        label2.setText("HOD");
        add(label2);
        label2.setBounds(20, 80, 40, 20);
        add(hod);
        hod.setBounds(70, 80, 150, 20);

        label3.setText("Details");
        add(label3);
        label3.setBounds(310, 70, 60, 20);

        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        add(t4);
        t4.setBounds(320, 200, 120, 20);
        add(t1);
        t1.setBounds(320, 110, 120, 20);

        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        add(t3);
        t3.setBounds(320, 170, 120, 20);

        label5.setText("Phone no.");
        add(label5);
        label5.setBounds(250, 170, 60, 20);

        exit.setLabel("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        add(exit);
        exit.setBounds(270, 290, 70, 20);

        UP.setLabel("Update");
        UP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPActionPerformed(evt);
            }
        });
        add(UP);
        UP.setBounds(230, 250, 70, 24);

        sav.setLabel("Save");
        sav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savActionPerformed(evt);
            }
        });
        add(sav);
        sav.setBounds(320, 250, 70, 24);

        l1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                l1ItemStateChanged(evt);
            }
        });
        add(l1);
        l1.setBounds(30, 120, 120, 210);

        label8.setText("Name");
        add(label8);
        label8.setBounds(260, 110, 40, 20);

        label9.setText("Email Id");
        add(label9);
        label9.setBounds(250, 200, 46, 20);

        dd.setText("Class");
        add(dd);
        dd.setBounds(260, 140, 50, 20);

        ch2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ch2ItemStateChanged(evt);
            }
        });
        add(ch2);
        ch2.setBounds(380, 140, 60, 20);
        add(t2);
        t2.setBounds(320, 140, 50, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void ch1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ch1ItemStateChanged
        // TODO add your handling code here:
        l1.removeAll();
        try{stmt=con.prepareStatement("select name,Expirence from teacher where Subject=?");
          stmt.setString(1, ch1.getSelectedItem());
          rs=stmt.executeQuery();
          int max=0;
          while(rs.next())
          {  int ex=rs.getInt("Expirence");
              System.out.println();
              String s1=rs.getString("name"); 
          if(ex>max){hod.setText(s1); ex=max;}
          l1.add(s1); System.out.println(s1);   
          }    
        }catch(Exception ee){System.out.println("error:"+ee);}
    }//GEN-LAST:event_ch1ItemStateChanged

    private void l1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_l1ItemStateChanged
        // TODO add your handling code here:
        try{
            stmt=con.prepareStatement("select Phoneno,EmailId,class from teacher where name=?");
            stmt.setString(1,l1.getSelectedItem());
            rs=stmt.executeQuery();
            if(rs.next())
            {
               String s1=rs.getString("Phoneno");
               String s2=rs.getString("EmailId");
               int a=rs.getInt("class");
               t1.setText(l1.getSelectedItem());
               t3.setText(s1);
               t4.setText(s2);t2.setText(a+"");
               
            }    
        }catch(Exception ee){System.out.println("ee="+ee);}
    }//GEN-LAST:event_l1ItemStateChanged

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
       int a=JOptionPane.showConfirmDialog(this,"are you sure");
       if(a==0){dispose();}
    }//GEN-LAST:event_exitActionPerformed

    private void UPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPActionPerformed
        // TODO add your handling code here:
        try{
        stmt=con.prepareStatement("update teacher set class=?,EmailID=?,Phoneno=?");
        stmt.setInt(1,Integer.parseInt(t2.getText()));
        stmt.setString(2,t4.getText());
        stmt.setString(3,t3.getText());
        stmt.executeUpdate();
        t1.setText(" ");
         t2.setText(" ");
          t3.setText(" ");
           t4.setText(" ");
        }catch(Exception ee){System.out.println(ee);}
    }//GEN-LAST:event_UPActionPerformed

    private void savActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savActionPerformed
        // TODO add your handling code here:
        try{
            stmt=con.prepareStatement("update teacher set class=?");
            stmt.setInt(1,Integer.parseInt(t2.getText()));
            stmt.executeUpdate();
            t1.setText("");t2.setText("");t3.setText("");t4.setText("");
        }catch(Exception ee){}
    }//GEN-LAST:event_savActionPerformed

    private void ch2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ch2ItemStateChanged
        // TODO add your handling code here:
        t2.setText(ch2.getSelectedItem());
    }//GEN-LAST:event_ch2ItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button UP;
    private java.awt.Choice ch1;
    private java.awt.Choice ch2;
    private java.awt.Label dd;
    private java.awt.Button exit;
    private java.awt.TextField hod;
    private java.awt.List l1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label5;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.Button sav;
    private java.awt.TextField t1;
    private java.awt.TextField t2;
    private java.awt.TextField t3;
    private java.awt.TextField t4;
    // End of variables declaration//GEN-END:variables
}
