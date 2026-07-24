#!/usr/bin/env regina
/* Rexx */

pipe_this = "pipe 'diskr length.nrx | length | console'"

say '$' pipe_this
address system pipe_this

