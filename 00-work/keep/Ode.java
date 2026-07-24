/* Generated from 'Ode.nrx' 21 Jun 2026 02:20:18 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Trace2 Verbose3 */

/* NetRexx */


// . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8


public class Ode{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx("NetRexx 5.10 20 Mar 2026");
 private static final char[] $02={1,10,1,0,0};
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx("Java method Ode.nrx");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('\'');
 private static final netrexx.lang.Rexx $05=netrexx.lang.Rexx.toRexx("version:");
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx("source:");
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(':');
 private static final java.lang.String $0="Ode.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx arg;
  netrexx.lang.Rexx ver=null;
  netrexx.lang.Rexx src=null;
  netrexx.lang.Rexx anon;
  netrexx.lang.Rexx bump;
  netrexx.lang.Rexx line=null;
  
  arg=new netrexx.lang.Rexx(args);
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse($01,$02,$1);
  ver=$1[0];}
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse($03,$02,$2);
  src=$2[0];}
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("progrem args:").OpCcblank(null,$04)).OpCc(null,arg)).OpCc(null,$04));
  netrexx.lang.RexxIO.Say($05.OpCcblank(null,ver));
  netrexx.lang.RexxIO.Say($06.OpCcblank(null,src));
  
  anon=netrexx.lang.Rexx.toRexx("");
  anon.getnode(new netrexx.lang.Rexx((byte)0)).leaf=new netrexx.lang.Rexx((byte)0);
  bump=(anon.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$07);
  anon.getnode(new netrexx.lang.Rexx((byte)0)).leaf=bump; // A Midsummer Night's Dream
  anon.getnode(bump).leaf=netrexx.lang.Rexx.toRexx("\'The course of true love never did run smooth\' -- A Midsummer Night\'s Dream");
  bump=(anon.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$07);
  anon.getnode(new netrexx.lang.Rexx((byte)0)).leaf=bump; // dream
  anon.getnode(bump).leaf=netrexx.lang.Rexx.toRexx("\'Love looks not with the eyes, but with the mind; and therefore is winged Cupid painted blind\' -- dream");
  bump=(anon.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$07);
  anon.getnode(new netrexx.lang.Rexx((byte)0)).leaf=bump; // as you like it
  anon.getnode(bump).leaf=netrexx.lang.Rexx.toRexx("\'All the world\'s a stage, and all the men and women merely players\' -- As You Like It");
  bump=(anon.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$07);
  anon.getnode(new netrexx.lang.Rexx((byte)0)).leaf=bump; // Hamlet
  anon.getnode(bump).leaf=netrexx.lang.Rexx.toRexx("\'There is nothing either good or bad, but thinking makes it so\' -- Hamlet");
  bump=(anon.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$07);
  anon.getnode(new netrexx.lang.Rexx((byte)0)).leaf=bump; // The Tempest
  anon.getnode(bump).leaf=netrexx.lang.Rexx.toRexx("\'We are such stuff as dreams are made on, and our little life is rounded with a sleep\' -- The Tempest");
  bump=(anon.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpAdd(null,$07);
  anon.getnode(new netrexx.lang.Rexx((byte)0)).leaf=bump; // As You Like It
  anon.getnode(bump).leaf=netrexx.lang.Rexx.toRexx("\'The fool doth think he is wise, but the wise man knows himself to be a fool\' -- As You Like It");
  
  {int $5=0;java.util.Vector $4=new java.util.Vector(100,0);synchronized(anon){java.util.Enumeration $3=anon.keys();for(;;){if(!$3.hasMoreElements())break;$4.addElement($3.nextElement());if(!anon.testnode((netrexx.lang.Rexx)($4.elementAt($5)))){$4.removeElementAt($5);continue;}$5++;}}line:for(;;){if(--$5<0)break;line=(netrexx.lang.Rexx)$4.elementAt($5);
   if (line.OpEq(null,$08)) 
    continue line;
   netrexx.lang.RexxIO.Say(((line.right(new netrexx.lang.Rexx((byte)3))).OpCc(null,$09)).OpCcblank(null,anon.getnode(line).leaf));
   }
  }/*line*/
  
  return;
  }
 
 
 private Ode(){return;}
 }
