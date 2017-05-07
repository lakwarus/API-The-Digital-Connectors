### This repository contains Demo setup for workshop APIs: The Digital Connectors

## Pre-requisites

 * Docker 
 * Docker compose

#### Docker installation for linux
```
wget -qO- https://get.docker.com/ | sh
```

#### Docker installation for Mac

https://docs.docker.com/docker-for-mac/

#### Docker installation for Windows

https://docs.docker.com/docker-for-windows/

#### Docker Compose Installation

https://docs.docker.com/compose/install/


#### How to run

Go inside to deployment directory and issue following commands

```docker login docker.wso2.com ```

```docker-compose up --build -d ```

This will deploy the following,

* Mysql server (container) with apimdb, userdb, regdb
* APIM Container
* APIM Analytics Container
* WSO2 Identity Server as Keymanager
* Tomcat with sample web apps
* Sample micro service Container


#### How to test

Add the following entries to the /etc/hosts
```
127.0.0.1 api-manager is-key-manager apim_rdbms people-service
```
If you are using docker machine, please use the docker machine IP instead of the local maGchine IP.

#### How to access the environment

Publisher

```
https://api-manager/publisher
```

Store

```
https://api-manager/store/
```

Identity Server

```
https://is-key-manager:9443
```
