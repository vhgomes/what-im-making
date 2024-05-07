package vhgomes.com.whatimmaking.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vhgomes.com.whatimmaking.client.GithubClient;
import vhgomes.com.whatimmaking.dtos.RepositoriesResponse;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class GithubController {

    private GithubClient githubClient;

    public GithubController(GithubClient githubClient) {
        this.githubClient = githubClient;
    }

    @GetMapping("/repositories")
    public ResponseEntity<List<RepositoriesResponse>> getRepos(@RequestHeader("token") String token) {
        var repos = githubClient.listRepos("Bearer " + token, null);
        return ResponseEntity.ok(repos);
    }

}
