#!/usr/bin/env rexx
/* Rexx RAIN EXEC A1 - sx25.rex */

-- Note substitute ASCII x2a for EBCDIC x5c for '*' |
'pipe',
  ' "',
  'literal The rain'||,      /* write "The rain" to input of SPECS */
  '| specs pad + 1-* 5 /in Spain/ nextword x2a 25'||, /* rearrange */
  '| console',                          /* and display at terminal */
  '"'

