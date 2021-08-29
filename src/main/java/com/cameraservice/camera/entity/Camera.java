package com.cameraservice.camera.entity;

public class Camera {
	private long id;
	private String name;
	private String manufacterer;
	
	
	
	public Camera(long id, String name, String manufacterer) {
		super();
		this.id = id;
		this.name = name;
		this.manufacterer = manufacterer;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacterer() {
		return manufacterer;
	}
	public void setManufacterer(String manufacterer) {
		this.manufacterer = manufacterer;
	}
	
}
