package com.example.sweat.repos;

import org.springframework.data.repository.CrudRepository;
import com.example.sweat.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Integer> {
    List<Message> findByTag(String tag);
}