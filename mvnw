#!/bin/sh
###############################################################################
## Maven Wrapper bootstrap script for UNIX-based systems
###############################################################################

MVN_DIR="$(cd "$(dirname "$0")" && pwd)"
MVN_WRAPPER_JAR="$MVN_DIR/.mvn/wrapper/maven-wrapper.jar"

if [ ! -f "$MVN_WRAPPER_JAR" ]; then
  echo "Missing Maven wrapper JAR: $MVN_WRAPPER_JAR"
  exit 1
fi

exec java -jar "$MVN_WRAPPER_JAR" "$@"
