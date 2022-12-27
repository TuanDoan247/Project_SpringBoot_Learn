package com.example.First.Project.service;

import com.example.First.Project.entities.Employee;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface APIService {

    @RequestMapping(
            value = "/delete/{empid}",
            method = RequestMethod.DELETE,
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    @ResponseBody
    public String deleteEmp(@PathVariable("empid") int empid);

    /*
     * Function add employee
     * Note: @RequestBody convert json -> object
     */
    @RequestMapping(
            value = "/update",
            method = RequestMethod.PUT,
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    @ResponseBody
    public String updateEmp(@RequestBody Employee empEdit);

    /*
     * Function add employee
     * Note: @RequestBody convert json -> object
     */
    @RequestMapping(
            value = "/add",
            method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    @ResponseBody
    public String addEmp(@RequestBody Employee empNew);

    // Function view detail employee
    @RequestMapping(
            value = "/viewdetail/{empId}",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    @ResponseBody
    public Employee viewEmp(@PathVariable("empId") int empId);


    // Function view all employee
    @RequestMapping(
            value = "/viewall",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    @ResponseBody
    public List<Employee> viewAllEmp();
}
