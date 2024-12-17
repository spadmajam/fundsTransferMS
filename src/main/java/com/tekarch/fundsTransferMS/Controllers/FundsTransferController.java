package com.tekarch.fundsTransferMS.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FundsTransferController {

    @GetMapping("/transfer")
    public String postTransfer()
    {
        return "This is a fund transfer microservice";
    }
}
