package data;

import java.sql.Connection;
import data.link;
public class check {
	public static void main(String[] args) {
		Connection con = link.getConnection();
		
		if(con != null) {
			System.out.println("Kết nối thành công!");
		} else {
			System.out.println("Kết nối thất bại!");
		}
	}
}
