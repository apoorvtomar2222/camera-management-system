package com.cameraservice.camera.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cameraservice.camera.entity.Camera;

@Service
public class CameraServiceImpl implements CameraService{

	List<Camera> list;
	
	public CameraServiceImpl () {
		list = new ArrayList<>();
		list.add(new Camera(1, "Front Desk Camera", "CP Plus"));
		list.add(new Camera(2, "Back Desk Camera","Hikvision"));
	}

	@Override
	public List<Camera> getCameras() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Camera getCamera(long cameraId) {
		
		// TODO Auto-generated method stub
		Camera c = new Camera(1,"No Camera Exist","NA");
		
		for(Camera camera : list) {
			System.out.println(camera.getId());
			if(camera.getId() == cameraId) {
				c = camera;
				break;
			}
		}
		return c;
	}
	
	
	@Override
	public List<Camera> addCamera(Camera camera) {
		// TODO Auto-generated method stub
		
		this.list.add(camera);
		return this.list;
	}
	
}
