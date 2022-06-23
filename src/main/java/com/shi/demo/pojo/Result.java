package com.shi.demo.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Result {
    public Result(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }
    public Result(Boolean flag) {
        this.flag = flag;
    }
    private Boolean flag;
    private Object data;

}
