package com.example.spa.controller;

import com.example.spa.model.PersonResponse;
import com.example.spa.model.EsbRow;
import com.example.spa.service.ExternalApiClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;
import java.util.Map;

@Controller
public class UiController {
	private final ExternalApiClient api;

	public UiController(ExternalApiClient api) {
		this.api = api;
	}

	@GetMapping("/")
	public String home() {
		return "single";
	}

	// AJAX proxy endpoints (POST idnOrPcn) to match your contract
	@PostMapping("/api/person")
	@ResponseBody
	public Mono<PersonResponse> person(@RequestBody Map<String, String> body) {
//		String id = body.getOrDefault("idnOrPcn", "");
//		return api.fetchPerson(id);
		return api.fetchPerson(body.get("idnOrPcn"));
	}

	@PostMapping("/api/esb")
	@ResponseBody
	public Flux<EsbRow> esb(@RequestBody Map<String, String> body) {
		String id = body.getOrDefault("idnOrPcn", "");
		return api.fetchEsb(id);
	}
}
