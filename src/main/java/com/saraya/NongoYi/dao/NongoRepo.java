package com.saraya.NongoYi.dao;

import com.saraya.NongoYi.entity.NongoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;




@Repository
public interface NongoRepo extends JpaRepository<NongoEntity,String> {
//    @Query("SELECT n FROM nongo_yi n WHERE n.prenom_nom=? ")
    public NongoEntity findByPrenomNom(String prenomNom);
}
