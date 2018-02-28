#!/usr/bin/env bash
clear
mvn -B verify;
echo "Type your commit: "
read msg;
git commit -a -m "$msg";
git push origin master;
