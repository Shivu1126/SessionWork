use studentdetails;

create table zsgs(
	studentID int not null auto_increment,
    studentName varchar(20) not null,
    Gender varchar(7) not null,
    performance varchar(10) not null,
    City varchar(30) not null,
    primary key(studentID)
    
);
show tables;
describe zsgs;

insert into zsgs(studentID,studentName,Gender,performance,City) values(null,'James','male','Well','Tenkasi');
insert into zsgs(studentID,studentName,Gender,performance,City) values
	(null,'Shiv','male','Good','Tenkasi'),
    (null,'Zerome','male','Good','Tirunelveli'),
    (null,'Rajavel','male','Well','Surandai'),
    (null,'Ranjith','male','Well','Surandai'),
    (null,'Jegan','male','Good','Ambai'),
    (null,'Mariappan','male','Good','Tirunelveli'),
    (null,'Deniyal','male','Well','Madurai'),
    (null,'Fathima','female','Good','Tenkasi'),
    (null,'Bals','male','Good','Sankarankovil'),
    (null,'Krithika','female','Well','Tenkasi'),
    (null,'Kaja Peer','female','Good','Tirunelveli'),    
    (null,'Mugila','female','Good','Arupukottai'),
    (null,'Sathis','male','Good','Melaminchanapuram'),
    (null,'Arul','male','Well','Sankarankovil'),
    (null,'Hari','male','Good','Madurai')
    ;
    
    select studentName,City from zsgs where city='Tenkasi' AND city='Tirunelveli';
    
    select City as "Village" ,studentName as "EmployeeName" from zsgs;
    
    update zsgs set performance = 'Select' where performance = 'Well';  
    
    update zsgs set performance = 'Well' where performance = 'Good';  
    
    alter table zsgs add mark int;
	
    select *from zsgs;

	update zsgs set mark = 87 where performance = 'Select';
    update zsgs set mark = 72 where studentID = 3;
    update zsgs set mark = 76 where studentID = 4;
    update zsgs set mark = 80 where studentID = 5;
    update zsgs set mark = 71 where studentID = 6;
    update zsgs set mark = 73 where studentID = 7;
    update zsgs set mark = 74 where studentID = 8;
    update zsgs set mark = 90 where studentID = 9;
    update zsgs set mark = 81 where studentID = 10;
    update zsgs set mark = 86 where studentID = 11;
    update zsgs set mark = 80 where studentID = 12;
    update zsgs set mark = 79 where studentID = 13;
    update zsgs set mark = 75 where studentID = 14;
    update zsgs set mark = 81 where studentID = 15;
    update zsgs set mark = 77 where studentID = 16;
    
    select count(studentID),performance from zsgs group by performance;
    
    select *from zsgs order by mark desc limit 1,1;
    
    SELECT studentName, MAX(mark) AS MARK FROM zsgs WHERE mark <> (SELECT MAX(mark) FROM zsgs);
