package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.contactModel;

@Service
public class service {
    public List<contactModel> addContact() {
        List<contactModel> List =new ArrayList<>();
        List.add(new contactModel(1,"Juan","3012345678"));
        List.add(new contactModel(2,"Maria","3047654321"));
        List.add(new contactModel(3,"Pedro","3101234567"));
        List.add(new contactModel(4,"Ana","3159876543"));
        List.add(new contactModel(5,"Luis","3216549870"));
        List.add(new contactModel(6,"Sofia","3219876543"));
        List.add(new contactModel(7,"Carlos","3147258369"));
        List.add(new contactModel(8,"Laura","3043852741"));
        List.add(new contactModel(9,"Diego","3158369147"));
        List.add(new contactModel(10,"Marta","3109147258"));
        List.add(new contactModel(11,"Jorge","3014185296"));
        List.add(new contactModel(12,"Camila","3152963741"));
        return List;

    }
}
