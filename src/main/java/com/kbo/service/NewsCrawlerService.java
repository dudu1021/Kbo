package com.kbo.service;

import com.kbo.domain.News;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class NewsCrawlerService {

    public List<News> fetchNews() throws IOException {
        List<News> newsList = new ArrayList<>();
        String url = "https://sports.news.naver.com/kbaseball/index";

        Document doc = Jsoup.connect(url).get();
        Elements newsItems = doc.select("ol.news_list > li");

        for (Element item : newsItems) {
            int number = Integer.parseInt(item.select("span.number").text());
            String title = item.select("a.link_news_end").text();
            String link = item.select("a.link_news_end").attr("href");

            News news = new News();
            news.setNumber(number);
            news.setTitle(title);
            news.setLink(link);

            newsList.add(news);
        }

        return newsList;
    }
}

