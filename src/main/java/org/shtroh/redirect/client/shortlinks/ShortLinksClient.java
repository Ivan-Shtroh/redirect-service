package org.shtroh.redirect.client.shortlinks;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "shotrlinks-client", url = "${clients.shortlinks.url}")
public interface ShortLinksClient {

    @GetMapping("/getOriginal")
    String get(@RequestParam("request") String request);
}
