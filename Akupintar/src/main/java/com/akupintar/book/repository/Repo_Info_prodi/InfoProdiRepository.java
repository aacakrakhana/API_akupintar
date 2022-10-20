package com.akupintar.book.repository.Repo_Info_prodi;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.akupintar.book.entity.Info_prodi.InfoProdi;

@Repository
public interface InfoProdiRepository extends CrudRepository<InfoProdi, Long>{
    
}
