/* Generated from 'CPscaling.nrx' 18 Jul 2026 23:34:08 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Trace2 Verbose3 */

/* NetRexx Pipes */

// . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8



public class CPscaling{
 private static final java.lang.String $0="CPscaling.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx dlm;
  dlm=netrexx.lang.Rexx.toRexx("....o....O....o....O....o....O....o....O....o....O....o....O");
  
  netrexx.lang.RexxIO.Say(dlm);
  netrexx.lang.RexxIO.Say("pipe \000");
  netrexx.lang.RexxIO.Say("strliteral x123c | spec 1-* c2p | console");
  
  
  {try{
  netrexx.lang.RexxAddress.execAddress("pipe","strliteral x123c | spec 1-* c2p | console", (Object)null,(Object)null,0,(Object)null,0);
  }catch (java.io.IOException $01){
  netrexx.lang.RexxIO.Say("     +++ Error: IOException '"+$01.getMessage()+"' occurred during ADDRESS invocation");
  }catch (java.lang.InterruptedException $01){
  netrexx.lang.RexxIO.Say("     +++ Error: InterruptedException occurred during ADDRESS invocation");
  }}
  
  netrexx.lang.RexxIO.Say(netrexx.lang.RexxAddress.RC().toString());
  
  netrexx.lang.RexxIO.Say(dlm);
  netrexx.lang.RexxIO.Say("pipe \000");
  netrexx.lang.RexxIO.Say("strliteral x123c | spec 1-* c2p(0) | console");
  
  
  {try{
  netrexx.lang.RexxAddress.execAddress("pipe","strliteral x123c | spec 1-* c2p(0) | console", (Object)null,(Object)null,0,(Object)null,0);
  }catch (java.io.IOException $01){
  netrexx.lang.RexxIO.Say("     +++ Error: IOException '"+$01.getMessage()+"' occurred during ADDRESS invocation");
  }catch (java.lang.InterruptedException $01){
  netrexx.lang.RexxIO.Say("     +++ Error: InterruptedException occurred during ADDRESS invocation");
  }}
  
  netrexx.lang.RexxIO.Say(netrexx.lang.RexxAddress.RC().toString());
  
  netrexx.lang.RexxIO.Say(dlm);
  netrexx.lang.RexxIO.Say("pipe \000");
  netrexx.lang.RexxIO.Say("strliteral x123c | spec 1-* c2p(1) | console");
  
  
  {try{
  netrexx.lang.RexxAddress.execAddress("pipe","strliteral x123c | spec 1-* c2p(1) | console", (Object)null,(Object)null,0,(Object)null,0);
  }catch (java.io.IOException $01){
  netrexx.lang.RexxIO.Say("     +++ Error: IOException '"+$01.getMessage()+"' occurred during ADDRESS invocation");
  }catch (java.lang.InterruptedException $01){
  netrexx.lang.RexxIO.Say("     +++ Error: InterruptedException occurred during ADDRESS invocation");
  }}
  
  netrexx.lang.RexxIO.Say(netrexx.lang.RexxAddress.RC().toString());
  
  {System.exit(netrexx.lang.Rexx.toRexx(netrexx.lang.RexxAddress.RC().toString()).toint());return;}
  }
 
 
 private CPscaling(){return;}
 }
