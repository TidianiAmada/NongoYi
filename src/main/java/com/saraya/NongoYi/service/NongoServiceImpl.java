package com.saraya.NongoYi.service;

import com.saraya.NongoYi.dao.NongoRepo;
import com.saraya.NongoYi.entity.NongoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;

@Service
@Transactional
public class NongoServiceImpl implements NongoService{
    @Autowired
    NongoRepo nongoRepo;
    @Override
    public List<NongoEntity> getNongos() {

        return nongoRepo.findAll();
    }

    @Override
    public void insertNongo(NongoEntity nongo) {
        nongoRepo.save(nongo);
    }

    @Override
    public void updateNongo(String prenomNom, String adress, Long phoneNumber) {
        NongoEntity nongo = nongoRepo.findByPrenomNom(prenomNom);
        nongo.setAdress(adress);
        nongo.setPhoneNumber(phoneNumber);
    }

    @Override
    public void deleteNongo(String prenomNom) {

    }
}
