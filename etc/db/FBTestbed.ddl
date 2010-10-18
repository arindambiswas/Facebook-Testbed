DROP TABLE IF EXISTS member;

/**********************************/
/* Table Name: member */
/**********************************/
CREATE TABLE member(
  member_id SERIAL,
  fb_id BIGINT,
  fb_access_token VARCHAR(1000),
  is_valid_token BOOLEAN
);


ALTER TABLE member ADD PRIMARY KEY (member_id);

