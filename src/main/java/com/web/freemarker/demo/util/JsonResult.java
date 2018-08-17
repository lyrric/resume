package com.web.freemarker.demo.util;

import lombok.Data;

/**
 * 统一返回结果.
 */
@Data
public class JsonResult {

    /** 是否成功. */
    private boolean success;

    private String errMsg;

    private Object data;
    public JsonResult() {
    }
    public JsonResult(boolean success) {
        this.success = success;
    }

    public JsonResult(String data) {
        this.success = false;
        this.data = data;
    }
    public JsonResult(boolean success,  Object data) {
        this.success = success;
        this.data = data;
    }
}
