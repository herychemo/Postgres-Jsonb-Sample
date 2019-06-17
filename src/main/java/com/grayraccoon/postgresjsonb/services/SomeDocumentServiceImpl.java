package com.grayraccoon.postgresjsonb.services;

import com.grayraccoon.postgresjsonb.data.postgres.domain.SomeDocuments;
import com.grayraccoon.postgresjsonb.data.postgres.repository.SomeDocumentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SomeDocumentServiceImpl implements SomeDocumentService {

    @Autowired
    private SomeDocumentsRepository someDocumentsRepository;

    @Override
    public List<SomeDocuments> findAll() {
        return someDocumentsRepository.findAll();
    }

}
