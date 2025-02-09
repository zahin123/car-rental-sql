/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalsystem;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AddRental extends javax.swing.JFrame {

    /**
     * Creates new form AddRental
     */
    public AddRental() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfaddrentalstartdate = new javax.swing.JTextField();
        tfaddrentalreturndate = new javax.swing.JTextField();
        btnaddrental = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jl = new javax.swing.JLabel();
        cbaddrentaltype = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbaddrentalcategory = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbaddrentalrentaltype = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfaddrentalcustomerid = new javax.swing.JTextField();
        tfaddrentalqty = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfaddrentalorderdate = new javax.swing.JTextField();
        tfaddrentalpaymentdate = new javax.swing.JTextField();
        gohome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        addrentaltable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnaddrentalrent = new javax.swing.JButton();
        cbselectedmodel = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnaddrental.setText("Submit");
        btnaddrental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddrentalActionPerformed(evt);
            }
        });

        jLabel1.setText("Start Date *");

        jLabel2.setText("Return Date *");

        jl.setText("Type");

        cbaddrentaltype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        cbaddrentaltype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbaddrentaltypeActionPerformed(evt);
            }
        });

        jLabel4.setText("Category");

        cbaddrentalcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));

        jLabel5.setText("Rental Type");

        cbaddrentalrentaltype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "7" }));

        jLabel6.setText("Customer ID *");

        jLabel7.setText("Quantity *");

        jLabel8.setText("Order Date *");

        jLabel9.setText("Payment Date");

        gohome.setText("Home");
        gohome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gohomeActionPerformed(evt);
            }
        });

        addrentaltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Description"
            }
        ));
        jScrollPane1.setViewportView(addrentaltable);

        jLabel3.setText("Selected Model *");

        btnaddrentalrent.setText("Rent");
        btnaddrentalrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddrentalrentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnaddrental)
                                    .addComponent(gohome))
                                .addGap(189, 189, 189))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jl)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel5))
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbaddrentalcategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbaddrentalrentaltype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfaddrentalstartdate)
                                            .addComponent(tfaddrentalreturndate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cbaddrentaltype, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(46, 46, 46)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfaddrentalcustomerid, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(55, 55, 55)
                                            .addComponent(tfaddrentalqty, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel9))
                                            .addGap(35, 35, 35)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tfaddrentalpaymentdate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tfaddrentalorderdate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel3)
                                        .addGap(34, 34, 34)
                                        .addComponent(cbselectedmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(95, 95, 95))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(btnaddrentalrent)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(gohome)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl)
                    .addComponent(cbaddrentaltype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tfaddrentalcustomerid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbaddrentalcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tfaddrentalqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfaddrentalstartdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(tfaddrentalorderdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfaddrentalreturndate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(tfaddrentalpaymentdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbaddrentalrentaltype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnaddrental)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbselectedmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(btnaddrentalrent)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddrentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddrentalActionPerformed
        // TODO add your handling code here:
//        String startdate="2020-11-11";
//        String returndate="2021-12-12";
//        String orderdate="2020-11-11";
       

        String startdate=tfaddrentalstartdate.getText();
        String returndate=tfaddrentalreturndate.getText();
        String orderdate=tfaddrentalorderdate.getText();
        

        String customerid=tfaddrentalcustomerid.getText();
        if(startdate.length()==0 || returndate.length()==0 || orderdate.length()==0 || customerid.length()==0){
            JOptionPane.showMessageDialog(null, "Please fill up required fields");
        } else {
            Connection con = null;
            PreparedStatement ps = null;

            try{
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://localhost:3306/carrentalsystem";
                String username = "root";
                String password = "";
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url,username,password);
                Statement stmt = con.createStatement();
                String type=cbaddrentaltype.getSelectedItem().toString();
                String category=cbaddrentalcategory.getSelectedItem().toString();
                String rentaltype=cbaddrentalrentaltype.getSelectedItem().toString();
                String paymentdate=tfaddrentalpaymentdate.getText();
                Statement state = con.createStatement();
                String sql="SELECT Description FROM Vehicle WHERE VehicleID NOT IN (SELECT DISTINCT VehicleID FROM Rental WHERE (StartDate >= '"+startdate+"' and returndate <= '"+returndate+"') or (startDate<'"+returndate+"' and returndate>= '"+startdate+"')) and Type = '"+type+"' and Category = '"+category+"' UNION SELECT Description FROM Vehicle WHERE Type = '"+type+"' and Category = '"+category+"' and VehicleID NOT IN (SELECT DISTINCT VehicleID FROM Rental)";
                //System.out.println(sql);
                ResultSet rs = state.executeQuery(sql);
                int n=0,i=0;
                while(rs.next())
                {
                    n++;
                    String data[]={rs.getString(1)};
                    DefaultTableModel tblmodel=(DefaultTableModel)addrentaltable.getModel();
                    tblmodel.addRow(data);
                }
                String[] cars = new String[n];
                rs = state.executeQuery(sql);
                while(rs.next())
                {
                    cars[i]=rs.getString(1);
                    i++;
                }
                DefaultComboBoxModel model = new DefaultComboBoxModel(cars);
                cbselectedmodel.setModel( model );
            } catch(Exception e) {
                e.printStackTrace();
            } 
        }  
    }//GEN-LAST:event_btnaddrentalActionPerformed

    private void cbaddrentaltypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbaddrentaltypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbaddrentaltypeActionPerformed

    private void gohomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gohomeActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_gohomeActionPerformed

    private void btnaddrentalrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddrentalrentActionPerformed
        // TODO add your handling code here:
        String startdate=tfaddrentalstartdate.getText();
        String returndate=tfaddrentalreturndate.getText();
        String orderdate=tfaddrentalorderdate.getText();
        String customerid=tfaddrentalcustomerid.getText();
        if(startdate.length()==0 || returndate.length()==0 || orderdate.length()==0 || customerid.length()==0){
            JOptionPane.showMessageDialog(null, "Please fill up all fields");
        } else {
            Connection con = null;
            PreparedStatement ps = null;

            try{
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://localhost:3306/carrentalsystem";
                String username = "root";
                String password = "";
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url,username,password);
                Statement stmt = con.createStatement();
                String type=cbaddrentaltype.getSelectedItem().toString();
                String category=cbaddrentalcategory.getSelectedItem().toString();
                String rentaltype=cbaddrentalrentaltype.getSelectedItem().toString();
                String paymentdate=tfaddrentalpaymentdate.getText();
                Statement state = con.createStatement();
                String sql="SELECT Description FROM Vehicle WHERE VehicleID NOT IN (SELECT DISTINCT VehicleID FROM Rental WHERE (StartDate >= '"+startdate+"' and returndate <= '"+returndate+"') or (startDate<'"+returndate+"' and returndate>= '"+startdate+"')) and Type = '"+type+"' and Category = '"+category+"' UNION SELECT Description FROM Vehicle WHERE Type = '"+type+"' and Category = '"+category+"' and VehicleID NOT IN (SELECT DISTINCT VehicleID FROM Rental)";
                ResultSet rs = state.executeQuery(sql);
                while(rs.next())
                {
                    String data[]={rs.getString(1)};
                    DefaultTableModel tblmodel=(DefaultTableModel)addrentaltable.getModel();
                    tblmodel.addRow(data);
                }
                String sql2="SELECT phone from customer where custid ='"+customerid+"'";
                String phone="";
                ResultSet rs2 = state.executeQuery(sql2);
                while(rs2.next())
                {
                    phone=rs2.getString(1);
                    break;
                }
        
                String selectedmodel=cbselectedmodel.getSelectedItem().toString();
                System.out.println(selectedmodel);
      
                String vehid="";
                String sql3="SELECT VehicleID FROM Vehicle WHERE Description = '"+selectedmodel+"' and Type = '"+type+"' and Category = '"+category+"'";
                ResultSet rs3 = state.executeQuery(sql3);
                while(rs3.next())
                {
                    vehid=rs3.getString(1);
                    break;
                }
                System.out.println(vehid);

                // get days/weeks count
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate date1 = LocalDate.parse(startdate, dtf);
                LocalDate date2 = LocalDate.parse(returndate, dtf);
                int numberofday = (int) ChronoUnit.DAYS.between(date1, date2);
                int qty=Integer.parseInt(tfaddrentalqty.getText());
                // get rate
                String query4="select * from rate where (type = "+type+" and category = "+category+")";
                ResultSet rs4 = state.executeQuery(query4);
                int totalamount=0;
                while(rs4.next())
                {
                    String ratetype=rs4.getString(1);
                    String ratecat=rs4.getString(2);
                    String rateweekly=rs4.getString(3);
                    String ratedaily=rs4.getString(4);
                    if(rentaltype.equals("1")){
                        totalamount+=(numberofday*Double.parseDouble(ratedaily)); 
                    } 
                    else{
                        int numeberofweek=numberofday/7;
                        if(numberofday%7!=0){
                            numeberofweek++;
                        }
                        totalamount+=(numeberofweek*Double.parseDouble(rateweekly)); 
                    }
                    System.out.println(totalamount);
                    break;
                }
                totalamount*=qty;
                System.out.println(totalamount);
                 //Insert to rental
                ps = con.prepareStatement("insert into rental values (?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1,customerid);
                ps.setString(2,vehid);
                ps.setString(3, startdate);
                ps.setString(4,orderdate);
                ps.setString(5,String.valueOf(rentaltype));
                ps.setString(6,String.valueOf(qty));
                ps.setString(7,returndate);
                ps.setString(8,String.valueOf(totalamount));
                if(paymentdate.length()==0){
                    ps.setString(9, null);
                } else {
                    ps.setString(9, paymentdate);
                }
                
                ps.setString(10, String.valueOf(0));
                int i = ps.executeUpdate();
                if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Success");
                } else {
                    JOptionPane.showMessageDialog(null, "Failed");
                }
            } catch(Exception e) {
                e.printStackTrace();
            } 
        }
    }//GEN-LAST:event_btnaddrentalrentActionPerformed

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
            java.util.logging.Logger.getLogger(AddRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRental().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable addrentaltable;
    private javax.swing.JButton btnaddrental;
    private javax.swing.JButton btnaddrentalrent;
    private javax.swing.JComboBox<String> cbaddrentalcategory;
    private javax.swing.JComboBox<String> cbaddrentalrentaltype;
    private javax.swing.JComboBox<String> cbaddrentaltype;
    private javax.swing.JComboBox<String> cbselectedmodel;
    private javax.swing.JButton gohome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl;
    private javax.swing.JTextField tfaddrentalcustomerid;
    private javax.swing.JTextField tfaddrentalorderdate;
    private javax.swing.JTextField tfaddrentalpaymentdate;
    private javax.swing.JTextField tfaddrentalqty;
    private javax.swing.JTextField tfaddrentalreturndate;
    private javax.swing.JTextField tfaddrentalstartdate;
    // End of variables declaration//GEN-END:variables
}
