

/*	TABLES	*/

CREATE TABLE some_documents(
    some_documents_id VARCHAR(42) PRIMARY KEY,
    some_value VARCHAR(100),
    some_well_defined_json jsonb NOT NULL,
    some_custom_json jsonb NOT NULL
);


INSERT INTO some_documents (some_documents_id, some_value, some_well_defined_json, some_custom_json) VALUES
('9c095f99-58ed-4d4a-9a19-199486dfad23', 'some value 1',
 '{"first_name": "Heriberto", "last_name": "Reyes", "some_desc":  "My Desc 1"}',
 '{"name": "Some Name.", "type": "Some Type."}'),
('59196523-fc6d-4926-af89-dc8fa4cd2d26', 'some value 2',
 '{"first_name": "Angie", "last_name": "Flores", "some_desc":  "My Desc 2"}',
 '{"author": "Some nice Author", "birthday": "1892-03-05"}')
;
