package com.example.bookclubdemo.repository;

import com.example.bookclubdemo.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubRepository extends JpaRepository<Club, Long>
{

}
