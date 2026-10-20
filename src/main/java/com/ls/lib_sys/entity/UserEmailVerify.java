package com.ls.lib_sys.entity;

import lombok.Data;

@Data
public class UserEmailVerify {
    private String email;
    private String code;
}
