package org.example.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created with IntelliJ IDEA.
 * Date: 2016/8/13
 * Time: 15:38
 *
 * @author: Zero
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorMessage {
    private Integer code;
    private String errmsg;
    private Object data;

    public ErrorMessage(Integer code, String errmsg) {
        this.code = code;
        this.errmsg = errmsg;
    }

    public ErrorMessage(Integer code, String errmsg, Object data) {
        this.code = code;
        this.errmsg = errmsg;
        this.data = data;
    }

    public static ErrorMessage ok() {
        return new ErrorMessage(0, "OK", null);
    }

    public static ErrorMessage ok(Object data) {
        return new ErrorMessage(0, "OK", data);
    }

    public Integer getCode() {
        return code;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public Object getData() {
        return data;
    }

}
