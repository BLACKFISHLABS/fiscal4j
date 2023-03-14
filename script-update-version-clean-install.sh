#!/usr/bin/env bash
clear
mvn versions:set -DnewVersion=4.5.0-RELEASE
mvn versions:commit
mvn clean install -U