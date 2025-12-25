package com.estudos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
