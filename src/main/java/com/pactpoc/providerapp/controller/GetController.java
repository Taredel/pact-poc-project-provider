package com.pactpoc.providerapp.controller;

import com.pactpoc.providerapp.dto.MessageDto;
import com.pactpoc.providerapp.dto.SimpleDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GetController {

    @ResponseBody
    @RequestMapping(value = "/getSomething",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> printData(@RequestParam int inputData, @RequestHeader String authToken) {
        System.out.println("Retrieved data - " + inputData);
        System.out.println("Retrieved token - " + authToken);
        if (inputData == 0) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(new SimpleDto(inputData, new MessageDto("This is a generic message")), HttpStatus.OK);
    }

}
