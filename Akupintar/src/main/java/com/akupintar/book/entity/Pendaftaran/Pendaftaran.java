package com.akupintar.book.entity.Pendaftaran;

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
@Table(name = "pendaftaran")
public class Pendaftaran {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @DateTimeFormat(pattern = "dd-mm-yyyy")
    @Column(name = "tanggal")
    private Date tanggal;

    @Column(name = "Jenjang", columnDefinition = "varchar(5)", nullable = false)
    private String jenjang;

    @Column(name = "Biaya_Pendaftaran", columnDefinition = "varchar(25)")
    private String biaya;

    @Column(name = "Website", columnDefinition = "varchar(50)")
    private String web;

    @Column(name = "Syarat_Pendaftaran", columnDefinition = "varchar(2000)")
    private String syarat;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "kampus_id", nullable = false)
    private Kampus kampus;

    public Long getId() {
        return id;
    } 

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getJenjang() {
        return jenjang;
    }

    public void setJenjang(String jenjang) {
        this.jenjang = jenjang;
    }

    public String getBiaya() {
        return biaya;
    }

    public void setBiaya(String biaya) {
        this.biaya = biaya;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getSyarat() {
        return syarat;
    }

    public void setSyarat(String syarat) {
        this.syarat = syarat;
    }
}
