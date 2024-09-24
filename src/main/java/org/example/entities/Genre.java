package org.example.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "genres")
public class Genre {
    @Id
    @Column(name = "genre_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int genreId;
    private String  name;

    @OneToOne
    @JoinColumn(name = "", referencedColumnName = "")
    private Track track;



    public Genre(int genreId, String name) {
        this.genreId = genreId;
        this.name = name;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Genre{" +
                "genreId=" + genreId +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genre genre = (Genre) o;
        return genreId == genre.genreId && Objects.equals(name, genre.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genreId, name);
    }

}
