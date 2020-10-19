CREATE TABLE IF NOT EXISTS roles (
    id UUID PRIMARY KEY,
    role text
);

CREATE TABLE IF NOT EXISTS roles_users (
    roles_id UUID,
    users_id UUID
);