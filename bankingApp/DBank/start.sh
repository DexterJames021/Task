#run on local

sudo systemctl stop apache2.service
sudo /opt/lampp/lampp start
./mvnw spring-boot:run