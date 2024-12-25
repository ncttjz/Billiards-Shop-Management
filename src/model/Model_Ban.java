package model;

import java.util.Date;

public class Model_Ban {
	private int maBan;
	private String tenKhach;
	private Date batDau;
	private Date ketThuc;
	public Model_Ban(int maBan, String tenKhach, Date batDau, Date ketThuc, String luaChon) {
		super();
		this.maBan = maBan;
		this.tenKhach = tenKhach;
		this.batDau = batDau;
		this.ketThuc = ketThuc;
	}

	public int getMaBan() {
		return maBan;
	}
	public void setMaBan(int maBan) {
		this.maBan = maBan;
	}
	public String getTenKhach() {
		return tenKhach;
	}
	public void setTenKhach(String tenKhach) {
		this.tenKhach = tenKhach;
	}
	public Date getBatDau() {
		return batDau;
	}
	public void setBatDau(Date batDau) {
		this.batDau = batDau;
	}
	public Date getKetThuc() {
		return ketThuc;
	}
	public void setKetThuc(Date ketThuc) {
		this.ketThuc = ketThuc;
	}
	
	

}
