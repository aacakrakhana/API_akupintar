package com.akupintar.book.service.Service_Berita;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akupintar.book.entity.Berita.Berita;
import com.akupintar.book.repository.Repo_Berita.BeritaRepository;

@Service
public class BeritaService {
    @Autowired
    BeritaRepository beritaRepository;


    //save
    public Berita saveBerita(Berita berita){
        return beritaRepository.save(berita);
    }

    //read
    public List<Berita> fetchBeritaList(){
        return (List<Berita>) beritaRepository.findAll();
    }

    //update
    public Berita updateBerita(Berita berita, Long id){
        Berita beritaData = beritaRepository.findById(id).get();

        if (Objects.nonNull(berita.getTitle())&& !"".equalsIgnoreCase(berita.getTitle())){
            beritaData.setTitle(berita.getTitle());
        }
        if (Objects.nonNull(berita.getDesc())&& !"".equalsIgnoreCase(berita.getDesc())){
            beritaData.setDesc(berita.getDesc());
        }
        return beritaRepository.save(beritaData);  
    }


    //dekete
    public void deleteBerita(long id){
        beritaRepository.deleteById(id);
    }
}
