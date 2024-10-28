package com.github.pedrobonelli33.SpringCMS.repository;

import com.github.pedrobonelli33.SpringCMS.model.ContentPage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentPageRepository extends JpaRepository<ContentPage, Long> {
}
