package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.Company;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dict")
public class TokenDictController {

   /* @PostMapping(value = "/create")
    public boolean create(Company company) {
        return mapper.addCompany(company) > 0;
    }*/
}
