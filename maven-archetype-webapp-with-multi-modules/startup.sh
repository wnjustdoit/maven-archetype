#!/usr/bin/env bash
echo "The spring-boot-application is starting..."
# -P指定环境
mvn clean install -Plocal
cd module-web/ && mvn spring-boot:run
# 或者 cd module-web/ && mvn exec:java

# 另外,打包类型jar或war,module-web模块的packaging标签就行了


