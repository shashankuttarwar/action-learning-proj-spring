create table USER
(
   ID integer not null,
   FIRST_NAME varchar(255) not null,
   LAST_NAME varchar(255) not null,
   USER_ID varchar(255) not null,
   DATE_OF_BIRTH date not null,
   PHONE varchar(100) not null,
   EMAIL varchar(255) not null,
   ADDRESS varchar(255) not null,
   PASSWORD varchar(100) not null,
   primary key(ID)
);

create table POLICY
(
   ID integer not null,
   NAME varchar(255) not null,
   NUMBER varchar(255) not null,
   AMOUNT varchar(255) not null,
   END_DATE date not null,
   primary key(ID)
);

create table USERPOLICY
(
   ID integer not null,
   USER_ID varchar(255) not null,
   POLICY_NUMBER integer,
   primary key(ID)
);