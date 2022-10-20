package com.akupintar.book.controller.Controller_Berita;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akupintar.book.entity.Berita.Berita;
import com.akupintar.book.service.Service_Berita.BeritaService;




@RestController
public class BeritaController {
    @Autowired
    BeritaService beritaService;

    //save
    @PostMapping("/berita")
    public Berita saveBerita(
        @Validated @RequestBody Berita berita
    )
    {
        return beritaService.saveBerita(berita);
    }


    //read
    @GetMapping("/berita")
    public List<Berita> fetchBerita()
    {
        return beritaService.fetchBeritaList();
    }


    //update
    @PutMapping("/berita{id}")
    public Berita updBerita(
        @RequestBody Berita berita,
        @PathVariable ("id") Long id
    )
    {
        return beritaService.updateBerita(berita, id);
    }

    //delete
    @DeleteMapping("/berita{id}")
    public String deleteBerita(
        @PathVariable ("id")
        Long id
    )
    {
        beritaService.deleteBerita(id);
        return "Delete success";
    }
}
