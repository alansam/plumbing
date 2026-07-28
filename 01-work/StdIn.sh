#!/usr/bin/env bash

# send putput from stdout to a NetRexx Pipe 'console eof' stage
# Pipe is as follows:
#   pipe (fd1 ) console eof '.*' | specs 1-* 10 | console ?

#    eof    input
#    str         fn from user
echo '.*' | cat "$1" - | pipe -f StdIn.njp
echo "RC=$?"

