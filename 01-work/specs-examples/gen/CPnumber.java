/* Generated from 'CPnumber.nrx' 18 Jul 2026 23:21:35 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Trace2 Verbose3 */

/* NetRexx Pipes */

// . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8



public class CPnumber{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("cons");
 private static final java.lang.String $0="CPnumber.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx dlm;
  dlm=netrexx.lang.Rexx.toRexx("....o....O....o....O....o....O....o....O....o....O....o....O");
  
  netrexx.lang.RexxIO.Say(dlm);
  netrexx.lang.RexxIO.Say("pipe \000");
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("< CPnumber.nrx |").OpCcblank(null,netrexx.lang.Rexx.toRexx("spec number from 0 strip 1 1-* nextword |"))).OpCcblank(null,$01));
  
  
  
  
  {try{
  netrexx.lang.RexxAddress.execAddress("pipe",(netrexx.lang.Rexx.toRexx("< CPnumber.nrx |").OpCcblank(null,netrexx.lang.Rexx.toRexx("spec number from 0 strip 1 1-* nextword |"))).OpCcblank(null,$01), (Object)null,(Object)null,0,(Object)null,0);
  }catch (java.io.IOException $01){
  netrexx.lang.RexxIO.Say("     +++ Error: IOException '"+$01.getMessage()+"' occurred during ADDRESS invocation");
  }catch (java.lang.InterruptedException $01){
  netrexx.lang.RexxIO.Say("     +++ Error: InterruptedException occurred during ADDRESS invocation");
  }}
  
  
  
  netrexx.lang.RexxIO.Say(netrexx.lang.RexxAddress.RC().toString());
  
  {System.exit(netrexx.lang.Rexx.toRexx(netrexx.lang.RexxAddress.RC().toString()).toint());return;}
  }
 
 
 private CPnumber(){return;}
 }
