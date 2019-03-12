CREATE DATABASE IF NOT EXISTS SOTIETKIEM;

use sotietkiem ;


CREATE TABLE IF NOT EXISTS SoTK (
  ID int(11) NOT NULL auto_increment primary key,
  MaKH int(11) not null,
  LoaiTK int(11) not null,
  NgayMoSo date not null,
  SoTienGui int(30) not null 
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT;


create table IF NOT EXISTS LoaiTietKiem (
	ID int(11) not null auto_increment primary key ,
    TenLoai nvarchar(50) not null 
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT;

create table IF NOT EXISTS KhachHang (
	ID int(11) not null auto_increment primary key ,
    Ten nvarchar(30) not null ,
    CMND int (11) not null,
    DiaChi nvarchar(20) not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT;
/*
create table IF NOT EXISTS PhieuGiaoDich (
	MaGD int(11) not null auto_increment primary key ,
    MaKH int(11) not null ,
    SoTien int(30) not null ,
    LoaiPhieu int(11) not null ,
	MaSoTK int(11) not null ,
    NgayGD date not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT;
 */

create table IF NOT EXISTS PhieuGuiTien (
	MaPhieu int(11) not null auto_increment primary key ,
    MaKH int(11) not null ,
    SoTienGui int(30) not null ,
    NgayGui date not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT;

create table IF NOT EXISTS PhieuRutTien (
	MaPhieu int(11) not null auto_increment primary key ,
    MaKH int(11) not null ,
    SoTienRut int(30) not null ,
    NgayRut date not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT;


alter table PhieuGuiTien add constraint fk_phieugui FOREIGN KEY (MaKH) references khachhang(ID);
alter table SoTk add constraint fk_loaitietkiem FOREIGN KEY (LoaiTK) references LoaiTietKiem(ID);
alter table SoTk add constraint fk_khachhang FOREIGN KEY (MaKH) references KhachHang(ID);
alter table PhieuRutTien add constraint fk_phieurut FOREIGN KEY (MaKH) references khachhang(ID);

INSERT INTO LoaiTietKiem(TenLoai) VALUES('Không Kỳ Hạn');
INSERT INTO LoaiTietKiem(TenLoai) VALUES('Kỳ Hạn 3 Tháng');
INSERT INTO LoaiTietKiem(TenLoai) VALUES('Kỳ Hạn 6 Tháng');

INSERT INTO KhachHang(Ten,CMND,DiaChi) VALUES('Nguyễn Văn An','221419587','NhaTrang');
INSERT INTO KhachHang(Ten,CMND,DiaChi) VALUES('Trần Thị Linh','221419465','Hà Nội');
INSERT INTO KhachHang(Ten,CMND,DiaChi) VALUES('Phạm Văn Toàn','221419214','Hồ Chí Minh');

INSERT INTO sotk(MaKH,LoaiTk,NgayMoSo,SoTienGui) VALUES('1','1','2018-12-22','500000');

INSERT INTO phieuguitien(MaKH,SoTienGui,NgayGui) VALUES('1','500000','2018-12-22');

INSERT INTO phieuruttien(MaKH,SoTienRut,NgayRut) VALUES('1','300000','2018-12-23');





