# IManage

# HOW TO RUN

```
    mvn package docker:build
    docker images
    docker run -p 127.0.0.1:8080:8080/tcp <IMAGE_ID>

```
# API's
  ```
  GET localhost:8080/   for get the peek element
  POST localhost:8080/ for adding the element in stack
  DELETE localhost:8080/  for pop the element from stack
  ```