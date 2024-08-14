package com.kbo.controller;

import com.kbo.domain.TeamRecord;
import com.kbo.service.KBOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KBOController {

    @Autowired
    private KBOService kboService;

    @GetMapping("/kbo-records")
    public List<TeamRecord> getKBORecords() {
        return kboService.getKBORecords();
    }
}



