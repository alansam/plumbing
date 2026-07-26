#!/usr/bin/env bash

for pj in nr0*.njp
do
  echo "running pipe $pj >>>"
  time (pipe -f "$pj")
  echo -e "<<<\n\n"
done

