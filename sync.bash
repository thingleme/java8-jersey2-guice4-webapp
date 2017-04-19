#!/usr/bin/env bash

set -euo pipefail
IFS=$'\n\t'

mvn clean compile archetype:create-from-project

rsync -av --delete --progress --exclude=.git --exclude=.gitignore --exclude=README.md --exclude=LICENSE.txt --exclude=.idea target/generated-sources/archetype/ ../java8-jersey2-guice4-webapp-archetype/

rm -rf ../java8-jersey2-guice4-webapp-archetype/target
rm -rf ../java8-jersey2-guice4-webapp-archetype/src/test

find ../java8-jersey2-guice4-webapp-archetype/ -type f -exec dos2unix {} \;
