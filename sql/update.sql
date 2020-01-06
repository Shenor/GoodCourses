CREATE TABLE public.rewiew
(
  id bigint NOT NULL,
  course_id bigint NOT NULL,
  profile_id bigint NOT NULL,
  description text,
  rating int,
  start_date date,
  last_update date
);

CREATE SEQUENCE public.rewiew_seq
START WITH 1
INCREMENT BY 1
NO MINVALUE
NO MAXVALUE
CACHE 1;


ALTER TABLE public.rewiew_seq OWNER TO resume;