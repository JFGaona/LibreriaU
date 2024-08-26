package com.libreria.repository;

import com.libreria.model.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Integer> {
}
