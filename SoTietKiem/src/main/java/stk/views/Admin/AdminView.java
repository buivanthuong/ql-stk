/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stk.views.Admin;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import stk.entities.Khachhang;
import stk.entities.Phieuguitien;
import stk.entities.Taikhoan;
import stk.helper.KhachHangHelper;
import stk.helper.PhieuGoiHelper;
import stk.util.Utill;
import stk.views.Accout.AccoutView;
import stk.views.Accout.LoginView;
import stk.views.Config.ConfigView;
import stk.views.KhachHang.KhachHangView;
import stk.views.Report.DailyReport;
import stk.views.Report.SavingReportView;
import stk.views.Saving.AddSavingView;
import stk.views.Saving.SavingView;
import stk.views.Ticket.TicketInView;
import stk.views.Ticket.TicketOutView;

/**
 *
 * @author chitai
 */
public class AdminView extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public AdminView() {
        initComponents();
        updateTime();
        setTable();
        centreWindow(this);
    }
  public static void centreWindow(Window frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        tfSearchSaving = new javax.swing.JTextField();
        btSearch = new javax.swing.JButton();
        btOpenSaving = new javax.swing.JButton();
        btTicketIn = new javax.swing.JButton();
        btTicketOut = new javax.swing.JButton();
        btReport = new javax.swing.JButton();
        lbNameBank = new javax.swing.JLabel();
        lbAddress = new javax.swing.JLabel();
        btLogo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbTime = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnAccount = new javax.swing.JMenu();
        mnInfoAccount = new javax.swing.JMenuItem();
        mnLogout = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnOpenSaving = new javax.swing.JMenuItem();
        mnListSaving = new javax.swing.JMenuItem();
        mnTicket = new javax.swing.JMenu();
        mnTicketIn = new javax.swing.JMenuItem();
        mnTicketOut = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnReportDaily = new javax.swing.JMenuItem();
        mnReportMonthly = new javax.swing.JMenuItem();
        mnConfig = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu6.setText("jMenu6");

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(770, 550));
        setMinimumSize(new java.awt.Dimension(770, 550));
        setPreferredSize(new java.awt.Dimension(767, 530));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("QUẢN LÝ SỔ TIẾT KIỆM");
        jLabel1.setAlignmentX(0.5F);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 440, 85));

        tfSearchSaving.setText("Tra cứu sổ tiết kiệm");
        tfSearchSaving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchSavingActionPerformed(evt);
            }
        });
        getContentPane().add(tfSearchSaving, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 361, -1));

        btSearch.setText("Tra cứu");
        getContentPane().add(btSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, -1, -1));

        btOpenSaving.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btOpenSaving.setText("Mở sổ tiết kiệm");
        btOpenSaving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOpenSavingActionPerformed(evt);
            }
        });
        getContentPane().add(btOpenSaving, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 143, 63));

        btTicketIn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btTicketIn.setText("Phiếu gởi");
        btTicketIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTicketInActionPerformed(evt);
            }
        });
        getContentPane().add(btTicketIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 132, 63));

        btTicketOut.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btTicketOut.setText("Phiểu rút");
        btTicketOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTicketOutActionPerformed(evt);
            }
        });
        getContentPane().add(btTicketOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 128, 63));

        btReport.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btReport.setText("Báo cáo");
        btReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReportActionPerformed(evt);
            }
        });
        getContentPane().add(btReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 137, 63));

        lbNameBank.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNameBank.setText("NGÂN HÀNG NHÀ NƯỚC VIỆT NAM");
        getContentPane().add(lbNameBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        lbAddress.setText("123 Lê lợi , Phường Dakao, Quận 1, TP HỒ CHÍ MINH");
        getContentPane().add(lbAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        btLogo.setText("jButton6");
        getContentPane().add(btLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 50, 50));

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTime.setText("12:30 PM      22 - 05 - 2019");
        jPanel1.add(lbTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 0, 170, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 770, 50));

        mnAccount.setText("Tài khoản");

        mnInfoAccount.setText("Thông tin tài khoản");
        mnInfoAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnInfoAccountActionPerformed(evt);
            }
        });
        mnAccount.add(mnInfoAccount);

        mnLogout.setText("Đăng xuất");
        mnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLogoutActionPerformed(evt);
            }
        });
        mnAccount.add(mnLogout);

        jMenuBar1.add(mnAccount);

        jMenu2.setText("Sổ tiết kiêm");

        mnOpenSaving.setText("Mở sổ tiết kiệm");
        mnOpenSaving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnOpenSavingActionPerformed(evt);
            }
        });
        jMenu2.add(mnOpenSaving);

        mnListSaving.setText("Danh sách sổ");
        mnListSaving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListSavingActionPerformed(evt);
            }
        });
        jMenu2.add(mnListSaving);

        jMenuBar1.add(jMenu2);

        mnTicket.setText("Phiếu gửi/ rút");

        mnTicketIn.setText("Phiểu gửi");
        mnTicketIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTicketInActionPerformed(evt);
            }
        });
        mnTicket.add(mnTicketIn);

        mnTicketOut.setText("Phiếu rút");
        mnTicketOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTicketOutActionPerformed(evt);
            }
        });
        mnTicket.add(mnTicketOut);

        jMenuBar1.add(mnTicket);

        jMenu4.setText("Báo cáo");

        mnReportDaily.setText("Báo cáo ngày");
        mnReportDaily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnReportDailyActionPerformed(evt);
            }
        });
        jMenu4.add(mnReportDaily);

        mnReportMonthly.setText("Báo cáo tháng");
        mnReportMonthly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnReportMonthlyActionPerformed(evt);
            }
        });
        jMenu4.add(mnReportMonthly);

        jMenuBar1.add(jMenu4);

        mnConfig.setText("Quy định");

        jMenuItem6.setText("Thay đổi quy định");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        mnConfig.add(jMenuItem6);

        jMenuBar1.add(mnConfig);

        jMenu1.setText("Khách hàng");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Danh sách khách hàng");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnReportDailyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnReportDailyActionPerformed
        // TODO add your handling code here:
        DailyReport ds = new DailyReport();
         ds.setVisible(true);
    }//GEN-LAST:event_mnReportDailyActionPerformed

    private void mnReportMonthlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnReportMonthlyActionPerformed
        // TODO add your handling code here:
        SavingReportView ds = new SavingReportView();
         ds.setVisible(true);
    }//GEN-LAST:event_mnReportMonthlyActionPerformed

    private void mnInfoAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnInfoAccountActionPerformed
        // TODO add your handling code here:
        AccoutView ds = new AccoutView();
         ds.setVisible(true);
    }//GEN-LAST:event_mnInfoAccountActionPerformed

    private void mnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLogoutActionPerformed
        // TODO add your handling code here:
        Utill.SaveLogin(false);
        
         /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new LoginView().setVisible(true);
                    }
                });
		 this.setVisible(false);
    }//GEN-LAST:event_mnLogoutActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        ConfigView ds = new ConfigView();
        ds.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void tfSearchSavingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchSavingActionPerformed
        // TODO add your handling code here:
        SavingView ds = new SavingView();
         ds.setVisible(true);
    }//GEN-LAST:event_tfSearchSavingActionPerformed

    private void btTicketInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTicketInActionPerformed
        // TODO add your handling code here:
        TicketInView ds = new TicketInView();
         ds.setVisible(true);
    }//GEN-LAST:event_btTicketInActionPerformed

    private void btOpenSavingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOpenSavingActionPerformed
         SavingView ds = new SavingView();
         ds.setVisible(true);
    }//GEN-LAST:event_btOpenSavingActionPerformed

    private void btReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReportActionPerformed
        // TODO add your handling code here:
        DailyReport ds = new DailyReport();
         ds.setVisible(true);
    }//GEN-LAST:event_btReportActionPerformed

    private void mnOpenSavingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnOpenSavingActionPerformed
        // TODO add your handling code here:
         AddSavingView ds = new AddSavingView();
         ds.setVisible(true);
    }//GEN-LAST:event_mnOpenSavingActionPerformed

    private void mnListSavingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListSavingActionPerformed
        // TODO add your handling code here:
        SavingView ds = new SavingView();
         ds.setVisible(true);
    }//GEN-LAST:event_mnListSavingActionPerformed

    private void mnTicketInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTicketInActionPerformed
        // TODO add your handling code here:
         TicketInView ds = new TicketInView();
         ds.setVisible(true);
    }//GEN-LAST:event_mnTicketInActionPerformed

    private void btTicketOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTicketOutActionPerformed
        // TODO add your handling code here:
         TicketOutView ds = new TicketOutView();
         ds.setVisible(true);
    }//GEN-LAST:event_btTicketOutActionPerformed

    private void mnTicketOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTicketOutActionPerformed
        // TODO add your handling code here:
         TicketInView ds = new TicketInView();
         ds.setVisible(true);
    }//GEN-LAST:event_mnTicketOutActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        KhachHangView ds = new KhachHangView();
         ds.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogo;
    private javax.swing.JButton btOpenSaving;
    private javax.swing.JButton btReport;
    private javax.swing.JButton btSearch;
    private javax.swing.JButton btTicketIn;
    private javax.swing.JButton btTicketOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAddress;
    private javax.swing.JLabel lbNameBank;
    private javax.swing.JLabel lbTime;
    private javax.swing.JMenu mnAccount;
    private javax.swing.JMenu mnConfig;
    private javax.swing.JMenuItem mnInfoAccount;
    private javax.swing.JMenuItem mnListSaving;
    private javax.swing.JMenuItem mnLogout;
    private javax.swing.JMenuItem mnOpenSaving;
    private javax.swing.JMenuItem mnReportDaily;
    private javax.swing.JMenuItem mnReportMonthly;
    private javax.swing.JMenu mnTicket;
    private javax.swing.JMenuItem mnTicketIn;
    private javax.swing.JMenuItem mnTicketOut;
    private javax.swing.JTextField tfSearchSaving;
    // End of variables declaration//GEN-END:variables

    public  void setTable(){
//        KhachHangHelper kh = new KhachHangHelper();
//       
//        Khachhang ab =new  Khachhang();
//        ab.setDiaChi(jTextField4.getText());
//        
//        
//            List<Khachhang> resultList = kh.getKhachhangList();;
//            System.out.println("num of employess:" + resultList.size());
//            int i = 0;
//            for (Khachhang next : resultList) {
//                System.out.println("next employee: " + next);
//                jTable1.getModel().setValueAt(next.getTen(),i,1);
//                jTable1.getModel().setValueAt(next.getId(),i,0);
//                jTable1.getModel().setValueAt(next.getDiaChi(),i,2);
//                
//
//                                i++;
//
//
//            }
//        
//            
//            
//          PhieuGoiHelper pg = new PhieuGoiHelper();
//       
//            List<Phieuguitien> resultLists = pg.getPhieuguitienList();;
//            System.out.println("num of employess:" + resultList.size());
//            int ii = 0;
//            for (Phieuguitien next : resultLists) {
//                System.out.println("next employee: " + next);
//                jTable7.getModel().setValueAt(next.getNgayGui(),ii,2);
//                jTable7.getModel().setValueAt(next.getId(),ii,0);
//                jTable7.getModel().setValueAt(next.getSoTienGui(),ii,3);
//                jTable7.getModel().setValueAt(next.getIdKh(),ii,1);
//
//                                ii++;
//
//
//            }
    }

    private void updateTime() {
        
        Thread  updateThread = new Thread() {
            public void run() {
                while (true) {
                    try {
                        lbTime.setText( new SimpleDateFormat(" HH:mm:ss dd/MM/YYYY").format(new Date()));
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
	// background thread
	updateThread.setDaemon(true);
	updateThread.start();
    }
}
