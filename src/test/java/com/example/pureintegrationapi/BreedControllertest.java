package com.example.pureintegrationapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest
public class BreedControllertest {
    @Autowired
    private MockMvc mockMvc;

    @Test
   void getAllList() throws Exception{

        RequestBuilder requestBuilder= MockMvcRequestBuilders.get("/api/breeds//list/all")
                .contentType(MediaType.APPLICATION_JSON);
     mockMvc.perform(requestBuilder).andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
//asert


    }
}
