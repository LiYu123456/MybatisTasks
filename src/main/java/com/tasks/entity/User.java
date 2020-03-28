package com.tasks.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;//用户姓名
    private Date birth;//用户出生日期
    private Integer age;//用户年龄
    private Boolean onWork;//是否在职


}
