package com.kbo.domain;

import jakarta.persistence.*;
@Entity
@Table(name = "player_statistics")
public class PlayerStatistic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long statsId;

    @ManyToOne
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;

    @Column
    private Integer matchesPlayed;

    @Column
    private Integer hits; // 안타 수

    @Column
    private Integer homeRuns; // 홈런 수 

    @Column
    private Integer RBIs; // 타점 수

    @Column
    private Integer stolenBases; // 도루 수

    @Column(precision = 3)
    private Float battingAverage; // 타율
}

