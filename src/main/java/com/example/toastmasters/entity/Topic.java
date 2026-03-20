
package com.example.toastmasters.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "topics", indexes = {
        @Index(name = "idx_title", columnList = "title"),
        @Index(name = "idx_category", columnList = "category")
})
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String title;

    @Column(length = 2000)
    private String description;

    @Column(length = 100)
    private String category;

    @Builder.Default
    private boolean active = true;
}
