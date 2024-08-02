package com.kbo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "highlights")
public class Highlight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long highlightId;

    @ManyToOne
    @JoinColumn(name = "match_id", nullable = false)
    private Match match;

    @Column
    private String summary;

    @Column
    private String videoLink;
}

