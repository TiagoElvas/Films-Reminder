DROP DATABASE IF EXISTS films;
CREATE DATABASE films;
USE films;

DROP TABLE IF EXISTS film;

CREATE TABLE film (
                          id            INTEGER AUTO_INCREMENT PRIMARY KEY,
                          title         VARCHAR(255),
                          director      VARCHAR(255),
                          year          INTEGER (255),
                          type          VARCHAR(255)

);

DELETE FROM film;
INSERT INTO film(title, director, year, type)
VALUES ('Cars', 'John Lasseter', 2006, 'animation'),
       ('Lion King', 'Chris Sanders', 1994, 'animation'),
       ('The Incredibles', 'Brad Bird', 2004, 'animation'),
       ('Nemo', 'Andrew Stanton', 2003, 'animation');



