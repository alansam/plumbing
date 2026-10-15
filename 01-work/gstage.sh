#!/usr/bin/env bash

main() {
  local tag

  if [[ -z "$1" ]]; then
    echo "An argument is required."
    echo "usage:"
    echo "  $0 stage_name"
    echo "or"
    echo "  $0 -p stage_prefix"
  else
    if [[ "$1" == "-p" ]]; then
      if [[ -z "$2" ]]; then
        echo "Two arguments are required."
      else
        tag="\<$2"
      fi
    else
      tag="\<$1\>"
    fi
  fi

  if [[ -n "$tag" ]]; then
    tag="$tag.*[\|?]"
    echo "Search string: $tag" 
    echo
    egrep -e "$tag" *.njp > ./tmp/_commando
    pipe -f gstage.njp
  fi
}

main $@

