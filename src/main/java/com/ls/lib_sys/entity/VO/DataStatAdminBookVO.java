package com.ls.lib_sys.entity.VO;

import lombok.Data;

import java.io.Serializable;
///统计
@Data
public class DataStatAdminBookVO implements Serializable {
    private Long bookCount;
    private Long borrowBookCount;
    private Long notReturnBookCount;
}
