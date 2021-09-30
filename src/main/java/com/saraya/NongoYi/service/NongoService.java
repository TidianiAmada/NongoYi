package com.saraya.NongoYi.service;

import com.saraya.NongoYi.entity.NongoEntity;

import java.util.List;


public interface NongoService {
    public List<NongoEntity> getNongos();
    public void insertNongo(NongoEntity nongo);
    public void updateNongo(String prenomNom, String adress, Long phoneNumber);
    public void deleteNongo(String prenomNom);
}
