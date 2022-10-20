package com.akupintar.book.controller.Controller_Pendaftaran;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akupintar.book.entity.Pendaftaran.Pendaftaran;
import com.akupintar.book.service.Service_Pendaftara.PendaftaranService;

@RestController
public class PendaftaranController {
    
    @Autowired
    PendaftaranService pendaftaranService;


    //save
    @PostMapping("/pendaftaran")
    public Pendaftaran saveDaftar(
        @Validated @RequestBody Pendaftaran pendaftaran
    )
    {
        return pendaftaranService.saveDaftar(pendaftaran);
    }

    //read
    @GetMapping("/pendaftaran")
    public List<Pendaftaran> fetchDaftar()
    {
        return pendaftaranService.fetchDaftar();
    }


    //update
    @GetMapping("/pendaftaran{id}")
    public Pendaftaran updateData(
        @RequestBody Pendaftaran pendaftaran,
        @PathVariable ("id") Long id
    )
    {
        return pendaftaranService.updateDaftar(pendaftaran, id);
    }


    //delete
    public String deleteDaftar(@PathVariable("id")Long id)
    {
        pendaftaranService.deleteDaftar(id);
        return "delete success";
    }

}
