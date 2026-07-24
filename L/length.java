/* Generated from 'length.nrx' 21 Jun 2026 12:40:24 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Trace2 Verbose3 */

/* NetRexx */






public class length extends org.netrexx.njpipes.pipes.stage{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(12);
 private static final java.lang.String $0="length.nrx";

 
 
 @SuppressWarnings("unchecked") 
 public void run() throws org.netrexx.njpipes.pipes.ThreadQ{
  netrexx.lang.Rexx line=null;
  netrexx.lang.Rexx l=null;
  int rc=0;
  {try{
   {for(;;){
    line=(netrexx.lang.Rexx)(peekto());
    l=line.length();
    output((java.lang.Object)(((l.right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0))).OpCcblank(null,l.d2x().right(new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)0)))).OpCcblank(null,line)));
    readto();
    }
   }
  }
  catch (org.netrexx.njpipes.pipes.StageError $1){
   rc=rc();
  }}
  
  exit(new netrexx.lang.Rexx(rc).OpMult(null,new netrexx.lang.Rexx((new netrexx.lang.Rexx(rc).OpNotEq(null,$01)))).toint());
  return;}
 
 
 public length(){return;}
 }
