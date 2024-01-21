USE new;

CREATE TABLE `users` (
  `username` varchar(50) NOT NULL,
  `password` char(68) NOT NULL,
  `enabled` tinyint NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE `authorities` (
  `username` varchar(50) NOT NULL,
  `authority` varchar(50) NOT NULL,
  UNIQUE KEY `authorities4_idx_1` (`username`,`authority`),
  CONSTRAINT `authorities4_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO users 
	VALUES ("yasir","{bcrypt}$2a$10$MuO9qVp.sRi1/7SrfCQGxOQXR9SF4aBwhat9qmFS2R/6azY0WYkjq",1),
    ("alex","{bcrypt}$2a$10$8bYpeiImeYjJeiILL4IPkuvW7xDQuycNK47WaCGKHh6.R941sq28e",1),
    ("sana","{bcrypt}$2a$10$Q5rAc3e1cwKFXC6FJ5NhHeme.mBgcE/BRIIMYEIHs7zMHK4npNjBe",1);
    
SELECT * FROM users;

INSERT INTO authorities
	VALUES("alex","GUEST"),
    ("sana","GUEST"),
    ("sana","EMPLOYEE"),
    ("yasir","GUEST"),
    ("yasir","EMPLOYEE"),
    ("yasir","ADMIN");
    
SELECT * FROM authorities    
    
    