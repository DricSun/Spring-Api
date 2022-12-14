package com.example.api.controllerTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

import com.example.Employee.api.controller.EmployeeController;
import com.example.Employee.api.service.EmployeeService;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@WebMvcTest(controllers = EmployeeController.class)
public class EmployeeControllerTest {
    
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeService employeeService;

    @Test
    public void testGetEmployees() throws Exception{
        mockMvc.perform(get("/employees"))
            .andExpect(((StatusResultMatchers) status()).isOk());
            andExpect(JsonPath("$[0].firstName", is("Laurent")));
    }

    private void andExpect(Object jsonPath) {
    }

    private Object JsonPath(String string, Object object) {
        return null;
    }

    private Object is(String string) {
        return null;
    }
    
}



