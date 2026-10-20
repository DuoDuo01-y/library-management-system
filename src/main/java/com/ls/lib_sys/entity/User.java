package com.ls.lib_sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@TableName("user")
@Data
public class User {
    @TableId(type= IdType.AUTO)
    private Long id;
    private String username;
    private String password;
    private String nickname;
    private Long age;
    private String sex;
    private String status;
    private LocalDateTime date;
    private String email;
    private String avatar;
}
