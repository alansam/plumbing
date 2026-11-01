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
 +  Exec:         zdatatypes.rex
 +  Created by:   alansampson on 2026/10/29 13:12:51.
 +  Description:
 +
 +-----------------------------------------------------------------

  Add Use information here.
?*
?* Prefix all display lines with a "??" in columns 1-2.
?* Formal comments should be prefixed with "?*".
?* To terminate, place a "?!" in columns 1-2.
?*
?? zdatatypes.rex
??
?? >-- rexx zdatatypes.rex --------------------------><
??                          +- : Parms -+
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

    tv = '101 109 10A a0A b10 q10 xa0 ABC abc aBc _3X 1.4 a1.4 1 0 . ? ! _ $ # @ ~ $10.0 $10'

    say '~'~copies(60)
    loop _v = 1 to tv~words()
      vw = tv~word(_v)~strip()
      say (''''vw'''')~right(8) showtype(vw)
    end _v
    say

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

-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
showtype:
  procedure
Do
  Parse arg dt .

    types = ''
    dt = dt~strip()
    if dt~datatype('A') == 1 then
      types = types || 'Alphabetic '
    if dt~datatype('B') == 1 then
      types = types || 'Binary '
    if dt~datatype('I') == 1 then
      types = types || 'Internal_whole_number '
    if dt~datatype('L') == 1 then
      types = types || 'Lowercase '
    if dt~datatype('M') == 1 then
      types = types || 'Mixedcase '
    if dt~datatype('N') == 1 then
      types = types || 'Number '
    if dt~datatype('O') == 1 then
      types = types || 'lOgical '
    if dt~datatype('S') == 1 then
      types = types || 'Symbol '
    if dt~datatype('U') == 1 then
      types = types || 'Uppercase '
    if dt~datatype('V') == 1 then
      types = types || 'Variable '
    if dt~datatype('W') == 1 then
      types = types || 'Whole_number '
    if dt~datatype('X') == 1 then
      types = types || 'heXadecimal '
    if dt~datatype('9') == 1 then
      types = types || '9_digits '

    return types
End
Exit

-- . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8

/*
 +-----------------------------------------------------------------
 +  End of module
 +-----------------------------------------------------------------
 */

