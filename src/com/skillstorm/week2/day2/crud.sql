/*
	SQL Keys:
    Primary Key - Is a column that uniquely identifies a key from all other rows of a table
    Candidate Key - A column or columns that could be used to uniquely identify a row (could be primary key)
    Natural Key - A naturally occuring unique identifier that we don't have to create (phone number, ssn, vin, email, username)
    Artificial/Surrogate/Synthetic Key - An identifier we generate to identify a row (employee id, student id, ticket id)
    Composite Key - Two+ columns that together uniquely identify a row in a given table
    Foreign Key - A column that references the primary key of another table
*/
SELECT * FROM author;

/*
 CRUD Operations
 C - Create (INSERT)
 R - Read (SELECT)
 U - Update (UPDATE)
 D - Delete (DELETE)
*/

-- Insert data
INSERT INTO author (first_name, last_name) VALUES ('Shawn', 'Carter');
INSERT INTO author (first_name, last_name) VALUES ('Jane', 'Austen');
INSERT INTO author (first_name, last_name) VALUES ('Francis', 'Key');

-- Updating data
UPDATE author SET first_name = 'Sean' WHERE author_id = 1;

-- Deleting data from a table
DELETE FROM author WHERE author_id BETWEEN 0 AND 100;


UPDATE author SET first_name = 'Sean'; -- Doesn't work in safe mode
-- In general, you'll want to use an id such that you only target specific rows

-- DROP TABLE
-- Deletes altogether
DROP TABLE author;

DESCRIBE book;
INSERT INTO book (title, genre, author_id) VALUES ('Pride & Prejudice', 'Adventure', 3);
INSERT INTO book (title, genre, author_id) VALUES ('The Great Gatsby', 'Mystery', 3);
INSERT INTO book (title, genre, author_id) VALUES ('The Hitchiker\s Guide to the Galaxy', 'Adventure', 3);
INSERT INTO book (title, genre, author_id) VALUES ('Brave New World', 'Adventure', 4);

SELECT * FROM book;