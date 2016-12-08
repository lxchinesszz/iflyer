package com.iflyer.exception;

import com.iflyer.common.base.BaseException;

/**
 * @author liuxin
 * 异常类
 */
public class NoticeException extends BaseException {

    private static final long serialVersionUID = 1172910353638992375L;

    public NoticeException(String msg) {
        super(msg);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
