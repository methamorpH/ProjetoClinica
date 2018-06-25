--
-- PostgreSQL database dump
--

-- Dumped from database version 10.3
-- Dumped by pg_dump version 10.3

-- Started on 2018-06-23 17:47:08

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1 (class 3079 OID 12924)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2851 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 205 (class 1259 OID 20190)
-- Name: agenda; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.agenda (
    agenda_codigo bigint NOT NULL,
    agenda_cod_paciente bigint,
    agenda_turno character varying(25),
    agenda_cod_medico bigint,
    agenda_data date,
    agenda_motivo text,
    agenda_status character varying(15)
);


ALTER TABLE public.agenda OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 20188)
-- Name: agenda_agenda_codigo_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.agenda_agenda_codigo_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.agenda_agenda_codigo_seq OWNER TO postgres;

--
-- TOC entry 2852 (class 0 OID 0)
-- Dependencies: 204
-- Name: agenda_agenda_codigo_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.agenda_agenda_codigo_seq OWNED BY public.agenda.agenda_codigo;


--
-- TOC entry 201 (class 1259 OID 20150)
-- Name: bairro; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.bairro (
    bairro_codigo bigint NOT NULL,
    bairro_nome character varying(60)
);


ALTER TABLE public.bairro OWNER TO postgres;

--
-- TOC entry 200 (class 1259 OID 20148)
-- Name: bairro_bairro_codigo_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.bairro_bairro_codigo_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.bairro_bairro_codigo_seq OWNER TO postgres;

--
-- TOC entry 2853 (class 0 OID 0)
-- Dependencies: 200
-- Name: bairro_bairro_codigo_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.bairro_bairro_codigo_seq OWNED BY public.bairro.bairro_codigo;


--
-- TOC entry 197 (class 1259 OID 20134)
-- Name: medicos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.medicos (
    cod_medico bigint NOT NULL,
    nome_medico character varying(250) NOT NULL,
    especializacao_medico character varying(60) NOT NULL,
    crm_medico bigint NOT NULL
);


ALTER TABLE public.medicos OWNER TO postgres;

--
-- TOC entry 196 (class 1259 OID 20132)
-- Name: medicos_cod_medico_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.medicos_cod_medico_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.medicos_cod_medico_seq OWNER TO postgres;

--
-- TOC entry 2854 (class 0 OID 0)
-- Dependencies: 196
-- Name: medicos_cod_medico_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.medicos_cod_medico_seq OWNED BY public.medicos.cod_medico;


--
-- TOC entry 203 (class 1259 OID 20166)
-- Name: pacientes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.pacientes (
    paci_codigo bigint NOT NULL,
    paci_nome character varying(260),
    paci_rg character varying(15),
    paci_telefone character varying(15),
    paci_rua character varying(50),
    paci_cep character varying(15),
    paci_complemento character varying(50),
    paci_bairro_codigo bigint,
    paci_nascimento character varying(15)
);


ALTER TABLE public.pacientes OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 20164)
-- Name: pacientes_paci_codigo_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.pacientes_paci_codigo_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.pacientes_paci_codigo_seq OWNER TO postgres;

--
-- TOC entry 2855 (class 0 OID 0)
-- Dependencies: 202
-- Name: pacientes_paci_codigo_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.pacientes_paci_codigo_seq OWNED BY public.pacientes.paci_codigo;


--
-- TOC entry 199 (class 1259 OID 20142)
-- Name: usuarios; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.usuarios (
    usu_codigo bigint NOT NULL,
    usu_nome character varying(30),
    usu_senha character varying(30),
    usu_tipo character varying(30)
);


ALTER TABLE public.usuarios OWNER TO postgres;

--
-- TOC entry 198 (class 1259 OID 20140)
-- Name: usuarios_usu_codigo_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.usuarios_usu_codigo_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.usuarios_usu_codigo_seq OWNER TO postgres;

--
-- TOC entry 2856 (class 0 OID 0)
-- Dependencies: 198
-- Name: usuarios_usu_codigo_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.usuarios_usu_codigo_seq OWNED BY public.usuarios.usu_codigo;


--
-- TOC entry 2699 (class 2604 OID 20193)
-- Name: agenda agenda_codigo; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.agenda ALTER COLUMN agenda_codigo SET DEFAULT nextval('public.agenda_agenda_codigo_seq'::regclass);


--
-- TOC entry 2697 (class 2604 OID 20153)
-- Name: bairro bairro_codigo; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.bairro ALTER COLUMN bairro_codigo SET DEFAULT nextval('public.bairro_bairro_codigo_seq'::regclass);


--
-- TOC entry 2695 (class 2604 OID 20137)
-- Name: medicos cod_medico; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.medicos ALTER COLUMN cod_medico SET DEFAULT nextval('public.medicos_cod_medico_seq'::regclass);


