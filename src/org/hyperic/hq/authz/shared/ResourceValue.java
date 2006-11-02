/*
 * xdoclet generated file
 * legacy DTO pattern (targeted for replacement with hibernate pojo)
 */
package org.hyperic.hq.authz.shared;

/**
 * Value object for Resource.
 *
 */
public class ResourceValue
   extends java.lang.Object
   implements java.io.Serializable
{
   private java.lang.String sortName;
   private boolean sortNameHasBeenSet = false;
   private Integer instanceId;
   private boolean instanceIdHasBeenSet = false;
   private boolean system;
   private boolean systemHasBeenSet = false;
   private String name;
   private boolean nameHasBeenSet = false;
   private Integer id;
   private boolean idHasBeenSet = false;
   private org.hyperic.hq.authz.shared.ResourceTypeValue ResourceTypeValue;
   private boolean ResourceTypeValueHasBeenSet = false;
   private org.hyperic.hq.authz.shared.AuthzSubjectValue AuthzSubjectValue;
   private boolean AuthzSubjectValueHasBeenSet = false;

   private org.hyperic.hq.authz.shared.ResourcePK pk;

   public ResourceValue()
   {
	  pk = new org.hyperic.hq.authz.shared.ResourcePK();
   }

   public ResourceValue( java.lang.String sortName,Integer instanceId,boolean system,String name,Integer id )
   {
	  this.sortName = sortName;
	  sortNameHasBeenSet = true;
	  this.instanceId = instanceId;
	  instanceIdHasBeenSet = true;
	  this.system = system;
	  systemHasBeenSet = true;
	  this.name = name;
	  nameHasBeenSet = true;
	  this.id = id;
	  idHasBeenSet = true;
	  pk = new org.hyperic.hq.authz.shared.ResourcePK(this.getId());
   }

   //TODO Cloneable is better than this !
   public ResourceValue( ResourceValue otherValue )
   {
	  this.sortName = otherValue.sortName;
	  sortNameHasBeenSet = true;
	  this.instanceId = otherValue.instanceId;
	  instanceIdHasBeenSet = true;
	  this.system = otherValue.system;
	  systemHasBeenSet = true;
	  this.name = otherValue.name;
	  nameHasBeenSet = true;
	  this.id = otherValue.id;
	  idHasBeenSet = true;
	// TODO Clone is better no ?
	  this.ResourceTypeValue = otherValue.ResourceTypeValue;
	  ResourceTypeValueHasBeenSet = true;
	// TODO Clone is better no ?
	  this.AuthzSubjectValue = otherValue.AuthzSubjectValue;
	  AuthzSubjectValueHasBeenSet = true;

	  pk = new org.hyperic.hq.authz.shared.ResourcePK(this.getId());
   }

   public org.hyperic.hq.authz.shared.ResourcePK getPrimaryKey()
   {
	  return pk;
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
   public Integer getInstanceId()
   {
	  return this.instanceId;
   }

   public void setInstanceId( Integer instanceId )
   {
	  this.instanceId = instanceId;
	  instanceIdHasBeenSet = true;

   }

   public boolean instanceIdHasBeenSet(){
	  return instanceIdHasBeenSet;
   }
   public boolean getSystem()
   {
	  return this.system;
   }

   public void setSystem( boolean system )
   {
	  this.system = system;
	  systemHasBeenSet = true;

   }

   public boolean systemHasBeenSet(){
	  return systemHasBeenSet;
   }
   public String getName()
   {
	  return this.name;
   }

   public void setName( String name )
   {
	  this.name = name;
	  nameHasBeenSet = true;

   }

   public boolean nameHasBeenSet(){
	  return nameHasBeenSet;
   }
   public Integer getId()
   {
	  return this.id;
   }

   public void setId( Integer id )
   {
	  this.id = id;
	  idHasBeenSet = true;

		 pk.setId(id);
   }

   public boolean idHasBeenSet(){
	  return idHasBeenSet;
   }

   public org.hyperic.hq.authz.shared.ResourceTypeValue getResourceTypeValue()
   {
	  return this.ResourceTypeValue;
   }
   public void setResourceTypeValue( org.hyperic.hq.authz.shared.ResourceTypeValue ResourceTypeValue )
   {
	  this.ResourceTypeValue = ResourceTypeValue;
	  ResourceTypeValueHasBeenSet = true;
   }
   public org.hyperic.hq.authz.shared.AuthzSubjectValue getAuthzSubjectValue()
   {
	  return this.AuthzSubjectValue;
   }
   public void setAuthzSubjectValue( org.hyperic.hq.authz.shared.AuthzSubjectValue AuthzSubjectValue )
   {
	  this.AuthzSubjectValue = AuthzSubjectValue;
	  AuthzSubjectValueHasBeenSet = true;
   }

   public String toString()
   {
	  StringBuffer str = new StringBuffer("{");

	  str.append("sortName=" + getSortName() + " " + "instanceId=" + getInstanceId() + " " + "system=" + getSystem() + " " + "name=" + getName() + " " + "id=" + getId());
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
	  if (other instanceof ResourceValue)
	  {
		 ResourceValue that = (ResourceValue) other;
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
	  if (other instanceof ResourceValue)
	  {
		 ResourceValue that = (ResourceValue) other;
		 boolean lEquals = true;
		 if( this.sortName == null )
		 {
			lEquals = lEquals && ( that.sortName == null );
		 }
		 else
		 {
			lEquals = lEquals && this.sortName.equals( that.sortName );
		 }
		 if( this.instanceId == null )
		 {
			lEquals = lEquals && ( that.instanceId == null );
		 }
		 else
		 {
			lEquals = lEquals && this.instanceId.equals( that.instanceId );
		 }
		 lEquals = lEquals && this.system == that.system;
		 if( this.name == null )
		 {
			lEquals = lEquals && ( that.name == null );
		 }
		 else
		 {
			lEquals = lEquals && this.name.equals( that.name );
		 }
		 if( this.ResourceTypeValue == null )
		 {
			lEquals = lEquals && ( that.ResourceTypeValue == null );
		 }
		 else
		 {
			lEquals = lEquals && this.ResourceTypeValue.equals( that.ResourceTypeValue );
		 }
		 if( this.AuthzSubjectValue == null )
		 {
			lEquals = lEquals && ( that.AuthzSubjectValue == null );
		 }
		 else
		 {
			lEquals = lEquals && this.AuthzSubjectValue.equals( that.AuthzSubjectValue );
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
      result = 37*result + ((this.sortName != null) ? this.sortName.hashCode() : 0);

      result = 37*result + ((this.instanceId != null) ? this.instanceId.hashCode() : 0);

      result = 37*result + (system ? 0 : 1);

      result = 37*result + ((this.name != null) ? this.name.hashCode() : 0);

      result = 37*result + ((this.id != null) ? this.id.hashCode() : 0);

	  result = 37*result + ((this.ResourceTypeValue != null) ? this.ResourceTypeValue.hashCode() : 0);
	  result = 37*result + ((this.AuthzSubjectValue != null) ? this.AuthzSubjectValue.hashCode() : 0);
	  return result;
   }

}
