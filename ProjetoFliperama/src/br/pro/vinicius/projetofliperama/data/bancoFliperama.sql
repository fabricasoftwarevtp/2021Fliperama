PGDMP     ,    #                x         	   Fliperama    12.2    12.0 6    G           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            H           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            I           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            J           1262    25472 	   Fliperama    DATABASE     �   CREATE DATABASE "Fliperama" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Portuguese_Brazil.1252' LC_CTYPE = 'Portuguese_Brazil.1252';
    DROP DATABASE "Fliperama";
                postgres    false            �            1259    25870 
   emprestimo    TABLE     �   CREATE TABLE public.emprestimo (
    idemprestimo integer NOT NULL,
    idjogador integer,
    idjogo integer,
    dtaaluga character varying(10),
    dtadevolve character varying(10)
);
    DROP TABLE public.emprestimo;
       public         heap    postgres    false            �            1259    25868    emprestimo_idemprestimo_seq    SEQUENCE     �   CREATE SEQUENCE public.emprestimo_idemprestimo_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public.emprestimo_idemprestimo_seq;
       public          postgres    false    214            K           0    0    emprestimo_idemprestimo_seq    SEQUENCE OWNED BY     [   ALTER SEQUENCE public.emprestimo_idemprestimo_seq OWNED BY public.emprestimo.idemprestimo;
          public          postgres    false    213            �            1259    25551    genero    TABLE     c   CREATE TABLE public.genero (
    idgenero integer NOT NULL,
    descricao character varying(15)
);
    DROP TABLE public.genero;
       public         heap    postgres    false            �            1259    25549    genero_idgenero_seq    SEQUENCE     �   CREATE SEQUENCE public.genero_idgenero_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.genero_idgenero_seq;
       public          postgres    false    205            L           0    0    genero_idgenero_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.genero_idgenero_seq OWNED BY public.genero.idgenero;
          public          postgres    false    204            �            1259    25530    jogador    TABLE     �   CREATE TABLE public.jogador (
    idjogador integer NOT NULL,
    nome character varying(50),
    idade integer,
    email character varying(50),
    rua character varying(50),
    nro_casa integer,
    bairro character varying(50)
);
    DROP TABLE public.jogador;
       public         heap    postgres    false            �            1259    25528    jogador_idjogador_seq    SEQUENCE     �   CREATE SEQUENCE public.jogador_idjogador_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.jogador_idjogador_seq;
       public          postgres    false    203            M           0    0    jogador_idjogador_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.jogador_idjogador_seq OWNED BY public.jogador.idjogador;
          public          postgres    false    202            �            1259    25796    jogadortelefone    TABLE     �   CREATE TABLE public.jogadortelefone (
    idtelefone integer NOT NULL,
    idjogador integer,
    telefone character varying(15)
);
 #   DROP TABLE public.jogadortelefone;
       public         heap    postgres    false            �            1259    25794    jogadortelefone_idtelefone_seq    SEQUENCE     �   CREATE SEQUENCE public.jogadortelefone_idtelefone_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 5   DROP SEQUENCE public.jogadortelefone_idtelefone_seq;
       public          postgres    false    212            N           0    0    jogadortelefone_idtelefone_seq    SEQUENCE OWNED BY     a   ALTER SEQUENCE public.jogadortelefone_idtelefone_seq OWNED BY public.jogadortelefone.idtelefone;
          public          postgres    false    211            �            1259    25567    jogo    TABLE     �   CREATE TABLE public.jogo (
    idjogo integer NOT NULL,
    nome character varying(50),
    desenvolvedora character varying(30),
    anolanc integer,
    idplataforma integer,
    idgenero integer
);
    DROP TABLE public.jogo;
       public         heap    postgres    false            �            1259    25565    jogo_idjogo_seq    SEQUENCE     �   CREATE SEQUENCE public.jogo_idjogo_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.jogo_idjogo_seq;
       public          postgres    false    209            O           0    0    jogo_idjogo_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.jogo_idjogo_seq OWNED BY public.jogo.idjogo;
          public          postgres    false    208            �            1259    25559 
   plataforma    TABLE     k   CREATE TABLE public.plataforma (
    idplataforma integer NOT NULL,
    descricao character varying(15)
);
    DROP TABLE public.plataforma;
       public         heap    postgres    false            �            1259    25557    plataforma_idplataforma_seq    SEQUENCE     �   CREATE SEQUENCE public.plataforma_idplataforma_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public.plataforma_idplataforma_seq;
       public          postgres    false    207            P           0    0    plataforma_idplataforma_seq    SEQUENCE OWNED BY     [   ALTER SEQUENCE public.plataforma_idplataforma_seq OWNED BY public.plataforma.idplataforma;
          public          postgres    false    206            �            1259    25601    usuario    TABLE     k   CREATE TABLE public.usuario (
    login character varying(30) NOT NULL,
    senha character varying(15)
);
    DROP TABLE public.usuario;
       public         heap    postgres    false            �
           2604    25873    emprestimo idemprestimo    DEFAULT     �   ALTER TABLE ONLY public.emprestimo ALTER COLUMN idemprestimo SET DEFAULT nextval('public.emprestimo_idemprestimo_seq'::regclass);
 F   ALTER TABLE public.emprestimo ALTER COLUMN idemprestimo DROP DEFAULT;
       public          postgres    false    213    214    214            �
           2604    25554    genero idgenero    DEFAULT     r   ALTER TABLE ONLY public.genero ALTER COLUMN idgenero SET DEFAULT nextval('public.genero_idgenero_seq'::regclass);
 >   ALTER TABLE public.genero ALTER COLUMN idgenero DROP DEFAULT;
       public          postgres    false    204    205    205            �
           2604    25533    jogador idjogador    DEFAULT     v   ALTER TABLE ONLY public.jogador ALTER COLUMN idjogador SET DEFAULT nextval('public.jogador_idjogador_seq'::regclass);
 @   ALTER TABLE public.jogador ALTER COLUMN idjogador DROP DEFAULT;
       public          postgres    false    202    203    203            �
           2604    25799    jogadortelefone idtelefone    DEFAULT     �   ALTER TABLE ONLY public.jogadortelefone ALTER COLUMN idtelefone SET DEFAULT nextval('public.jogadortelefone_idtelefone_seq'::regclass);
 I   ALTER TABLE public.jogadortelefone ALTER COLUMN idtelefone DROP DEFAULT;
       public          postgres    false    211    212    212            �
           2604    25570    jogo idjogo    DEFAULT     j   ALTER TABLE ONLY public.jogo ALTER COLUMN idjogo SET DEFAULT nextval('public.jogo_idjogo_seq'::regclass);
 :   ALTER TABLE public.jogo ALTER COLUMN idjogo DROP DEFAULT;
       public          postgres    false    209    208    209            �
           2604    25562    plataforma idplataforma    DEFAULT     �   ALTER TABLE ONLY public.plataforma ALTER COLUMN idplataforma SET DEFAULT nextval('public.plataforma_idplataforma_seq'::regclass);
 F   ALTER TABLE public.plataforma ALTER COLUMN idplataforma DROP DEFAULT;
       public          postgres    false    207    206    207            D          0    25870 
   emprestimo 
   TABLE DATA           [   COPY public.emprestimo (idemprestimo, idjogador, idjogo, dtaaluga, dtadevolve) FROM stdin;
    public          postgres    false    214   �<       ;          0    25551    genero 
   TABLE DATA           5   COPY public.genero (idgenero, descricao) FROM stdin;
    public          postgres    false    205   �<       9          0    25530    jogador 
   TABLE DATA           W   COPY public.jogador (idjogador, nome, idade, email, rua, nro_casa, bairro) FROM stdin;
    public          postgres    false    203   =       B          0    25796    jogadortelefone 
   TABLE DATA           J   COPY public.jogadortelefone (idtelefone, idjogador, telefone) FROM stdin;
    public          postgres    false    212   �=       ?          0    25567    jogo 
   TABLE DATA           ]   COPY public.jogo (idjogo, nome, desenvolvedora, anolanc, idplataforma, idgenero) FROM stdin;
    public          postgres    false    209   8>       =          0    25559 
   plataforma 
   TABLE DATA           =   COPY public.plataforma (idplataforma, descricao) FROM stdin;
    public          postgres    false    207   �>       @          0    25601    usuario 
   TABLE DATA           /   COPY public.usuario (login, senha) FROM stdin;
    public          postgres    false    210   _?       Q           0    0    emprestimo_idemprestimo_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.emprestimo_idemprestimo_seq', 2, true);
          public          postgres    false    213            R           0    0    genero_idgenero_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.genero_idgenero_seq', 5, true);
          public          postgres    false    204            S           0    0    jogador_idjogador_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.jogador_idjogador_seq', 9, true);
          public          postgres    false    202            T           0    0    jogadortelefone_idtelefone_seq    SEQUENCE SET     L   SELECT pg_catalog.setval('public.jogadortelefone_idtelefone_seq', 5, true);
          public          postgres    false    211            U           0    0    jogo_idjogo_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.jogo_idjogo_seq', 10, true);
          public          postgres    false    208            V           0    0    plataforma_idplataforma_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.plataforma_idplataforma_seq', 9, true);
          public          postgres    false    206            �
           2606    25564    plataforma pk_console 
   CONSTRAINT     ]   ALTER TABLE ONLY public.plataforma
    ADD CONSTRAINT pk_console PRIMARY KEY (idplataforma);
 ?   ALTER TABLE ONLY public.plataforma DROP CONSTRAINT pk_console;
       public            postgres    false    207            �
           2606    25875    emprestimo pk_emprestimo 
   CONSTRAINT     `   ALTER TABLE ONLY public.emprestimo
    ADD CONSTRAINT pk_emprestimo PRIMARY KEY (idemprestimo);
 B   ALTER TABLE ONLY public.emprestimo DROP CONSTRAINT pk_emprestimo;
       public            postgres    false    214            �
           2606    25535    jogador pk_jogador 
   CONSTRAINT     W   ALTER TABLE ONLY public.jogador
    ADD CONSTRAINT pk_jogador PRIMARY KEY (idjogador);
 <   ALTER TABLE ONLY public.jogador DROP CONSTRAINT pk_jogador;
       public            postgres    false    203            �
           2606    25572    jogo pk_jogo 
   CONSTRAINT     N   ALTER TABLE ONLY public.jogo
    ADD CONSTRAINT pk_jogo PRIMARY KEY (idjogo);
 6   ALTER TABLE ONLY public.jogo DROP CONSTRAINT pk_jogo;
       public            postgres    false    209            �
           2606    25556    genero pk_jogofisico 
   CONSTRAINT     X   ALTER TABLE ONLY public.genero
    ADD CONSTRAINT pk_jogofisico PRIMARY KEY (idgenero);
 >   ALTER TABLE ONLY public.genero DROP CONSTRAINT pk_jogofisico;
       public            postgres    false    205            �
           2606    25801    jogadortelefone pk_telefone 
   CONSTRAINT     a   ALTER TABLE ONLY public.jogadortelefone
    ADD CONSTRAINT pk_telefone PRIMARY KEY (idtelefone);
 E   ALTER TABLE ONLY public.jogadortelefone DROP CONSTRAINT pk_telefone;
       public            postgres    false    212            �
           2606    25605    usuario pk_usuario 
   CONSTRAINT     S   ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT pk_usuario PRIMARY KEY (login);
 <   ALTER TABLE ONLY public.usuario DROP CONSTRAINT pk_usuario;
       public            postgres    false    210            �
           2606    25578    jogo fk_genero    FK CONSTRAINT     u   ALTER TABLE ONLY public.jogo
    ADD CONSTRAINT fk_genero FOREIGN KEY (idgenero) REFERENCES public.genero(idgenero);
 8   ALTER TABLE ONLY public.jogo DROP CONSTRAINT fk_genero;
       public          postgres    false    209    2730    205            �
           2606    25876    emprestimo fk_idjogador    FK CONSTRAINT     �   ALTER TABLE ONLY public.emprestimo
    ADD CONSTRAINT fk_idjogador FOREIGN KEY (idjogador) REFERENCES public.jogador(idjogador);
 A   ALTER TABLE ONLY public.emprestimo DROP CONSTRAINT fk_idjogador;
       public          postgres    false    2728    214    203            �
           2606    25881    emprestimo fk_idjogo    FK CONSTRAINT     u   ALTER TABLE ONLY public.emprestimo
    ADD CONSTRAINT fk_idjogo FOREIGN KEY (idjogo) REFERENCES public.jogo(idjogo);
 >   ALTER TABLE ONLY public.emprestimo DROP CONSTRAINT fk_idjogo;
       public          postgres    false    2734    214    209            �
           2606    25573    jogo fk_plataforma    FK CONSTRAINT     �   ALTER TABLE ONLY public.jogo
    ADD CONSTRAINT fk_plataforma FOREIGN KEY (idplataforma) REFERENCES public.plataforma(idplataforma);
 <   ALTER TABLE ONLY public.jogo DROP CONSTRAINT fk_plataforma;
       public          postgres    false    209    2732    207            �
           2606    25802    jogadortelefone fk_telefones    FK CONSTRAINT     �   ALTER TABLE ONLY public.jogadortelefone
    ADD CONSTRAINT fk_telefones FOREIGN KEY (idjogador) REFERENCES public.jogador(idjogador);
 F   ALTER TABLE ONLY public.jogadortelefone DROP CONSTRAINT fk_telefones;
       public          postgres    false    212    203    2728            D   /   x�3�4�4�44�7���\F@������������ifr��qqq �Z       ;   1   x�3�
p�2�t�2�,MM*J�MNLJ=�<�˔���ɑ+F��� �
�      9   �   x�M�Mj�0��O��	B��r�KR�E	!`誛�"ڡ��Hv�M�*������y��c���ƞ�1��s�Ȗ��Y�Ϛ�-����tOiQ,�d}Di�g�{n�3�%�7� ����g�WR%�a�-V=8���/&�e�Ɖq����s��[i'�=r#�e�Uw��U��68�sC/��ٛ
�y�a�>���/�Y�      B   6   x����0�7S))�a��?G��N��X�d�A���·�����,��<$?B	=      ?   �   x�e̽�0����U�
L!�ψ������Jl(Դ��[aј3��{c��bՀ���ZB,���ٞ;3i��5�M�_de0"_M�ex��"���^�NI��T~�	b��&[��t�bFcQ6^��)3n(�@��F��8S+�C��*DE!���#�QM~�����1���@�      =   `   x�3�p�P��s�2����+I�K�W03�2��I�,.I,���S0�2�t,I,����s�2��q�q���S0��HʯP063������ 0�      @      x�342�442�*I-.I�� n� g��     