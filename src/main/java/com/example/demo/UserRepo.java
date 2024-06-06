package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

interface UserRepo extends JpaRepository<User,Integer> {

}