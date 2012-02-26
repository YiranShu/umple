/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.15.0.963 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * TODO: Code smell. Should be replaced by the 'otherEnd' of the AssociationEnd
 */
public class AssociationVariable extends UmpleVariable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AssociationVariable Attributes
  private Multiplicity multiplicity;
  private boolean isNavigable;

  //AssociationVariable Associations
  private AssociationVariable relatedAssociation;
  private List<Comment> comments;
  private UmpleClass umpleClass;
  private TraceDirective traceDirective;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AssociationVariable(String aName, String aType, String aModifier, String aValue, Multiplicity aMultiplicity, boolean aIsNavigable)
  {
    super(aName, aType, aModifier, aValue);
    multiplicity = aMultiplicity;
    isNavigable = aIsNavigable;
    comments = new ArrayList<Comment>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setMultiplicity(Multiplicity aMultiplicity)
  {
    boolean wasSet = false;
    multiplicity = aMultiplicity;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsNavigable(boolean aIsNavigable)
  {
    boolean wasSet = false;
    if (aIsNavigable && !canBeNavigable()) { return false; }
    isNavigable = aIsNavigable;
    wasSet = true;
    return wasSet;
  }

  public Multiplicity getMultiplicity()
  {
    return multiplicity;
  }

  public boolean getIsNavigable()
  {
    return isNavigable;
  }

  public boolean isIsNavigable()
  {
    return isNavigable;
  }

  public AssociationVariable getRelatedAssociation()
  {
    return relatedAssociation;
  }

  public Comment getComment(int index)
  {
    Comment aComment = comments.get(index);
    return aComment;
  }

  /**
   * The comments associated with the association (such as the Javadoc above it).
   */
  public List<Comment> getComments()
  {
    List<Comment> newComments = Collections.unmodifiableList(comments);
    return newComments;
  }

  public int numberOfComments()
  {
    int number = comments.size();
    return number;
  }

  public boolean hasComments()
  {
    boolean has = comments.size() > 0;
    return has;
  }

  public int indexOfComment(Comment aComment)
  {
    int index = comments.indexOf(aComment);
    return index;
  }

  public UmpleClass getUmpleClass()
  {
    return umpleClass;
  }

  public TraceDirective getTraceDirective()
  {
    return traceDirective;
  }

  public boolean setRelatedAssociation(AssociationVariable newRelatedAssociation)
  {
    boolean wasSet = false;
    if(!canBeRelatedAssociation(newRelatedAssociation)) { return false; }
    if (newRelatedAssociation == null)
    {
      AssociationVariable existingRelatedAssociation = relatedAssociation;
      relatedAssociation = null;
      
      if (existingRelatedAssociation != null && existingRelatedAssociation.getRelatedAssociation() != null)
      {
        existingRelatedAssociation.setRelatedAssociation(null);
      }
      wasSet = true;
      return wasSet;
    }

    AssociationVariable currentRelatedAssociation = getRelatedAssociation();
    if (currentRelatedAssociation != null && !currentRelatedAssociation.equals(newRelatedAssociation))
    {
      currentRelatedAssociation.setRelatedAssociation(null);
    }

    relatedAssociation = newRelatedAssociation;
    AssociationVariable existingRelatedAssociation = newRelatedAssociation.getRelatedAssociation();

    if (!equals(existingRelatedAssociation))
    {
      newRelatedAssociation.setRelatedAssociation(this);
    }
    wasSet = true;
    return wasSet;
  }

  public static int minimumNumberOfComments()
  {
    return 0;
  }

  public boolean addComment(Comment aComment)
  {
    boolean wasAdded = false;
    if (comments.contains(aComment)) { return false; }
    comments.add(aComment);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeComment(Comment aComment)
  {
    boolean wasRemoved = false;
    if (comments.contains(aComment))
    {
      comments.remove(aComment);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean setUmpleClass(UmpleClass aUmpleClass)
  {
    boolean wasSet = false;
    if ((aUmpleClass != null) && !aUmpleClass.immutabilityAssociationRulesSatisfied(this, aUmpleClass.isImmutable())) { return false; }
    UmpleClass existingUmpleClass = umpleClass;
    umpleClass = aUmpleClass;
    if (existingUmpleClass != null && !existingUmpleClass.equals(aUmpleClass))
    {
      existingUmpleClass.removeAssociationVariable(this);
    }
    if (aUmpleClass != null)
    {
      aUmpleClass.addAssociationVariable(this);
    }
    wasSet = true;
    return wasSet;
  }

  public boolean setTraceDirective(TraceDirective newTraceDirective)
  {
    boolean wasSet = false;
    if (newTraceDirective == null)
    {
      TraceDirective existingTraceDirective = traceDirective;
      traceDirective = null;
      
      if (existingTraceDirective != null && existingTraceDirective.getAssociationVariable() != null)
      {
        existingTraceDirective.setAssociationVariable(null);
      }
      wasSet = true;
      return wasSet;
    }

    TraceDirective currentTraceDirective = getTraceDirective();
    if (currentTraceDirective != null && !currentTraceDirective.equals(newTraceDirective))
    {
      currentTraceDirective.setAssociationVariable(null);
    }

    traceDirective = newTraceDirective;
    AssociationVariable existingAssociationVariable = newTraceDirective.getAssociationVariable();

    if (!equals(existingAssociationVariable))
    {
      newTraceDirective.setAssociationVariable(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (relatedAssociation != null)
    {
      relatedAssociation.setRelatedAssociation(null);
    }
    comments.clear();
    if (umpleClass != null)
    {
      UmpleClass placeholderUmpleClass = umpleClass;
      this.umpleClass = null;
      placeholderUmpleClass.removeAssociationVariable(this);
    }
    if (traceDirective != null)
    {
      traceDirective.setAssociationVariable(null);
    }
    super.delete();
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  public boolean isReflexive()
  {
    return getRelatedAssociation() != null && getType().equals(getRelatedAssociation().getType());
  }
  
  public boolean isSymmetricReflexive()
  {
    return getRelatedAssociation() != null && "symmetricreflexive".equals(getModifier());
  }

  public void configureRelatedAssociation(AssociationVariable newRelatedAssociation)
  {
    if (newRelatedAssociation == null || !getType().equals(newRelatedAssociation.getType()))
    {
      setRelatedAssociation(newRelatedAssociation);
    }
    else
    {
      multiplicity.minimizeRange(newRelatedAssociation.getMultiplicity());
      setRelatedAssociation(this);
    }
  }
    
  public static int min(int first, int second)
  {
    return first == -1 ? second : second == -1 ? first : Math.min(first, second);
  }

  public static int max(int first, int second)
  {
    return first == -1 ? first : second == -1 ? second : Math.max(first, second);
  }
  
  public boolean isMany()
  {
    return multiplicity.getUpperBound() == -1 || multiplicity.getUpperBound() > 1;
  }
  
  public boolean isOptionalN()
  {
    return multiplicity.getLowerBound() == 0 && multiplicity.getUpperBound() > 1;
  }

  public boolean isOne()
  {
    return multiplicity.getUpperBound() == 1;
  }
  
  public boolean isOnlyOne()
  {
    return multiplicity.getUpperBound() == 1 && multiplicity.getLowerBound() == 1;
  }
  
  public boolean isOptionalOne()
  {
    return multiplicity.getUpperBound() == 1 && multiplicity.getLowerBound() == 0;
  }
  
  public boolean isOptionalMany()
  {
    return multiplicity.getLowerBound() == 0 && isMany();
  }

  public boolean isN()
  {
    return multiplicity.getLowerBound() > 1 && multiplicity.getLowerBound() == multiplicity.getUpperBound();
  }
  
  public boolean isMN()
  {
    return multiplicity.getLowerBound() > 0 && (multiplicity.getUpperBound() > multiplicity.getLowerBound() || multiplicity.getUpperBound() == -1);
  }
  
  public boolean isMStar()
  {
    return multiplicity.getLowerBound() > 0 && multiplicity.getUpperBound() == -1;
  }
  
  public boolean isStar()
  {
    return multiplicity.getUpperBound() == -1;
  }
  
  public boolean isMandatory()
  {
    return multiplicity.getLowerBound() > 0;
  }
  
  public boolean isMandatoryOne()
  {
    return multiplicity.getLowerBound() == 1 && multiplicity.getUpperBound() == 1;
  }
  
  public boolean isMandatoryMany()
  {
    return multiplicity.getLowerBound() > 0 && isMany();
  }
  
  public boolean isImmutable()
  {
  	AssociationVariable related = getRelatedAssociation();
  	Boolean relatedAssocIsImmutable = (related == null) ? false : "immutable".equals(related.getModifier());
  	
  	Boolean myUmpleClassIsImmutable = 
  			(getIsNavigable() && getUmpleClass() != null) ? getUmpleClass().isImmutable() : false;
  	Boolean yourUmpleClassIsImmutable = 
  			(related != null && related.getIsNavigable() && related.getUmpleClass() != null) ? related.getUmpleClass().isImmutable() : false;
  	
  	return (super.isImmutable() || relatedAssocIsImmutable 
  		|| myUmpleClassIsImmutable || yourUmpleClassIsImmutable);
  }
  
  public boolean setImmutable(boolean aImmutable)
  {
  	boolean wasSet = false;
  	if (!aImmutable)
  	{
  	  setModifier(null);
  	  wasSet = true;
  	}
  	else if (aImmutable && canBeImmutable())
  	{
  	  setModifier("immutable");
  	  wasSet = true;
  	}
  	return wasSet;
  }
  
  public boolean canBeImmutable()
  {
  	AssociationVariable related = getRelatedAssociation();
  	
  	if (getIsNavigable() && related != null && related.getIsNavigable())
  	{
  	  return false;
  	}
    return true;
  }
  
  public boolean canBeNavigable()
  {
  	AssociationVariable related = getRelatedAssociation();
  	
    if (umpleClass != null && umpleClass.isImmutable() && related != null && related.getIsNavigable())
    {
      return false;
    }	
    return true;
  }
  
  private boolean canBeRelatedAssociation(AssociationVariable aRelatedAssociation)
  {
  	if (umpleClass == null || aRelatedAssociation == null || aRelatedAssociation.getUmpleClass() == null)
  	{
  		return true;
  	}
  	
  	return UmpleClass.immutabilityAssociationRulesSatisfied(this, umpleClass, umpleClass.isImmutable(), 
  		aRelatedAssociation, aRelatedAssociation.getUmpleClass(), aRelatedAssociation.getUmpleClass().isImmutable());
  }
}