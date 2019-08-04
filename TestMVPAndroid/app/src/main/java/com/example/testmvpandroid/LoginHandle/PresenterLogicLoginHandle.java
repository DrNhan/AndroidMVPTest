package com.example.testmvpandroid.LoginHandle;

public class PresenterLogicLoginHandle implements PresenterImLoginHandle {

    ViewLoginHandle viewLoginHandle;

    public PresenterLogicLoginHandle(ViewLoginHandle viewLoginHandle){
        this.viewLoginHandle = viewLoginHandle;
    }

    @Override
    public void CheckLogin(String loginName, String password) {
        if(loginName.equals("LoginName") && password.equals("password")){
            // return success login
            viewLoginHandle.HandleSuccessLogin();
        }else{
            // return error view
            viewLoginHandle.HanldeFaileLogin();
        }
    }
}
