package com.ls.lib_sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDate;

@TableName("book")
@Data
public class Book {
    @TableId(type = IdType.AUTO)
    private long id;
    private String title;
    private String author;
    private String publisher;
    private LocalDate publishdate;
    private String isbn;
    private Long count;
    private String description;
    private String category;
    private String cover;
}
