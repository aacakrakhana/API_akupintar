package com.akupintar.book.repository.Repo_pendaftaran;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.akupintar.book.entity.Pendaftaran.Pendaftaran;



@Repository
public interface PendaftaranRepository extends CrudRepository<Pendaftaran, Long>{
    
}
