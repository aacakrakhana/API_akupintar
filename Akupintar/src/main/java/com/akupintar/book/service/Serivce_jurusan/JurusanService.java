package com.akupintar.book.service.Serivce_jurusan;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akupintar.book.entity.Jurusan.Jurusan;
import com.akupintar.book.repository.Repo_Jurusan.JurusanRepository;



@Service
public class JurusanService {
    @Autowired
    JurusanRepository jurusanRepository;

    //save
    public Jurusan saveJurusan(Jurusan jurusan){
        return jurusanRepository.save(jurusan);
    }

    //read
    public List<Jurusan> fetchJurusanList(){
        return(List<Jurusan>) jurusanRepository.findAll();
    }

    //update
    public Jurusan updateJurusan(Jurusan jurusan, Long id){
        Jurusan jurusanData = jurusanRepository.findById(id).get();

        if(Objects.nonNull(jurusan.getFakultas()) && !"".equalsIgnoreCase(jurusan.getFakultas())){
            jurusanData.setFakultas(jurusan.getFakultas());
        }
        if(Objects.nonNull(jurusan.getProdi()) && !"".equalsIgnoreCase(jurusan.getProdi())){
            jurusanData.setProdi(jurusan.getProdi());
        }
        return jurusanRepository.save(jurusanData);
    }

    //delete
    public void deleteJurusan(Long id){
        jurusanRepository.deleteById(id);
    }
}
