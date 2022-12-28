package com.example.Test.service;

import com.example.Test.entities.Employee;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface APIService {

    @RequestMapping(
            value = "/viewall",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    @ResponseBody
    public List<Employee> viewAllEmp();

}
