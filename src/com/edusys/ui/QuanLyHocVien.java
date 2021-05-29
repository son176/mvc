package com.edusys.ui;

import com.edusys.dao.ChuyenDeDAO;
import com.edusys.dao.HocVienDAO;
import com.edusys.dao.KhoaHocDAO;
import com.edusys.dao.NguoiHocDAO;
import com.edusys.entity.ChuyenDe;
import com.edusys.entity.HocVien;
import com.edusys.entity.KhoaHoc;
import com.edusys.entity.NguoiHoc;
import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QuanLyHocVien extends javax.swing.JInternalFrame {

    public QuanLyHocVien() {
        initComponents();
        inits();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cboChuyenDe = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        cboKhoaHoc = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHocVien = new javax.swing.JTable();
        btnXoa = new javax.swing.JButton();
        btnCapNhapDiem = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNguoiHoc = new javax.swing.JTable();
        btnThemVaoKhoaHoc = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chuyên đề", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N

        cboChuyenDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboChuyenDe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboChuyenDeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboChuyenDe, 0, 253, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Khóa học", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N

        cboKhoaHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboKhoaHoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboKhoaHocItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboKhoaHoc, 0, 259, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblHocVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã học viên", "Mã người học", "Họ tên", "Điểm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHocVien);

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa khỏi khóa học");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhapDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/Edit.png"))); // NOI18N
        btnCapNhapDiem.setText("Cập nhập điểm");
        btnCapNhapDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhapDiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCapNhapDiem, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnCapNhapDiem))
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("HỌC VIÊN", jPanel3);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 153, 255))); // NOI18N
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });
        jPanel5.add(txtTimKiem);

        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/Zoom.png"))); // NOI18N
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        jPanel5.add(btnTimKiem);

        tblNguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã người học", "Họ tên", "Giới tính", "Ngày sinh", "Điện thoại", "Email"
            }
        ));
        jScrollPane2.setViewportView(tblNguoiHoc);

        btnThemVaoKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/Add.png"))); // NOI18N
        btnThemVaoKhoaHoc.setText("Thêm vào khóa học");
        btnThemVaoKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemVaoKhoaHocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(453, Short.MAX_VALUE)
                .addComponent(btnThemVaoKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThemVaoKhoaHoc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("NGƯỜI HỌC", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 86, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboChuyenDeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboChuyenDeItemStateChanged
        this.fillComboBoxKhoaHoc();

    }//GEN-LAST:event_cboChuyenDeItemStateChanged

    private void cboKhoaHocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboKhoaHocItemStateChanged
        this.fillTableHocVien();

    }//GEN-LAST:event_cboKhoaHocItemStateChanged

    private void btnCapNhapDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhapDiemActionPerformed
        this.updateDiem();
    }//GEN-LAST:event_btnCapNhapDiemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        this.removeHocVien();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemVaoKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemVaoKhoaHocActionPerformed
        this.addHocVien();
    }//GEN-LAST:event_btnThemVaoKhoaHocActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased

    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        this.search();
    }//GEN-LAST:event_btnTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhapDiem;
    private javax.swing.JButton btnThemVaoKhoaHoc;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboChuyenDe;
    private javax.swing.JComboBox<String> cboKhoaHoc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblHocVien;
    private javax.swing.JTable tblNguoiHoc;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
    ChuyenDeDAO cddao = new ChuyenDeDAO();
    HocVienDAO hvdao = new HocVienDAO();
    NguoiHocDAO nhdao = new NguoiHocDAO();
    KhoaHocDAO khdao = new KhoaHocDAO();
