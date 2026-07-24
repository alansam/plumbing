#!/usr/bin/env bash

main() {
  case $1 in
    "-c" | "-C" )
      compile
      ;;

    "-r" | "-R" )
      run
      ;;

    *)
      explain
      ;;
  esac

  return
}

compile() {
  echo "Compile"
  # -- copmpile with pipc
  for i in {1..12}; do
    echo "................................................................................"
    local st="hbntest$i.njp"
    echo "$st"
    pipc "$st" 2>&1
  done

  return
}

run() {
  # -- run with runnrex script
  for i in {1..12}; do
    echo "................................................................................"
    local st="hbntest$i"
    echo "$st"
    runnrex "$st" 2>&1
  done

  return
}

explain() {
  echo
  echo "Usage: $0 [ -c | -r ]"
  echo "  -c : compile the hbntest pipe scripts"
  echo "  -r : run the hbntest scripts"
  echo

  return
}

main "$@"

