package com.example.pureintegrationapi.controller;

import com.example.pureintegrationapi.domain.Breed;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/breeds")
public class BreedsController {
    private ObjectMapper objectMapper;
    @Autowired
    public BreedsController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }


    @GetMapping("/list/all")
    public ResponseEntity<Breed> getList() throws IOException {

        return new ResponseEntity<>((objectMapper.readValue(new File("apidata.json"), Breed.class)),HttpStatus.OK);

       // return new ResponseEntity<Object>(entities, HttpStatus.OK);
    }

}
