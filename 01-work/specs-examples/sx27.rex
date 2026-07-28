#!/usr/bin/env rexx
/* Rexx TRANSACT EXEC - sx27.rex*/
'pipe "(endchar ?)',
  '< sx27BANKACCT_FILE.a1',               /* read BANKACCT FILE */
  '| s: specs',                             /* rearrange record */
    'select 1',                        /* select input stream 1 */
    '1.9 1.9 right',    /* copy and right justify 1st 9 columns */
    '/transferred to/ nextword',     /* append "transferred to" */
    'select 0',                          /* select input stream */
    'words1.2 nextword',       /* append 1st 2 words from input */
  '| > sx27TRANSACT_FILE.a1', /* write resulting record to file */
  '?',                              /* start of second pipeline */
  '< sx27AMOUNT_FILE.a1',                   /* read AMOUNT FILE */
  '| s:',                   /* define secondary input for SPECS */
  '"'

