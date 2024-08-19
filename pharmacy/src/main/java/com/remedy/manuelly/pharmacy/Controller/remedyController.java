package com.remedy.manuelly.pharmacy.Controller;

import com.remedy.manuelly.pharmacy.remedy.DataRegistrationsRemedies;
import com.remedy.manuelly.pharmacy.remedy.Remedy;
import com.remedy.manuelly.pharmacy.remedy.remedyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remedy")

public class remedyController {

    @Autowired
    private remedyRepository repository; // Injetando o repository

    @PostMapping
    public void cadastrar(@RequestBody DataRegistrationsRemedies data){
        repository.save(new Remedy(data)); // isso esté criando um cadastramento de remédio atráves do reposity
    }
}
