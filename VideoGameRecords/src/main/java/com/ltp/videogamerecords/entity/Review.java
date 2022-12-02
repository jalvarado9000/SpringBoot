package com.ltp.videogamerecords.entity;
import java.util.List;
import java.util.Optional;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ltp.videogamerecords.repository.ReviewRepository;

import lombok.*;


@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Entity
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
   

    @NonNull
    @Column(name = "is_played", nullable = false)
    private boolean isPlayed;
    @NonNull
    @Column(name = "is_enjoyed", nullable = false)
    private boolean isEnjoyed;
    @NonNull
    @Column(name = "score", nullable = false)
    private double score;

    @JsonIgnore
    @OneToMany(mappedBy = "review", cascade = CascadeType.ALL)
    private List<VideoGame> videoGames;
    
    


    
}
