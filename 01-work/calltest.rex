#!/usr/bin/env rexx
--  © Copyright Alan Sampson 2026
/* Rexx */
-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
  parse arg args
  call main args
  exit

usage: procedure
-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
  parse source . . pgm .
  lastslash = pgm~lastpos('/')
  if lastslash = 0 then do
    pgm = './' || pgm
  end
  else do
    pgm = '.' || pgm~substr(lastslash)
  end

  say 'Calls a "NetRexx Pipe" to generate a list of integers'
  say
  say 'Usage:' pgm 'nr'
  say '  where ''nr'' is the number of integers to generate (default 5)' 
  say

  return

exit

-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
-- The main class from the NJPipe program calltest is not runnable.
-- Instead, you must use the class name generated in the 'pipe' statement,
-- 'callt1'. This exec encapsulates the method used to invoke 'callt1'.
-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
main: procedure
  parse arg ct .

  if ct~length = 0 then do
    ct = 5
    call usage
  end

  say '.'~copies(60)
  address system runnrex 'callt1' ct

  exit

