package com.ls.lib_sys.entity.VO;

import java.io.Serializable;

public class BorrowBookVO implements Serializable {
    private Long id;
    private Long userId;
    private String returnDate;
    private String borrowDate;
    private String title;
    private String author;
    private String category;
    private String cover;
    private Long count;
    private String isReturn;
}
