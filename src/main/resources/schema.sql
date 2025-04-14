CREATE TABLE IF NOT EXISTS users (
  user_id int AUTO_INCREMENT PRIMARY KEY,
  -- Marking user-id as auto_increment primary key will make it a pk
  -- and hibernate itself generate a user_id so no need to add in code
  user_name varchar(100) DEFAULT NULL,
  user_add varchar(255) DEFAULT NULL
);

COMMIT;