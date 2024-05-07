package vhgomes.com.whatimmaking.client;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.service.annotation.GetExchange;
import vhgomes.com.whatimmaking.dtos.RepositoriesResponse;

import java.util.List;

public interface GithubClient {

    @GetExchange("/user/repos")
    public List<RepositoriesResponse> listRepos(@RequestHeader("Authorization") String token,
                                                @RequestHeader(value = "X-GitHub-Api-Version", defaultValue = "2022-11-28") String apiVersion);
}
