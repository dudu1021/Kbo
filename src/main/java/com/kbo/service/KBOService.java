package com.kbo.service;

import com.kbo.domain.TeamRecord;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class KBOService {

    public List<TeamRecord> getKBORecords() {
        List<TeamRecord> records = new ArrayList<>();

        try {
            String url = "https://sports.news.naver.com/kbaseball/record/index.nhn?category=kbo";

            Document doc = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36")
                    .get();

            Elements baseballTeams = doc.select("#regularTeamRecordList_table > tr");

            for (Element baseballTeam : baseballTeams) {
                String rank = baseballTeam.select("th").text();
                String teamName = baseballTeam.select("span").text();
                String winRate = baseballTeam.select("td:nth-child(7) > strong").text();

                if (!teamName.isEmpty()) {
                    TeamRecord record = new TeamRecord(rank, teamName, winRate);
                    records.add(record);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return records;
    }
}