package project_Non_Use_Database.service;

import project_Non_Use_Database.entities.Employee;
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
