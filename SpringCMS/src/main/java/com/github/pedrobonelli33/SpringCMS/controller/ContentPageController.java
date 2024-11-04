package com.github.pedrobonelli33.SpringCMS.controller;

import com.github.pedrobonelli33.SpringCMS.model.ContentPage;
import com.github.pedrobonelli33.SpringCMS.service.ContentPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contentPage")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ContentPageController {

    @Autowired
    private ContentPageService service;

    @PostMapping
    public ResponseEntity<ContentPage> createPage(@RequestBody ContentPage page){
        return ResponseEntity.ok(service.create(page));
    }

}
