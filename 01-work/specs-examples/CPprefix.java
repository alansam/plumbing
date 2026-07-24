/* Generated from 'CPprefix.nrx' 18 Jul 2026 23:19:54 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Trace2 Verbose3 */

/* NetRexx Pipes */

// . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8



public class CPprefix{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("cons");
 private static final java.lang.String $0="CPprefix.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx dlm;
  dlm=netrexx.lang.Rexx.toRexx("....o....O....o....O....o....O....o....O....o....O....o....O");
  
  netrexx.lang.RexxIO.Say(dlm);
  netrexx.lang.RexxIO.Say("pipe \000");
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("< CPprefix.nrx |").OpCcblank(null,netrexx.lang.Rexx.toRexx("spec x0000 1 1-* v2c next |"))).OpCcblank(null,$01));
  
  
  
  
  {try{
  netrexx.lang.RexxAddress.execAddress("pipe",(netrexx.lang.Rexx.toRexx("< CPprefix.nrx |").OpCcblank(null,netrexx.lang.Rexx.toRexx("spec x0000 1 1-* v2c next |"))).OpCcblank(null,$01), (Object)null,(Object)null,0,(Object)null,0);
  }catch (java.io.IOException $01){
  netrexx.lang.RexxIO.Say("     +++ Error: IOException '"+$01.getMessage()+"' occurred during ADDRESS invocation");
  }catch (java.lang.InterruptedException $01){
  netrexx.lang.RexxIO.Say("     +++ Error: InterruptedException occurred during ADDRESS invocation");
  }}
  
  
  
  netrexx.lang.RexxIO.Say(netrexx.lang.RexxAddress.RC().toString());
  
  netrexx.lang.RexxIO.Say(dlm);
  netrexx.lang.RexxIO.Say("pipe \000");
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("< CPprefix.nrx |").OpCcblank(null,netrexx.lang.Rexx.toRexx("spec 1-* 1 /xx/ next | spec 1-* v2c 1 | spec 1;-3 1 |"))).OpCcblank(null,$01));
  
  
  
  
  {try{
  netrexx.lang.RexxAddress.execAddress("pipe",(netrexx.lang.Rexx.toRexx("< CPprefix.nrx |").OpCcblank(null,netrexx.lang.Rexx.toRexx("spec 1-* 1 /xx/ next | spec 1-* v2c 1 | spec 1;-3 1 |"))).OpCcblank(null,$01), (Object)null,(Object)null,0,(Object)null,0);
  }catch (java.io.IOException $01){
  netrexx.lang.RexxIO.Say("     +++ Error: IOException '"+$01.getMessage()+"' occurred during ADDRESS invocation");
  }catch (java.lang.InterruptedException $01){
  netrexx.lang.RexxIO.Say("     +++ Error: InterruptedException occurred during ADDRESS invocation");
  }}
  
  
  
  netrexx.lang.RexxIO.Say(netrexx.lang.RexxAddress.RC().toString());
  
  netrexx.lang.RexxIO.Say(dlm);
  netrexx.lang.RexxIO.Say("pipe \000");
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("< CPprefix.nrx |").OpCcblank(null,netrexx.lang.Rexx.toRexx("spec 1-* 1 /xx/ next | spec 1-* c2v | spec 1;-3 |"))).OpCcblank(null,$01));
  
  
  
  
  {try{
  netrexx.lang.RexxAddress.execAddress("pipe",(netrexx.lang.Rexx.toRexx("< CPprefix.nrx |").OpCcblank(null,netrexx.lang.Rexx.toRexx("spec 1-* 1 /xx/ next | spec 1-* c2v | spec 1;-3 |"))).OpCcblank(null,$01), (Object)null,(Object)null,0,(Object)null,0);
  }catch (java.io.IOException $01){
  netrexx.lang.RexxIO.Say("     +++ Error: IOException '"+$01.getMessage()+"' occurred during ADDRESS invocation");
  }catch (java.lang.InterruptedException $01){
  netrexx.lang.RexxIO.Say("     +++ Error: InterruptedException occurred during ADDRESS invocation");
  }}
  
  
  
  netrexx.lang.RexxIO.Say(netrexx.lang.RexxAddress.RC().toString());
  
  {System.exit(netrexx.lang.Rexx.toRexx(netrexx.lang.RexxAddress.RC().toString()).toint());return;}
  }
 
 
 private CPprefix(){return;}
 }
