# language: vi
  Tính năng: Đăng nhập
    Kịch bản: Đăng nhập thành công
      Biết tôi đang ở trang Đăng nhập
      Và   tồn tại tài khoản với số điện thoại "0123456789" với mật khẩu "!123StrongPassword!"
      Khi  tôi điền "0123456789" vào trường số điện thoại
      Và   tôi điền "!123StrongPassword!" vào trường mật khẩu
      Và   tôi nhấp vào nút đăng nhập
      Thì  thông báo "Chào mừng" phải được hiện ra

    Khung kịch bản: Tất cả các trường đều phải hiện lỗi nếu nó bị để trống
      Biết Tôi đang ở trang Đăng nhập
      Khi  tôi để trống trường "<trường>" trên trang đăng nhập
      Và   tôi nhấp vào nút đăng nhập trên trang đăng nhập
      Thì  "<lỗi>" trên trang đăng nhập cần phải được hiện ra
      Dữ liệu:
        |trường         |lỗi                  |
        |Số điện thoại  |thiếu số điện thoại  |
        |Mật khẩu       |thiếu mật khẩu       |

    Kịch bản: Người dùng nhập số điện thoại không tồn tại
      Biết tôi đang ở trang Đăng nhập
      Và   không tồn tại số điện thoại "0908764356" trong hệ thống
      Khi  tôi điền "0908764356" vào trường số điện thoại
      Và   tôi nhấp vào nút "Đăng nhập" trên trang đăng nhập
      Thì  lỗi "Số điện thoại không tồn tại" cần phải được hiện ra

    Kịch bản: Người dùng nhập sai mật khẩu
      Biết tôi đang ở trang Đăng nhập
      Và   tồn tại tài khoản với số điện thoại "0123456789" với mật khẩu "!123StrongPassword!"
      Khi  tôi điền "0123456789" vào trường số điện thoại
      Và   tôi điền "!123StrongPassword" vào trường mật khẩu
      Và   tôi nhấp vào nút "Đăng nhập" trên trang đăng nhập
      Thì  lỗi "Sai mật khẩu" cần phải được hiện ra
      