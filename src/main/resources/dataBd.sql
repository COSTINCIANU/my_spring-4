CREATE TABLE livre (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(50) UNIQUE NOT NULL,
    `description` VARCHAR(255) NOT NULL,
    date_publication DATE(50) NOT NULL
);