package com.akupintar.book.entity.Kampus;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "kampus")


public class Kampus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nama_univ", columnDefinition ="Varchar(100)")
    public String name;

    @Enumerated
    @Column(name = "Jenis", length = 10)
    private JenisKategori jenis;

    @Enumerated
    @Column(name = "Kategori", length = 15)
    private Category kategori;

    @Enumerated
    @Column(name = "Akreditas", length = 3, nullable = false)
    private Akretidasi akre;

    @Column(name = "Telepon", columnDefinition = "Varchar(20)")
    private String telepon;

    @Column(name = "Faximile", columnDefinition = "varchar(20)")
    public String fax;

    @Column(name = "Alamat", columnDefinition= "varchar(150)")
    public String alamat;



    @OneToMany(mappedBy = "kampus", fetch = FetchType.LAZY,
        cascade = CascadeType.ALL
    )

    
    
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public JenisKategori getJenis() {
        return jenis;
    }

    public Category getKategori() {
        return kategori;
    }

    public String getTelepon() {
        return telepon;
    }

    public String getFax() {
        return fax;
    }

    public String getAlamat() {
        return alamat;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJenis(JenisKategori jenis) {
        this.jenis = jenis;
    }

    public void setKategori(Category kategori) {
        this.kategori = kategori;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Object getKampusName() {
        return null;
    }

    public void setKampusName(Object kampusName) {
    }

    public enum JenisKategori{
        Negeri, Swasta, PTN_BLU, Kedinasan
    }
    public enum Category{
        PTN,PTS,PTN_BLU,PTN_BH
    }
    public enum Akretidasi{
        A,B,C
    }
}

