package com.ls.lib_sys.entity.VO;

import lombok.Data;

import java.io.Serializable;

///折线图
@Data
public class DataStatAdminBookEchartsVO implements Serializable {
    private Long BorrowBookCount;
    private Object BorrowBookDate;
}
