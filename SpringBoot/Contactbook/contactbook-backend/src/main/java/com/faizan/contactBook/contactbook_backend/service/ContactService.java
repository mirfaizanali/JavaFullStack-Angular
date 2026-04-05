package com.faizan.contactBook.contactbook_backend.service;

import com.faizan.contactBook.contactbook_backend.entity.Contact;
import com.faizan.contactBook.contactbook_backend.repo.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    private ContactRepo contactRepo;


    public List<Contact> getAllContacts() {
        return contactRepo.findAll();
    }

    public Optional<Contact> getContactById(int id){
        return  contactRepo.findById(id);
    }

    //Post
    public void saveContact(Contact contact){
        contactRepo.save(contact);
    }


}
