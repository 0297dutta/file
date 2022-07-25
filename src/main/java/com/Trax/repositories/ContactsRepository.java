package com.Trax.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Trax.entity.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, Long> {

}
