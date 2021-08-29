package com.cameraservice.camera.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cameraservice.camera.entity.Camera;
import com.cameraservice.camera.services.CameraService;

@RestController
public class MyController {

	@Autowired
	private CameraService cameraService;
	
	@GetMapping("/")
	public String index() {
		return "Hello world.";
	}
	
	@GetMapping("/camera")
	public List<Camera> cameraList() {
		return this.cameraService.getCameras();
	}
	
	@GetMapping("/camera/{cameraId}")
	public Camera getCourse(@PathVariable String cameraId) {
		return this.cameraService.getCamera(Long.parseLong(cameraId));
	}
	
	@PostMapping("/camera")
	public List<Camera> addCourse(@RequestBody Camera camera) {
		return this.cameraService.addCamera(camera);
		
	}
}
