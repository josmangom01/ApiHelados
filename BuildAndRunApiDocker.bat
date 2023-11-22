set MYSQL_IP=127.0.0.1:33061
cd .\heladosRest
call mvnw.cmd package
cd ..
docker build -t api-rest .\heladosRest
docker run --name=Helados -e MYSQL_IP=172.17.0.2 -p8080:8080 -d api-rest:latest
