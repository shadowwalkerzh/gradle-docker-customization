**Simple groovy projects and build with brief but elegant gradle configurations, can run with custom dockerfile** 
#### Build Jar
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

#### Build Docker 
Please install [docker](https://docs.docker.com/engine/installation) beforehand if your docker environment is not ready.<br/>
Build first-server as an example: 
```
cd ${outputPath}/${projectName}
docker build -t first-server:1.0-SNAPSHOT . 
```

#### Run Application with Docker
```
docker run -p8001:8001  -d first-server:1.0-SNAPSHOT
```

Your can manage your dockerfile and docker images with your private docker registry or [docker hub](https://hub.docker.com).
