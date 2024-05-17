Utilizando banco de dados no docker:

1) POSTGRES
docker run -p 5432:5432 -v /tmp/database:/var/lib/postgresql/data -e POSTGRES_PASSWORD=<SENHA> -d postgres

2) PGADMIN
docker run -p 5050:80 --name pgadmin -e PGADMIN_DEFAULT_EMAIL=<EMAIL>  -e PGADMIN_DEFAULT_PASSWORD=<SENHA_PARA_ACESSAR_PGADMIN> -d dpage/pgadmin4

OBS:
docker inspect <id_container> -> ver o ip e colocar no pgadmin

