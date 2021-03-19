package com.github.qquang24t5._8tea.it;

import io.cucumber.java.vi.Biết;
import io.cucumber.java.vi.Khi;
import io.cucumber.java.vi.Thì;

public class EmployeeStepDefinitions {

    @Biết("tài khoản với số điện thoại {string} đã tồn tại trong hệ thống")
    public void tài_khoản_với_số_điện_thoại_đã_tồn_tại_trong_hệ_thống(String string) {}

    @Biết("tài khoản với số điện thoại {string} không tồn tại trong hệ thống")
    public void tài_khoản_với_số_điện_thoại_không_tồn_tại_trong_hệ_thống(String string) {}

    @Khi("người dùng tạo tài khoản mới với mật khẩu {string}")
    public void người_dùng_tạo_tài_khoản_mới_với_mật_khẩu(String string) {}

    @Khi("người dùng tạo tài khoản mới với số điện thoại {string}")
    public void người_dùng_tạo_tài_khoản_mới_với_số_điện_thoại(String string) {}

    @Khi("người dùng tạo tài khoản mới với số điện thoại {string}, mật khẩu {string}")
    public void người_dùng_tạo_tài_khoản_mới_với_số_điện_thoại_mật_khẩu(String string, String string2) {}

    @Thì("người dùng được thông báo rằng số điện thoại đã tồn tại trong hệ thống")
    public void người_dùng_được_thông_báo_rằng_số_điện_thoại_đã_tồn_tại_trong_hệ_thống() {}

    @Thì("người dùng được thông báo rằng tạo tài khoản mới thành công")
    public void người_dùng_được_thông_báo_rằng_tạo_tài_khoản_mới_thành_công() {}

    @Thì("người dùng được thông báo rằng {string}")
    public void người_dùng_được_thông_báo_rằng() {}

}
