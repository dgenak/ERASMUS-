package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ForumPostRepository extends JpaRepository<ForumPost, Long> {
    List<ForumPost> findByDepartment(String department);
    List<ForumPost> findByDepartmentAndUniversity(String department, String university);
}
