CREATE table tblMember(
idx NUMBER PRIMARY KEY,
 NAME VARCHAR2(10) NOT NULL,
 PHONE VARCHAR2(13)NOT NULL,
 TEAM VARCHAR2(10) NOT NULL);
 
 CREATE SEQUENCE SEQMEMBER;
  
 insert into tblmember(idx, name, phone, team)
 VALUES (seqmember.nextval, 'ȫ�浿', '010-5555-6666','����');
 
 insert into tblmember(idx, name, phone, team)
 VALUES (seqmember.nextval, '��ȣ��', '010-4444-6666','MC');
 
  insert into tblmember(idx, name, phone, team)
 VALUES (seqmember.nextval, '�嵿��', '010-1234-6666','���');
 