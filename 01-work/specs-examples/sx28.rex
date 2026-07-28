#!/usr/bin/env rexx
/* Rexx ADDNAME EXEC - sx28.rex */
parse upper arg nickname .                  /* get input nickname */
-- 'namefind :nick' nickname ':name :phone :userid :node (stack fifo'
nstack. = ''
nicks = 'JOHN CATHY CE NICK DONNA'

RC = namefind(nickname)

if (RC = 0) then do                         /* if nickname exists */
  'pipe "',
  '    literal 'nstack.1' |',
  '    split at ~ |',
  '    specs',                               /* rearrange records */
  '        1-30 1',
  '        read',
  '        1-30 31',
  '        write',
  '        read',
  '        1-8 1 /at/ nextword',
  '        read',
  '        1-8 nextword',
  '        write / / 1 |',
  '    >> sx28PIPE_CONTACTS.a1 ?',        /* write result to file */
  '"'
end
else                                   /* nickname does not exist */
  do                                          /* so issue message */
    say 'Nickname does not exist in your NAMES file.'
    exit 4                                      /* exit with rc=4 */
  end
exit

-- ... ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
namefind: procedure,
  expose nstack. nicks
  scd = 0
  parse arg nik .
  nms.0 = 0
  if wordpos(nik, nicks) = 0 then scd = 4

  parse var nicks JOHN CATHY CE NICK DONNA .
-- 'namefind :nick' nickname ':name :phone :userid :node (stack fifo'
  -- ... ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
  nms.JOHN  =,
   'John Heart'     || '~' || '2156' || '~' || 'JOHNH'  || '~' || 'NYVM3'
  nms.CATHY =,
   'Cathy Peterson' || '~' || '2533' || '~' || 'CATHYP' || '~' || 'NYVM1'
  nms.CE    =,
   'Cecilia Smith'  || '~' || '2589' || '~' || 'SMITHC' || '~' || 'NYVM1'
  nms.NICK  =,
   'Nick Johnson'   || '~' || '2789' || '~' || 'NICKJ'  || '~' || 'NYVM2'
  nms.DONNA =,
   'Donna Jones'    || '~' || '2475' || '~' || 'DJ'     || '~' || 'NYVM2'

  nstack.0 = 1
  nstack.1 = nms.nik
--nstack.1 = translate(nstack.1, '^', ' ')

  return scd

/*
  nstack.JOHN  = ':nick.JOHN' ,
                 ':userid.JOHNH' ,
                 ':node.NYVM3' ,
                 ':notebook.PIPE' ,
                 ':name.John Heart' ,
                 ':phone.2156'
  nstack.CATHY = ':nick.CATHY' ,
                 ':userid.CATHYP' ,
                 ':node.NYVM1' ,
                 ':notebook.TOOLS' ,
                 ':name.Cathy Peterson' ,
                 ':phone.2533'
  nstack.CE    = ':nick.CE' ,
                 ':userid.SMITHC' ,
                 ':node.NYVM1' ,
                 ':notebook.' ,
                 ':name.Cecilia Smith', 
                 ':phone.2589'
  nstack.NICK  = ':nick.NICK' ,
                 ':userid.NICKJ' ,
                 ':node.NYVM2' ,
                 ':notebook.' ,
                 ':name.Nick Johnson' ,
                 ':phone.2789'
  nstack.DONNA = ':nick.DONNA' ,
                 ':userid.DJ' ,
                 ':node.NYVM2' ,
                 ':notebook.PIPE' ,
                 ':name.Donna Jones' ,
                 ':phone.2475'
 */

/*
 ... ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
:nick.JOHN     :userid.JOHNH    :node.NYVM3           :notebook.PIPE
         :name.John Heart                       :phone.2156

:nick.CATHY    :userid.CATHYP   :node.NYVM1           :notebook.TOOLS
         :name.Cathy Peterson                   :phone.2533

:nick.CE       :userid.SMITHC   :node.NYVM1
         :name.Cecilia Smith                    :phone.2589

:nick.NICK     :userid.NICKJ    :node.NYVM2
         :name.Nick Johnson                     :phone.2789

:nick.DONNA    :userid.DJ       :node.NYVM2           :notebook.PIPE
         :name.Donna Jones                      :phone.2475
*/

