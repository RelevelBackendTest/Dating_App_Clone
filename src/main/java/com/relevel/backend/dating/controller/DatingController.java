package com.relevel.backend.dating.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatingController {

	@GetMapping("/ping")
	public String ping() {
		return "Ping is Successful";
	}
}

