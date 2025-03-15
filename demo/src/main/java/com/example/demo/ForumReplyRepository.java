package com.example.demo;

import com.example.demo.model.ForumReply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForumReplyRepository extends JpaRepository<ForumReply, Long> {
}
