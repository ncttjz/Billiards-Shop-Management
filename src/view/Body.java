package view;

import javax.swing.JPanel;

import view.pages.QL_Ban;
import view.pages.QL_DoanhThu;
import view.pages.QL_NhanVien;
import view.pages.QL_Thong_ke;
import view.pages.QL_ThucDon;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;

public class Body extends JPanel{
	private CardLayout cardLayout;
	private QL_Ban ban;
	private QL_ThucDon thucdon;
	private QL_NhanVien nhanvien;
	private QL_DoanhThu doanhthu;
	private QL_Thong_ke thongke;
	
	 public Body() {
	 	setBackground(new Color(0, 0, 0));
		 setSize(1050, 660);
		 cardLayout = new CardLayout(0, 0);
		 setLayout(cardLayout);
		 
			ban = new QL_Ban();
			add(ban, "ban");	
			
			thucdon = new QL_ThucDon();
			add(thucdon, "thucdon");
			
			nhanvien = new QL_NhanVien();
			add(nhanvien, "nhanvien");
			
			doanhthu = new QL_DoanhThu();
			add(doanhthu, "doanhthu");
			
			thongke = new QL_Thong_ke();
			add(thongke, "thongke");	
			
		}

		public CardLayout getCardLayout() {
			return cardLayout;
		}

		public QL_DoanhThu getDoanhthu() {
			return doanhthu;
		}

		public QL_Ban getKhosach() {
			return ban;
		}

		public QL_ThucDon getKhachhang() {
			return thucdon;
		}

		public QL_NhanVien getNhanvien() {
			return nhanvien;
		}


		public QL_Thong_ke getThongke() {
			return thongke;
		}
		
	 

}
