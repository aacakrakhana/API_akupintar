package com.akupintar.book.controller.Controller_Profil;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akupintar.book.entity.Profil.Profile;
import com.akupintar.book.service.Service_Profil.ProfilService;

@RestController
public class ProfilController {
    @Autowired
    ProfilService profilService;


    //save
    @PostMapping("/profil")
    public Profile saveProfile(
        @Validated 
        @RequestBody
        Profile profile
    )
    {
        return profilService.saveProfile(profile);
    }

    //read
    @GetMapping("/profil")
    public List<Profile> fetchProfileList()
    {
        return profilService.fetchProfileList();
    }

    //update
    @PutMapping("/profil{id}")
    public Profile updateProfile(
        @RequestBody Profile profile,
        @PathVariable ("id") Long id
    )
    {
        return profilService.updateProfile(profile, id);
    }

    //delete
    public String deleteProfil(
        @PathVariable ("id")
        Long id
    )
    {
        profilService.deleteProfile(id);
        return "Delete Sueccess";
    }
}
