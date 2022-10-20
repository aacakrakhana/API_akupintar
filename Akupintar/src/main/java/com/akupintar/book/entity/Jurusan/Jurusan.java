package com.akupintar.book.entity.Jurusan;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.akupintar.book.entity.Info_prodi.InfoProdi;
import com.akupintar.book.entity.Kampus.Getter;
import com.akupintar.book.entity.Kampus.Kampus;

@Entity
@Getter
@Table(name = "Jurusan")
public class Jurusan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Fakultas", columnDefinition = "varchar(30)", nullable = false)
    public String fakultas;

    @Column(name = "Prodi", columnDefinition = "varchar(50)", nullable = false)
    public String prodi;

    @OneToMany(mappedBy = "jurusan", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<InfoProdi> infoprodi;
    


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "kampus_id", nullable = false)
    private Kampus kampus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }


}