--
-- TOC entry 2698 (class 2604 OID 20169)
-- Name: pacientes paci_codigo; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pacientes ALTER COLUMN paci_codigo SET DEFAULT nextval('public.pacientes_paci_codigo_seq'::regclass);


--
-- TOC entry 2696 (class 2604 OID 20145)
-- Name: usuarios usu_codigo; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuarios ALTER COLUMN usu_codigo SET DEFAULT nextval('public.usuarios_usu_codigo_seq'::regclass);


--
-- TOC entry 2843 (class 0 OID 20190)
-- Dependencies: 205
-- Data for Name: agenda; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.agenda (agenda_codigo, agenda_cod_paciente, agenda_turno, agenda_cod_medico, agenda_data, agenda_motivo, agenda_status) FROM stdin;
\.


--
-- TOC entry 2839 (class 0 OID 20150)
-- Dependencies: 201
-- Data for Name: bairro; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.bairro (bairro_codigo, bairro_nome) FROM stdin;
1	Centro
\.


--
-- TOC entry 2835 (class 0 OID 20134)
-- Dependencies: 197
-- Data for Name: medicos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.medicos (cod_medico, nome_medico, especializacao_medico, crm_medico) FROM stdin;
1	Médico Genérico	Cirurgia Geral	99999
\.


--
-- TOC entry 2841 (class 0 OID 20166)
-- Dependencies: 203
-- Data for Name: pacientes; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.pacientes (paci_codigo, paci_nome, paci_rg, paci_telefone, paci_rua, paci_cep, paci_complemento, paci_bairro_codigo, paci_nascimento) FROM stdin;
1	Paciente Genérico	999999999	44999999999	Rua Genérica	99999999	\N	1	99/99/9999
\.


--
-- TOC entry 2837 (class 0 OID 20142)
-- Dependencies: 199
-- Data for Name: usuarios; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.usuarios (usu_codigo, usu_nome, usu_senha, usu_tipo) FROM stdin;
1	admin	123	Administrador
\.


--
-- TOC entry 2857 (class 0 OID 0)
-- Dependencies: 204
-- Name: agenda_agenda_codigo_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.agenda_agenda_codigo_seq', 1, true);


--
-- TOC entry 2858 (class 0 OID 0)
-- Dependencies: 200
-- Name: bairro_bairro_codigo_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.bairro_bairro_codigo_seq', 1, true);


--
-- TOC entry 2859 (class 0 OID 0)
-- Dependencies: 196
-- Name: medicos_cod_medico_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.medicos_cod_medico_seq', 1, true);


--
-- TOC entry 2860 (class 0 OID 0)
-- Dependencies: 202
-- Name: pacientes_paci_codigo_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.pacientes_paci_codigo_seq', 1, true);


--
-- TOC entry 2861 (class 0 OID 0)
-- Dependencies: 198
-- Name: usuarios_usu_codigo_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.usuarios_usu_codigo_seq', 1, true);


--
-- TOC entry 2709 (class 2606 OID 20198)
-- Name: agenda agenda_codigo_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.agenda
    ADD CONSTRAINT agenda_codigo_pk PRIMARY KEY (agenda_codigo);


--
-- TOC entry 2705 (class 2606 OID 20155)
-- Name: bairro bairro_codigo_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.bairro
    ADD CONSTRAINT bairro_codigo_pk PRIMARY KEY (bairro_codigo);


--
-- TOC entry 2701 (class 2606 OID 20139)
-- Name: medicos medicos_cod_medico_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.medicos
    ADD CONSTRAINT medicos_cod_medico_pk PRIMARY KEY (cod_medico);


--
-- TOC entry 2707 (class 2606 OID 20171)
-- Name: pacientes paci_codigo_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pacientes
    ADD CONSTRAINT paci_codigo_pk PRIMARY KEY (paci_codigo);


--
-- TOC entry 2703 (class 2606 OID 20147)
-- Name: usuarios usuarios_usu_codigo_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuarios_usu_codigo_pk PRIMARY KEY (usu_codigo);


--
-- TOC entry 2712 (class 2606 OID 20204)
-- Name: agenda agenda_cod_medico_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.agenda
    ADD CONSTRAINT agenda_cod_medico_fk FOREIGN KEY (agenda_cod_medico) REFERENCES public.medicos(cod_medico);


--
-- TOC entry 2711 (class 2606 OID 20199)
-- Name: agenda agenda_cod_paciente_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.agenda
    ADD CONSTRAINT agenda_cod_paciente_fk FOREIGN KEY (agenda_cod_paciente) REFERENCES public.pacientes(paci_codigo);


--
-- TOC entry 2710 (class 2606 OID 20172)
-- Name: pacientes paci_bairro_codigo_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.pacientes
    ADD CONSTRAINT paci_bairro_codigo_fk FOREIGN KEY (paci_bairro_codigo) REFERENCES public.bairro(bairro_codigo);


-- Completed on 2018-06-23 17:47:11

--
-- PostgreSQL database dump complete
--

