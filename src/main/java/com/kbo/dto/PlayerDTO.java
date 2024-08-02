package com.kbo.dto;

import lombok.Getter;

@Getter
public class PlayerDTO {
    String team;
    int player_no; // 플레이어 넘버
    String player; // 플레이어 이름
    String name; // 플레이어 영문이름
    String position; // 포지션
    String image; // 이미지 링크
    String era; // 평균자책점
    String whip; // WHIP
    String c_category; // 승리/홀드/세이브
    String c_count; // 승리/홀드/세이브 카운트
    String inning; // 이닝
    String strikeout; // 탈삼진
    String batting; // 타율
    String hit; // 안타
    String homerun; // 홈런
    String rbi; // 타점
    String steal; // 도루
    int like_cnt; // 찜 카운트 수

    // 생성자
    public PlayerDTO(String name, String position, String team) {
        this.name = name;
        this.position = position;
        this.team = team;
    }
}
