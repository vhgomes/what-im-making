package vhgomes.com.whatimmaking.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public record RepositoriesResponse(String id,
                                   @JsonProperty("html_url") String htmlUrl,
                                   @JsonProperty("private") boolean isPrivate,
                                   @JsonProperty("full_name") String fullName,
                                   String description

) {
}
