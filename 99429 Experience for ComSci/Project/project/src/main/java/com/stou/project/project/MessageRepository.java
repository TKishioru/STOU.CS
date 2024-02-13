package com.stou.project.project;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message,Integer>{

    List<Message> findByMessageContainingIgnoreCase(String keywords);
    List<Message> findByTopicContainingIgnoreCase(String keywords);
    //List<Message> findByTopicOrMessageContainingIgnoreCase(String keywords);
    
    //@Query("SELECT u FROM ProjectDB u WHERE u.topic = :keywords or u.message = :keywords")
    // Message findAllByTopicORMessage(
    // @Param("topic") String topic, 
    // @Param("message") String message);

}
