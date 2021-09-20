package com.example.pureintegrationapi.controller;

import com.fasterxml.jackson.core.type.TypeReference;
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
    @Autowired
      ObjectMapper objectMapper;

    @GetMapping("/list/all")
    public ResponseEntity<Object> getList() throws IOException {

        List<JSONObject> entities  = ((List<JSONObject>) objectMapper.readValue(new File("apidata.json"), new TypeReference<JSONObject>() {}));

        return new ResponseEntity<Object>(entities, HttpStatus.OK);
    }

}
