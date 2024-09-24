package org.example.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "artists")
public class Artist {


    @Id
    @Column(name = "artist_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int artistId;
    private String name;

    @ManyToOne
    @JoinColumn(name = "", referencedColumnName = "")
    private Track track;


    public Artist(int artistId, String name) {
        this.artistId = artistId;
        this.name = name;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return artistId == artist.artistId && Objects.equals(name, artist.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artistId, name);
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistId=" + artistId +
                ", name='" + name + '\'' +
                '}';
    }


}
