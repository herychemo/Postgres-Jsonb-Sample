package com.grayraccoon.postgresjsonb.services;

import com.grayraccoon.postgresjsonb.data.postgres.domain.SomeDocuments;

import java.util.List;

public interface SomeDocumentService {

    List<SomeDocuments> findAll();

}
