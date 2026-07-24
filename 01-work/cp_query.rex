#!/usr/bin/env regina
/* Rexx */
--  © Copyright Alan Sampson 2026

apar. = ''
ix = 0
ix = ix + 1; apar.0 = ix; apar.ix = 'APAR      PTF'
ix = ix + 1; apar.0 = ix; apar.ix = 'VM10000   IA29000'
ix = ix + 1; apar.0 = ix; apar.ix = 'VM69104   IA29210'
ix = ix + 1; apar.0 = ix; apar.ix = 'VM50000   IA39000'
ix = ix + 1; apar.0 = ix; apar.ix = 'VM61000   IA79000'
ix = ix + 1; apar.0 = ix; apar.ix = 'VM61035   IA79101'
ix = ix + 1; apar.0 = ix; apar.ix = 'VM62000   IA78000'
ix = ix + 1; apar.0 = ix; apar.ix = 'VM63000   IA77000'
ix = ix + 1; apar.0 = ix; apar.ix = 'VM65655   IA77032'
ix = ix + 1; apar.0 = ix; apar.ix = 'VM64000   IA76000'
ix = ix + 1; apar.0 = ix; apar.ix = 'VM62036   IA76101'
ix = ix + 1; apar.0 = ix; apar.ix = 'VM65000   IA75000'
ix = ix + 1; apar.0 = ix; apar.ix = 'VM64379   IA75010'
ix = ix + 1; apar.0 = ix; apar.ix = 'VM66000   IA74000'

do ix = 1 to apar.0
  say apar.ix
end ix

exit

