package com.akupintar.book.controller.Controller_Jurusan;

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

import com.akupintar.book.entity.Jurusan.Jurusan;
import com.akupintar.book.service.Serivce_jurusan.JurusanService;

@RestController
public class JurusanController {

    @Autowired
    JurusanService jurusanService;


    //save
    @PostMapping("/jurusan")
    public Jurusan saveJurusan(
        @Validated @RequestBody Jurusan jurusan
    )
    {
        return jurusanService.saveJurusan(jurusan); 
    }

    //read
    
    @GetMapping("/jurusan")
    public List<Jurusan> fetchJurusanList()
    {
        return jurusanService.fetchJurusanList();
    }

    //update
    @PutMapping("/jurusan{id}")
    public Jurusan updateJurusan(
        @RequestBody Jurusan jurusan, 
        @PathVariable ("id") Long id)
        {
            return jurusanService.updateJurusan(jurusan, id);
        }

    //delete
    @DeleteMapping("/jurusan{id}")
    public String deleteJurusan(@PathVariable("id")
    Long id)
    {
        jurusanService.deleteJurusan(id);
        return "delete success";
    }
}
