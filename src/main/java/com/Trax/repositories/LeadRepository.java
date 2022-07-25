package com.Trax.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Trax.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
