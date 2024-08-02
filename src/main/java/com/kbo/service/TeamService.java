package com.kbo.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class TeamService {
    private HashMap<Integer, String> teams; // 팀 코드와 팀 이름을 매핑하기 위한 해시맵

    public TeamService() {
        teams = new HashMap<>();
        initializeTeams();
    }

    // 예시 데이터로 팀 정보 초기화
    private void initializeTeams() {
        teams.put(1, "Lotte Giants");
        teams.put(2, "Doosan Bears");
        teams.put(3, "Samsung Lions");
        teams.put(4, "Kiwoon Heroes");
        teams.put(5, "NC Dinos");
        teams.put(6, "KT Wiz");
        teams.put(7, "Hanwha Eagles");
        teams.put(8, "KIA Tigers");
        teams.put(9, "LG Twins");
        teams.put(10, "SSG Landers");
    }

    // 팀 코드에 따라 팀 이름을 반환하는 메서드
    public String team_name(int team_code) {
        return teams.get(team_code);
    }
}

