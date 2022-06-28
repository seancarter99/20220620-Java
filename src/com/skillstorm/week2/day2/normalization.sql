SELECT * FROM playlist;

SELECT pl.name AS playlist_name, t.name, t.composer FROM playlist AS pl
INNER JOIN playlisttrack
ON playlisttrack.PlaylistId = pl.PlaylistId
INNER JOIN track AS t
ON playlisttrack.trackid = t.TrackId
WHERE pl.playlistid = 1
ORDER BY t.name ASC;

/*
	1NF (1st Normal Form)
    - To be in first normal form a table MUST:
      - Have a primary key
      - Table columns should be atomic (One value per column. NO LISTS)
        - item: "Apple, Egg, Bread, "
      - No repeating groups (item_1, item_2, item_3, ... item_n)
    
    2NF (2nd Normal Form)
    - To be in second normal form a table MUST:
      - Be 1NF compliant
      - No partial functional dependencies (A composite key should not directly determine another column)
    3NF (3rd Normal Form)
    - To be in third normal form a table MUST:
      - Be 2NF compliant
      - No transitive functional dependencies (A non-key column should not directly determine another column)
        - Birthday -> Age
        - Department Name -> Building Name

*/