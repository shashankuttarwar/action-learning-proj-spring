insert into USER
values(10001,'Ranga', 'Rajan','ranga1312','1989-10-13','9823782790','shashank@gmail.com','Pune','123456');
insert into USER
values(10002,'Rob', 'Stern','rob2010','1992-10-20','9028999483','rob.stern@gmail.com','Pune','123');
insert into USER
values(10003,'ADMIN', '','admin','2000-10-10','9028999483','admin@gmail.com','Pune','admin');
commit;

insert into POLICY
values(20001,'Jeevan Jyoti', '111111','20000','2020-05-02');
insert into POLICY
values(20002,'Bharti AXA', '222222','30000','2022-01-22');
insert into POLICY
values(20003,'Roshan Jeevan', '333333','40000','2025-07-23');
insert into POLICY
values(20004,'Jeevan Kalyan', '444444','50000','2026-010-10');
insert into POLICY
values(20005,'Star Jeevan', '555555','60000','2015-03-23');
insert into POLICY
values(20006,'Life Win', '666666','70000','2016-07-28');
commit;

insert into USERPOLICY
values(30001,'ranga1312', 20001);
insert into USERPOLICY
values(30002,'ranga1312', 20002);
insert into USERPOLICY
values(30003,'ranga1312', 20005);
insert into USERPOLICY
values(30004,'rob2010', 20004);
insert into USERPOLICY
values(30005,'rob2010', 20006);
insert into USERPOLICY
values(30006,'rob2010', 20003);
commit;