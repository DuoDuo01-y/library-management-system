package com.ls.lib_sys.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;

@TableName("borrobook")
@Data
public class BorrowBook {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long bookid;
    private Long userid;
    private LocalDate borrowdate;
    private LocalDate returndate;
    private Long count;
    private String isreturn;
}
