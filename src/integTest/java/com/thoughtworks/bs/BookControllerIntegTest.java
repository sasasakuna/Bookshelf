package com.thoughtworks.bs;


import com.thoughtworks.bs.web.BookShelfController;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class BookControllerIntegTest {

    private MockMvc mockMvc;

    @InjectMocks
    BookShelfController bookShelfController;

    @Before
    public void setup(){

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");

        MockitoAnnotations.initMocks(this);
        this.mockMvc = standaloneSetup(bookShelfController)
                .setViewResolvers(viewResolver)
                .build();


    }



}
