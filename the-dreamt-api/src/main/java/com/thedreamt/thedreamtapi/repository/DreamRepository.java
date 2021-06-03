package com.thedreamt.thedreamtapi.repository;

import com.thedreamt.thedreamtapi.model.Dream;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DreamRepository extends JpaRepository<Dream, Long> {

    Dream findByTitle(String title);
}
