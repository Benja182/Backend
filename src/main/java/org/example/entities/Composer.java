package org.example.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "composers")
public class Composer {
    @Id
    @Column(name = "composer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int composerId;
    private String name;

    @OneToOne
    @JoinColumn(name = "", referencedColumnName = "")
    private Track track;

    public Composer(int composerId, String name) {
        this.composerId = composerId;
        this.name = name;
    }

    public int getComposerId() {
        return composerId;
    }

    public void setComposerId(int composerId) {
        this.composerId = composerId;
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
        Composer composer = (Composer) o;
        return composerId == composer.composerId && Objects.equals(name, composer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(composerId, name);
    }

    @Override
    public String toString() {
        return "Composer{" +
                "composerId=" + composerId +
                ", name='" + name + '\'' +
                '}';
    }

}
