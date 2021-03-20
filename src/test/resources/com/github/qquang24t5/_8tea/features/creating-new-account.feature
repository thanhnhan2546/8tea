# language: vi
Tính năng: Tạo tài khoản mới
  Kiểm tra thông tin và tạo tài khoản cho người dùng mới

  Bối cảnh:
    người dùng hiện tại có đủ quyền để tạo tạo khoản mới

  Kịch bản: tạo tài khoản mới thành công
    Biết tài khoản với số điện thoại "0777888999" không tồn tại trong hệ thống
    Khi người dùng tạo tài khoản mới với số điện thoại "0777888999", mật khẩu "111!StrongPassword!999"
    Thì người dùng được thông báo rằng "tạo tài khoản mới thành công"

  Khung kịch bản: tạo tài khoản mới bằng số điện thoại không hợp lệ hoặc đã tồn tại trong hệ thống
    Biết tài khoản với số điện thoại "0123456789" đã tồn tại trong hệ thống
    Khi người dùng tạo tài khoản mới với số điện thoại "<phoneNumber>"
    Thì người dùng được thông báo rằng "<result>"

  Dữ liệu:
    | phoneNumber     | result                                  |
    |                 | số điện thoại không được để trống       |
    | Đại học Sài Gòn | số điện thoại chỉ có thể chứa số        |
    | 0123456789      | số điện thoại đã tồn tại trong hệ thống |

  Khung kịch bản: tạo tài khoản mới với mật khẩu yếu
    Khi người dùng tạo tài khoản mới với mật khẩu "<password>"
    Thì người dùng được thông báo rằng "<result>"

  Dữ liệu:
    | password   | result                                        |
    | 0123       | mật khẩu quá ngắn (8 ký tự tối thiểu)          |
    | 01234567a! | mật khẩu phải chứa ít nhất 1 ký tự hoa        |
    | 01234567A! | mật khẩu phải chứa ít nhất 1 ký tự thường     |
    | 01234567Aa | mật khẩu phải chứa ít nhất một ký tự đặc biệt |
