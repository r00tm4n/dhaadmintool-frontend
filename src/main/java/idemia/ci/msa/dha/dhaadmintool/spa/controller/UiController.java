package idemia.ci.msa.dha.dhaadmintool.spa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import idemia.ci.msa.dha.dhaadmintool.spa.model.EsbRow;
import idemia.ci.msa.dha.dhaadmintool.spa.model.PersonArchiveResponse;
import idemia.ci.msa.dha.dhaadmintool.spa.model.PersonResponse;
import idemia.ci.msa.dha.dhaadmintool.spa.service.ExternalApiClient;
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

	@PostMapping("/api/person")
	@ResponseBody
	public Mono<PersonResponse> person(@RequestBody Map<String, String> body) {
		return api.fetchPerson(body.get("idnOrPcn"));
	}

	@PostMapping("/api/personarchive")
	@ResponseBody
	public Flux<PersonArchiveResponse> personArchive(@RequestBody Map<String, String> body) {
		return api.fetchPersonArchive(body.get("idnOrPcn"));
	}

	
	@PostMapping("/api/esb")
	@ResponseBody
	public Flux<EsbRow> esb(@RequestBody Map<String, String> body) {
		String id = body.getOrDefault("idnOrPcn", "");
		return api.fetchEsb(id);
	}
}
