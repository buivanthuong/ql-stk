
CREATE DATABASE IF NOT EXISTS SOTIETKIEM;

use sotietkiem ;


CREATE TABLE IF NOT EXISTS SoTK (
  ID int(11) not null auto_increment primary key ,
  IdKH int(11) not null,
  LoaiTK int(11) not null,
  NgayMoSo date not null,
  SoTienGui int(30) not null 
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT;

create table IF NOT EXISTS TaiKhoan (
	ID int(11) not null auto_increment primary key ,
    TenTaiKhoan nvarchar(50) not null ,
	HoTen nvarchar(50) not null,
    MatKhau nvarchar(255) not null 
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT;


create table IF NOT EXISTS LoaiTietKiem (
	ID int(11) not null auto_increment primary key ,
    TenLoai nvarchar(50) not null ,
    LaiXuat float(10) not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT;

create table IF NOT EXISTS KhachHang (
	ID int(11) not null auto_increment primary key ,
    Ten nvarchar(30) not null ,
    CMND int (11) not null,
    DiaChi nvarchar(200) not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT;

create table IF NOT EXISTS QuyDinh (
	ID int(11) not null auto_increment primary key ,
	SoLoai int(11) not null,
    SoNgayDaoHan int(11) not null ,
    ThayDoiLaiXuat boolean not null ,
    TienGoiToiThieu int(11) not null 
    
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT;
 

create table IF NOT EXISTS PhieuGuiTien (
	ID int(11) not null auto_increment primary key ,
    IdKH int(11) not null ,
    SoTienGui int(30) not null ,
    NgayGui date not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT;

create table IF NOT EXISTS PhieuRutTien (
	ID int(11) not null auto_increment primary key ,
    IdKH int(11) not null ,
    SoTienRut int(30) not null ,
    NgayRut date not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT;


/*alter table PhieuGuiTien add constraint fk_phieugui FOREIGN KEY (ID) references khachhang(ID);
alter table SoTk add constraint fk_loaitietkiem FOREIGN KEY (LoaiTK) references LoaiTietKiem(ID);
alter table SoTk add constraint fk_khachhang FOREIGN KEY (ID) references KhachHang(ID);
alter table PhieuRutTien add constraint fk_phieurut FOREIGN KEY (ID) references khachhang(ID);
/*/
INSERT INTO LoaiTietKiem(TenLoai,LaiXuat) VALUES('Không Kỳ Hạn', '0.65');
INSERT INTO LoaiTietKiem(TenLoai,LaiXuat) VALUES('Kỳ Hạn 3 Tháng','0.5');
INSERT INTO LoaiTietKiem(TenLoai,LaiXuat) VALUES('Kỳ Hạn 6 Tháng','0.55');

INSERT INTO KhachHang(Ten,CMND,DiaChi) VALUES('Nguyễn Văn An','221419587','NhaTrang');
INSERT INTO KhachHang(Ten,CMND,DiaChi) VALUES('Trần Thị Linh','221419465','Hà Nội');
INSERT INTO KhachHang(Ten,CMND,DiaChi) VALUES('Phạm Văn Toàn','221419214','Hồ Chí Minh');

INSERT INTO sotk(IdKH,LoaiTk,NgayMoSo,SoTienGui) VALUES('1','1','2018-12-22','500000');

INSERT INTO phieuguitien(IdKH,SoTienGui,NgayGui) VALUES('1','500000','2018-12-22');

INSERT INTO phieuruttien(IdKH,SoTienRut,NgayRut) VALUES('1','300000','2018-12-23');

INSERT INTO taikhoan(TenTaiKhoan,HoTen,MatKhau) VALUES('buivanthuong','Bùi Văn Thương','e10adc3949ba59abbe56e057f20f883e');

INSERT INTO quydinh(SoLoai,SoNgayDaoHan,ThayDoiLaiXuat,TienGoiToiThieu) VALUES(3,15,0,100000);




