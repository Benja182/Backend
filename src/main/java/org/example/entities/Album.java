package org.example.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "albums")
public class Album {

    @Id
    @Column(name = "album_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int albumId;
    private String name;
    private int totalMiliseconds;

    @ManyToOne
    @JoinColumn(name = "", referencedColumnName = "")
    private Track track;

    public Album(int albumId, String name, int totalMiliseconds) {
        this.albumId = albumId;
        this.name = name;
        this.totalMiliseconds = totalMiliseconds;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalMiliseconds() {
        return totalMiliseconds;
    }

    public void setTotalMiliseconds(int totalMiliseconds) {
        this.totalMiliseconds = totalMiliseconds;
    }




    @Override
    public String toString() {
        return "Album{" +
                "albumId=" + albumId +
                ", name='" + name + '\'' +
                ", totalMiliseconds=" + totalMiliseconds +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return albumId == album.albumId && totalMiliseconds == album.totalMiliseconds && Objects.equals(name, album.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(albumId, name, totalMiliseconds);
    }

}
