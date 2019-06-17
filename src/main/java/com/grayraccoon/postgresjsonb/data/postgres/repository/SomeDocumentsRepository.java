package com.grayraccoon.postgresjsonb.data.postgres.repository;

import com.grayraccoon.postgresjsonb.data.postgres.domain.SomeDocuments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SomeDocumentsRepository extends JpaRepository<SomeDocuments, UUID> {
}
