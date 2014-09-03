--CREATE SCHEMA BUDGET_EMPLOYEE;
USE  BUDGET_EMPLOYEE;
CREATE TABLE book (
        isbn varchar(20) PRIMARY KEY,
        title varchar(100),
        author varchar(100),
        price varchar(20),
        location varchar(100)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into book values("isbn_1","Java: A Beginner's Guide","Herbert Schildt","$24.10","/EBook/Computer/Java: A Beginner's Guide.pdf");
insert into book values("isbn_2","Head First Java, 2nd Edition","Kathy Sierra and Bert Bates","$20.10","2排2行2列");
insert into book values("isbn_3","Effective Java(2nd Edition)","Joshua Bloch","$39.25","/EBook/Computer/Effective Java(2nd Edition).pdf");
insert into book values("isbn_4","Java: The Complete Reference (Compelte Reference Series)","Herbert Schildt","$38.49","2排2行3列");
