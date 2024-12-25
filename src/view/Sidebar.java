package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

import view.pages.QL_Ban;
import view.pages.QL_NhanVien;

import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sidebar extends JPanel{

	public Sidebar() {
		setBackground(new Color(74, 170, 239));
		setSize(220, 680);
		setLayout(null);
		
		JLabel lb_QL_Ban = new JLabel("QUẢN LÝ BÀN");
		lb_QL_Ban.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_QL_Ban.setBackground(new Color(34,  133, 205));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_QL_Ban.setBackground(new Color(173, 216, 230));
			}
		});
		lb_QL_Ban.setForeground(new Color(255, 255, 255));
		lb_QL_Ban.setHorizontalAlignment(SwingConstants.CENTER);
		lb_QL_Ban.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_QL_Ban.setBackground(new Color(173, 216, 230));
		lb_QL_Ban.setOpaque(true);
		lb_QL_Ban.setBounds(0, 216, 220, 53);
		add(lb_QL_Ban);
		
		JLabel lb_QL_ThucDon = new JLabel("QUẢN LÝ THỰC ĐƠN");
		lb_QL_ThucDon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_QL_ThucDon.setBackground(new Color(34,  133, 205));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_QL_ThucDon.setBackground(new Color(173, 216, 230));
			}
		});
		lb_QL_ThucDon.setOpaque(true);
		lb_QL_ThucDon.setHorizontalAlignment(SwingConstants.CENTER);
		lb_QL_ThucDon.setForeground(Color.WHITE);
		lb_QL_ThucDon.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_QL_ThucDon.setBackground(new Color(173, 216, 230));
		lb_QL_ThucDon.setBounds(0, 280, 220, 53);
		add(lb_QL_ThucDon);
		
		JLabel lb_QL_NhanVien = new JLabel("QUẢN LÝ NHÂN VIÊN");
		lb_QL_NhanVien.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_QL_NhanVien.setBackground(new Color(34,  133, 205));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_QL_NhanVien.setBackground(new Color(173, 216, 230));
			}
		});
		lb_QL_NhanVien.setOpaque(true);
		lb_QL_NhanVien.setHorizontalAlignment(SwingConstants.CENTER);
		lb_QL_NhanVien.setForeground(Color.WHITE);
		lb_QL_NhanVien.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_QL_NhanVien.setBackground(new Color(173, 216, 230));
		lb_QL_NhanVien.setBounds(0, 344, 220, 53);
		add(lb_QL_NhanVien);
		
		JLabel lb_QL_DoanhThu = new JLabel("DOANH THU");
		lb_QL_DoanhThu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_QL_DoanhThu.setBackground(new Color(34,  133, 205));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_QL_DoanhThu.setBackground(new Color(173, 216, 230));
			}
		});
		lb_QL_DoanhThu.setOpaque(true);
		lb_QL_DoanhThu.setHorizontalAlignment(SwingConstants.CENTER);
		lb_QL_DoanhThu.setForeground(Color.WHITE);
		lb_QL_DoanhThu.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_QL_DoanhThu.setBackground(new Color(173, 216, 230));
		lb_QL_DoanhThu.setBounds(0, 408, 220, 53);
		add(lb_QL_DoanhThu);
		
		JLabel lb_QL_ThongKe = new JLabel("THỐNG KÊ");
		lb_QL_ThongKe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_QL_ThongKe.setBackground(new Color(34,  133, 205));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_QL_ThongKe.setBackground(new Color(173, 216, 230));
			}
		});
		lb_QL_ThongKe.setOpaque(true);
		lb_QL_ThongKe.setHorizontalAlignment(SwingConstants.CENTER);
		lb_QL_ThongKe.setForeground(Color.WHITE);
		lb_QL_ThongKe.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_QL_ThongKe.setBackground(new Color(173, 216, 230));
		lb_QL_ThongKe.setBounds(0, 472, 220, 53);
		add(lb_QL_ThongKe);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Sidebar.class.getResource("/images/billardBONG.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(0, 0, 220, 156);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BILLIARD");
		lblNewLabel_1.setForeground(new Color(139, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(0, 167, 220, 29);
		add(lblNewLabel_1);
	}

	protected void reset() {
		// TODO Auto-generated method stub
		
	}
}
