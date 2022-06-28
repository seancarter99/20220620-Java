-- Find the author first_name, last_name, and book title, for all of a given author's books
SELECT a.first_name, a.last_name, b.title
FROM author AS a
INNER JOIN book AS b
ON a.author_id = b.author_id
WHERE b.genre = 'Adventure'; -- You can also add filter conditions

-- Find all authors who have no books associated with them
SELECT a.first_name, a.last_name
FROM author a -- Implies AS. Same thing as author AS a
LEFT JOIN book AS b
ON a.author_id = b.author_id
WHERE b.author_id IS NULL;
 
-- Right JOIN
SELECT a.first_name, a.last_name
FROM book b -- Implies AS
RIGHT JOIN author a
ON a.author_id = b.author_id
WHERE b.author_id IS NULL;


SELECT CONCAT(first_name, ' ', last_name) AS full_name FROM author;