/* Generated from 'ChunkyFun.nrx' 21 Jun 2026 16:22:51 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Trace2 Verbose3 */
package org.netrexx;

/* NetRexx */




// . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8


public class ChunkyFun{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx("NetRexx 5.10 20 Mar 2026");
 private static final char[] $02={1,10,1,0,0};
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx("Java method ChunkyFun.nrx");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('\'');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $06=netrexx.lang.Rexx.toRexx(" bean:");
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx(", \000");
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx(" size:");
 private static final netrexx.lang.Rexx $09=netrexx.lang.Rexx.toRexx("valid:");
 private static final netrexx.lang.Rexx $010=netrexx.lang.Rexx.toRexx(" name:");
 private static final java.lang.String $0="ChunkyFun.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx arg;
  netrexx.lang.Rexx ver=null;
  netrexx.lang.Rexx src=null;
  org.netrexx.ChunkyBean bean[];
  org.netrexx.ChunkyBean bn=null;
  netrexx.lang.Rexx status=null;
  arg=new netrexx.lang.Rexx(args);
  
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse($01,$02,$1);
  ver=$1[0];}
  {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[1];
  netrexx.lang.RexxParse.parse($03,$02,$2);
  src=$2[0];}
  
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("callers args:").OpCcblank(null,$04)).OpCc(null,arg)).OpCc(null,$04));
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("     version:").OpCcblank(null,$04)).OpCc(null,ver)).OpCc(null,$04));
  netrexx.lang.RexxIO.Say(((netrexx.lang.Rexx.toRexx("      source:").OpCcblank(null,$04)).OpCc(null,src)).OpCc(null,$04));
  netrexx.lang.RexxIO.Say("");
  
  bean=new org.netrexx.ChunkyBean[]{new org.netrexx.ChunkyBean(netrexx.lang.Rexx.toRexx("I am an kween bean"),new netrexx.lang.Rexx((byte)10),new netrexx.lang.Rexx((short)1000)),new org.netrexx.ChunkyBean(netrexx.lang.Rexx.toRexx("I am but an \'umble bumble bean"),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((short)1005)),new org.netrexx.ChunkyBean(netrexx.lang.Rexx.toRexx("I am an superior bean"),new netrexx.lang.Rexx((byte)20),new netrexx.lang.Rexx((short)2500)),new org.netrexx.ChunkyBean(netrexx.lang.Rexx.toRexx("I am an buzzy worker bean"),new netrexx.lang.Rexx((byte)15),new netrexx.lang.Rexx((short)1010)),new org.netrexx.ChunkyBean(netrexx.lang.Rexx.toRexx("I am an baked bean, dude"),new netrexx.lang.Rexx((byte)11),new netrexx.lang.Rexx((short)1020)),new org.netrexx.ChunkyBean(),new org.netrexx.ChunkyBean()};
  
  
  
  
  
  
  
  
  bean[5]=new org.netrexx.ChunkyBean(bean[1]);
  bean[5].setID((bean[1].getID()).OpAdd(null,$05));
  bean[5].setSize((bean[1].getSize()).OpSub(null,$05));
  
  netrexx.lang.RexxIO.Say(new netrexx.lang.Rexx('.').copies(new netrexx.lang.Rexx((byte)60)));
  {int $5=0;org.netrexx.ChunkyBean[] $4=new org.netrexx.ChunkyBean[bean.length];synchronized(bean){for(;;){if($5==$4.length)break;$4[$5]=bean[bean.length-1-$5];$5++;}}bn:for(;;){if(--$5<0)break;bn=(org.netrexx.ChunkyBean)$4[$5];
   if (bn.isValid()) 
    status=netrexx.lang.Rexx.toRexx("true");
   else 
    status=netrexx.lang.Rexx.toRexx("false");
   
   netrexx.lang.RexxIO.Say(($06.OpCcblank(null,bn.getID().right(new netrexx.lang.Rexx((byte)5)))).OpCc(null,$07));
   netrexx.lang.RexxIO.Say(($08.OpCcblank(null,bn.getSize().right(new netrexx.lang.Rexx((byte)3)))).OpCc(null,$07));
   netrexx.lang.RexxIO.Say(($09.OpCcblank(null,status.right(new netrexx.lang.Rexx((byte)5)))).OpCc(null,$07));
   netrexx.lang.RexxIO.Say($010.OpCcblank(null,bn.getName()));
   }
  }/*bn*/
  netrexx.lang.RexxIO.Say("");
  
  netrexx.lang.RexxIO.Say(new netrexx.lang.Rexx('.').copies(new netrexx.lang.Rexx((byte)60)));
  {int $8=0;org.netrexx.ChunkyBean[] $7=new org.netrexx.ChunkyBean[bean.length];synchronized(bean){for(;;){if($8==$7.length)break;$7[$8]=bean[bean.length-1-$8];$8++;}}bn:for(;;){if(--$8<0)break;bn=(org.netrexx.ChunkyBean)$7[$8];
   netrexx.lang.RexxIO.Say(bn.toString());
   }
  }/*bn*/
  netrexx.lang.RexxIO.Say("");
  
  return;
  }
 
 
 private ChunkyFun(){return;}
 }
