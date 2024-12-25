package model;

import java.util.Date;
import java.util.Objects;

public class Model_NhanVien {
	private int maNhanVien;
	private String ten;
	private String cccd;
	private String gioiTinh;
	private Date ngaySinh;
	private String sdt;
	private String chucVu;
	private int luong;
	
	public Model_NhanVien(int maNhanVien, String ten, String cccd, String gioiTinh, Date ngaySinh, String sdt,
			String chucVu, int luong) {
		this.maNhanVien = maNhanVien;
		this.ten = ten;
		this.cccd = cccd;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.sdt = sdt;
		this.chucVu = chucVu;
		this.luong = luong;
		
	}
	
	
	public int getMaNhanVien() {
		return maNhanVien;
	}


	public void setMaNhanVien(int maNhanVien) {
		this.maNhanVien = maNhanVien;
	}


	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
	}


	public String getCccd() {
		return cccd;
	}


	public void setCccd(String cccd) {
		this.cccd = cccd;
	}


	public String getGioiTinh() {
		return gioiTinh;
	}


	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}


	public Date getNgaySinh() {
		return ngaySinh;
	}


	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}


	public String getSdt() {
		return sdt;
	}


	public void setSdt(String sdt) {
		this.sdt = sdt;
	}


	public String getChucVu() {
		return chucVu;
	}


	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}


	public int getLuong() {
		return luong;
	}


	public void setLuong(int luong) {
		this.luong = luong;
	}


	@Override
	public String toString() {
		return "Model_NhanVien [maNhanVien=" + maNhanVien + ", ten=" + ten + ", cccd=" + cccd + ", gioiTinh=" + gioiTinh
				+ ", ngaySinh=" + ngaySinh + ", sdt=" + sdt + ", chucVu=" + chucVu + ", luong=" + luong + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cccd, chucVu, gioiTinh, luong, maNhanVien, ngaySinh, sdt, ten);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Model_NhanVien other = (Model_NhanVien) obj;
		return Objects.equals(cccd, other.cccd) && Objects.equals(chucVu, other.chucVu)
				&& Objects.equals(gioiTinh, other.gioiTinh) && luong == other.luong && maNhanVien == other.maNhanVien
				&& Objects.equals(ngaySinh, other.ngaySinh) && Objects.equals(sdt, other.sdt)
				&& Objects.equals(ten, other.ten);
	}
	
	

}
