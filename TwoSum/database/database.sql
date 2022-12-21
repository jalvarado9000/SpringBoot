--
-- PostgreSQL database dump
--

-- Dumped from database version 15.1
-- Dumped by pg_dump version 15.1

-- Started on 2022-12-20 16:02:48

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 2 (class 3079 OID 16384)
-- Name: adminpack; Type: EXTENSION; Schema: -; Owner: -
--

CREATE EXTENSION IF NOT EXISTS adminpack WITH SCHEMA pg_catalog;


--
-- TOC entry 3322 (class 0 OID 0)
-- Dependencies: 2
-- Name: EXTENSION adminpack; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION adminpack IS 'administrative functions for PostgreSQL';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 215 (class 1259 OID 16398)
-- Name: two_sum; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.two_sum (
    id bigint NOT NULL,
    numbers text NOT NULL,
    target bigint NOT NULL,
    result text
);


ALTER TABLE public.two_sum OWNER TO postgres;

--
-- TOC entry 3174 (class 2606 OID 16404)
-- Name: two_sum two_sum_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.two_sum
    ADD CONSTRAINT two_sum_pkey PRIMARY KEY (id);


-- Completed on 2022-12-20 16:02:49

--
-- PostgreSQL database dump complete
--

