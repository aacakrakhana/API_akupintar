package com.akupintar.book.repository.Repo_kampus;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.akupintar.book.entity.Kampus.Kampus;


@Repository
public interface KampusRepository extends CrudRepository<Kampus, Long> {
    
   
}
