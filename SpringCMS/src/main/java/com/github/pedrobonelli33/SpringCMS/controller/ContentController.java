package com.github.pedrobonelli33.SpringCMS.controller;

import com.github.pedrobonelli33.SpringCMS.model.Content;
import com.github.pedrobonelli33.SpringCMS.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/content")
public class ContentController {

    @Autowired
    private ContentService service;

    @PostMapping
    public ResponseEntity<Content> createContent(@RequestBody Content content){
        return ResponseEntity.ok(service.create(content));
    }


}
