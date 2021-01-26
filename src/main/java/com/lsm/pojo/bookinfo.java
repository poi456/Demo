package com.lsm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class bookinfo{
    private Integer id;
    private String name;
    private String pwd;
}
