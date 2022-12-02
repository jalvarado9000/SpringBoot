package com.ltp.videogamerecords.entity;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;


@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Entity

@Table(name = "video_game", uniqueConstraints = {
    @UniqueConstraint(columnNames = {
        "console_id", "review_id" })
})
public class VideoGame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @NonNull
    @Column(name = "gane_name", nullable = false)
    private String gameName;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "console_id", referencedColumnName = "id")
    private Console console;

    @ManyToOne(optional = false)
    @JoinColumn(name = "review_id", referencedColumnName = "id")
    private Review review;

    
}