//    int row1;
//    int row2;
//    DefaultTableModel tbhv;
//    DefaultTableModel tbNh;
//    DefaultComboBoxModel cbcd;
//    DefaultComboBoxModel cbkh;
//    List<HocVien> lsthv;
//    List<NguoiHoc> lstnh;
//    List<ChuyenDe> lstcd;
//    List<KhoaHoc> lstkh;
//

    private void inits() {
        this.fillComboBoxChuyenDe();

    }

    private void fillComboBoxChuyenDe() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboChuyenDe.getModel();
        model.removeAllElements();
        List<ChuyenDe> list = cddao.selectAll();
        if (list != null) {
            for (ChuyenDe cd : list) {
                model.addElement(cd);
            }
        }
        fillComboBoxKhoaHoc();
    }

    private void fillComboBoxKhoaHoc() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboKhoaHoc.getModel();
        model.removeAllElements();
        ChuyenDe chuyende = (ChuyenDe) cboChuyenDe.getSelectedItem();
        if (chuyende != null) {

            List<KhoaHoc> list = khdao.selectByChuyenDe(chuyende.getMaCD());
            if (list != null) {
                for (KhoaHoc kh : list) {

                    model.addElement(kh);

                }
            }
        }
        this.fillTableHocVien();
    }

    private void fillTableHocVien() {
        DefaultTableModel model = (DefaultTableModel) tblHocVien.getModel();
        model.setRowCount(0);
        KhoaHoc khoahoc = (KhoaHoc) cboKhoaHoc.getSelectedItem();
        if (khoahoc != null) {
            List<HocVien> list = hvdao.selectByKhoaHoc(khoahoc.getMaKH());
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    HocVien hv = list.get(i);
                    String hoten = nhdao.selectById(hv.getMaNH()).getHoTen();
                    model.addRow(new Object[]{i + 1, hv.getMaHV(), hv.getMaNH(), hoten, hv.getDiem()});

                }
            }
        }
        this.fillTableNguoiHoc();
    }

    private void fillTableNguoiHoc() {
        DefaultTableModel model = (DefaultTableModel) tblNguoiHoc.getModel();
        model.setRowCount(0);
        

        List<NguoiHoc> list = nhdao.selectNotInCourse();
        for (NguoiHoc nh : list) {
            model.addRow(new Object[]{nh.getMaNH(), nh.getHoTen(), nh.isGioiTinh() ? "Nam" : "Nu", nh.getNgaySinh(), nh.getDienThoai(), nh.getEmail()});
        }
    }
    
    private void search() {
        DefaultTableModel model = (DefaultTableModel) tblNguoiHoc.getModel();
        model.setRowCount(0);
        KhoaHoc khoahoc = (KhoaHoc) cboKhoaHoc.getSelectedItem();
        String keyword = txtTimKiem.getText();
        List<NguoiHoc> list = nhdao.selectNotInCourse1(khoahoc.getMaKH(),keyword );
        for (NguoiHoc nh : list) {
            model.addRow(new Object[]{nh.getMaNH(), nh.getHoTen(), nh.isGioiTinh() ? "Nam" : "Nu", nh.getNgaySinh(), nh.getDienThoai(), nh.getEmail()});
        }
    }


    void addHocVien() {
        KhoaHoc khoahoc = (KhoaHoc) cboKhoaHoc.getSelectedItem();
        for (int row : tblNguoiHoc.getSelectedRows()) {
            HocVien hv = new HocVien();
            hv.setMaKH(khoahoc.getMaKH());
            hv.setDiem((float) 0.0);
            hv.setMaNH((String) tblNguoiHoc.getValueAt(row, 0));
            hvdao.insert(hv);
        }
        this.fillTableHocVien();
        jTabbedPane1.setSelectedIndex(0);

    }

    void removeHocVien() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Ban khong co quyen xoa hoc vien");
        } else {
            if (MsgBox.confirm(this, "Ban co muon xoa hoc vien nay khong??")) {
                for (int row : tblHocVien.getSelectedRows()) {
                    int mahv = (int) tblHocVien.getValueAt(row, 1);
                    hvdao.delete(mahv);
                }
            }
            this.fillTableHocVien();
        }

    }

    void updateDiem() {
        for (int i = 0; i < tblHocVien.getRowCount(); i++) {
            int mahv = (int) tblHocVien.getValueAt(i, 1);
            HocVien hv = hvdao.selectById(mahv);
            hv.setDiem((float) tblHocVien.getValueAt(i, 4));
            hvdao.update(hv);
        }
        MsgBox.alert(this, "Cap nhap diem thanh cong");
    }

}
