#!/usr/bin/env rexx
/* --- Rexx ------------------------------------------------------- */
-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
/*
 +-----------------------------------------------------------------
 +
 +  © Copyright Alan Sampson 2026
 +
 +-----------------------------------------------------------------
 +
 +  Exec:         askii3.rex
 +  Created by:   alansampson on 2026/11/16 10:12:30.
 +  Description:
 +
 +-----------------------------------------------------------------

  Add Use information here.
?*
?* Prefix all display lines with a "??" in columns 1-2.
?* Formal comments should be prefixed with "?*".
?* To terminate, place a "?!" in columns 1-2.
?*
?? askii3.rex
??
?? Produce a report of all the ASCII characters from 0x00 (0, 0/0)
?? to 0x7F (127, 7/15) using the 'ascii' system command.
??
?? >-- rexx askii3.rex --------------------------><
??                      +- : Parms -+
??
??     Parms:
??  +-------------------------------------:
??  +-(--------------------------------+
??      +- ? ----+ +-DEBUG -+ +- ) -+
??      +- HELP -+
??
??  Parms:
??    ? or HELP
??      Show this usage information.
??
??    DEBUG
??      Enable REXX interactive debug.
??
??
??
??
?!

 ------------------------------------------------------------------
 */
Do  /* --- Main --- */

  Boolean = "true false"
  True = (1 == 1)
  False = \True

  Parse arg pgmArgs
  pgmArgs = strip(pgmArgs, "B", "'")

  Parse upper var pgmArgs argStr '(' parmStr ')'
  If wordpos("DEBUG", parmStr) \= 0,
  then,
    Trace "?i"; Nop

  If wordpos("?", parmStr) \= 0,
   | wordpos("HELP", parmStr) \= 0,
  then,
    Call displayUseInformation

  /* Load RexxUtil function package */
  Call RxFuncAdd 'SysLoadFuncs', 'rexxutil', 'SysLoadFuncs'
  Call SysLoadFuncs

  /* -- Enter REXX code here -- */

  loop _c1 = 0 to 7
    loop _c2 = 0 to 15
      axxi. = '*GRONK!*'
      commando = 'ascii' _c1'/'_c2
      address system commando with output replace stem axxi.
      loop _ax = 1 to axxi.0
        say '   ' || axxi._ax
      end _ax
    end _c2
  end _c1

  /* Discard function packages */
  Call SysDropFuncs

  Return
End  /* --- Main --- */
Exit

/*%Page
 +-----------------------------------------------------------------
 +  Subroutines
 +-----------------------------------------------------------------
 */
displayUseInformation:
Procedure,
  expose (Boolean)
Do  /* --- Subroutine --- */

  Do _i = 1 to sourceline()
    Parse value sourceline(_i) with _? 3 _text
    Select
      When _? = "??",  /* Help text line  */
      then,
        Say _text

      When _? = "?*",  /* Help comment    */
      then,
        Iterate _i

      When _? = "?!",  /* Help terminator */
      then,
        Leave _i

      Otherwise,
        Iterate _i
    End  /* select */
  End _i
  Drop _i

  Exit 0
End  /* --- Subroutine --- */
Exit

/*
 +-----------------------------------------------------------------
 +  End of module
 +-----------------------------------------------------------------
 */
