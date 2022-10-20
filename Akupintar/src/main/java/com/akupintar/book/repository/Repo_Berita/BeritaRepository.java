package com.akupintar.book.repository.Repo_Berita;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.akupintar.book.entity.Berita.Berita;



@Repository
public interface BeritaRepository extends CrudRepository<Berita, Long>{
    
}
