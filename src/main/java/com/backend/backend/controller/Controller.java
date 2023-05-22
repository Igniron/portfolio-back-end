package com.backend.backend.controller;

import com.backend.backend.model.Contact;
import com.backend.backend.model.Education;
import com.backend.backend.model.Person;
import com.backend.backend.model.Project;
import com.backend.backend.model.User;
import com.backend.backend.service.IContactService;
import com.backend.backend.service.IEducationService;
import com.backend.backend.service.IPersonService;
import com.backend.backend.service.IProjectService;
import com.backend.backend.service.IUserService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", exposedHeaders = { "Authorization", "X-Custom-Header" })
public class Controller {
    
    @Autowired
    private IPersonService persServ;
    @Autowired
    private IEducationService eduServ;
    @Autowired
    private IContactService contServ;
    @Autowired
    private IProjectService proServ;
    @Autowired
    private IUserService userServ;
    
    
    
    @GetMapping("/get/person")
    @ResponseBody
    public List<Person> getPerson()
    {
       return persServ.getPerson();
    }
    
    @GetMapping("/get/education")
    @ResponseBody
    public List<Education> getEducation()
    {
        return eduServ.getEducation();
    }
    
    @GetMapping("/get/project")
    @ResponseBody
    public List<Project> getProject()
    {
       return proServ.getProject();
    }
    
    @GetMapping("/get/contact")
    @ResponseBody
    public List<Contact> getContact()
    {
        return contServ.getContact();
    }
    
    @GetMapping("/get/user")
    @ResponseBody
    public List<User> getUser()
    {
        return userServ.getUser();
    }
    
    @PostMapping("/new/project")
    public void createProject (@RequestBody Project pro)
    {
        proServ.createProject(pro);
    }
    
    @PostMapping("/new/education")
    public void createEducation(@RequestBody Education edu)
    {
        eduServ.createEducation(edu);
    }
    
    @DeleteMapping("/delete/project")
    public void deleteProject(@RequestParam Long id)
    {
        
        proServ.deleteProject(id);
    }
    
    @DeleteMapping("/delete/education")
    public void deleteEducation(@RequestParam Long id)
    {
        eduServ.deleteEducation(id);
    }
    
    @PostMapping("/update/person")
    public void updatePerson(@RequestBody Person per)
    {
         persServ.updatePerson(per);
    }
    
     @PostMapping("/update/education")
    public void updateEducation(@RequestBody Education edu)
    {
        eduServ.updateEducation(edu);
    }
    
     @PostMapping("/update/project")
    public void updateProject(@RequestBody Project pro)
    {
        proServ.updateProject(pro);
    }
    
     @PostMapping("/update/contact")
    public void updateContact(@RequestBody Contact con)
    {
        contServ.updateContact(con);
    }
  
  
    
}
