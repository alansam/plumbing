#!/usr/bin/env bash

main() {
  local pager=less
  if [[ -n "$1" ]]; then
    pager="$1"
  fi

  java encode640 | "$pager"
}

main $@

