package net.qcollins.backend;

import net.qcollins.backend.domain.GithubProject;
import net.qcollins.backend.repository.GithubProjectRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Configuration
public class Config {

    private static final Logger log = LoggerFactory.getLogger(BackendApplication.class);

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner getGithubRepositoryList(RestTemplate restTemplate,
                                                     GithubProjectRepository githubProjectRepository) {
        return args -> {
            ResponseEntity<List<GithubProject>> githubProjectResponse =
                    restTemplate.exchange("https://api.github.com/users/quinn-collins/repos", HttpMethod.GET,
                            null, new ParameterizedTypeReference<List<GithubProject>>(){});
            List<GithubProject> githubProjects = githubProjectResponse.getBody();

            for(GithubProject githubProject : githubProjects) {
                log.info(githubProject.toString());
                githubProjectRepository.save(githubProject);
            }
        };
    }
}
