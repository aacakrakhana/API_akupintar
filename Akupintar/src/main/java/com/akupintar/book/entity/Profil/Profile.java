package com.akupintar.book.entity.Profil;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.akupintar.book.entity.Kampus.Getter;
import com.akupintar.book.entity.Kampus.Kampus;

@Entity
@Getter
@Table(name = "Profil")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "informasi", columnDefinition ="Varchar(2000)")
    public String info;

    @Column(name = "Prestasi", columnDefinition = "varchar(1500)")
    public String prestasi;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "kampus_id", nullable = false)
    private Kampus kampus;


    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPrestasi() {
        return prestasi;
    }

    public void setPrestasi(String prestasi) {
        this.prestasi = prestasi;
    }

    public Kampus getKampus() {
        return kampus;
    }

    public void setKampus(Kampus kampus) {
        this.kampus = kampus;
    }
}
