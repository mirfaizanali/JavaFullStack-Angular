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
    public Contact addContact(@RequestBody Contact contact){
        return contactService.addContact(contact);
    }

    @PutMapping("/{id}")
    public Contact updateContact(@PathVariable int id,@RequestBody Contact contact){
        return contactService.updateContact(contact);
    }

    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable int id){
         contactService.deleteContact(id);
    }
}
