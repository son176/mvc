package com.edusys.ui;

import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import com.edusys.utils.XImage;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.Timer;

public class EdusysJFrame extends javax.swing.JFrame {

    public EdusysJFrame() {
        initComponents();
        inits();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnDangXuat = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnChuyenDe = new javax.swing.JButton();
        btnNguoiHoc = new javax.swing.JButton();
        btnKhoaHoc = new javax.swing.JButton();
        btnHocVien = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btnHuongDan = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblThongtin = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        JDes = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mniDangNhap = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniDoiMatKhau = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mniKetThuc = new javax.swing.JMenuItem();
        mnuQuanLy = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mniChuyenDe = new javax.swing.JMenuItem();
        mniKhoaHoc = new javax.swing.JMenuItem();
        mniNguoiHoc = new javax.swing.JMenuItem();
        mniHocVien = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mniNhanVien = new javax.swing.JMenuItem();
        mnuThongKe = new javax.swing.JMenu();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mniBangDiem = new javax.swing.JMenuItem();
        mniLuongNguoiHoc = new javax.swing.JMenuItem();
        mniDiemChuyenDe = new javax.swing.JMenuItem();
        mniDoanhThu = new javax.swing.JMenuItem();
        mnuTroGiup = new javax.swing.JMenu();
        mniHuongdansudung = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mniGioiThieu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HỆ THỐNG QUẢN LÝ ĐÀO TẠO");

        jToolBar1.setRollover(true);

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/Log out.png"))); // NOI18N
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangXuat);

        btnKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/Stop.png"))); // NOI18N
        btnKetThuc.setText("Kết Thúc");
        btnKetThuc.setFocusable(false);
        btnKetThuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKetThuc.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnKetThuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKetThuc);
        jToolBar1.add(jSeparator7);

        btnChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/Text.png"))); // NOI18N
        btnChuyenDe.setText("Chuyên Đề");
        btnChuyenDe.setFocusable(false);
        btnChuyenDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChuyenDe.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnChuyenDe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenDeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnChuyenDe);

        btnNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/User group.png"))); // NOI18N
        btnNguoiHoc.setText("Người Học");
        btnNguoiHoc.setFocusable(false);
        btnNguoiHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNguoiHoc.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnNguoiHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNguoiHocActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNguoiHoc);

        btnKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/Certificate.png"))); // NOI18N
        btnKhoaHoc.setText("Khóa Học");
        btnKhoaHoc.setFocusable(false);
        btnKhoaHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhoaHoc.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnKhoaHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoaHocActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKhoaHoc);

        btnHocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/User.png"))); // NOI18N
        btnHocVien.setText("Học Viên");
        btnHocVien.setFocusable(false);
        btnHocVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHocVien.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnHocVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHocVienActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHocVien);
        jToolBar1.add(jSeparator8);

        btnHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/Globe.png"))); // NOI18N
        btnHuongDan.setText("Hướng Dẫn");
        btnHuongDan.setFocusable(false);
        btnHuongDan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuongDan.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnHuongDan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDanActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHuongDan);

        lblThongtin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/Info.png"))); // NOI18N
        lblThongtin.setText("Hệ Quản Lý Đào Tạo");

        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/Clock.png"))); // NOI18N
        lblDongHo.setText("09:47:07 AM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThongtin, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblThongtin, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(lblDongHo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JDesLayout = new javax.swing.GroupLayout(JDes);
        JDes.setLayout(JDesLayout);
        JDesLayout.setHorizontalGroup(
            JDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        JDesLayout.setVerticalGroup(
            JDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );

        mnuHeThong.setText("Hệ Thống");

        mniDangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        mniDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/Key.png"))); // NOI18N
        mniDangNhap.setText("Đăng Nhập");
        mniDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangNhapActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangNhap);

        mniDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/Exit.png"))); // NOI18N
        mniDangXuat.setText("Đăng Xuất");
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangXuat);
        mnuHeThong.add(jSeparator1);

        mniDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/Refresh.png"))); // NOI18N
        mniDoiMatKhau.setText("Đổi Mật Khẩu");
        mniDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMatKhauActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDoiMatKhau);
        mnuHeThong.add(jSeparator2);

        mniKetThuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mniKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/Stop.png"))); // NOI18N
        mniKetThuc.setText("Kết Thúc");
        mniKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKetThucActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniKetThuc);

        jMenuBar1.add(mnuHeThong);

        mnuQuanLy.setText("Quản Lý");
        mnuQuanLy.add(jSeparator3);

        mniChuyenDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        mniChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/Document.png"))); // NOI18N
        mniChuyenDe.setText("Chuyên Đề");
        mniChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniChuyenDeActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniChuyenDe);

        mniKhoaHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        mniKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/Certificate.png"))); // NOI18N
        mniKhoaHoc.setText("Khóa Học");
        mniKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKhoaHocActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniKhoaHoc);

        mniNguoiHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_MASK));
        mniNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/User group.png"))); // NOI18N
        mniNguoiHoc.setText("Người Học");
        mniNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNguoiHocActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniNguoiHoc);

        mniHocVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        mniHocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/User.png"))); // NOI18N
        mniHocVien.setText("Học Viên");
        mniHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHocVienActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniHocVien);
        mnuQuanLy.add(jSeparator4);

        mniNhanVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_MASK));
        mniNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/Users.png"))); // NOI18N
        mniNhanVien.setText("Nhân Viên");
        mniNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNhanVienActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniNhanVien);

        jMenuBar1.add(mnuQuanLy);

        mnuThongKe.setText("Thống Kê");
        mnuThongKe.add(jSeparator5);

        mniBangDiem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_MASK));
        mniBangDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/List.png"))); // NOI18N
        mniBangDiem.setText("Bảng Điểm");
        mniBangDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBangDiemActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniBangDiem);

        mniLuongNguoiHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.SHIFT_MASK));
        mniLuongNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/Clien list.png"))); // NOI18N
        mniLuongNguoiHoc.setText("Lượng người học");
        mniLuongNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLuongNguoiHocActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniLuongNguoiHoc);

        mniDiemChuyenDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.SHIFT_MASK));
        mniDiemChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/Bar chart.png"))); // NOI18N
        mniDiemChuyenDe.setText("Điểm Chuyên Đề");
        mniDiemChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDiemChuyenDeActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniDiemChuyenDe);

        mniDoanhThu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_MASK));
        mniDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/Dollar.png"))); // NOI18N
        mniDoanhThu.setText("Doanh Thu");
        mniDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoanhThuActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniDoanhThu);

        jMenuBar1.add(mnuThongKe);

        mnuTroGiup.setText("Trợ Giúp");

        mniHuongdansudung.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mniHuongdansudung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/Globe.png"))); // NOI18N
        mniHuongdansudung.setText("Hướng dẫn sử dụng");
        mniHuongdansudung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHuongdansudungActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mniHuongdansudung);
        mnuTroGiup.add(jSeparator6);

        mniGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.edusys.icon/Brick house.png"))); // NOI18N
        mniGioiThieu.setText("Giới thiệu sản phẩm");
        mnuTroGiup.add(mniGioiThieu);

        jMenuBar1.add(mnuTroGiup);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JDes)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JDes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniChuyenDeActionPerformed
        this.openQuanLyChuyenDe();
    }//GEN-LAST:event_mniChuyenDeActionPerformed

    private void btnChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenDeActionPerformed
        this.openQuanLyChuyenDe();
    }//GEN-LAST:event_btnChuyenDeActionPerformed

    private void btnKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoaHocActionPerformed
        this.openQuanLyKhoaHoc();
    }//GEN-LAST:event_btnKhoaHocActionPerformed

    private void mniKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKhoaHocActionPerformed
        this.openQuanLyKhoaHoc();
    }//GEN-LAST:event_mniKhoaHocActionPerformed

    private void mniNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNguoiHocActionPerformed
        this.openQuanLyNguoiHoc();
    }//GEN-LAST:event_mniNguoiHocActionPerformed

    private void btnNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNguoiHocActionPerformed
        this.openQuanLyNguoiHoc();
    }//GEN-LAST:event_btnNguoiHocActionPerformed

    private void mniNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNhanVienActionPerformed
        this.openQuanLyNhanVien();
    }//GEN-LAST:event_mniNhanVienActionPerformed

    private void btnHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHocVienActionPerformed
        this.openQuanLyHocVien();
    }//GEN-LAST:event_btnHocVienActionPerformed

    private void mniHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHocVienActionPerformed
        this.openQuanLyHocVien();
    }//GEN-LAST:event_mniHocVienActionPerformed

    private void mniDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMatKhauActionPerformed
        this.openDoiMatKhau();
    }//GEN-LAST:event_mniDoiMatKhauActionPerformed

    private void mniBangDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBangDiemActionPerformed
        this.openThongKe(0);
    }//GEN-LAST:event_mniBangDiemActionPerformed

    private void mniHuongdansudungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHuongdansudungActionPerformed
        this.openHuongDan();
    }//GEN-LAST:event_mniHuongdansudungActionPerformed

    private void mniLuongNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLuongNguoiHocActionPerformed
        this.openThongKe(1);
    }//GEN-LAST:event_mniLuongNguoiHocActionPerformed

    private void mniDiemChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDiemChuyenDeActionPerformed
        this.openThongKe(2);
    }//GEN-LAST:event_mniDiemChuyenDeActionPerformed

    private void mniDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoanhThuActionPerformed
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xem doanh thu");
        } else {
            this.openThongKe(3);
        }
    }//GEN-LAST:event_mniDoanhThuActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        dangXuat();
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        dangXuat();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        ketThuc();
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void mniKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKetThucActionPerformed
        ketThuc();
    }//GEN-LAST:event_mniKetThucActionPerformed

    private void btnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanActionPerformed
        this.openHuongDan();
    }//GEN-LAST:event_btnHuongDanActionPerformed

    private void mniDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangNhapActionPerformed
        this.openDangNhap();
    }//GEN-LAST:event_mniDangNhapActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EdusysJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDes;
    private javax.swing.JButton btnChuyenDe;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHocVien;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnKhoaHoc;
    private javax.swing.JButton btnNguoiHoc;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblThongtin;
    private javax.swing.JMenuItem mniBangDiem;
    private javax.swing.JMenuItem mniChuyenDe;
    private javax.swing.JMenuItem mniDangNhap;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDiemChuyenDe;
    private javax.swing.JMenuItem mniDoanhThu;
    private javax.swing.JMenuItem mniDoiMatKhau;
    private javax.swing.JMenuItem mniGioiThieu;
    private javax.swing.JMenuItem mniHocVien;
    private javax.swing.JMenuItem mniHuongdansudung;
    private javax.swing.JMenuItem mniKetThuc;
    private javax.swing.JMenuItem mniKhoaHoc;
    private javax.swing.JMenuItem mniLuongNguoiHoc;
    private javax.swing.JMenuItem mniNguoiHoc;
    private javax.swing.JMenuItem mniNhanVien;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenu mnuQuanLy;
    private javax.swing.JMenu mnuThongKe;
    private javax.swing.JMenu mnuTroGiup;
    // End of variables declaration//GEN-END:variables

    private void inits() {
        this.setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());

        new ChaoJDialog(this, true).setVisible(true);
        new DangNhapJDialog(this, true).setVisible(true);
        if (Auth.isLogin()) {
            this.setVisible(true);
        }
        new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date now = new Date();
                SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss a");
                String text = formater.format(now);
                lblDongHo.setText(text);
            }
        }).start();
    }

    void startDongHo() {
    }

    ;
    void dangXuat() {
        Auth.clear();
        new DangNhapJDialog(this, true).setVisible(true);
    }

    ;
    void ketThuc() {
        if (MsgBox.confirm(this, "Bạn muốn kết thúc làm việc không??")) {
            System.exit(0);
        }
    }

    ;
    
    
    
    private void openQuanLyChuyenDe() {
        for (JInternalFrame frmChild : JDes.getAllFrames()) {
            frmChild.dispose();
        }
        QuanLyChuyenDe cd = new QuanLyChuyenDe();
        cd.setTitle("Quản lý chuyên đề");
        cd.setLocation(this.getWidth() / 2 - cd.getWidth() / 2, (this.getHeight() - 50) / 2 - cd.getHeight() / 2 - 100);
        JDes.add(cd);
        cd.setVisible(true);

    }

    private void openQuanLyKhoaHoc() {
        for (JInternalFrame frmChild : JDes.getAllFrames()) {
            frmChild.dispose();
        }
        QuanLyKhoaHoc cd = new QuanLyKhoaHoc();
        cd.setTitle("Quản lý khóa học");
        cd.setLocation(this.getWidth() / 2 - cd.getWidth() / 2, (this.getHeight() - 50) / 2 - cd.getHeight() / 2 - 100);
        JDes.add(cd);
        cd.setVisible(true);
    }

    private void openQuanLyNguoiHoc() {
        for (JInternalFrame frmChild : JDes.getAllFrames()) {
            frmChild.dispose();
        }
        QuanLyNguoiHoc cd = new QuanLyNguoiHoc();
        cd.setTitle("Quản lý người học");
        cd.setLocation(this.getWidth() / 2 - cd.getWidth() / 2, (this.getHeight() - 50) / 2 - cd.getHeight() / 2 - 100);
        JDes.add(cd);
        cd.setVisible(true);
    }

    private void openQuanLyNhanVien() {
        for (JInternalFrame frmChild : JDes.getAllFrames()) {
            frmChild.dispose();
        }
        QuanLyNhanVien cd = new QuanLyNhanVien();
        cd.setTitle("Quản lý nhân viên");
        cd.setLocation(this.getWidth() / 2 - cd.getWidth() / 2, (this.getHeight() - 50) / 2 - cd.getHeight() / 2 - 100);
        JDes.add(cd);
        cd.setVisible(true);
    }

    private void openQuanLyHocVien() {
        for (JInternalFrame frmChild : JDes.getAllFrames()) {
            frmChild.dispose();
        }
        QuanLyHocVien cd = new QuanLyHocVien();
        cd.setTitle("Quản lý học viên");
        cd.setLocation(this.getWidth() / 2 - cd.getWidth() / 2, (this.getHeight() - 50) / 2 - cd.getHeight() / 2 - 100);
        JDes.add(cd);
        cd.setVisible(true);

    }

    private void openDoiMatKhau() {
        for (JInternalFrame frmChild : JDes.getAllFrames()) {
            frmChild.dispose();
        }
        DoiMatKhau cd = new DoiMatKhau();
        cd.setTitle("Đổi mật khẩu");
        cd.setLocation(this.getWidth() / 2 - cd.getWidth() / 2, (this.getHeight() - 50) / 2 - cd.getHeight() / 2 - 100);
        JDes.add(cd);
        cd.setVisible(true);
    }

    private void openThongKe(int index) {
//        if(Auth.isLogin()){
//            if(index == 3 && !Auth.isManager()){
//                MsgBox.alert(this, "Bạn không có quyền xem doanh thu");
//            }else{
//                ThongKeJDialog tkwin = new ThongKeJDialog(this, true);
//                tkwin.setVisible(true);
//                tkwin.selectTab(index);
//            }
//        }else{
//            MsgBox.alert(this, "Vui lòng đăng nhập để xem Thống kê");
//        }

//        if (index == 3 && !Auth.isManager()) {
//            MsgBox.alert(this, "Bạn không có quyền xem doanh thu");
//            return;
//        }
        
            for (JInternalFrame frmChild : JDes.getAllFrames()) {
                frmChild.dispose();
            }
            ThongKe cd = new ThongKe(index);
            
            cd.setTitle("Thống kê");
            cd.setLocation(this.getWidth() / 2 - cd.getWidth() / 2, (this.getHeight() - 50) / 2 - cd.getHeight() / 2 - 100);
            JDes.add(cd);

            cd.setVisible(true);
        
    }

    

    private void openHuongDan() {
        try {
            Desktop.getDesktop().browse(new File("help/index.html").toURI());
        } catch (Exception e) {
            MsgBox.alert(this, "Không tìm thấy file hướng dẫn");
        }
    }

    private void openDangNhap() {
        new DangNhapJDialog(this, true).setVisible(true);
    }

}
