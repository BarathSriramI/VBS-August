package com.example.VBS.repository;

import com.example.VBS.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Personrepository extends JpaRepository<Person,Integer> {
}
