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
@Table(name = "console")
public class Console {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @NonNull
    @Column(name = "console_name", nullable = false)
    private String consoleName;
    @NonNull
    @Column(name = "console_manufacturer", nullable = false)
    private String consoleManufacturer;

    @JsonIgnore
    @OneToMany(mappedBy = "console", cascade = CascadeType.ALL)
    private List<VideoGame> videoGames;
    
    
}
