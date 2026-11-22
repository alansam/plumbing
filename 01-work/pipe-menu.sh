#!/usr/bin/env bash

main() {
  local jar='01-work.jar'
  local jardir='/Users/alansampson/usr/src/target/plumbing/01-work'

  pushd "$jardir" > /dev/null

  CLASSPATH="$jar:$CLASSPATH"

  if [[ -z "$1" ]]; then
    java jar_stages | bat
  else
    java jar_stages | less
  fi

  popd > /dev/null
}

main $@

