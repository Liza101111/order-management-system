--liquibase formatted sql

--changeset Liza:1

CREATE TABLE customer  (
                             id BIGINT NOT NULL AUTO_INCREMENT,
                             registration_code VARCHAR(45) NOT NULL,
                             full_name VARCHAR(40) NOT NULL,
                             email varchar(45) NOT NULL,
                             telephone VARCHAR(30)  NOT NULL,
                             PRIMARY KEY (id)
);

insert into customer (id, registration_code, full_name, email, telephone) values (1, '17089-390', 'Sheila-kathryn Fawltey', 'sfawltey0@umn.edu', '+1 314 395 8519');
insert into customer (id, registration_code, full_name, email, telephone) values (2, '69097-128', 'Candy Melross', 'cmelross1@google.com.au', '+351 398 423 7494');
insert into customer (id, registration_code, full_name, email, telephone) values (3, '30142-117', 'Sven Collinge', 'scollinge2@usnews.com', '+252 431 675 3942');
insert into customer (id, registration_code, full_name, email, telephone) values (4, '10147-0901', 'Kata Angliss', 'kangliss3@admin.ch', '+63 125 215 4165');
insert into customer (id, registration_code, full_name, email, telephone) values (5, '67938-1163', 'Honoria Jacqueminet', 'hjacqueminet4@ftc.gov', '+233 192 182 1836');
insert into customer (id, registration_code, full_name, email, telephone) values (6, '68419-0001', 'Nancy Brazear', 'nbrazear5@samsung.com', '+63 871 303 2402');
insert into customer (id, registration_code, full_name, email, telephone) values (7, '60512-6189', 'Bruis Soutar', 'bsoutar6@hud.gov', '+57 123 128 1642');
insert into customer (id, registration_code, full_name, email, telephone) values (8, '62670-4078', 'Jess McCreery', 'jmccreery7@hp.com', '+63 318 490 6550');
insert into customer (id, registration_code, full_name, email, telephone) values (9, '60793-850', 'Dael Hof', 'dhof8@woothemes.com', '+221 345 814 8097');
insert into customer (id, registration_code, full_name, email, telephone) values (10, '37000-807', 'Gilly Jakubski', 'gjakubski9@psu.edu', '+380 257 964 3925');
insert into customer (id, registration_code, full_name, email, telephone) values (11, '55154-5451', 'Bettye McConnal', 'bmcconnala@google.pl', '+7 998 696 9799');
insert into customer (id, registration_code, full_name, email, telephone) values (12, '36987-2306', 'Chucho Stetlye', 'cstetlyeb@mediafire.com', '+86 852 116 0949');
insert into customer (id, registration_code, full_name, email, telephone) values (13, '67544-479', 'Vernen Dermott', 'vdermottc@pcworld.com', '+84 113 510 3841');
insert into customer (id, registration_code, full_name, email, telephone) values (14, '57955-8020', 'Cherise MacTeggart', 'cmacteggartd@amazon.de', '+86 839 295 1312');
insert into customer (id, registration_code, full_name, email, telephone) values (15, '49348-683', 'Felipa Hymus', 'fhymuse@microsoft.com', '+84 989 754 9568');
