package com.cameraservice.camera.services;

import java.util.List;

import com.cameraservice.camera.entity.Camera;

public interface CameraService {
	
	public List<Camera> getCameras();
	
	public Camera getCamera(long cameraId);
	
	public List<Camera> addCamera(Camera camera);

}
