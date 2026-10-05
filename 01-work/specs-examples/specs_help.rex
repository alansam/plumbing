#!/usr/bin/env rexx
/* Rexx */
  -- trace ?r; nop

  do
    say '>>' 'pipe "literal abc | spec 1-* NR /return data.reverse/ 1 | cons"'
    address system,
      'pipe "literal abc | spec 1-* NR /return data.reverse/ 1 | cons"'
    say '>>' 'pipe "literal abc | spec 1-* NR @rev = data.reverse; return rev@ 1 | cons"'
    address system,
      'pipe "literal abc | spec 1-* NR @rev = data.reverse; return rev@ 1 | cons"'
    say '>>' 'pipe "literal abc | spec 1-* NR %data = data.reverse% 1 | cons"'
    address system,
      'pipe "literal abc | spec 1-* NR %data = data.reverse% 1 | cons"'
    say '>>' 'pipe "spec /abc/ NR /data = data.reverse/ 1 | cons"'
    address system,
      'pipe "spec /abc/ NR /data = data.reverse/ 1 | cons"'

    say
  end

  do
    say '>>' 'pipe "literal abc | spec 1-* NR /counter[7]=counter[7]+1;ret=data.reverse counter[7];return ret/ 1 | cons"'
    address system,
      'pipe "literal abc | spec 1-* NR /counter[7]=counter[7]+1;ret=data.reverse counter[7];return ret/ 1 | cons"'

    say
  end
 
  do
    say '>>' 'pipe "literal abc | spec T:1-* . 1 NR @rev = field[''T''].reverse; return rev@ 1 | cons"'
    address system,
      'pipe "literal abc | spec T:1-* . 1 NR @rev = field[''T''].reverse; return rev@ 1 | cons"'
    say '>>' 'pipe "literal abc | spec T:1-* . t:1 NR @rev = field[''T''].reverse; return rev@ 1 | cons"'
    address system,
      'pipe "literal abc | spec T:1-* . t:1 NR @rev = field[''T''].reverse; return rev@ 1 | cons"'

    say
  end

  do
    say '>>' 'pipe "literal abc | spec T:1-* 10-16, 1.2 NR @rev = field[''T''].reverse; return rev@ 1 | cons"'
    address system,
      'pipe "literal abc | spec T:1-* 10-16, 1.2 NR @rev = field[''T''].reverse; return rev@ 1 | cons"'

    say
  end
  exit

