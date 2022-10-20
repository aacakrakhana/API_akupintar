package com.akupintar.book.repository.Repo_Jurusan;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.akupintar.book.entity.Jurusan.Jurusan;


@Repository
public interface JurusanRepository extends CrudRepository<Jurusan, Long>{
    
}
