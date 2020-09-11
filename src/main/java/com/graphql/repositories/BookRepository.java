package com.graphql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphql.models.Book;

public interface BookRepository extends JpaRepository<Book, String> {

}
