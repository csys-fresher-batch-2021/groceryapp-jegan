--Vegetables
create table vegetables(id serial primary key,vegetableName varchar(100) not null,price int , quantity int,
unique(vegetableName),
check(quantity>0),
check(price>0));
insert into vegetables(vegetableName,price,quantity) values('Chilly','35','50');

---user details
create table user_details(id serial primary key,userName varchar(500) not null,password varchar(500) not null,userMobileNumber varchar(500),userEmail varchar(500) not null,unique(userEmail));
insert into user_details values('jegan45','Jegan@123','919698475004','jegan@gmail.com');

--employees
create table employees(id serial primary key,userEmail varchar(500) not null,password varchar(500) not null,
unique(userEmail)
);
insert into employees values('jegan@gmail.com','Admin@123');
insert into employees values('john@gmail.com','Admin@234');

--order details
create table order_details(id serial primary key,vegetableName varchar(100) not null,price int , quantity int,totalPrice int,
check(quantity>0),
check(price>0));
