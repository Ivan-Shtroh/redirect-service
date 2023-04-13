package org.shtroh.redirect.controller;

import lombok.RequiredArgsConstructor;
import org.shtroh.redirect.client.shortlinks.ShortLinksClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequiredArgsConstructor
public class RedirectController {
    private final ShortLinksClient shortLinksClient;

    @GetMapping("/{link}")
    public ResponseEntity<?> getUrl(@PathVariable String link) {
        String url = shortLinksClient.get(link);
        return url == null ? new ResponseEntity<>(HttpStatus.NOT_FOUND): ResponseEntity.ok(new RedirectView(url));
    }

}
