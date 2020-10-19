CREATE TABLE IF NOT EXISTS users (
    id UUID PRIMARY KEY,
    username text,
    password text,
    email text
);