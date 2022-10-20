package com.akupintar.book.repository.Repo_Profil;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.akupintar.book.entity.Profil.Profile;



@Repository
public interface ProfilRepository extends CrudRepository<Profile, Long>{
    
}
