package com.github.pedrobonelli33.SpringCMS.repository;

import com.github.pedrobonelli33.SpringCMS.model.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, Long> {
}
