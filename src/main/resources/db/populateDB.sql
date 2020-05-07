DELETE FROM product;
ALTER SEQUENCE global_seq RESTART WITH 1;

INSERT INTO product (name, price) VALUES
  ('abc12', 5134),
  ('abc3', 7134),
  ('abc45', 5134),
  ('abc56', 67134),
  ('abc63', 13445),
  ('abc36', 134342),
  ('abc66', 134),
  ('abc66', 134),
  ('dfghdfg', 34534);
