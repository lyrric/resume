package com.web.freemarker.demo.util;

/**
 * json结果工具.
 */
public class JsonResultUtil {

    public static JsonResult ok() {
        return new JsonResult(true);
    }

    public static JsonResult ok(Object data) {
        return new JsonResult(true,  data);
    }


    public static JsonResult error(String message) {
        return new JsonResult(message);
    }


}
