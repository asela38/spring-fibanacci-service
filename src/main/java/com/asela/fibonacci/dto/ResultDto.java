package com.asela.fibonacci.dto;

public class ResultDto<T> {

    private T result;

    public ResultDto(T result) {
        this.result = result;
    }

    public T getResult() {
        return result;
    }
}
