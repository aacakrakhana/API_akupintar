package com.akupintar.book.service.Service_InfoProdi;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akupintar.book.entity.Info_prodi.InfoProdi;
import com.akupintar.book.repository.Repo_Info_prodi.InfoProdiRepository;

@Service
public class InfoProdiService {
    @Autowired
    InfoProdiRepository infoprodiRepository;

    //save
    public InfoProdi saveInfo(InfoProdi infoprodi){
        return infoprodiRepository.save(infoprodi);
    }

    //read
    public List<InfoProdi> fetchInfoList(){
        return (List<InfoProdi>) infoprodiRepository.findAll();
    }

    //update
    public InfoProdi updateInfo(InfoProdi infoprodi, Long id){
        InfoProdi infoData = infoprodiRepository.findById(id).get();

        if (Objects.nonNull(infoprodi.getPendaftaran()) && !"".equalsIgnoreCase(infoprodi.getPendaftaran())){
            infoData.setPendaftaran(infoprodi.getPendaftaran());
        }
        if (Objects.nonNull(infoprodi.getKetatan()) && !"".equalsIgnoreCase(infoprodi.getKetatan())){
            infoData.setKetatan(infoprodi.getKetatan());
        }
        if (Objects.nonNull(infoprodi.getKuota()) && !"".equalsIgnoreCase(infoprodi.getKuota())){
            infoData.setKuota(infoprodi.getKuota());
        }
        if (Objects.nonNull(infoprodi.getInfo()) && !"".equalsIgnoreCase(infoprodi.getInfo())){
            infoData.setInfo(infoprodi.getInfo());
        }
        if (Objects.nonNull(infoprodi.getInfoprospek()) && !"".equalsIgnoreCase(infoprodi.getInfoprospek())){
            infoData.setInfoprospek(infoprodi.getInfoprospek());
        }
        if (Objects.nonNull(infoprodi.getUkt()) && !"".equalsIgnoreCase(infoprodi.getUkt())){
            infoData.setUkt(infoprodi.getUkt());
        }
        if (Objects.nonNull(infoprodi.getDana()) && !"".equalsIgnoreCase(infoprodi.getDana())){
            infoData.setDana(infoprodi.getDana());
        }
        
        return infoprodiRepository.save(infoData);
    }

    //delete
    public void deleteInfo(Long id){
        infoprodiRepository.deleteById(id);
    }
}
