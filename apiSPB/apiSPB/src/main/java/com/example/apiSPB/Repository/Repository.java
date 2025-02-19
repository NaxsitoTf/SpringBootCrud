package com.example.apiSPB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apiSPB.Model.Person;
public interface Repository extends JpaRepository<Person,Long> {
    
}
