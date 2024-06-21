package com.bookstore.jpa.repositories;

import com.bookstore.jpa.models.PublisherModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;
import java.util.concurrent.Flow;

public interface PublisherRepository extends JpaRepository<PublisherModel, UUID> {
}
