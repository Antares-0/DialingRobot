package cn.lxm.dialingrobotweb.application.dto.response;


import java.io.Serial;
import java.io.Serializable;

public abstract class BaseResponse implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public static final Integer SUCCESS_CODE = 0;
    public static final String SUCCESS_MSG = "success";

    /**
     * 响应码：0=成功，非0=失败
     */
    private Integer code;

    /**
     * 响应信息
     */
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void success() {
        this.code = SUCCESS_CODE;
        this.msg = SUCCESS_MSG;
    }

    public void fail(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}