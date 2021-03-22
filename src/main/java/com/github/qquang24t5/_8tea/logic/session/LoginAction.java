package com.github.qquang24t5._8tea.logic.session;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
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

    private String mobile;
    private String password;

}
