docker login
docker version
exit
clear
id -nG
docker login
docker pull deniffelio/use-case
echo "docker pull deniffelio/use-case" > pull
docker run -p 8080:8080 deniffelio/use-case
docker run -p 8080:80 deniffelio/use-case
docker run -p 9010:80 deniffelio/use-case
docker run -d -p 9010:80 deniffelio/use-case
echo "docker run -d -p 9010:80 deniffelio/use-case" run
echo "docker run -d -p 9010:80 deniffelio/use-case" > run
ls
chmod +x pull 
chmod +x run 
docker stop deniffelio/use-case
docker rm $(docker stop $(docker ps -a -q --filter ancestor=<image-name> --format="{{.ID}}"))
docker rm $(docker stop $(docker ps -a -q --filter ancestor=deniffelio/use-case --format="{{.ID}}"))
echo "docker rm $(docker stop $(docker ps -a -q --filter ancestor=deniffelio/use-case --format="{{.ID}}"))" > stop
git init
git remote add origin https://github.com/tom-010/useCase.git
git checkout server
git checkout -b server
git add .
git commit -m "Basic docker scripts"
git push orign master
git push origin master
git push origin server
clear
ls
chmod +x stop 
nano upgrade
chmod +x upgrade 
ls
./upgrade 
git add .
git commit -m "upgrade script"
git config --global user.name "Thomas Deniffel"
git config --global user.email "tom-010@web.de"
git push origin server
exit
