package com.kbo.dto;

import lombok.Getter;

@Getter
public class TeamDTO {
    private String rank;
    private String image;
    private String title;
    private String match;
    private String victory;
    private String defeat;
    private String draw;
    private String rate;
    private String winning;
    private String recent;

    // Constructor
    public TeamDTO(String rank, String image, String title, String match, String victory, String defeat, String draw, String rate, String winning, String recent) {
        this.rank = rank;
        this.image = image;
        this.title = title;
        this.match = match;
        this.victory = victory;
        this.defeat = defeat;
        this.draw = draw;
        this.rate = rate;
        this.winning = winning;
        this.recent = recent;
    }

}

