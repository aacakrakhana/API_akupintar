package com.akupintar.book.service.Service_Profil;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akupintar.book.entity.Profil.Profile;
import com.akupintar.book.repository.Repo_Profil.ProfilRepository;

@Service
public class ProfilService {
    @Autowired
    ProfilRepository profilRepository;

    //save
    public Profile saveProfile(Profile profile){
        return profilRepository.save(profile);
    } 

    //read
    public List<Profile> fetchProfileList(){
        return (List<Profile>) profilRepository.findAll();
    }


    //update
    public Profile updateProfile(Profile profile, Long id){
        Profile profileData = profilRepository.findById(id).get();
        
        if (Objects.nonNull(profile.getInfo()) && !"".equalsIgnoreCase(profile.getInfo())) {
            profileData.setInfo(profile.getInfo());
        }
        if (Objects.nonNull(profile.getPrestasi()) && !"".equalsIgnoreCase(profile.getPrestasi())) {
            profileData.setPrestasi(profile.getPrestasi());
        }
        
        return profilRepository.save(profileData);
    }

    //delete
    //@Override
    public void deleteProfile(Long id){
        profilRepository.deleteById(id);
    }

}
