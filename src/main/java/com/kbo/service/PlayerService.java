package com.kbo.service;

import com.kbo.dto.PlayerDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class PlayerService {
    private List<PlayerDTO> players; // 플레이어 목록을 저장하는 리스트

    public PlayerService() {
        players = new ArrayList<>();
        initializePlayers();
    }

    private void initializePlayers() {
        // 초기 플레이어 데이터 추가
        players.add(new PlayerDTO("후라도", "투수", "키움 히어로즈"));
        // 다른 플레이어도 마찬가지로 초기화
    }

    // 팀과 포지션에 따라 플레이어를 찾는 메서드
    public List<PlayerDTO> find_Allplayer(HashMap<String, String> criteria) {
        List<PlayerDTO> result = new ArrayList<>();
        for (PlayerDTO player : players) {
            if (player.getTeam().equals(criteria.get("team")) && player.getPosition().equals(criteria.get("pos"))) {
                result.add(player);
            }
        }
        return result;
    }
}
