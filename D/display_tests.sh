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
  for i in {1..11}; do
    echo "............................................................"
    local st=$(printf "display_tests%02d.njp" "$i")
    echo "$st"
    pipc "$st" 2>&1
  done

  return
}

run() {
  # -- run with runnrex script
  for i in {1..11}; do
    echo "............................................................"
    local st=$(printf "display_tests%02d" "$i")
    echo "$st"
    runnrex "$st" 2>&1
  done

  return
}

explain() {
  echo
  echo "Usage: $0 [ -c | -r ]"
  echo "  -c : compile the display_tests pipe script"
  echo "  -r : run the display_tests scripts"
  echo

  return
}

main "$@"

