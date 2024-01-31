package com.aprendendoJAVA.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoJAVA.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
