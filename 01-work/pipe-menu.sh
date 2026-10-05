#!/usr/bin/env bash

jar='01-work.jar'
jardir='/Users/alansampson/usr/src/target/plumbing/01-work'

pushd "$jardir"

CLASSPATH="$jar:$CLASSPATH"

if [[ -z "$1" ]]; then
  java jar_stages | bat
else
  java jar_stages | less
fi

popd

