#!/usr/bin/env regina
/* Rexx */

do nr = 1 to 9
  say copies('.', 60)
  run_this = "runnrex lookupt" || nr

  say '$' run_this
  address system run_this
  say
end nr

