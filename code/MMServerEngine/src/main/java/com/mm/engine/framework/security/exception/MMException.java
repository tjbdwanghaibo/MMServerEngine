package com.mm.engine.framework.security.exception;

/**
 * Created by a on 2016/8/24.
 */
public class MMException extends RuntimeException {
    private static final long serialVersionUID = 5908169566019016047L;
    private int errCode = -10001;// 异常代号
    private String errMsg = null;
    public MMException(){
        super();
    }
    public MMException(String msg) {
        super(msg);
        this.errMsg = msg;
    }

    public MMException(Throwable cause) {
        super(null, cause);
    }

    public MMException(int errCode, String msg) {
        super(msg);
        this.errCode = errCode;
        this.errMsg = msg;
    }

    public MMException(int errCode, Throwable cause) {
        super(null, cause);
        this.errCode = errCode;
    }

    public void setMessage(String message){
        this.errMsg = message;
    }
    public int getErrCode() {
        return errCode;
    }

    public String getMessage(){
        String tmp = this.errMsg;
        if (tmp==null && this.getCause()!=null){
            tmp = this.getCause().getMessage();
        }
        return tmp;
    }
}
