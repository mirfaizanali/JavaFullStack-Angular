package com.faizan.contactBook.contactbook_backend.repo;

import com.faizan.contactBook.contactbook_backend.entity.Contact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepo extends JpaRepository<Contact,Integer> {


}
