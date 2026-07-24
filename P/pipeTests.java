/* Generated from 'pipeTests.nrx' 21 Jun 2026 17:05:29 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Trace2 Verbose3 */

/* NetRexx */


/* a set of tests for the Pipelines component of NetRexx */



public class pipeTests{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("failed RC=");
 private static final java.lang.String $0="pipeTests.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){ // command
  {try{
  netrexx.lang.RexxAddress.execAddress("SYSTEM","ls -laF", (Object)null,(Object)null,0,(Object)null,0);
  }catch (java.io.IOException $01){
  netrexx.lang.RexxIO.Say("     +++ Error: IOException '"+$01.getMessage()+"' occurred during ADDRESS invocation");
  }catch (java.lang.InterruptedException $01){
  netrexx.lang.RexxIO.Say("     +++ Error: InterruptedException occurred during ADDRESS invocation");
  }} // 'll'
  
  if (netrexx.lang.Rexx.toRexx(netrexx.lang.RexxAddress.RC().toString()).OpNotEq(null,$01)) 
   netrexx.lang.RexxIO.Say($02.OpCcblank(null,netrexx.lang.Rexx.toRexx(netrexx.lang.RexxAddress.RC().toString())));
  return;}
 
 
 private pipeTests(){return;}
 }
