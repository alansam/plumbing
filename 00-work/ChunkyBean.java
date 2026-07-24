/* Generated from 'ChunkyBean.nrx' 21 Jun 2026 01:08:23 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Trace2 Verbose3 */
package org.netrexx;

/* NetRexx */




// . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8


public class ChunkyBean implements java.io.Serializable{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('<');
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(':');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx('>');
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(31);
 private static final java.lang.String $0="ChunkyBean.nrx";
 
 /* properties private constant unused */
 private static final long serialVersionUID=new netrexx.lang.Rexx(1).tolong();
 
 /* properties private constant */
 private static final boolean true_=(1==1);
 private static final boolean false_=(new netrexx.lang.Rexx(true_).OpNot(null));
 
 /* properties private */
 private netrexx.lang.Rexx name;
 private netrexx.lang.Rexx size;
 private netrexx.lang.Rexx id;
 private boolean valid;

 
 // . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
 
 @SuppressWarnings("unchecked") 
 public ChunkyBean(){
  this(netrexx.lang.Rexx.toRexx(""),new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx((byte)0));return;
  }
 public ChunkyBean(netrexx.lang.Rexx nm){
  this(nm,new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx((byte)0));return;
  }
 public ChunkyBean(netrexx.lang.Rexx nm,netrexx.lang.Rexx sz){
  this(nm,sz,new netrexx.lang.Rexx((byte)0));return;
  }
 public ChunkyBean(netrexx.lang.Rexx nm,netrexx.lang.Rexx sz,netrexx.lang.Rexx i_){super();
  name=nm;
  size=sz;
  id=i_;
  if (((name.OpEq(null,$01)|size.OpEq(null,$02))|id.OpEq(null,$02))) 
   valid=false_;
  else 
   valid=true_;
  
  return;
  }
  // . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
 
 
 @SuppressWarnings("unchecked") 
 public ChunkyBean(org.netrexx.ChunkyBean other){
  this(other.getName(),other.getSize(),other.getID());
  valid=other.isValid();
  
  return;
  }
  // . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
 
 
 @SuppressWarnings("unchecked") 
 public netrexx.lang.Rexx getName(){
  return name;
  }
  // . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
 
 
 @SuppressWarnings("unchecked") 
 public void setName(netrexx.lang.Rexx nm){
  name=nm;
  return;
  }
  // . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
 
 
 @SuppressWarnings("unchecked") 
 public netrexx.lang.Rexx getSize(){
  return size;
  }
  // . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
 
 
 @SuppressWarnings("unchecked") 
 public void setSize(netrexx.lang.Rexx sz){
  size=sz;
  return;
  }
  // . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
 
 
 @SuppressWarnings("unchecked") 
 public netrexx.lang.Rexx getID(){
  return id;
  }
  // . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
 
 
 @SuppressWarnings("unchecked") 
 public void setID(netrexx.lang.Rexx i_){
  id=i_;
  return;
  }
  // . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
 
 
 @SuppressWarnings("unchecked") 
 public boolean isValid(){
  return valid;
  }
  // . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
 
 
 @SuppressWarnings("unchecked") 
 public void setValid(boolean vld){
  valid=vld;
  return;
  }
  // . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
 
 
 @SuppressWarnings("unchecked") 
 public java.lang.String toString(){
  netrexx.lang.Rexx val=null;
  netrexx.lang.Rexx beaninfo;
  if (isValid()) 
   val=new netrexx.lang.Rexx('T');
  else 
   val=new netrexx.lang.Rexx('F');
  
  beaninfo=((((((($03.OpCc(null,getID().right(new netrexx.lang.Rexx((byte)6)))).OpCc(null,$04)).OpCc(null,getSize().right(new netrexx.lang.Rexx((byte)5)))).OpCc(null,$04)).OpCc(null,val)).OpCc(null,$04)).OpCc(null,getName())).OpCc(null,$05);
  
  
  
  
  return new java.lang.String(netrexx.lang.Rexx.tochararray(beaninfo));
  }
  // . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
 
 
 @SuppressWarnings("unchecked") 
 public boolean equals(java.lang.Object o_){
  if ((o_==this)) 
   return true_;
  if ((o_.toString()).equals(toString())) 
   return true_;
  else 
   return false_;
  }
  // . ... 1 ... ... 2 ... ... 3 ... ... 4 ... ... 5 ... ... 6 ... ... 7 ... ... 8
 
 
 @SuppressWarnings("unchecked") 
 public int hashCode(){
  int hash;
  hash=new netrexx.lang.Rexx(7).toint();
  hash=$06.OpMult(null,new netrexx.lang.Rexx(hash)).OpAdd(null,new netrexx.lang.Rexx(id.hashCode())).toint();
  hash=$06.OpMult(null,new netrexx.lang.Rexx(hash)).OpAdd(null,new netrexx.lang.Rexx(size.hashCode())).toint();
  hash=$06.OpMult(null,new netrexx.lang.Rexx(hash)).OpAdd(null,new netrexx.lang.Rexx(name.hashCode())).toint();
  
  return hash;
  }
 
 }
