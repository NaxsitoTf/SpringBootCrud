package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Model.Person
;
public interface Repository extends JpaRepository<Person,Long> {
    
}
