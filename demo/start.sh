#!/bin/bash

# start tomcat locally
cd deployment/playground-app/bin
./startup.sh
# start docker containers
cd ..
docker-compose up --build

