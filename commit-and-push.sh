#!/usr/bin/env bash
clear
mvn clean install;
echo "Type your commit: "
read msg;
git commit -a -m "$msg";
git push origin master;
