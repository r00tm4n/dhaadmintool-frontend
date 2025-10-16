package idemia.ci.msa.dha.dhaadmintool.spa.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import idemia.ci.msa.dha.dhaadmintool.spa.model.EsbRow;
import idemia.ci.msa.dha.dhaadmintool.spa.model.PersonArchiveResponse;
import idemia.ci.msa.dha.dhaadmintool.spa.model.PersonResponse;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@Service
public class ExternalApiClient {

    private final WebClient client;
    private final String personUrl;
    private final String personArchiveUrl;
    private final String esbUrl;

    public ExternalApiClient(
            @Value("${apis.personUrl}") String personUrl,
            @Value("${apis.personArchiveUrl}") String personArchiveUrl,
            @Value("${apis.esbUrl}") String esbUrl) {
		this.client = WebClient.builder()
				.codecs(configurer -> configurer.defaultCodecs().maxInMemorySize(50 * 1024 * 1024)).build();
        this.personUrl = personUrl;
        this.personArchiveUrl = personArchiveUrl;
        this.esbUrl = esbUrl;
    }

    public Mono<PersonResponse> fetchPerson(String idn) {
        return client.post()
                .uri(personUrl)
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .body(BodyInserters.fromFormData("idnOrPcn", idn))
                .retrieve()
                .bodyToFlux(PersonResponse.class)
                .next(); // take the first element of the array
    }
    
    public Flux<PersonArchiveResponse> fetchPersonArchive(String idn) {
        return client.post()
                .uri(personArchiveUrl)
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .body(BodyInserters.fromFormData("idnOrPcn", idn))
                .retrieve()
                .bodyToFlux(PersonArchiveResponse.class);
    }


    public Flux<EsbRow> fetchEsb(String idn) {
        return client.post()
                .uri(esbUrl)
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .body(BodyInserters.fromFormData("idnOrPcn", idn))
                .retrieve()
                .bodyToFlux(EsbRow.class);
    }
}
