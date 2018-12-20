package com.minshang.erp.common.result;

import lombok.Data;

/**
 * @ClassName R
 * @Description 统一的接口返回格式类
 * @Author 后羿i
 * @Date 2018/12/20
 * @Version 1.0
 **/
@Data
public class R {
    //状态
    private Boolean status = true;
    //响应码
    private int code = 200;
    //消息
    private String message;
    //返回的数据
    private Object data;
    public static R ok(Object data) {
        return new R(data);
    }
    public R(Object data) {
        super();
        this.data = data;
    }
    public R() {
        super();
    }
}