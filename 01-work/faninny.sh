#!/usr/bin/env bash

main() {
  egrep -e '\<fanin\>' *.njp > ./tmp/_commando

  pipe -f faninny.njp
}

main $@

