package com.asela.fibonacci.service;

import com.asela.fibonacci.dto.ResultDto;
import com.asela.fibonacci.logic.FibonacciLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fibonacci")
public class FibonacciService {

    @Autowired
    FibonacciLogic logic;


    @GetMapping(value = "/{n}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResultDto<Integer> calculateFibonacci(@PathVariable Integer n) {
        return new ResultDto(logic.fibonacci(n));
    }


}
