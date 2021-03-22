package com.github.qquang24t5._8tea.logic.session;

public class LoginAction {

    public enum Error {
        EMPTY_MOBILE("Bạn chưa nhập sô điện thoại"),
        EMPTY_PASSWORD("Bạn chưa nhập mật khẩu"),
        UNAUTHORIZED("Sai số điện thoại hoặc mật khẩu");

        public String message;
        private Error(String message) {
            this.message = message;
        }
    }

    public LoginAction() {}

    public String getMobile() {
        return mobile;
    }

    public LoginAction setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public LoginAction setPassword(String password) {
        this.password = password;
        return this;
    }

    private String mobile;
    private String password;

}
