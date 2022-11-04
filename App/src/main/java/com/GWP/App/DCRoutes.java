package com.GWP.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DCRoutes {

    @GetMapping("")
    public String index (){return "This is the Index Page";};
}
