package com.akupintar.book.service.Service_Pendaftara;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akupintar.book.entity.Pendaftaran.Pendaftaran;
import com.akupintar.book.repository.Repo_pendaftaran.PendaftaranRepository;

@Service
public class PendaftaranService {
    @Autowired
    PendaftaranRepository pendaftaranRepository;

    //save
    public Pendaftaran saveDaftar(Pendaftaran pendaftaran){
        return pendaftaranRepository.save(pendaftaran);
    }

    //read
    public List<Pendaftaran> fetchDaftar(){
        return (List<Pendaftaran>) pendaftaranRepository.findAll();
    }

    //update
    public Pendaftaran updateDaftar(Pendaftaran pendaftaran, long id){
        Pendaftaran daftarData = pendaftaranRepository.findById(id).get();

        if(Objects.nonNull(pendaftaran.getJenjang()) && !"".equalsIgnoreCase(pendaftaran.getJenjang())){
            pendaftaran.setJenjang(pendaftaran.getJenjang());
        }
        if(Objects.nonNull(pendaftaran.getBiaya()) && !"".equalsIgnoreCase(pendaftaran.getBiaya())){
            pendaftaran.setBiaya(pendaftaran.getBiaya());
        }
        if(Objects.nonNull(pendaftaran.getWeb()) && !"".equalsIgnoreCase(pendaftaran.getWeb())){
            pendaftaran.setWeb(pendaftaran.getWeb());
        }
        if(Objects.nonNull(pendaftaran.getSyarat()) && !"".equalsIgnoreCase(pendaftaran.getSyarat())){
            pendaftaran.setSyarat(pendaftaran.getSyarat());
        }
        return pendaftaranRepository.save(daftarData);
    }

    //delete
    public void deleteDaftar(Long id){
        pendaftaranRepository.deleteById(id);
    }
    }

