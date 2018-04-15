package com.itplayer.core.base.web;

public class BaseController {

    public ResponseData success() {
        return new ResponseData(ResponseData.SUCCESS);
    }

    public ResponseData success(Object data) {
        return new ResponseData(ResponseData.SUCCESS, data);
    }

    public ResponseData faild() {
        return new ResponseData(ResponseData.FAILD);
    }

    public ResponseData faild(String msg) {
        return new ResponseData(ResponseData.FAILD, msg);
    }
}
