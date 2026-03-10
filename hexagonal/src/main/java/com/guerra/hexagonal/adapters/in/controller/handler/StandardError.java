package com.guerra.hexagonal.adapters.in.controller.handler;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StandardError {

    private long timestamp;
    private Integer status;
    private String message;
    private String path;

}
