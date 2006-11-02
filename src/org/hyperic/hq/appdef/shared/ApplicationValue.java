/*
 * xdoclet generated code.
 * legacy DTO pattern (targeted to be replaced with hibernate pojo).
 */
package org.hyperic.hq.appdef.shared;

import java.util.Set;

/**
 * Value object for Application.
 *
 */
public class ApplicationValue
   extends org.hyperic.hq.appdef.shared.AppdefResourceValue
   implements java.io.Serializable
{
   private java.lang.String name;
   private boolean nameHasBeenSet = false;
   private java.lang.String sortName;
   private boolean sortNameHasBeenSet = false;
   private java.lang.String modifiedBy;
   private boolean modifiedByHasBeenSet = false;
   private java.lang.String owner;
   private boolean ownerHasBeenSet = false;
   private java.lang.String location;
   private boolean locationHasBeenSet = false;
   private java.lang.String engContact;
   private boolean engContactHasBeenSet = false;
   private java.lang.String opsContact;
   private boolean opsContactHasBeenSet = false;
   private java.lang.String businessContact;
   private boolean businessContactHasBeenSet = false;
   private java.lang.String description;
   private boolean descriptionHasBeenSet = false;
   private java.lang.Integer id;
   private boolean idHasBeenSet = false;
   private java.lang.Long mTime;
   private boolean mTimeHasBeenSet = false;
   private java.lang.Long cTime;
   private boolean cTimeHasBeenSet = false;
   private Set AppServiceValues = new java.util.HashSet();
   private org.hyperic.hq.appdef.shared.ApplicationTypeValue ApplicationType;
   private boolean ApplicationTypeHasBeenSet = false;

   private org.hyperic.hq.appdef.shared.ApplicationPK pk;

   public ApplicationValue()
   {
	  pk = new org.hyperic.hq.appdef.shared.ApplicationPK();
   }

   public ApplicationValue( java.lang.String name,java.lang.String sortName,java.lang.String modifiedBy,java.lang.String owner,java.lang.String location,java.lang.String engContact,java.lang.String opsContact,java.lang.String businessContact,java.lang.String description,java.lang.Integer id,java.lang.Long mTime,java.lang.Long cTime )
   {
	  this.name = name;
	  nameHasBeenSet = true;
	  this.sortName = sortName;
	  sortNameHasBeenSet = true;
	  this.modifiedBy = modifiedBy;
	  modifiedByHasBeenSet = true;
	  this.owner = owner;
	  ownerHasBeenSet = true;
	  this.location = location;
	  locationHasBeenSet = true;
	  this.engContact = engContact;
	  engContactHasBeenSet = true;
	  this.opsContact = opsContact;
	  opsContactHasBeenSet = true;
	  this.businessContact = businessContact;
	  businessContactHasBeenSet = true;
	  this.description = description;
	  descriptionHasBeenSet = true;
	  this.id = id;
	  idHasBeenSet = true;
	  this.mTime = mTime;
	  mTimeHasBeenSet = true;
	  this.cTime = cTime;
	  cTimeHasBeenSet = true;
	  pk = new org.hyperic.hq.appdef.shared.ApplicationPK(this.getId());
   }

   //TODO Cloneable is better than this !
   public ApplicationValue( ApplicationValue otherValue )
   {
	  this.name = otherValue.name;
	  nameHasBeenSet = true;
	  this.sortName = otherValue.sortName;
	  sortNameHasBeenSet = true;
	  this.modifiedBy = otherValue.modifiedBy;
	  modifiedByHasBeenSet = true;
	  this.owner = otherValue.owner;
	  ownerHasBeenSet = true;
	  this.location = otherValue.location;
	  locationHasBeenSet = true;
	  this.engContact = otherValue.engContact;
	  engContactHasBeenSet = true;
	  this.opsContact = otherValue.opsContact;
	  opsContactHasBeenSet = true;
	  this.businessContact = otherValue.businessContact;
	  businessContactHasBeenSet = true;
	  this.description = otherValue.description;
	  descriptionHasBeenSet = true;
	  this.id = otherValue.id;
	  idHasBeenSet = true;
	  this.mTime = otherValue.mTime;
	  mTimeHasBeenSet = true;
	  this.cTime = otherValue.cTime;
	  cTimeHasBeenSet = true;
	// TODO Clone is better no ?
	  this.AppServiceValues = otherValue.AppServiceValues;
	// TODO Clone is better no ?
	  this.ApplicationType = otherValue.ApplicationType;
	  ApplicationTypeHasBeenSet = true;

	  pk = new org.hyperic.hq.appdef.shared.ApplicationPK(this.getId());
   }

   public org.hyperic.hq.appdef.shared.ApplicationPK getPrimaryKey()
   {
	  return pk;
   }

   public java.lang.String getName()
   {
	  return this.name;
   }

   public void setName( java.lang.String name )
   {
	  this.name = name;
	  nameHasBeenSet = true;

   }

   public boolean nameHasBeenSet(){
	  return nameHasBeenSet;
   }
   public java.lang.String getSortName()
   {
	  return this.sortName;
   }

   public void setSortName( java.lang.String sortName )
   {
	  this.sortName = sortName;
	  sortNameHasBeenSet = true;

   }

   public boolean sortNameHasBeenSet(){
	  return sortNameHasBeenSet;
   }
   public java.lang.String getModifiedBy()
   {
	  return this.modifiedBy;
   }

   public void setModifiedBy( java.lang.String modifiedBy )
   {
	  this.modifiedBy = modifiedBy;
	  modifiedByHasBeenSet = true;

   }

   public boolean modifiedByHasBeenSet(){
	  return modifiedByHasBeenSet;
   }
   public java.lang.String getOwner()
   {
	  return this.owner;
   }

   public void setOwner( java.lang.String owner )
   {
	  this.owner = owner;
	  ownerHasBeenSet = true;

   }

   public boolean ownerHasBeenSet(){
	  return ownerHasBeenSet;
   }
   public java.lang.String getLocation()
   {
	  return this.location;
   }

   public void setLocation( java.lang.String location )
   {
	  this.location = location;
	  locationHasBeenSet = true;

   }

   public boolean locationHasBeenSet(){
	  return locationHasBeenSet;
   }
   public java.lang.String getEngContact()
   {
	  return this.engContact;
   }

   public void setEngContact( java.lang.String engContact )
   {
	  this.engContact = engContact;
	  engContactHasBeenSet = true;

   }

   public boolean engContactHasBeenSet(){
	  return engContactHasBeenSet;
   }
   public java.lang.String getOpsContact()
   {
	  return this.opsContact;
   }

   public void setOpsContact( java.lang.String opsContact )
   {
	  this.opsContact = opsContact;
	  opsContactHasBeenSet = true;

   }

   public boolean opsContactHasBeenSet(){
	  return opsContactHasBeenSet;
   }
   public java.lang.String getBusinessContact()
   {
	  return this.businessContact;
   }

   public void setBusinessContact( java.lang.String businessContact )
   {
	  this.businessContact = businessContact;
	  businessContactHasBeenSet = true;

   }

   public boolean businessContactHasBeenSet(){
	  return businessContactHasBeenSet;
   }
   public java.lang.String getDescription()
   {
	  return this.description;
   }

   public void setDescription( java.lang.String description )
   {
	  this.description = description;
	  descriptionHasBeenSet = true;

   }

   public boolean descriptionHasBeenSet(){
	  return descriptionHasBeenSet;
   }
   public java.lang.Integer getId()
   {
	  return this.id;
   }

   public void setId( java.lang.Integer id )
   {
	  this.id = id;
	  idHasBeenSet = true;

		 pk.setId(id);
   }

   public boolean idHasBeenSet(){
	  return idHasBeenSet;
   }
   public java.lang.Long getMTime()
   {
	  return this.mTime;
   }

   public void setMTime( java.lang.Long mTime )
   {
	  this.mTime = mTime;
	  mTimeHasBeenSet = true;

   }

   public boolean mTimeHasBeenSet(){
	  return mTimeHasBeenSet;
   }
   public java.lang.Long getCTime()
   {
	  return this.cTime;
   }

   public void setCTime( java.lang.Long cTime )
   {
	  this.cTime = cTime;
	  cTimeHasBeenSet = true;

   }

   public boolean cTimeHasBeenSet(){
	  return cTimeHasBeenSet;
   }

   protected Set addedAppServiceValues = new java.util.HashSet();
   protected Set removedAppServiceValues = new java.util.HashSet();
   protected Set updatedAppServiceValues = new java.util.HashSet();

   public Set getAddedAppServiceValues() { return addedAppServiceValues; }
   public Set getRemovedAppServiceValues() { return removedAppServiceValues; }
   public Set getUpdatedAppServiceValues() { return updatedAppServiceValues; }

   public org.hyperic.hq.appdef.shared.AppServiceValue[] getAppServiceValues()
   {
	  return (org.hyperic.hq.appdef.shared.AppServiceValue[])this.AppServiceValues.toArray(new org.hyperic.hq.appdef.shared.AppServiceValue[AppServiceValues.size()]);
   }

   public void addAppServiceValue(org.hyperic.hq.appdef.shared.AppServiceValue added)
   {
	  this.AppServiceValues.add(added);
	  if ( ! this.addedAppServiceValues.contains(added))
		 this.addedAppServiceValues.add(added);
   }

   public void removeAppServiceValue(org.hyperic.hq.appdef.shared.AppServiceValue removed)
   {
	  this.AppServiceValues.remove(removed);
	  this.removedAppServiceValues.add(removed);
	  if (this.addedAppServiceValues.contains(removed))
		 this.addedAppServiceValues.remove(removed);
	  if (this.updatedAppServiceValues.contains(removed))
		 this.updatedAppServiceValues.remove(removed);
   }

   public void removeAllAppServiceValues()
   {
        // DOH. Clear the collection - javier 2/24/03
        this.AppServiceValues.clear();
   }

   public void updateAppServiceValue(org.hyperic.hq.appdef.shared.AppServiceValue updated)
   {
	  if ( ! this.updatedAppServiceValues.contains(updated))
		 this.updatedAppServiceValues.add(updated);
   }

   public void cleanAppServiceValue(){
	  this.addedAppServiceValues = new java.util.HashSet();
	  this.removedAppServiceValues = new java.util.HashSet();
	  this.updatedAppServiceValues = new java.util.HashSet();
   }

   public void copyAppServiceValuesFrom(org.hyperic.hq.appdef.shared.ApplicationValue from)
   {
	  // TODO Clone the List ????
	  this.AppServiceValues = from.AppServiceValues;
   }
   public org.hyperic.hq.appdef.shared.ApplicationTypeValue getApplicationType()
   {
	  return this.ApplicationType;
   }
   public void setApplicationType( org.hyperic.hq.appdef.shared.ApplicationTypeValue ApplicationType )
   {
	  this.ApplicationType = ApplicationType;
	  ApplicationTypeHasBeenSet = true;
   }

   public String toString()
   {
	  StringBuffer str = new StringBuffer("{");

	  str.append("name=" + getName() + " " + "sortName=" + getSortName() + " " + "modifiedBy=" + getModifiedBy() + " " + "owner=" + getOwner() + " " + "location=" + getLocation() + " " + "engContact=" + getEngContact() + " " + "opsContact=" + getOpsContact() + " " + "businessContact=" + getBusinessContact() + " " + "description=" + getDescription() + " " + "id=" + getId() + " " + "mTime=" + getMTime() + " " + "cTime=" + getCTime());
	  str.append('}');

	  return(str.toString());
   }

   /**
	* A Value object have an identity if its attributes making its Primary Key
	* has all been set.  One object without identity is never equal to any other
	* object.
	*
	* @return true if this instance have an identity.
	*/
   protected boolean hasIdentity()
   {
	  boolean ret = true;
	  ret = ret && idHasBeenSet;
	  return ret;
   }

   public boolean equals(Object other)
   {
	  if ( ! hasIdentity() ) return false;
	  if (other instanceof ApplicationValue)
	  {
		 ApplicationValue that = (ApplicationValue) other;
		 if ( ! that.hasIdentity() ) return false;
		 boolean lEquals = true;
		 if( this.id == null )
		 {
			lEquals = lEquals && ( that.id == null );
		 }
		 else
		 {
			lEquals = lEquals && this.id.equals( that.id );
		 }

		 lEquals = lEquals && isIdentical(that);

		 return lEquals;
	  }
	  else
	  {
		 return false;
	  }
   }

   public boolean isIdentical(Object other)
   {
	  if (other instanceof ApplicationValue)
	  {
		 ApplicationValue that = (ApplicationValue) other;
		 boolean lEquals = true;
		 if( this.name == null )
		 {
			lEquals = lEquals && ( that.name == null );
		 }
		 else
		 {
			lEquals = lEquals && this.name.equals( that.name );
		 }
		 if( this.sortName == null )
		 {
			lEquals = lEquals && ( that.sortName == null );
		 }
		 else
		 {
			lEquals = lEquals && this.sortName.equals( that.sortName );
		 }
		 if( this.modifiedBy == null )
		 {
			lEquals = lEquals && ( that.modifiedBy == null );
		 }
		 else
		 {
			lEquals = lEquals && this.modifiedBy.equals( that.modifiedBy );
		 }
		 if( this.owner == null )
		 {
			lEquals = lEquals && ( that.owner == null );
		 }
		 else
		 {
			lEquals = lEquals && this.owner.equals( that.owner );
		 }
		 if( this.location == null )
		 {
			lEquals = lEquals && ( that.location == null );
		 }
		 else
		 {
			lEquals = lEquals && this.location.equals( that.location );
		 }
		 if( this.engContact == null )
		 {
			lEquals = lEquals && ( that.engContact == null );
		 }
		 else
		 {
			lEquals = lEquals && this.engContact.equals( that.engContact );
		 }
		 if( this.opsContact == null )
		 {
			lEquals = lEquals && ( that.opsContact == null );
		 }
		 else
		 {
			lEquals = lEquals && this.opsContact.equals( that.opsContact );
		 }
		 if( this.businessContact == null )
		 {
			lEquals = lEquals && ( that.businessContact == null );
		 }
		 else
		 {
			lEquals = lEquals && this.businessContact.equals( that.businessContact );
		 }
		 if( this.description == null )
		 {
			lEquals = lEquals && ( that.description == null );
		 }
		 else
		 {
			lEquals = lEquals && this.description.equals( that.description );
		 }
		 if( this.mTime == null )
		 {
			lEquals = lEquals && ( that.mTime == null );
		 }
		 else
		 {
			lEquals = lEquals && this.mTime.equals( that.mTime );
		 }
		 if( this.cTime == null )
		 {
			lEquals = lEquals && ( that.cTime == null );
		 }
		 else
		 {
			lEquals = lEquals && this.cTime.equals( that.cTime );
		 }
		 if( this.getAppServiceValues() == null )
		 {
			lEquals = lEquals && ( that.getAppServiceValues() == null );
		 }
		 else
		 {
            // XXX Covalent Custom - dont compare the arrays, as order is not significant. ever.    
            // - javier 7/16/03
            java.util.Collection cmr1 = java.util.Arrays.asList(this.getAppServiceValues());
            java.util.Collection cmr2 = java.util.Arrays.asList(that.getAppServiceValues());
			// lEquals = lEquals && java.util.Arrays.equals(this.getAppServiceValues() , that.getAppServiceValues()) ;
            lEquals = lEquals && cmr1.containsAll(cmr2);
		 }
		 if( this.ApplicationType == null )
		 {
			lEquals = lEquals && ( that.ApplicationType == null );
		 }
		 else
		 {
			lEquals = lEquals && this.ApplicationType.equals( that.ApplicationType );
		 }

		 return lEquals;
	  }
	  else
	  {
		 return false;
	  }
   }

   public int hashCode(){
	  int result = 17;
      result = 37*result + ((this.name != null) ? this.name.hashCode() : 0);

      result = 37*result + ((this.sortName != null) ? this.sortName.hashCode() : 0);

      result = 37*result + ((this.modifiedBy != null) ? this.modifiedBy.hashCode() : 0);

      result = 37*result + ((this.owner != null) ? this.owner.hashCode() : 0);

      result = 37*result + ((this.location != null) ? this.location.hashCode() : 0);

      result = 37*result + ((this.engContact != null) ? this.engContact.hashCode() : 0);

      result = 37*result + ((this.opsContact != null) ? this.opsContact.hashCode() : 0);

      result = 37*result + ((this.businessContact != null) ? this.businessContact.hashCode() : 0);

      result = 37*result + ((this.description != null) ? this.description.hashCode() : 0);

      result = 37*result + ((this.id != null) ? this.id.hashCode() : 0);

      result = 37*result + ((this.mTime != null) ? this.mTime.hashCode() : 0);

      result = 37*result + ((this.cTime != null) ? this.cTime.hashCode() : 0);

	  result = 37*result + ((this.getAppServiceValues() != null) ? this.getAppServiceValues().hashCode() : 0);
	  result = 37*result + ((this.ApplicationType != null) ? this.ApplicationType.hashCode() : 0);
	  return result;
   }

}
