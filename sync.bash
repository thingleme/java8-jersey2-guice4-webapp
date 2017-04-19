#!/usr/bin/env bash

set -euo pipefail
IFS=$'\n\t'

mvn clean compile archetype:create-from-project

rsync -av --delete --progress --exclude=.git target/generated-sources/archetype/ ../java8-jersey2-guice4-webapp-archetype/
