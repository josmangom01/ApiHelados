
docker build -t mysql_custom .\docker_db
docker volume create mysql-db-data
docker run --name mysql_DB -p 33061:3306 -d --mount src=mysql-db-data,dst=/var/lib/mysql mysql_custom

