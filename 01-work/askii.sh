#!/usr/bin/env bash

main() {
  local zc
  local ac

  for zc in {0..7}; do
    for ac in {0..15}; do
      ascii "$zc/$ac"
    done
  done
}

main $@

