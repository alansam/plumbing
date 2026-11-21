#!/usr/bin/env bash

main() {
  local dlm="~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
  local sh

  for sh in data/shag/*.a1; do
    echo "$dlm"
    echo "$sh"
    java viggy_pretty_counter "$sh"
    echo
  done
}

main $@

