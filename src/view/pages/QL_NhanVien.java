package view.pages;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import controller.QLNhanVienController;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QL_NhanVien extends JPanel{
	private JTable table;
	private JTextField tf_maNhanVien;
	private JTextField tf_tenNhanVien;
	private JTextField tf_cccd;
	private JTextField tf_ngaySinh;
	private JTextField tf_sdt;
	private JTextField tf_luong;
	private JTextField tf_timKiem;
	private DefaultTableModel table_model;
	private JComboBox cb_chucVu;
	private JComboBox cb_gioiTinh;
	private JButton bt_luu;
	
	public QL_NhanVien() {
		setBackground(Color.WHITE);
		setSize(1240, 660);
		setLayout(null);
		
		Action action = new QLNhanVienController(this);
		
		JLabel lb_logo = new JLabel("");
		lb_logo.setHorizontalAlignment(SwingConstants.CENTER);
		lb_logo.setBounds(370, 10, 442, 63);
		add(lb_logo);
		
		table_model = new DefaultTableModel(
				new Object[][] {},
				new String[] {
					"M\u00E3 NV", "T\u00EAn NV", "CCCD", "Gi\u1EDBi", "Ng\u00E0y sinh", "S\u0110T", "Ch\u1EE9c v\u1EE5", "L\u01B0\u01A1ng"
				});
		table = new JTable();
		table.setModel(table_model);
		table.setFont(new Font("Tahoma", Font.BOLD, 20));
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(230);
		table.getColumnModel().getColumn(2).setPreferredWidth(150);
		table.getColumnModel().getColumn(3).setPreferredWidth(70);
		table.getColumnModel().getColumn(4).setPreferredWidth(133);
		table.getColumnModel().getColumn(5).setPreferredWidth(125);
		table.getColumnModel().getColumn(6).setPreferredWidth(170);
		table.getColumnModel().getColumn(7).setPreferredWidth(171);
		
		Font headerFont = new Font("Arial", Font.BOLD, 20);
		table.getTableHeader().setPreferredSize(new Dimension(table.getTableHeader().getWidth(), 30));
		table.getTableHeader().setFont(headerFont);
		table.setRowHeight(40);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(20, 421, 1017, 239);
		add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("Mã nhân viên");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(20, 103, 154, 30);
		add(lblNewLabel);
		
		JLabel lblTnNhnVin = new JLabel("Tên nhân viên");
		lblTnNhnVin.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTnNhnVin.setBounds(20, 162, 154, 30);
		add(lblTnNhnVin);
		
		JLabel lblCccd = new JLabel("CCCD");
		lblCccd.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCccd.setBounds(20, 217, 154, 30);
		add(lblCccd);
		
		JLabel lblGiiTnh = new JLabel("Giới Tính");
		lblGiiTnh.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblGiiTnh.setBounds(20, 277, 154, 30);
		add(lblGiiTnh);
		
		tf_maNhanVien = new JTextField();
		tf_maNhanVien.setFont(new Font("Tahoma", Font.BOLD, 20));
		tf_maNhanVien.setBounds(184, 103, 245, 29);
		add(tf_maNhanVien);
		tf_maNhanVien.setColumns(10);
		
		tf_tenNhanVien = new JTextField();
		tf_tenNhanVien.setFont(new Font("Tahoma", Font.BOLD, 20));
		tf_tenNhanVien.setColumns(10);
		tf_tenNhanVien.setBounds(184, 162, 245, 29);
		add(tf_tenNhanVien);
		
		tf_cccd = new JTextField();
		tf_cccd.setFont(new Font("Tahoma", Font.BOLD, 20));
		tf_cccd.setColumns(10);
		tf_cccd.setBounds(184, 217, 245, 29);
		add(tf_cccd);
		
		String[] itemGioiTinh = { "Nam", "Nữ" };
		cb_gioiTinh = new JComboBox<>(itemGioiTinh);
		cb_gioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cb_gioiTinh.setBounds(184, 277, 245, 30);
		add(cb_gioiTinh);
		
		JLabel lblNgySinh = new JLabel("Ngày sinh");
		lblNgySinh.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNgySinh.setBounds(478, 103, 154, 30);
		add(lblNgySinh);
		
		JLabel lblSt = new JLabel("SĐT");
		lblSt.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSt.setBounds(478, 162, 154, 30);
		add(lblSt);
		
		JLabel lblChcV = new JLabel("Chức vụ");
		lblChcV.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblChcV.setBounds(478, 217, 154, 30);
		add(lblChcV);
		
		JLabel lblLng = new JLabel("Lương");
		lblLng.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLng.setBounds(478, 277, 154, 30);
		add(lblLng);
		
		tf_ngaySinh = new JTextField();
		tf_ngaySinh.setFont(new Font("Tahoma", Font.BOLD, 20));
		tf_ngaySinh.setColumns(10);
		tf_ngaySinh.setBounds(594, 104, 245, 29);
		add(tf_ngaySinh);
		
		tf_sdt = new JTextField();
		tf_sdt.setFont(new Font("Tahoma", Font.BOLD, 20));
		tf_sdt.setColumns(10);
		tf_sdt.setBounds(594, 163, 245, 29);
		add(tf_sdt);
		
		tf_luong = new JTextField();
		tf_luong.setFont(new Font("Tahoma", Font.BOLD, 20));
		tf_luong.setColumns(10);
		tf_luong.setBounds(594, 278, 245, 29);
		add(tf_luong);
		
		String[] itemChucVu = { "Quản lý", "Nhân viên", "Lao công", "Bảo vệ" };
		cb_chucVu = new JComboBox<>(itemChucVu);
		cb_chucVu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cb_chucVu.setBounds(594, 217, 245, 30);
		add(cb_chucVu);
		
		JLabel bt_xuatDanhSach = new JLabel("XUẤT DANH SÁCH");
		bt_xuatDanhSach.setIcon(new ImageIcon(QL_NhanVien.class.getResource("/images/icon_export.png")));
		bt_xuatDanhSach.setBackground(new Color(0, 185, 7));
		bt_xuatDanhSach.setHorizontalAlignment(SwingConstants.CENTER);
		bt_xuatDanhSach.setFont(new Font("Tahoma", Font.BOLD, 15));
		bt_xuatDanhSach.setBounds(849, 92, 188, 56);
		bt_xuatDanhSach.setOpaque(true);
		add(bt_xuatDanhSach);
		
		JLabel bt_themNhanVien = new JLabel("THÊM NHÂN VIÊN");
		bt_themNhanVien.setOpaque(true);
		bt_themNhanVien.setIcon(new ImageIcon(QL_NhanVien.class.getResource("/images/icon_add.png")));
		bt_themNhanVien.setHorizontalAlignment(SwingConstants.CENTER);
		bt_themNhanVien.setFont(new Font("Tahoma", Font.BOLD, 15));
		bt_themNhanVien.setBackground(new Color(2, 119, 185));
		bt_themNhanVien.setBounds(849, 162, 188, 56);
		add(bt_themNhanVien);
		
		JLabel bt_suaThongTin = new JLabel("SỬA THÔNG TIN");
		bt_suaThongTin.setOpaque(true);
		bt_suaThongTin.setIcon(new ImageIcon(QL_NhanVien.class.getResource("/images/edit.png")));
		bt_suaThongTin.setHorizontalAlignment(SwingConstants.CENTER);
		bt_suaThongTin.setFont(new Font("Tahoma", Font.BOLD, 15));
		bt_suaThongTin.setBackground(new Color(188, 219, 0));
		bt_suaThongTin.setBounds(849, 229, 188, 56);
		add(bt_suaThongTin);
		
		JLabel bt_xoaNhanVien = new JLabel("XOÁ NHÂN VIÊN");
		bt_xoaNhanVien.setOpaque(true);
		bt_xoaNhanVien.setIcon(new ImageIcon(QL_NhanVien.class.getResource("/images/icon_delete (2).png")));
		bt_xoaNhanVien.setHorizontalAlignment(SwingConstants.CENTER);
		bt_xoaNhanVien.setFont(new Font("Tahoma", Font.BOLD, 15));
		bt_xoaNhanVien.setBackground(new Color(210, 25, 13));
		bt_xoaNhanVien.setBounds(849, 296, 188, 56);
		add(bt_xoaNhanVien);
		
		JButton btnLuu = new JButton("LƯU");
		btnLuu.addActionListener(action);
		btnLuu.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLuu.setBounds(732, 334, 107, 30);
		add(btnLuu);
	}	
	
	public void reset() {
		tf_maNhanVien.setText("");
		tf_tenNhanVien.setText("");
		tf_ngaySinh.setText("");
		tf_cccd.setText("");
		tf_sdt.setText("");
		tf_luong.setText("");
		cb_gioiTinh.setSelectedIndex(0);
		cb_chucVu.setSelectedIndex(0);
		
		tf_maNhanVien.setEditable(false);
		tf_tenNhanVien.setEditable(false);
		tf_ngaySinh.setEditable(false);
		tf_cccd.setEditable(false);
		tf_sdt.setEditable(false);
		tf_luong.setEditable(false);
		cb_gioiTinh.setEnabled(false);
		cb_chucVu.setEnabled(false);
	}
	
	public void unreset() {		
//		tf_maNhanVien.setEditable(true);
		tf_tenNhanVien.setEditable(true);
		tf_ngaySinh.setEditable(true);
		tf_cccd.setEditable(true);
		tf_sdt.setEditable(true);
		tf_luong.setEditable(true);
		cb_gioiTinh.setEnabled(true);
		cb_chucVu.setEnabled(true);
	}
}
