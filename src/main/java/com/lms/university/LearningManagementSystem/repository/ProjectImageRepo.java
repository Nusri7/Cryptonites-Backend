package com.lms.university.LearningManagementSystem.repository;

import com.lms.university.LearningManagementSystem.entity.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface ProjectImageRepo extends JpaRepository<ProductImage, Long> {
    Optional<ProductImage> findByName(String fileName);
}
