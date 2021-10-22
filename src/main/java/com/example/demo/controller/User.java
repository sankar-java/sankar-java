package com.example.demo.controller;


class User{
	
	private String name;
	private int g;
	
	private static int number;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public long getMun() {
		return mun;
	}

	public void setMun(long mun) {
		this.mun = mun;
	}

	private long mun;
	
	
	public void add() {
		try {
			number=4/0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
