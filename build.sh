#!/usr/bin/env bash
echo "building is starting..."
cd maven-archetype-simple/
mvn archetype:create-from-project
cd target/generated-sources/archetype/
mvn clean install

cd ../maven-archetype-webapp/
mvn archetype:create-from-project
cd target/generated-sources/archetype/
mvn clean install

cd ../maven-archetype-webapp-with-multi-modules/
mvn archetype:create-from-project
cd target/generated-sources/archetype/
mvn clean install


