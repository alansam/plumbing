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
  local st="deblocktest.njp"
  echo "$st"
  pipc "$st" 2>&1

  return
}

run() {
  # -- run with runnrex script
  for i in {1..10}; do
    echo "............................................................"
    local st=$(printf "deblockt%02d" "$i")
    echo "$st"
    runnrex "$st" 2>&1
  done

  return
}

explain() {
  echo
  echo "Usage: $0 [ -c | -r ]"
  echo "  -c : compile the deblocktest pipe script"
  echo "  -r : run the deblocktNN scripts"
  echo

  return
}

main "$@"

