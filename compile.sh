#!/bin/sh

rm -rf build

#gradle -b conf/build.gradle build
#gradle -b conf/build.gradle appRun
gradle -b conf/build.gradle buildProduct
