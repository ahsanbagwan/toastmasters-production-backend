
package com.example.toastmasters.controller;

import com.example.toastmasters.entity.Topic;
import com.example.toastmasters.repository.TopicRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/topics")
@RequiredArgsConstructor
public class TopicController {

    private final TopicRepository repository;

    @GetMapping
    public Page<Topic> getAll(@RequestParam(defaultValue = "0") int page,
                              @RequestParam(defaultValue = "10") int size) {
        return repository.findAll(PageRequest.of(page, size));
    }

    @GetMapping("/search")
    public Page<Topic> search(@RequestParam String keyword,
                              @RequestParam(defaultValue = "0") int page,
                              @RequestParam(defaultValue = "10") int size) {
        return repository.search(keyword, PageRequest.of(page, size));
    }

    @PostMapping
    public Topic create(@RequestBody Topic topic) {
        return repository.save(topic);
    }
}
