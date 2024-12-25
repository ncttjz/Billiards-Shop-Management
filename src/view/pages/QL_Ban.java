package view.pages;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.QLBanController;
import model.Model_Ban;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Action;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class QL_Ban extends JPanel{
	
	public Model_Ban model;
	public JTextField tf_tenKhach;
	public JTextField tf_batDau;
	public JTextField tf_ketThuc;
	public JTable table;
	public JComboBox cb_Ban;
	public QL_Ban() {
		setBackground(new Color(255, 255, 255));
		setSize(1050, 660);
		setLayout(null);
		
		Action action = new QLBanController(this);
		
		JLabel lblMaBan = new JLabel("Mã Bàn");
		lblMaBan.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaBan.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMaBan.setBounds(543, 112, 118, 38);
		add(lblMaBan);
		
		cb_Ban = new JComboBox();
		cb_Ban.setFont(new Font("Tahoma", Font.BOLD, 18));
		cb_Ban.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04"}));
		cb_Ban.setBounds(673, 116, 186, 38);
		add(cb_Ban);
		
		JLabel lblTnKhch = new JLabel("Tên Khách");
		lblTnKhch.setHorizontalAlignment(SwingConstants.CENTER);
		lblTnKhch.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTnKhch.setBounds(543, 176, 118, 38);
		add(lblTnKhch);
		
		tf_tenKhach = new JTextField();
		tf_tenKhach.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf_tenKhach.setBounds(673, 173, 186, 38);
		add(tf_tenKhach);
		tf_tenKhach.setColumns(10);
		
		JLabel lblBatDau = new JLabel("Bắt Đầu");
		lblBatDau.setHorizontalAlignment(SwingConstants.CENTER);
		lblBatDau.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBatDau.setBounds(543, 225, 118, 38);
		add(lblBatDau);
		
		JLabel lblKetThuc = new JLabel("Kết Thúc");
		lblKetThuc.setHorizontalAlignment(SwingConstants.CENTER);
		lblKetThuc.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblKetThuc.setBounds(543, 274, 118, 38);
		add(lblKetThuc);
		
		tf_batDau = new JTextField();
		tf_batDau.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf_batDau.setColumns(10);
		tf_batDau.setBounds(673, 222, 186, 38);
		add(tf_batDau);
		
		tf_ketThuc = new JTextField();
		tf_ketThuc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf_ketThuc.setColumns(10);
		tf_ketThuc.setBounds(673, 278, 186, 38);
		add(tf_ketThuc);
		
		JLabel bt_ban01 = new JLabel("New label");
		bt_ban01.setBackground(new Color(75, 0, 130));
		bt_ban01.setIcon(new ImageIcon(QL_Ban.class.getResource("/images/bàn bia.png")));
		bt_ban01.setBounds(0, 11, 248, 143);
		bt_ban01.setOpaque(true);
		add(bt_ban01);
		
		JLabel lbl_ban01 = new JLabel("BÀN 01");
		lbl_ban01.setForeground(new Color(255, 0, 0));
		lbl_ban01.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_ban01.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_ban01.setBounds(82, 155, 107, 45);
		add(lbl_ban01);
		
		JLabel bt_ban01_1 = new JLabel("New label");
		bt_ban01_1.setOpaque(true);
		bt_ban01_1.setIcon(new ImageIcon(QL_Ban.class.getResource("/images/bàn bia.png")));
		bt_ban01_1.setBackground(new Color(75, 0, 130));
		bt_ban01_1.setBounds(284, 11, 248, 143);
		add(bt_ban01_1);
		
		JLabel bt_ban01_2 = new JLabel("New label");
		bt_ban01_2.setOpaque(true);
		bt_ban01_2.setIcon(new ImageIcon(QL_Ban.class.getResource("/images/bàn bia.png")));
		bt_ban01_2.setBackground(new Color(75, 0, 130));
		bt_ban01_2.setBounds(0, 211, 248, 143);
		add(bt_ban01_2);
		
		JLabel bt_ban01_3 = new JLabel("New label");
		bt_ban01_3.setOpaque(true);
		bt_ban01_3.setIcon(new ImageIcon(QL_Ban.class.getResource("/images/bàn bia.png")));
		bt_ban01_3.setBackground(new Color(75, 0, 130));
		bt_ban01_3.setBounds(284, 211, 248, 143);
		add(bt_ban01_3);
		
		JLabel lbl_ban01_1 = new JLabel("BÀN 02");
		lbl_ban01_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_ban01_1.setForeground(Color.RED);
		lbl_ban01_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_ban01_1.setBounds(360, 155, 107, 45);
		add(lbl_ban01_1);
		
		JLabel lbl_ban01_2 = new JLabel("BÀN 03");
		lbl_ban01_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_ban01_2.setForeground(Color.RED);
		lbl_ban01_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_ban01_2.setBounds(82, 367, 107, 45);
		add(lbl_ban01_2);
		
		JLabel lbl_ban01_3 = new JLabel("BÀN 04");
		lbl_ban01_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_ban01_3.setForeground(Color.RED);
		lbl_ban01_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_ban01_3.setBounds(360, 365, 107, 45);
		add(lbl_ban01_3);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 17));
		table.setModel(new DefaultTableModel(
			new Object[][] {},
			new String[] {
				"M\u00E3 B\u00E0n", "T\u00EAn Kh\u00E1ch", "B\u1EAFt \u0110\u1EA7u", "K\u1EBFt Th\u00FAc"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(56, 419, 941, 241);
		add(scrollPane);
		
		JButton btnthem = new JButton("THÊM");
		btnthem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnthem.setBounds(892, 112, 118, 50);
		add(btnthem);
		
		JButton btnsua = new JButton("SỬA");
		btnsua.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnsua.setBounds(892, 170, 118, 50);
		add(btnsua);
		
		JButton btnxoa = new JButton("XOÁ");
		btnxoa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnxoa.setBounds(892, 225, 118, 50);
		add(btnxoa);
		
		JButton btnluu = new JButton("LƯU");
		btnluu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnluu.setBounds(892, 286, 118, 50);
		add(btnluu);
		
		this.setVisible(true);
	}
	public void xoaForm() {
		tf_tenKhach.setText("");
		tf_batDau.setText("");
		tf_ketThuc.setText("");
		cb_Ban.setSelectedIndex(0);
		
	}
}
