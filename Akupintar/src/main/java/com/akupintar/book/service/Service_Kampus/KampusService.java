package com.akupintar.book.service.Service_Kampus;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akupintar.book.entity.Kampus.Kampus;
import com.akupintar.book.repository.Repo_kampus.KampusRepository;



@Service
public class KampusService {
    @Autowired
     KampusRepository kampusRepository;


    //save
    public Kampus saveKampus(Kampus kampus){
        return kampusRepository.save(kampus);
    } 

    //read
    public List<Kampus> fetchKampusList(){
        return (List<Kampus>) kampusRepository.findAll();
    }


    //update
    public Kampus updateKampus(Kampus kampus, Long id){
        Kampus kampusData = kampusRepository.findById(id).get();
        
        if (Objects.nonNull(kampus.getName()) && !"".equalsIgnoreCase(kampus.getName())) {
            kampusData.setName(kampus.getName());
        }
        if (Objects.nonNull(kampus.getTelepon()) && !"".equalsIgnoreCase(kampus.getTelepon())) {
            kampusData.setTelepon(kampus.getTelepon());
        }
        if (Objects.nonNull(kampus.getFax()) && !"".equalsIgnoreCase(kampus.getFax())) {
            kampusData.setFax(kampus.getFax());
        }
        if (Objects.nonNull(kampus.getAlamat()) && !"".equalsIgnoreCase(kampus.getAlamat())) {
            kampusData.setAlamat(kampus.getAlamat());
        }
        return kampusRepository.save(kampusData);
    }

    //delete
    //@Override
    public void deleteKampus(Long id){
        kampusRepository.deleteById(id);
    }

}
