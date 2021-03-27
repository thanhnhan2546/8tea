# language: vi
  Tính năng: Đăng nhập
    Kịch bản: Đăng nhập thành công
      Biết tôi đang ở trang Đăng nhập
      Khi  tôi nhấp vào nút "Đăng nhập" trên trang đăng nhập
      Và   tất cả các trường tôi đã nhập trùng với database
      Thì  tôi sẽ chuyển đến trang dựa trên chức năng của tôi trong hệ thống

    Khung kịch bản: Tất cả các trường đều phải hiện lỗi nếu nó không được điền
      Biết Biết tôi đang ở trang Đăng nhập
      Khi  tôi nhấp vào nút "Đăng nhập" trên trang đăng nhập
      Và   tôi không điền vào trường "<trường>" trên trang đăng nhập
      Thì  "<lỗi>" trên trang đăng nhập cần phải được hiện ra
      Dữ liệu:
        |trường         |lỗi                  |
        |Số điện thoại  |thiếu số điện thoại  |
        |Mật khẩu       |thiếu mật khẩu       |

    Kịch bản: Người dùng nhập số điện thoại không tồn tại
      Biết Biết tôi đang ở trang Đăng nhập
      Khi  tôi nhấp vào nút "Đăng nhập" trên trang đăng nhập
      Và   tôi nhập vào số điện thoại không có trong database
      Thì  lỗi "Số điện thoại" không tồn tại cần phải được hiện ra

    Kịch bản: Người dùng nhập sai mật khẩu
      Biết Biết tôi đang ở trang Đăng nhập
      Khi  tôi nhấp vào nút "Đăng nhập" trên trang đăng nhập
      Và   tôi nhập mật khẩu không đúng với số điện thoại
      Thì  lỗi "Sai mật khẩu" cần phải được hiện ra
      