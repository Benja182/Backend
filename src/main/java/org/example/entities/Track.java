package org.example.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tracks")
public class Track {


    @Id
    @Column(name = "track_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int trackId;

    private String name;
    private int miliseconds;

    @OneToMany(mappedBy = "artist_id")
    private Artist artist;

    @OneToOne
    @JoinColumn(name = "", referencedColumnName = "")
    private Composer compser;

    @OneToOne
    @JoinColumn(name = "", referencedColumnName = "")
    private Genre genre;

    @OneToOne
    @JoinColumn(name = "", referencedColumnName = "")
    private MediaType mediaType;


    @ManyToOne
    @JoinColumn(name = "", referencedColumnName = "")
    private Album album;





    public Track(int trackId, String name, int miliseconds) {
        this.trackId = trackId;
        this.name = name;
        this.miliseconds = miliseconds;
    }


    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMiliseconds() {
        return miliseconds;
    }

    public void setMiliseconds(int miliseconds) {
        this.miliseconds = miliseconds;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return trackId == track.trackId && miliseconds == track.miliseconds && Objects.equals(name, track.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackId, name, miliseconds);
    }


    @Override
    public String toString() {
        return "Track{" +
                "trackId=" + trackId +
                ", name='" + name + '\'' +
                ", miliseconds=" + miliseconds +
                '}';
    }

}
