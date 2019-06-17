package com.grayraccoon.postgresjsonb.data.postgres.repository;

import com.grayraccoon.postgresjsonb.data.postgres.domain.SomeDocuments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SomeDocumentsRepository extends JpaRepository<SomeDocuments, UUID> {
}
