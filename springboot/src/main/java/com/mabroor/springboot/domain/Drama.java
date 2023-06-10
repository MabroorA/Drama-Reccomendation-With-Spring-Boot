package com.mabroor.springboot.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;
@Entity
public class Drama {
    @Id
    private Integer id;
    private String Name;
    private String Description;
    private String Network;
    private String Director;
    private String Status;
    private Integer Release;
    private String genres;
    @OneToMany
    private List<Actor> actors;


    public Drama(Integer id, String name, String description, String network, String director, String status, Integer release, String genres, List<Actor> actors) {
        this.id = id;
        Name = name;
        Description = description;
        Network = network;
        Director = director;
        Status = status;
        Release = release;
        this.genres = genres;
        this.actors = actors;
    }

    public Drama() {}

    // Getter and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getNetwork() {
        return Network;
    }

    public void setNetwork(String network) {
        Network = network;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Integer getRelease() {
        return Release;
    }

    public void setRelease(Integer release) {
        Release = release;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "kdrama{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                ", Network='" + Network + '\'' +
                ", Director='" + Director + '\'' +
                ", Status='" + Status + '\'' +
                ", Release=" + Release +
                ", genres='" + genres + '\'' +
                ", actors=" + actors +
                '}';
    }
}
