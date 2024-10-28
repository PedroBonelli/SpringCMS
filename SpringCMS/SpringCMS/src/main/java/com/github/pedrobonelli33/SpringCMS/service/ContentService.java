package com.github.pedrobonelli33.SpringCMS.service;

import com.github.pedrobonelli33.SpringCMS.model.Content;
import com.github.pedrobonelli33.SpringCMS.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentService {

    @Autowired
    private ContentRepository repository;

    public List<Content> findAll(){
        return repository.findAll();
    }

    public Content findById(long id){
        return repository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public Content update(long id, Content newContent){
        if(repository.existsById(id)){
            newContent.setId(id);
            return repository.save(newContent);
        }
        throw new IllegalArgumentException();
    }

    

}
