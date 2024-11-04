package com.github.pedrobonelli33.SpringCMS.service;

import com.github.pedrobonelli33.SpringCMS.model.ContentPage;
import com.github.pedrobonelli33.SpringCMS.repository.ContentPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentPageService {

    @Autowired
    private ContentPageRepository repository;

    public List<ContentPage> findAll(){
        return repository.findAll();
    }

    public ContentPage create(ContentPage page){
        return repository.save(page);
    }

    public ContentPage findById(long id){
        return repository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public ContentPage update(long id, ContentPage page){
        if(repository.existsById(id)){
            page.setId(id);
            return repository.save(page);
        }
        throw new IllegalArgumentException();
    }

    public void delete(long id){
        repository.deleteById(id);
    }

}
