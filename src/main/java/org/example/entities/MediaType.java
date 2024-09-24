package org.example.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "medias")
public class MediaType {
    @Id
    @Column(name = "media_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mediaTypeId;
    private String name;

    @OneToOne
    @JoinColumn(name = "", referencedColumnName = "")
    private Track track;


    public MediaType(int mediaTypeId, String name) {
        this.mediaTypeId = mediaTypeId;
        this.name = name;
    }


    public int getMediaTypeId() {
        return mediaTypeId;
    }

    public void setMediaTypeId(int mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "MediaType{" +
                "mediaTypeId=" + mediaTypeId +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MediaType mediaType = (MediaType) o;
        return mediaTypeId == mediaType.mediaTypeId && Objects.equals(name, mediaType.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediaTypeId, name);
    }
}
