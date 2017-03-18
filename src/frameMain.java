
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Iin Nuraini
 */
public class frameMain extends javax.swing.JFrame {

    String nol_jam = "";
    String nol_menit = "";
    String nol_detik = "";
  
    /**
     * Creates new form frameMain
     */
    public frameMain() {
        initComponents();
        setTanggal();
        setJam();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nopol = new javax.swing.JTextField();
        tglklr = new com.toedter.calendar.JDateChooser();
        tglmsk = new com.toedter.calendar.JDateChooser();
        mobil = new javax.swing.JRadioButton();
        motor = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        nmpegawai = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        save = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        print = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        labeltanggal = new javax.swing.JLabel();
        labeljam = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel2.setText("Rp. 3000/jam");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(300, 140, 130, 20);

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel4.setText("Nama Pegawai");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 170, 140, 20);

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel5.setText("Jenis Kendaraan");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 260, 160, 20);

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel6.setText("Tanggal Masuk");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 300, 160, 20);

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel7.setText("Tanggal Keluar");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 340, 160, 20);
        jPanel1.add(nopol);
        nopol.setBounds(190, 220, 220, 30);
        jPanel1.add(tglklr);
        tglklr.setBounds(190, 340, 220, 30);
        jPanel1.add(tglmsk);
        tglmsk.setBounds(190, 300, 220, 30);

        buttonGroup1.add(mobil);
        mobil.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        mobil.setText("Mobil");
        jPanel1.add(mobil);
        mobil.setBounds(190, 260, 80, 25);

        buttonGroup1.add(motor);
        motor.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        motor.setText("Motor");
        jPanel1.add(motor);
        motor.setBounds(310, 260, 90, 25);

        jLabel10.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel10.setText("Nomor Polisi");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 220, 130, 20);

        nmpegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmpegawaiActionPerformed(evt);
            }
        });
        jPanel1.add(nmpegawai);
        nmpegawai.setBounds(190, 170, 220, 30);

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 530, 400);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 200, 530, 400);

        save.setBackground(new java.awt.Color(0, 204, 255));
        save.setFont(new java.awt.Font("Lucida Calligraphy", 1, 10)); // NOI18N
        save.setForeground(new java.awt.Color(102, 0, 102));
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save);
        save.setBounds(570, 200, 90, 40);

        clear.setBackground(new java.awt.Color(0, 204, 255));
        clear.setFont(new java.awt.Font("Lucida Calligraphy", 1, 10)); // NOI18N
        clear.setForeground(new java.awt.Color(102, 0, 102));
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear);
        clear.setBounds(690, 200, 90, 40);

        delete.setBackground(new java.awt.Color(0, 204, 255));
        delete.setFont(new java.awt.Font("Lucida Calligraphy", 1, 10)); // NOI18N
        delete.setForeground(new java.awt.Color(102, 0, 102));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(810, 200, 90, 40);

        print.setBackground(new java.awt.Color(0, 204, 255));
        print.setFont(new java.awt.Font("Lucida Calligraphy", 1, 10)); // NOI18N
        print.setForeground(new java.awt.Color(102, 0, 102));
        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        getContentPane().add(print);
        print.setBounds(1060, 200, 90, 40);

        refresh.setBackground(new java.awt.Color(0, 204, 255));
        refresh.setFont(new java.awt.Font("Lucida Calligraphy", 1, 10)); // NOI18N
        refresh.setForeground(new java.awt.Color(102, 0, 102));
        refresh.setText("REFRESH");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        getContentPane().add(refresh);
        refresh.setBounds(930, 200, 100, 40);

        labeltanggal.setBackground(new java.awt.Color(0, 153, 153));
        labeltanggal.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        labeltanggal.setText("Tanggal");
        getContentPane().add(labeltanggal);
        labeltanggal.setBounds(780, 150, 130, 30);

        labeljam.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        labeljam.setText("Jam");
        getContentPane().add(labeljam);
        labeljam.setBounds(1010, 150, 160, 30);

        jScrollPane1.setBackground(new java.awt.Color(0, 204, 204));

        tabel.setBackground(new java.awt.Color(0, 153, 153));
        tabel.setForeground(new java.awt.Color(0, 153, 153));
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NoResi", "NmPegawai", "NoPol", "JenKen", "TanggalMsk", "TanggalKlr", "Tarif"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(590, 290, 530, 270);

        jPanel3.setBackground(new java.awt.Color(51, 255, 255));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(570, 260, 580, 340);

        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Aman dan Terpercaya");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(510, 60, 300, 60);

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("TRANSAKSI PARKIRQUE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(350, 20, 580, 50);

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 1180, 640);

        setBounds(0, 0, 1193, 670);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        int harga = 72000;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggalmasuk = dateFormat.format(tglmsk.getDate());
        String tanggalkeluar = dateFormat.format(tglklr.getDate());
        
        Date masuk = tglmsk.getDate();
        Date keluar = tglklr.getDate();
        long miliseconds = keluar.getTime() - masuk.getTime();
        int days = (int) (miliseconds/(1000*60*60*24));
        int total = days*72000;
        
        
        String jk = "";
            if (mobil.isSelected()){
                jk="Mobil";
            } 
            if (motor.isSelected())
                jk = "Motor";
            
            
        if(
           nopol.getText().equals("") ||
           nmpegawai.getText().equals("") ||
                jk.equals("") ||
           tanggalmasuk.equals("") ||
           tanggalkeluar.equals("") 
         
           
           ){
            JOptionPane.showMessageDialog(this, "Harap Lengkapi data", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            
            String SQL = "INSERT INTO tb_transaksi (NoResi,NmPegawai,NoPol,JenKen,TanggalMsk,TanggalKlr,Tarif)"
                    + "VALUES"
                    + "(NULL,"
                    + "'"+nmpegawai.getText()+"',"
                    + "'"+nopol.getText()+"',"
                    + "'"+jk+"',"
                    + "'"+tanggalmasuk+"',"
                    + "'"+tanggalkeluar+"',"
                    + "'"+total+"')";
            int status = KoneksiDB.execute(SQL);
            if(status == 1){
            
               JOptionPane.showMessageDialog(this, "data berhasil ditambahkan", "sukses", JOptionPane.INFORMATION_MESSAGE);
               selectData();
            }  else {
                JOptionPane.showMessageDialog(this, "data gagal ditambahkan", "gagal", JOptionPane.WARNING_MESSAGE);
            } 
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        
       nopol.setText("");
       nmpegawai.setText("");
       buttonGroup1.clearSelection();
       tglmsk.setDate(null);
       tglklr.setDate(null);
      

        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        int baris = tabel.getSelectedRow();
        if (baris != -1){
            String NoResi = tabel.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM tb_transaksi WHERE NoResi='"+NoResi+"'";
            int status = KoneksiDB.execute(SQL);
            if(status==1){
                JOptionPane.showMessageDialog(this, "data berhasil dihapus","sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "data gagal dihapus","gagal", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "pilih baris data terlebih dahulu", "error", JOptionPane.WARNING_MESSAGE);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        
           MessageFormat header = new MessageFormat("Rent Car");
        MessageFormat footer = new MessageFormat("Page (0,number,integer)   ");
        
        try {
            tabel.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("cannot print %s%n", e.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_printActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        
        selectData();

        // TODO add your handling code here:
    }//GEN-LAST:event_refreshActionPerformed

    private void nmpegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nmpegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nmpegawaiActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked

        int baris = tabel.getSelectedRow();
        if (baris != -1){
            nopol.setText(tabel.getValueAt(baris, 1).toString());
            nmpegawai.setText(tabel.getValueAt(baris, 2).toString());
            String jk= tabel.getValueAt(baris, 3).toString();
            if (jk.equals("Mobil")){
                mobil.setSelected(true);
            } else {
                motor.setSelected(true);
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String tanggalmasuk = tabel.getValueAt(baris, 4).toString();
            Date tgl;
            try{
                tgl = dateFormat.parse(tanggalmasuk);
                tglmsk.setDate(tgl);
            } catch (ParseException ex) {
                // Logger.getLogger(frameMain.class.getName()).log(Level.SEVERE, null, ex);
            }
            String tanggalkeluar = tabel.getValueAt(baris, 5).toString();
            try{
                tgl = dateFormat.parse(tanggalkeluar);
                tglklr.setDate(tgl);
            } catch (ParseException ex) {
                // Logger.getLogger(frameMain.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_tabelMouseClicked

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
            java.util.logging.Logger.getLogger(frameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labeljam;
    private javax.swing.JLabel labeltanggal;
    private javax.swing.JRadioButton mobil;
    private javax.swing.JRadioButton motor;
    private javax.swing.JTextField nmpegawai;
    private javax.swing.JTextField nopol;
    private javax.swing.JButton print;
    private javax.swing.JButton refresh;
    private javax.swing.JButton save;
    private javax.swing.JTable tabel;
    private com.toedter.calendar.JDateChooser tglklr;
    private com.toedter.calendar.JDateChooser tglmsk;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
        String kolom[] = {"NoResi","NmPegawai","NoPol","JenKen","TanggalMsk","TanggalKlr","Tarif"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM tb_transaksi";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try {
            while(rs.next()) {
                String NoResi = rs.getString(1);
                String NmPegawai = rs.getString(2);
                String NoPol = rs.getString(3);
                String JenisKendaraan = "";
                if ("Mobil".equals(rs.getString(4))){
                    JenisKendaraan = "Mobil";
                } else {
                    JenisKendaraan = "Motor";
                }
                String TanggalMsk = rs.getString(5);
                String TanggalKlr = rs.getString(6);
                String Tarif = rs.getString(7);
                String data[] = {NoResi,NmPegawai,NoPol,JenisKendaraan,TanggalMsk,TanggalKlr,Tarif};
                dtm.addRow(data);
            }
         
        } catch (SQLException ex){
        //Logger.getLogger(frameMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        tabel.setModel(dtm);
    }
    
    public void setTanggal(){
        java.util.Date skrg = new java.util.Date();
        java.text.SimpleDateFormat kal = new
            java.text.SimpleDateFormat("dd/MM/yyyy");
        labeltanggal.setText(kal.format(skrg));
    }
    
    public void setJam(){
        ActionListener taskPerformed = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Date dt = new Date();
                int nilai_jam = dt.getHours();
                int nilai_menit = dt.getMinutes();
                int nilai_detik = dt.getSeconds();
                if(nilai_jam <= 9 ){
                    nol_jam = "0";
                }
                if(nilai_menit <= 9 ){
                    nol_menit = "0";
                }
                if(nilai_detik <= 9 ){
                    nol_detik = "0";
                }
                
                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);
                labeljam.setText("Jam "+jam + ":" + menit + ":" + detik);
                
            }
        };
        new Timer(100, taskPerformed).start();
    }
    
}
