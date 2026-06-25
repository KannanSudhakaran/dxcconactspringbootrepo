package com.dxc.lab05restapi.controllers;

import com.dxc.lab05restapi.model.Contact;
import com.dxc.lab05restapi.service.IContactService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contacts")
public class ContactController {

    private  IContactService service;
    public  ContactController(IContactService service){
        this.service=service;
    }
    @GetMapping
    public ResponseEntity< List<Contact>> getAllContacts(){
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    public ResponseEntity<String> addContact(@RequestBody Contact contact){
        service.addContact(contact.getName(), contact.getPhone());
        return ResponseEntity.ok("Contact added successfully");
    }
}
