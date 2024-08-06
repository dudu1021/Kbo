package com.kbo.controller;

import com.kbo.domain.News;
import com.kbo.service.NewsCrawlerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class NewsController {

    private final NewsCrawlerService newscrawlerService;

    public NewsController(NewsCrawlerService newscrawlerService) {
        this.newscrawlerService = newscrawlerService;
    }

    @GetMapping("/news")
    public List<News> getNews() throws IOException {
        return newscrawlerService.fetchNews();
    }
}
