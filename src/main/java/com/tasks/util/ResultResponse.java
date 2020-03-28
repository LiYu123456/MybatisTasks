package com.tasks.util;

import lombok.Data;

@Data
public class ResultResponse {
    private String statusCode;
    private String statusDesc;
    private Object data;
}
