package com.akupintar.book.entity.Info_prodi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.akupintar.book.entity.Jurusan.Jurusan;
import com.akupintar.book.entity.Kampus.Getter;

@Entity
@Getter
@Table(name = "Info_prodi")
public class InfoProdi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated
    @Column(name = "Akreditas", length = 3, nullable = false)
    private AkretidasProdi akreditasprodi;

    @Column(name = "Penfataran", columnDefinition = "varchar(50)")
    private String pendaftaran;

    @Column(name = "ketatan", columnDefinition = "varchar(50)")
    private String ketatan;

    @Column(name = "kuota", columnDefinition = "varchar(8)")
    private String kuota;

    @Column(name = "info", columnDefinition = "varchar(1000)")
    private String info;

    @Column(name = "info_prospek", columnDefinition = "varchar(1000)")
    private String infoprospek;

    @Column(name = "uang_Kuliah", columnDefinition = "varchar(15)")
    private String ukt;

    @Column(name= "Dana_pendidikan", columnDefinition = "varchar(20)")
    private String dana;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "jurusan_id", nullable = false)
    private Jurusan jurusan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AkretidasProdi getAkreditasprodi() {
        return akreditasprodi;
    }

    public void setAkreditasprodi(AkretidasProdi akreditasprodi) {
        this.akreditasprodi = akreditasprodi;
    }

    public String getPendaftaran() {
        return pendaftaran;
    }

    public void setPendaftaran(String pendaftaran) {
        this.pendaftaran = pendaftaran;
    }

    public String getKetatan() {
        return ketatan;
    }

    public void setKetatan(String ketatan) {
        this.ketatan = ketatan;
    }

    public String getKuota() {
        return kuota;
    }

    public void setKuota(String kuota) {
        this.kuota = kuota;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfoprospek() {
        return infoprospek;
    }

    public void setInfoprospek(String infoprospek) {
        this.infoprospek = infoprospek;
    }

    public String getUkt() {
        return ukt;
    }

    public void setUkt(String ukt) {
        this.ukt = ukt;
    }

    public String getDana() {
        return dana;
    }

    public void setDana(String dana) {
        this.dana = dana;
    }
}


enum AkretidasProdi{
    A,B,C
}