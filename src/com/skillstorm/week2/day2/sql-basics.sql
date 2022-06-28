DESCRIBE country;

-- This is a comment

/* 
	This is a multi line comment
    
    MySQL Data Types
    
    Numeric:
	- INT (int in Java)
    - SMALLINT (short in Java)
    - TINYINT (byte in Java)
    - MEDIUMINT (between a int and a short in size)
    - BIGINT (long in Java)
    - FLOAT(M,D)
    - DECIMAL(M,D)
    - M is the number of digits TOTAL
      - D is the number of spaces after the decimal
    
    Text:
    - CHAR(N) (Fixed size string)
     - N is the number of characters
	- VARCHAR(N) (Variable sized string) (Max size is 255)
     - N is the max number of characters
	- TEXT/BLOB (65,000 characters) (Used for storing articles OR images)
    - TINYTEXT/TINYBLOB
    - MEDIUMTEXT/MEDIUMBLOB
    - BIGTEXT/BIGBLOB
    - SMALLTEXT/SMALLBLOB
    - ENUM(...types)
      - Limit the allowed values to just the ones specified as parameters
      
	Date/Time:
    - DATE (YYYY-MM-DD)
    - TIME (HH:MM:SS)
    - DATETIME (YYYY-MM-DD HH:MM:SS)
    - TIMESTAMP (YYYYMMDDHHMMSS)
    - YEAR
      YEAR(XX) 70+ indicates 19XX, 69 or below is 20XX
      YEAR(XXXX) Uses the date provided
	
    Other:
	- BOOL/BOOLEAN (True / False)
*/

-- SQL Query Basics

-- SELECT
-- Allows us to retrieve a set of data from the table, we just specify which columns we want

-- FROM
-- Allows us to specify the table we'd like to SELECT data from
SELECT * FROM country;

-- AS
-- Allows for aliasing of tables or columns
SELECT code AS cod, name AS llamo, continent, indepyear FROM country;

-- WHERE
-- Allows us to add conditions for what data to grab
SELECT * frOm country WHERE indepyear < 0 OR indepyear IS NULL;

-- Indepyear between 1900 and 1950
SELECT * frOm country WHERE indepyear >= 1900 AND indepyear <= 1950;
SELECT * frOm country WHERE indepyear BETWEEN 1900 AND 1950;

/*
	Wildcards:
    Allow any character to fill its slot
    
    % - Any number of characters can appear here 0+
    _ - Exactly one character can appear here 1
*/

-- Grab all countries starting with the letter U
SELECT * FROM country WHERE name LIKE 'U%'; -- Starts with a U and I don't care what follows

-- Grab all countries with the letter W somewhere in the name
SELECT * FROM country WHERE name LIKE '%W%';

-- Grab all countries with the second letter being W
SELECT * FROM country WHERE name LIKE '_W%' AND LENGTH(name) = 6;

-- Grab all countries starting with Turk
SELECT LCASE(name) AS name FROM country WHERE name LIKE 'Turk%';

-- GROUP BY
-- Allows us to bundle different rows into logical groups on some condition

-- AGGREGATE FUNCTIONS
-- These are functions that take many values and reduce a singular one
-- MAX, MIN, COUNT, AVG, SUM

SELECT COUNT(*) FROM country; -- Returns the total number of countries in the table

-- Counts up the number of countries per each continent
SELECT continent, COUNT(*) AS num_countries
FROM country
GROUP BY continent;

SELECT continent, MAX(Population) AS highest_pop, MIN(Population) AS lowest_pop
FROM country
GROUP BY continent;

-- HAVING (Basically a WHERE Clause just for the groups)
-- Treat this one as a filter statement for your groups
SELECT continent, MAX(Population) AS highest_pop FROM country
GROUP BY continent
HAVING SUM(Population) > 1000;

-- ORDER BY
SELECT name, population FROM country ORDER BY population DESC;

-- LIMIT allows us to add a limit to the amount of rows returned back
-- OFFSET allows us to skip the first X in the rows returned back
SELECT name, population FROM country ORDER BY population DESC LIMIT 10 OFFSET 10;

SELECT * FROM country where name = 'Aruba';

SELECT name, indepyear FROM country WHERE indepyear IS NOT NULL ORDER BY indepyear LIMIT 10;