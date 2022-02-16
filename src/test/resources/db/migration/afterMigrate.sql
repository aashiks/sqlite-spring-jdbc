
-- admin:testpassword
INSERT INTO
    users(uid,username,password,
          email_address,creation_date,enabled)
    values (1,'admin','$2b$10$qRB9Fm23UdZskC4DKUQ74.ZmMA1uBE1MSMVXYN04FChwF7wqIgDGq','test\@example.com','2021-01-13 15:55:28.598000',1);


-- user:testpassword
INSERT INTO
    users(uid,username,password,
          email_address,creation_date,enabled)
values (2,'user','$2b$10$qRB9Fm23UdZskC4DKUQ74.ZmMA1uBE1MSMVXYN04FChwF7wqIgDGq','test\@example.com','2021-01-13 15:55:28.598000',1);


INSERT INTO
    roles(uid,role)
values (1,'ADMIN');

INSERT INTO
    roles(uid,role)
values (1,'USER');


INSERT INTO
    roles(uid,role)
values (2,'USER');