package com.grayraccoon.postgresjsonb.ws;

import com.grayraccoon.postgresjsonb.data.postgres.domain.SomeDocuments;
import com.grayraccoon.postgresjsonb.services.SomeDocumentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ws/sd")
public class SomeDocumentsWebService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SomeDocumentsWebService.class);

    @Autowired
    private SomeDocumentService someDocumentService;

    @GetMapping
    public List<SomeDocuments> findAll() {
        LOGGER.info("findAll()");

        List<SomeDocuments> someDocumentsList = someDocumentService.findAll();

        LOGGER.info("findAll(): {}", someDocumentsList);

        return someDocumentsList;
    }

}
