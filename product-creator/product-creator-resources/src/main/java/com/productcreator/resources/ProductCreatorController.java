package com.productcreator.resources;


import com.productcreator.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/productCreator")
public class ProductCreatorController
{

    @Autowired
    private MainService mainService;

    public ProductCreatorController(MainService mainService) {
        this.mainService = mainService;
    }


    @GetMapping("/GetProductName")
    public String getProductName()
    {
        return  mainService.getPublicName();
    }
}
