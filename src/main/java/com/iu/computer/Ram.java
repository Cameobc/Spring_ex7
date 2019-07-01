package com.iu.computer;


public class Ram {

	private int size;
	private String company;
	
	public void initRam() {
		System.out.println("객체가 생성될 때 한 번 실행");
	}
	
	public void destroyRam() {
		System.out.println("객체가 소멸될 때 한 번 실행");
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
}
