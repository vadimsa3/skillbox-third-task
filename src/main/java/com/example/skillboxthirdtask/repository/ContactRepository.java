package com.example.skillboxthirdtask.repository;

import com.example.skillboxthirdtask.model.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactRepository {

    List<Contact> findAll();

    Optional<Contact> findById(Long id);

    Contact save(Contact task);

    Contact update(Contact task);

    void deleteById(Long id);

//    void batchInsert(List<Task> tasks);
}
