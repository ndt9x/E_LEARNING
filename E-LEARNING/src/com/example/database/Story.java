package com.example.database;

public class Story {
	private int id;
	private String  ten, noidung;
	public Story(int id, String ten, String noidung) {
		super();
		this.id = id;
		this.ten = ten;
		this.noidung = noidung;
	}
	public Story(String ten, String noidung) {
		super();
		this.ten = ten;
		this.noidung = noidung;
	}
	public Story() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

	
}

