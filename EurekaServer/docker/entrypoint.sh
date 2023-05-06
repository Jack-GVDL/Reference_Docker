#!/bin/bash

java \
-jar /app/app.jar \
$JAVA_EXTERNAL_ARGS \
-Xms512m \
-Xmx2g \
-XX:MetaspaceSize=128M \
-XX:MaxMetaspaceSize=512M \
-XX:+PrintGCDetails \
-XX:+UseG1GC \
-XX:+PrintGCDateStamps \
-XX:+HeapDumpOnOutOfMemoryError \
-Duser.timezone=GMT+08
