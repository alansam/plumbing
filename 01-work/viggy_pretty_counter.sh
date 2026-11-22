#!/usr/bin/env bash
# word count (wc) for Vigenère cipher pretty printer

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

