#!/usr/bin/env bash
clear
mvn -B verify;
echo "Type your commit: "
read msg;
git add .
git commit -m "$msg";
git push origin master;
