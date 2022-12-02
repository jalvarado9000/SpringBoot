package com.ltp.videogamerecords.entity;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;


@Setter
@NoArgsConstructor
@Getter
@Entity
@Table(name = "console")
public class Console {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "idOfConsole")
    private Long c_id;

    @NonNull
    @Column(name = "console_name")
    private String consoleName;
    @NonNull
    @Column(name = "console_manufacturer")
    private String consoleManufacturer;

    @JsonIgnore
    @OneToMany(mappedBy = "console", cascade = CascadeType.ALL)
    private List<VideoGame> videoGames;


    
    public Console(String consoleName){

        this.consoleName = consoleName.toUpperCase();
        

        switch (consoleName.toUpperCase()) {
            case "PS5": setConsoleManufacturer("SONY");
                    setC_id((long) 1);
                break;
            case "PS4": setConsoleManufacturer("SONY");
                    setC_id((long) 1);
                break;
            case "PS3": setConsoleManufacturer("SONY");
                    setC_id((long) 1);
                break;
            case "PS2": setConsoleManufacturer("SONY");
                    setC_id((long) 1);
                break;
            case "PS1": setConsoleManufacturer("SONY");
                    setC_id((long) 1);
                break;
            case "PSP": setConsoleManufacturer("SONY");
                    setC_id((long) 1);
                break;
            case "WII-U": setConsoleManufacturer("NINTENDO");
                    setC_id((long) 2);
            case "3DS": setConsoleManufacturer("NINTENDO");
                    setC_id((long) 2);
            case "GAMEBOY-SP": setConsoleManufacturer("NINTENDO");
                    setC_id((long) 2);
            case "GAMEBOY-COLOR": setConsoleManufacturer("NINTENDO");
                    setC_id((long) 2);
                break;
            case "XBOX-SERIES-S": setConsoleManufacturer("MICROSOFT");
                    setC_id((long) 3);
                break;
            default:
                setConsoleManufacturer("NO-NAME");
                break;
        }
        

        

    }
    
}
