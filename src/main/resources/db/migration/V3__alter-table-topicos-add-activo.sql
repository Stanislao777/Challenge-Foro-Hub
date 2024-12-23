
ALTER TABLE topicos
    ADD COLUMN activo tinyint;
    UPDATE topicos set activo = 1