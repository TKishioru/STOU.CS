package com.stou.project.project;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message,Integer>{

    List<Message> findByMessageContainingIgnoreCase(String keywords);
    
}
