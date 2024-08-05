package com.kh.chap02_objectArray.model.vo;

public class Phone {
	
	// �ʵ��
	// �̸�(name), �ø���(series),�귣���(brand), ����(price)
	private String name;
	private String series;
	private String brand;
	private int price;
	
	
	// �����ں�
	// �⺻, ��� �Ű�����
	public Phone() {}
	public  Phone(String name,
			String series,
			String brand,
			int price) {
		this.name = name;
		this.series = series;
		this.brand = brand;
		this.price = price;
		
	}
	
	//setter getter, information
	public void setName(String name) {
		this.name = name;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public void setBrand(String brand) {
		this.brand= brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public String getSeries() {
		return series;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	
	public String information() {
		return name+" , "+series+" , "+brand+" , "+price;
	}
	
	
}
