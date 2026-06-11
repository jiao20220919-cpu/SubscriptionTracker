#!/bin/sh
# Gradle wrapper script

APP_HOME=$(cd "$(dirname "$0")" && pwd)
JAR_FILE="$APP_HOME/gradle/wrapper/gradle-wrapper.jar"

if [ ! -f "$JAR_FILE" ]; then
    echo "ERROR: Missing $JAR_FILE"
    exit 1
fi

exec java -cp "$JAR_FILE" org.gradle.wrapper.GradleWrapperMain "$@"
