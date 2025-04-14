#!/bin/sh
# ----------------------------------------------------------------------------
# Maven Wrapper
# ----------------------------------------------------------------------------

MVN_EXEC="./.mvn/wrapper/maven-wrapper.jar"
JAVA_CMD=$(which java)

exec "$JAVA_CMD" -jar "$MVN_EXEC" "$@"
