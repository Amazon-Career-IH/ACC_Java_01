package com.ironhack.week9.controller;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.ironhack.week9.enums.*;
import com.ironhack.week9.models.*;
import com.ironhack.week9.repositories.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.http.*;
import org.springframework.test.context.*;
import org.springframework.test.web.servlet.*;
import org.springframework.test.web.servlet.result.*;
import org.springframework.test.web.servlet.setup.*;
import org.springframework.web.context.*;

import java.math.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ActiveProfiles("test")
public class ProductControllerTest {

    /*
    - Falsa llamada a la api
    - Ver su resultado
     */

    //Nos da la instancia de la aplicación
    @Autowired
    private WebApplicationContext webApplicationContext;

    //Nos permite falsear llamadas
    private MockMvc mockMvc;

    @Autowired
    ProductRepository productRepository;


    // Nos permite convertir objetos a JSON
    private final ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        Product product1 = new Product("Coca Cola", new BigDecimal("2.20"), Category.COMMERCIAL_NEW, Department.HOMEGOODS);
        Product product2 = new Product("Nintendo Switch", new BigDecimal("399"), Category.COMMERCIAL_NEW, Department.ELECTRONICS);
        productRepository.saveAll(List.of(product1, product2));
    }

    @AfterEach
    public void tearDown() {
        productRepository.deleteAll();
    }

    @Test
    void shouldStoreNewProduct_WhenPostMethodIsCalled() throws Exception {

        Product product3 = new Product("Ordenador portátil", new BigDecimal("999"), Category.COMMERCIAL_NEW, Department.ELECTRONICS);
        String body = objectMapper.writeValueAsString(product3);
        MvcResult result = mockMvc.perform(post("/añadir-producto")
                        .content(body)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated()).andReturn();

        assertTrue(result.getResponse().getContentAsString().contains("Ordenador"));
        assertEquals(3, productRepository.findAll().size());

    }

    @Test
    void shouldReturnAllProducts_WhenMethodGetIsCalled() throws Exception {
        MvcResult result = mockMvc.perform(get("/mostrar-productos"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .contentType(MediaType.APPLICATION_JSON)).andReturn();
        assertTrue(result.getResponse().getContentAsString().contains("Coca Cola"));
        assertTrue(result.getResponse().getContentAsString().contains("Nintendo Switch"));

    }

}
