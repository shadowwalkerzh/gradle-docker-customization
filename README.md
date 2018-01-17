**Simple groovy projects and build with brief but elegant gradle configurations, can run with custom dockerfile** 
#### Build Jars
 ```
gradle -PactiveProfile=dev build 
```
or 
```
gradle --project-pro activeProfile=dev build
```
**activeProfile is the active profile of your application and it's a part of your archive jar name**

Then all built projects will be in 
```
outputPath = ${rootDir}/build-repo/${activeProfile}/
```

#### Build Docker Images
Please install [docker](https://docs.docker.com/engine/installation) beforehand if your docker environment is not ready. 
 ```
gradle -PactiveProfile=dev buildAppImage 
```
or 
```
gradle --project-pro activeProfile=dev buildAppImage
```

#### Build Docker Containers 
Will create all service containers automatically. 
 ```
gradle -PactiveProfile=dev buildAppContainer 
```
or 
```
gradle --project-pro activeProfile=dev buildAppContainer
```
List docker containers:
```
docker ps 
```

#### Push Docker Images 
Will push all service docker images to your docker registry automatically.<br/>
Firstly, set your docker registry username and password in file ${rootDir}/docker/docker.key.<br/>
Then run the command:
 ```
gradle -PactiveProfile=dev pushAppImage 
```
or 
```
gradle --project-pro activeProfile=dev pushAppImage
```

#### Run Application with Docker
```
docker run -p8001:8001  -d first-server:1.0-SNAPSHOT
```

Your can manage your dockerfile and docker images with your private docker registry or [docker hub](https://hub.docker.com).
