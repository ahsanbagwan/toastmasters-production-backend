
package com.example.toastmasters.repository;

import com.example.toastmasters.entity.Topic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

public interface TopicRepository extends JpaRepository<Topic, Long> {

    @Query("SELECT t FROM Topic t WHERE " +
           "LOWER(t.title) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
           "LOWER(t.description) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    Page<Topic> search(@Param("keyword") String keyword, Pageable pageable);
}
