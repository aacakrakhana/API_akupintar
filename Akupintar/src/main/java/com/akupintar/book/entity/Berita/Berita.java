package com.akupintar.book.entity.Berita;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.akupintar.book.entity.Kampus.Getter;
import com.akupintar.book.entity.Kampus.Kampus;

@Entity
@Getter
@Table(name = "Berita")
public class Berita {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title", columnDefinition = "varchar(50)",nullable = false)
    private String title;

    @Column(name = "foto", columnDefinition = "varchar(64)",nullable = true)
    private String foto;

    @DateTimeFormat(pattern = "dd-mm-yyyy")
    @Column(name = "tanggal")
    private Date tanggal;
    
    @Column(name = "Deskripsi", columnDefinition = "varchar(250)")
    private String desc;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "kampus_id", nullable = false)
    private Kampus kampus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
