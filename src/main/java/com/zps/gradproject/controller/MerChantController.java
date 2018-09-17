package com.zps.gradproject.controller;

import com.zps.gradproject.pojo.Commes;
import com.zps.gradproject.pojo.Merchant;
import com.zps.gradproject.service.MerChantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zps
 * @date 2018/8/31 16:40
 **/
@RestController
public class MerChantController {

    @Autowired
    private MerChantService merChantService;

    @RequestMapping("/updateMerChant")
    public Commes<Merchant> update(@RequestBody Merchant merchant){
            return merChantService.update(merchant);
    }
}
