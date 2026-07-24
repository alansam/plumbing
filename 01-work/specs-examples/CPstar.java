/* Generated from 'CPstar.nrx' 18 Jul 2026 22:40:36 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Trace2 Verbose3 */

/* NetRexx Pipes */

// . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8



public class CPstar{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("cons");
 private static final java.lang.String $0="CPstar.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx dlm;
  dlm=netrexx.lang.Rexx.toRexx("....o....O....o....O....o....O....o....O....o....O....o....O");
  
  netrexx.lang.RexxIO.Say(dlm);
  netrexx.lang.RexxIO.Say("pipe \000");
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("< CPstar.nrx |").OpCcblank(null,netrexx.lang.Rexx.toRexx("spec 1-* 1 /*/ next | "))).OpCcblank(null,$01));
  
  
  
  
  {try{
  netrexx.lang.RexxAddress.execAddress("pipe","< CPstar.nrx | spec 1-* 1 /*/ next | cons", (Object)null,(Object)null,0,(Object)null,0);
  }catch (java.io.IOException $01){
  netrexx.lang.RexxIO.Say("     +++ Error: IOException '"+$01.getMessage()+"' occurred during ADDRESS invocation");
  }catch (java.lang.InterruptedException $01){
  netrexx.lang.RexxIO.Say("     +++ Error: InterruptedException occurred during ADDRESS invocation");
  }}
  
  netrexx.lang.RexxIO.Say(netrexx.lang.RexxAddress.RC().toString());
  
  {System.exit(netrexx.lang.Rexx.toRexx(netrexx.lang.RexxAddress.RC().toString()).toint());return;}
  }
 
 
 private CPstar(){return;}
 }
