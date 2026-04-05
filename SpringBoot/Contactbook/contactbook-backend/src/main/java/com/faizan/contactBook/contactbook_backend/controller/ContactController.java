package com.faizan.contactBook.contactbook_backend.controller;

import com.faizan.contactBook.contactbook_backend.entity.Contact;
import com.faizan.contactBook.contactbook_backend.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping
    public List<Contact> getAllContacts(){
        return contactService.getAllContacts();
    }

    @GetMapping("/{id}")
    public Optional<Contact> getContactById(@PathVariable int id){
        return contactService.getContactById(id);
    }

    @PostMapping
    public void addContact(@RequestBody Contact contact){
        contactService.saveContact(contact);
    }
}
