package com.backend.backend.controller;

import com.backend.backend.service.IContactService;
import com.backend.backend.service.IEducationService;
import com.backend.backend.service.IPersonService;
import com.backend.backend.service.IProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    
    @Autowired
    private IPersonService persServ;
    private IEducationService eduServ;
    private IContactService contServ;
    private IProjectService proServ;
  
  
    
}
