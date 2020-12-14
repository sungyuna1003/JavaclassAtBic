CREATE table tblMember(
idx NUMBER PRIMARY KEY,
 NAME VARCHAR2(10) NOT NULL,
 PHONE VARCHAR2(13)NOT NULL,
 TEAM VARCHAR2(10) NOT NULL);
 
 CREATE SEQUENCE SEQMEMBER;
  
 insert into tblmember(idx, name, phone, team)
 VALUES (seqmember.nextval, '홍길동', '010-5555-6666','산적');
 
 insert into tblmember(idx, name, phone, team)
 VALUES (seqmember.nextval, '강호동', '010-4444-6666','MC');
 
  insert into tblmember(idx, name, phone, team)
 VALUES (seqmember.nextval, '장동건', '010-1234-6666','배우');
 