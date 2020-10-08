package com.playing.Play.Ground.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "play")
public class Play {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
