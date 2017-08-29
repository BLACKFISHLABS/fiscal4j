#!/usr/bin/env bash

clear
mvn versions:set -DnewVersion=$1;
git commit -a -m "Gerada versão $1";
git push origin master;
git tag $1;
git push --tags;