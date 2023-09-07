package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Date 2023/9/7 16:40
 * @Author XiaoHu
 * @Description
 **/
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String password;
}
