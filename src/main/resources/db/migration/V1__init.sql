
CREATE table task_status (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

INSERT INTO task_status (name)
VALUES
    ('Created'),
    ('In Progress'),
    ('Completed'),
    ('Cancelled'),
    ('Deleted');

CREATE TABLE tasks (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    due TIMESTAMP,
    task_status_id INT,
    FOREIGN KEY (task_status_id) REFERENCES task_status (id)
);
