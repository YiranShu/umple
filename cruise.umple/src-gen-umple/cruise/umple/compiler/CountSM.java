/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.18.0.3036 modeling language!*/

package cruise.umple.compiler;
import java.util.*;

/**
 * END OF CLASS StateMachineMetrics
 * 
 * CountSM class used to calculate State Machine Metrics.
 * 
 * D E F I N I T I O N S   U S E D:
 * PATH - A set of transitions in a specific sequence that start in some node and finish
 * in other node or the same node. 
 * 
 * SELF CYCLE - A PATH with ONE transition that start and finish in the same node.
 * 
 * CYCLE - A PATH with one or more transitions that start and finish in the same node and
 * doesn't have repeated node (except the start and the end node).
 * - A SELF CYCLE is a special case of CYCLE with just ONE transition.
 * 
 * K N O W N   B U G S (If this considerations are accepted, write it down on google code bugs controlling):   
 * 
 * 
 * 
 * @umplesource SimpleMetrics_SM.ump 254
 */
// line 254 "../../../../src/SimpleMetrics_SM.ump"
public class CountSM
{
  @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
  public @interface umplesourcefile{int[] line();String[] file();int[] javaline();int[] length();}

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CountSM Attributes
  private int totalStateMachines;
  private int totalStateMachinesPerClass;
  private int totalStates;
  private int totalStatesPerClass;
  private int totalEvents;
  private int totalEventsPerClass;
  private int totalTransitions;
  private int totalTransitionsPerClass;
  private int totalGuards;
  private int totalGuardsPerClass;
  private int totalDifferentTransitions;
  private int totalDifferentTransitionsPerClass;
  private int totalActions;
  private int totalActionsPerClass;
  private int totalNestedStateMachine;
  private int totalNestedStateMachinePerClass;
  private int totalSelfCycles;
  private int totalSelfCyclesPerClass;
  private int totalCycles;
  private int totalCyclesPerClass;
  private int totalClass;
  private int totalStateMachinesPerClassMax;
  private int totalStatesPerClassMax;
  private int totalEventsPerClassMax;
  private int totalGuardsPerClassMax;
  private int totalTransitionsPerClassMax;
  private int totalDifferentTransitionsPerClassMax;
  private int totalActionsPerClassMax;
  private int totalNestedStateMachinePerClassMax;
  private int totalSelfCyclesPerClassMax;
  private int totalCyclesPerClassMax;
  private int totalStateMachinesPerClassMin;
  private int totalStatesPerClassMin;
  private int totalEventsPerClassMin;
  private int totalGuardsPerClassMin;
  private int totalTransitionsPerClassMin;
  private int totalDifferentTransitionsPerClassMin;
  private int totalActionsPerClassMin;
  private int totalNestedStateMachinePerClassMin;
  private int totalSelfCyclesPerClassMin;
  private int totalCyclesPerClassMin;
  private List<State> visitedStates;
  private Set<Transition> transitionsList;
  private Set<State> statesSet;
  private Set<Event> eventsSet;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CountSM()
  {
    totalStateMachines = 0;
    totalStateMachinesPerClass = 0;
    totalStates = 0;
    totalStatesPerClass = 0;
    totalEvents = 0;
    totalEventsPerClass = 0;
    totalTransitions = 0;
    totalTransitionsPerClass = 0;
    totalGuards = 0;
    totalGuardsPerClass = 0;
    totalDifferentTransitions = 0;
    totalDifferentTransitionsPerClass = 0;
    totalActions = 0;
    totalActionsPerClass = 0;
    totalNestedStateMachine = 0;
    totalNestedStateMachinePerClass = 0;
    totalSelfCycles = 0;
    totalSelfCyclesPerClass = 0;
    totalCycles = 0;
    totalCyclesPerClass = 0;
    totalClass = 0;
    totalStateMachinesPerClassMax = 0;
    totalStatesPerClassMax = 0;
    totalEventsPerClassMax = 0;
    totalGuardsPerClassMax = 0;
    totalTransitionsPerClassMax = 0;
    totalDifferentTransitionsPerClassMax = 0;
    totalActionsPerClassMax = 0;
    totalNestedStateMachinePerClassMax = 0;
    totalSelfCyclesPerClassMax = 0;
    totalCyclesPerClassMax = 0;
    totalStateMachinesPerClassMin = 0;
    totalStatesPerClassMin = 0;
    totalEventsPerClassMin = 0;
    totalGuardsPerClassMin = 0;
    totalTransitionsPerClassMin = 0;
    totalDifferentTransitionsPerClassMin = 0;
    totalActionsPerClassMin = 0;
    totalNestedStateMachinePerClassMin = 0;
    totalSelfCyclesPerClassMin = 0;
    totalCyclesPerClassMin = 0;
    visitedStates = new ArrayList<State>();
    transitionsList = new HashSet<Transition>();
    statesSet = new HashSet<State>();
    eventsSet = new HashSet<Event>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setTotalStateMachines(int aTotalStateMachines)
  {
    boolean wasSet = false;
    totalStateMachines = aTotalStateMachines;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalStateMachinesPerClass(int aTotalStateMachinesPerClass)
  {
    boolean wasSet = false;
    totalStateMachinesPerClass = aTotalStateMachinesPerClass;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalStates(int aTotalStates)
  {
    boolean wasSet = false;
    totalStates = aTotalStates;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalStatesPerClass(int aTotalStatesPerClass)
  {
    boolean wasSet = false;
    totalStatesPerClass = aTotalStatesPerClass;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalEvents(int aTotalEvents)
  {
    boolean wasSet = false;
    totalEvents = aTotalEvents;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalEventsPerClass(int aTotalEventsPerClass)
  {
    boolean wasSet = false;
    totalEventsPerClass = aTotalEventsPerClass;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalTransitions(int aTotalTransitions)
  {
    boolean wasSet = false;
    totalTransitions = aTotalTransitions;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalTransitionsPerClass(int aTotalTransitionsPerClass)
  {
    boolean wasSet = false;
    totalTransitionsPerClass = aTotalTransitionsPerClass;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalGuards(int aTotalGuards)
  {
    boolean wasSet = false;
    totalGuards = aTotalGuards;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalGuardsPerClass(int aTotalGuardsPerClass)
  {
    boolean wasSet = false;
    totalGuardsPerClass = aTotalGuardsPerClass;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalDifferentTransitions(int aTotalDifferentTransitions)
  {
    boolean wasSet = false;
    totalDifferentTransitions = aTotalDifferentTransitions;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalDifferentTransitionsPerClass(int aTotalDifferentTransitionsPerClass)
  {
    boolean wasSet = false;
    totalDifferentTransitionsPerClass = aTotalDifferentTransitionsPerClass;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalActions(int aTotalActions)
  {
    boolean wasSet = false;
    totalActions = aTotalActions;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalActionsPerClass(int aTotalActionsPerClass)
  {
    boolean wasSet = false;
    totalActionsPerClass = aTotalActionsPerClass;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalNestedStateMachine(int aTotalNestedStateMachine)
  {
    boolean wasSet = false;
    totalNestedStateMachine = aTotalNestedStateMachine;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalNestedStateMachinePerClass(int aTotalNestedStateMachinePerClass)
  {
    boolean wasSet = false;
    totalNestedStateMachinePerClass = aTotalNestedStateMachinePerClass;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalSelfCycles(int aTotalSelfCycles)
  {
    boolean wasSet = false;
    totalSelfCycles = aTotalSelfCycles;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalSelfCyclesPerClass(int aTotalSelfCyclesPerClass)
  {
    boolean wasSet = false;
    totalSelfCyclesPerClass = aTotalSelfCyclesPerClass;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalCycles(int aTotalCycles)
  {
    boolean wasSet = false;
    totalCycles = aTotalCycles;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalCyclesPerClass(int aTotalCyclesPerClass)
  {
    boolean wasSet = false;
    totalCyclesPerClass = aTotalCyclesPerClass;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalClass(int aTotalClass)
  {
    boolean wasSet = false;
    totalClass = aTotalClass;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalStateMachinesPerClassMax(int aTotalStateMachinesPerClassMax)
  {
    boolean wasSet = false;
    totalStateMachinesPerClassMax = aTotalStateMachinesPerClassMax;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalStatesPerClassMax(int aTotalStatesPerClassMax)
  {
    boolean wasSet = false;
    totalStatesPerClassMax = aTotalStatesPerClassMax;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalEventsPerClassMax(int aTotalEventsPerClassMax)
  {
    boolean wasSet = false;
    totalEventsPerClassMax = aTotalEventsPerClassMax;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalGuardsPerClassMax(int aTotalGuardsPerClassMax)
  {
    boolean wasSet = false;
    totalGuardsPerClassMax = aTotalGuardsPerClassMax;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalTransitionsPerClassMax(int aTotalTransitionsPerClassMax)
  {
    boolean wasSet = false;
    totalTransitionsPerClassMax = aTotalTransitionsPerClassMax;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalDifferentTransitionsPerClassMax(int aTotalDifferentTransitionsPerClassMax)
  {
    boolean wasSet = false;
    totalDifferentTransitionsPerClassMax = aTotalDifferentTransitionsPerClassMax;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalActionsPerClassMax(int aTotalActionsPerClassMax)
  {
    boolean wasSet = false;
    totalActionsPerClassMax = aTotalActionsPerClassMax;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalNestedStateMachinePerClassMax(int aTotalNestedStateMachinePerClassMax)
  {
    boolean wasSet = false;
    totalNestedStateMachinePerClassMax = aTotalNestedStateMachinePerClassMax;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalSelfCyclesPerClassMax(int aTotalSelfCyclesPerClassMax)
  {
    boolean wasSet = false;
    totalSelfCyclesPerClassMax = aTotalSelfCyclesPerClassMax;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalCyclesPerClassMax(int aTotalCyclesPerClassMax)
  {
    boolean wasSet = false;
    totalCyclesPerClassMax = aTotalCyclesPerClassMax;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalStateMachinesPerClassMin(int aTotalStateMachinesPerClassMin)
  {
    boolean wasSet = false;
    totalStateMachinesPerClassMin = aTotalStateMachinesPerClassMin;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalStatesPerClassMin(int aTotalStatesPerClassMin)
  {
    boolean wasSet = false;
    totalStatesPerClassMin = aTotalStatesPerClassMin;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalEventsPerClassMin(int aTotalEventsPerClassMin)
  {
    boolean wasSet = false;
    totalEventsPerClassMin = aTotalEventsPerClassMin;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalGuardsPerClassMin(int aTotalGuardsPerClassMin)
  {
    boolean wasSet = false;
    totalGuardsPerClassMin = aTotalGuardsPerClassMin;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalTransitionsPerClassMin(int aTotalTransitionsPerClassMin)
  {
    boolean wasSet = false;
    totalTransitionsPerClassMin = aTotalTransitionsPerClassMin;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalDifferentTransitionsPerClassMin(int aTotalDifferentTransitionsPerClassMin)
  {
    boolean wasSet = false;
    totalDifferentTransitionsPerClassMin = aTotalDifferentTransitionsPerClassMin;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalActionsPerClassMin(int aTotalActionsPerClassMin)
  {
    boolean wasSet = false;
    totalActionsPerClassMin = aTotalActionsPerClassMin;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalNestedStateMachinePerClassMin(int aTotalNestedStateMachinePerClassMin)
  {
    boolean wasSet = false;
    totalNestedStateMachinePerClassMin = aTotalNestedStateMachinePerClassMin;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalSelfCyclesPerClassMin(int aTotalSelfCyclesPerClassMin)
  {
    boolean wasSet = false;
    totalSelfCyclesPerClassMin = aTotalSelfCyclesPerClassMin;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalCyclesPerClassMin(int aTotalCyclesPerClassMin)
  {
    boolean wasSet = false;
    totalCyclesPerClassMin = aTotalCyclesPerClassMin;
    wasSet = true;
    return wasSet;
  }

  public boolean setVisitedStates(List<State> aVisitedStates)
  {
    boolean wasSet = false;
    visitedStates = aVisitedStates;
    wasSet = true;
    return wasSet;
  }

  public boolean setTransitionsList(Set<Transition> aTransitionsList)
  {
    boolean wasSet = false;
    transitionsList = aTransitionsList;
    wasSet = true;
    return wasSet;
  }

  public boolean setStatesSet(Set<State> aStatesSet)
  {
    boolean wasSet = false;
    statesSet = aStatesSet;
    wasSet = true;
    return wasSet;
  }

  public boolean setEventsSet(Set<Event> aEventsSet)
  {
    boolean wasSet = false;
    eventsSet = aEventsSet;
    wasSet = true;
    return wasSet;
  }

  /**
   * total StM found considering all classes analysed.
   */
  public int getTotalStateMachines()
  {
    return totalStateMachines;
  }

  public int getTotalStateMachinesPerClass()
  {
    return totalStateMachinesPerClass;
  }

  public int getTotalStates()
  {
    return totalStates;
  }

  public int getTotalStatesPerClass()
  {
    return totalStatesPerClass;
  }

  public int getTotalEvents()
  {
    return totalEvents;
  }

  public int getTotalEventsPerClass()
  {
    return totalEventsPerClass;
  }

  public int getTotalTransitions()
  {
    return totalTransitions;
  }

  public int getTotalTransitionsPerClass()
  {
    return totalTransitionsPerClass;
  }

  public int getTotalGuards()
  {
    return totalGuards;
  }

  public int getTotalGuardsPerClass()
  {
    return totalGuardsPerClass;
  }

  public int getTotalDifferentTransitions()
  {
    return totalDifferentTransitions;
  }

  public int getTotalDifferentTransitionsPerClass()
  {
    return totalDifferentTransitionsPerClass;
  }

  public int getTotalActions()
  {
    return totalActions;
  }

  public int getTotalActionsPerClass()
  {
    return totalActionsPerClass;
  }

  public int getTotalNestedStateMachine()
  {
    return totalNestedStateMachine;
  }

  public int getTotalNestedStateMachinePerClass()
  {
    return totalNestedStateMachinePerClass;
  }

  public int getTotalSelfCycles()
  {
    return totalSelfCycles;
  }

  public int getTotalSelfCyclesPerClass()
  {
    return totalSelfCyclesPerClass;
  }

  public int getTotalCycles()
  {
    return totalCycles;
  }

  public int getTotalCyclesPerClass()
  {
    return totalCyclesPerClass;
  }

  public int getTotalClass()
  {
    return totalClass;
  }

  /**
   * MAX ATTRIBUTES
   */
  public int getTotalStateMachinesPerClassMax()
  {
    return totalStateMachinesPerClassMax;
  }

  public int getTotalStatesPerClassMax()
  {
    return totalStatesPerClassMax;
  }

  public int getTotalEventsPerClassMax()
  {
    return totalEventsPerClassMax;
  }

  public int getTotalGuardsPerClassMax()
  {
    return totalGuardsPerClassMax;
  }

  public int getTotalTransitionsPerClassMax()
  {
    return totalTransitionsPerClassMax;
  }

  public int getTotalDifferentTransitionsPerClassMax()
  {
    return totalDifferentTransitionsPerClassMax;
  }

  public int getTotalActionsPerClassMax()
  {
    return totalActionsPerClassMax;
  }

  public int getTotalNestedStateMachinePerClassMax()
  {
    return totalNestedStateMachinePerClassMax;
  }

  public int getTotalSelfCyclesPerClassMax()
  {
    return totalSelfCyclesPerClassMax;
  }

  public int getTotalCyclesPerClassMax()
  {
    return totalCyclesPerClassMax;
  }

  /**
   * MIN ATTRIBUTES
   */
  public int getTotalStateMachinesPerClassMin()
  {
    return totalStateMachinesPerClassMin;
  }

  public int getTotalStatesPerClassMin()
  {
    return totalStatesPerClassMin;
  }

  public int getTotalEventsPerClassMin()
  {
    return totalEventsPerClassMin;
  }

  public int getTotalGuardsPerClassMin()
  {
    return totalGuardsPerClassMin;
  }

  public int getTotalTransitionsPerClassMin()
  {
    return totalTransitionsPerClassMin;
  }

  public int getTotalDifferentTransitionsPerClassMin()
  {
    return totalDifferentTransitionsPerClassMin;
  }

  public int getTotalActionsPerClassMin()
  {
    return totalActionsPerClassMin;
  }

  public int getTotalNestedStateMachinePerClassMin()
  {
    return totalNestedStateMachinePerClassMin;
  }

  public int getTotalSelfCyclesPerClassMin()
  {
    return totalSelfCyclesPerClassMin;
  }

  public int getTotalCyclesPerClassMin()
  {
    return totalCyclesPerClassMin;
  }

  public List<State> getVisitedStates()
  {
    return visitedStates;
  }

  /**
   * keep transitions without repetition of an StM. Use method Load
   */
  public Set<Transition> getTransitionsList()
  {
    return transitionsList;
  }

  public Set<State> getStatesSet()
  {
    return statesSet;
  }

  public Set<Event> getEventsSet()
  {
    return eventsSet;
  }

  public void delete()
  {}


  /**
   * 
   * Increment Total Values with partial values or values counted in
   * a class.
   * 
   */
  @umplesourcefile(line={312},file={"SimpleMetrics_SM.ump"},javaline={743},length={15})
  public void incTotal(CountSM countPerClass){
    this.incTotalClass(1);	  	
	  this.incTotalStateMachines(countPerClass.getTotalStateMachinesPerClass());
	  this.incTotalStates(countPerClass.getTotalStatesPerClass());
	  this.incTotalTransitions(countPerClass.getTotalTransitionsPerClass());
	  this.incTotalTransitions(countPerClass.getTotalGuardsPerClass());
	  this.incTotalDifferentTransitions(countPerClass.getTotalDifferentTransitionsPerClass());
	  this.incTotalEvents(countPerClass.getTotalEventsPerClass());
	  this.incTotalGuards(countPerClass.getTotalGuardsPerClass());
	  this.incTotalActions(countPerClass.getTotalActionsPerClass());
	  this.incTotalNestedStateMachine(countPerClass.getTotalNestedStateMachinePerClass());
	  this.incTotalCycles(countPerClass.getTotalCyclesPerClass());
	  this.incTotalSelfCycles(countPerClass.getTotalSelfCyclesPerClass());
	  return;
  }


  /**
   * 
   * Analyze if new values collected is MIN or MAX than values had stored in order to hold correct
   * MAX and MIN values.
   * 
   */
  @umplesourcefile(line={332},file={"SimpleMetrics_SM.ump"},javaline={767},length={67})
  public void calcMinMax(CountSM countPerClass){
    // calculating MAX
	  
	  if (countPerClass.getTotalStateMachinesPerClass() > this.getTotalStateMachinesPerClassMax()) {
	     this.setTotalStateMachinesPerClassMax(countPerClass.getTotalStateMachinesPerClass());
	  }
	  if(countPerClass.getTotalStatesPerClass() > this.getTotalStatesPerClassMax() ){
	    this.setTotalStatesPerClassMax(countPerClass.getTotalStatesPerClass());
	  }
	  if(countPerClass.getTotalTransitionsPerClass() > this.getTotalTransitionsPerClassMax() ){
	    this.setTotalTransitionsPerClassMax(countPerClass.getTotalTransitionsPerClass());
	  }
	  if(countPerClass.getTotalGuardsPerClass() > this.getTotalGuardsPerClassMax() ){
	    this.setTotalGuardsPerClassMax(countPerClass.getTotalGuardsPerClass());
	  }
	  if(countPerClass.getTotalDifferentTransitionsPerClass() > this.getTotalDifferentTransitionsPerClassMax() ){
	    this.setTotalDifferentTransitionsPerClassMax(countPerClass.getTotalDifferentTransitionsPerClass());
	  }
	  if(countPerClass.getTotalEventsPerClass() > this.getTotalEventsPerClassMax() ){
	    this.setTotalEventsPerClassMax(countPerClass.getTotalEventsPerClass() );
	  }
	  if(countPerClass.getTotalActionsPerClass() > this.getTotalActionsPerClassMax() ){
	    this.setTotalActionsPerClassMax(countPerClass.getTotalActionsPerClass() );
	  }
	  if(countPerClass.getTotalNestedStateMachinePerClass() > this.getTotalNestedStateMachinePerClassMax() ){
	    this.setTotalNestedStateMachinePerClassMax(countPerClass.getTotalNestedStateMachinePerClass());
	  }
	  if(countPerClass.getTotalCyclesPerClass() > this.getTotalCyclesPerClassMax() ){
	    this.setTotalCyclesPerClassMax(countPerClass.getTotalCyclesPerClass());
	  }
	  if(countPerClass.getTotalSelfCyclesPerClass() > this.getTotalSelfCyclesPerClassMax() ){
	    this.setTotalSelfCyclesPerClassMax(countPerClass.getTotalSelfCyclesPerClass());
	  }
	  
	  // calculating MIN
	  if (countPerClass.getTotalStateMachinesPerClass() < this.getTotalStateMachinesPerClassMin()) {
	     this.setTotalStateMachinesPerClassMin(countPerClass.getTotalStateMachinesPerClass());
	  }
	  if(countPerClass.getTotalStatesPerClass() < this.getTotalStatesPerClassMin() ){
	    this.setTotalStatesPerClassMin(countPerClass.getTotalStatesPerClass());
	  }
	  if(countPerClass.getTotalTransitionsPerClass() < this.getTotalTransitionsPerClassMin() ){
	    this.setTotalTransitionsPerClassMin(countPerClass.getTotalTransitionsPerClass());
	  }
	  if(countPerClass.getTotalGuardsPerClass() < this.getTotalGuardsPerClassMin() ){
	    this.setTotalGuardsPerClassMin(countPerClass.getTotalGuardsPerClass());
	  }
	  if(countPerClass.getTotalDifferentTransitionsPerClass() < this.getTotalDifferentTransitionsPerClassMin() ){
	    this.setTotalDifferentTransitionsPerClassMin(countPerClass.getTotalDifferentTransitionsPerClass());
	  }
	  if(countPerClass.getTotalEventsPerClass() < this.getTotalEventsPerClassMin() ){
	    this.setTotalEventsPerClassMin(countPerClass.getTotalEventsPerClass() );
	  }
	  if(countPerClass.getTotalActionsPerClass() < this.getTotalActionsPerClassMin() ){
	    this.setTotalActionsPerClassMin(countPerClass.getTotalActionsPerClass() );
	  }
	  if(countPerClass.getTotalNestedStateMachinePerClass() < this.getTotalNestedStateMachinePerClassMin() ){
	    this.setTotalNestedStateMachinePerClassMin(countPerClass.getTotalNestedStateMachinePerClass());
	  }
	  if(countPerClass.getTotalCyclesPerClass() < this.getTotalCyclesPerClassMin() ){
	    this.setTotalCyclesPerClassMin(countPerClass.getTotalCyclesPerClass());
	  }
	  if(countPerClass.getTotalSelfCyclesPerClass() < this.getTotalSelfCyclesPerClassMin() ){
	    this.setTotalSelfCyclesPerClassMin(countPerClass.getTotalSelfCyclesPerClass());
	  }
	  return;
  }


  /**
   * 
   * Calculate State Machine Metrics for given Umple Class.
   * Considering an Umple Class can have multiples State Machines, this
   * method call the method calculate (StateMachine) per each State Machine
   * found in Umple Class. It is a Wraper Class.
   * @param  Umple Class under analysis
   * 
   */
  @umplesourcefile(line={407},file={"SimpleMetrics_SM.ump"},javaline={843},length={9})
  public void calculate(UmpleClass uClass){
    this.setTotalStateMachinesPerClass( uClass.getStateMachines().size() );
	  
	  for ( StateMachine sm : uClass.getStateMachines() ) {
		eventsSet.clear();
		this.setTotalEventsPerClass(0);
		this.calculate ( sm );
      }
  }


  /**
   * 
   * Calculate State Machine Metrics for a given State Machine.
   * Considering an state can be a state machine also, this method call
   * nestedSM (sm) to analyse Statemachine recursively.
   * @param  StateMachine under analysis
   * 
   */
  @umplesourcefile(line={423},file={"SimpleMetrics_SM.ump"},javaline={864},length={11})
  public void calculate(StateMachine sm){
    nestedSM (sm);	 
	  
	  // Put each event of all transitions in a SET structure
	  for(Transition tran : transitionsList){
	    eventsSet.add(tran.getEvent()); // add event to a Set Java Structure
	  }
	  this.incTotalEventsPerClass(eventsSet.size());
	 
	  eventsSet.clear();
  }


  /**
   * 
   * This method calculate the metrics of StateMachine recursively, storaging
   * values per class and totals of files analyzed.
   * Programmer consideration when alter this method. 
   * Immediately before return, always call methods:
   * - this.resetVisitedStates(); 
   * @param  StateMachine under analysis
   * 
   */
  @umplesourcefile(line={443},file={"SimpleMetrics_SM.ump"},javaline={886},length={38})
  public void nestedSM(StateMachine sm){
    this.load(sm); // Load all transitions to SET  Java Structure
      // Look for states
      for ( State state: sm.getStates() ) {          

		this.incTotalStatesPerClass( 1 );
		
		// Count self cycle
		this.incTotalSelfCyclesPerClass( this.getAmountSelfCycles( state ) );
		
		// Count Cycles
        this.incTotalCyclesPerClass( this.getAmountCycles( state ) );
        
        // Look for Actions
		for ( Action actions: state.getActions() ) {  
		  this.incTotalActionsPerClass( 1 );
		}
		
        // Look for transitions
        for ( Transition transition: state.getTransitions() ) {
		  this.incTotalTransitionsPerClass( 1 );
		  if (transition.getGuard()!=null){     // if there is a guard condition then count it
		    this.incTotalGuardsPerClass(1);
		  }   
		}
           
        // Look for Nested StateMachine
        for ( StateMachine smnested: state.getNestedStateMachines() ) {
		  this.incTotalNestedStateMachinePerClass( 1 );
          nestedSM( smnested );     
        }               
      }
	  
	  this.setTotalDifferentTransitionsPerClass( this.transitionsList.size() );
	  
	  this.resetVisitedStates();	
	  return ;
  }


  /**
   * END METHOD
   * 
   * Answer if there is a Self Cycle in a specific state.
   * @param  state used to look for self cycles
   * @return TRUE  means there is at least one self cycle
   * FALSE means there is NOT self cycle
   * 
   */
  @umplesourcefile(line={490},file={"SimpleMetrics_SM.ump"},javaline={937},length={7})
  public boolean hasSelfCycle(State state){
    List <Transition> TransitionsList= state.getTransitions();
	  for( Transition transition : TransitionsList){
	    if(transition.getNextState() == state ) return true;
	  }
	  return false;
  }


  /**
   * 
   * Answer the amount of Self cycles in a specific state. 	
   * @param  state used to look for cycles
   * @return The amount of transitions that represents Self Cycles 
   * 
   */
  @umplesourcefile(line={503},file={"SimpleMetrics_SM.ump"},javaline={956},length={8})
  public int getAmountSelfCycles(State state){
    int amount=0;
	  List <Transition> TransitionsList= state.getTransitions();
	  for( Transition transition : TransitionsList){
	    if(transition.getNextState() == state ) ++amount;
	  }
	  return amount;
  }


  /**
   * 
   * Count the amount of cycles considering a specific state as start node.
   * @param  state used to look for cycles
   * @return  The amount of transitions that provoke Self Cycles. 
   * Value Zero means there is NOT cycle.
   * Value -1 means a invalid NULL state was supplied as parameter.
   * 
   */
  @umplesourcefile(line={519},file={"SimpleMetrics_SM.ump"},javaline={974},length={16})
  public int getAmountCycles(State state){
    this.resetVisitedStates();
	  if (state==null) return -1;
	  
	  int sum=0;
	  List <Transition> TransitionsList= state.getTransitions();
	  for( Transition transition : TransitionsList){
	    if(transition.getNextState().equals(state) ) {
		  visitedStates.add(state); // Mark currentState like state already visited
		  sum= sum + 1 ;
		}else{
		  sum = countCycles( state, transition.getNextState(), sum );
		}
	  }
	  return sum;
  }


  /**
   * 
   * Count the amount of cycles recursively considering a specific state as start node.
   * This function was created to help execution of getAmountCycles(State). 
   * It must not be used directly. Use getAmountCycles(State)
   * @param  firstState is the state used like first state through looking for cycles
   * @param  currentState is the state under analysis. Algorithm checks if it returned to firstState
   * completing a cycle. It means, if currentState=firstState a Cycle was found.
   * @param  sum is used as accumulator (summing) among recursive loops.        	
   * @return  The amount of transitions that provoke Self Cycles. 
   * Value Zero means there is NOT cycle.
   * 
   */
  @umplesourcefile(line={547},file={"SimpleMetrics_SM.ump"},javaline={1002},length={17})
  public int countCycles(State firstState, State currentState, int sum){
    int count=0;
	  
      if ( currentState==null || visitedStates.contains(currentState) ) return sum; 
	  
	  visitedStates.add(currentState); // Mark currentState like state already visited
	  List <Transition> TransitionsList= currentState.getTransitions();
	  for( Transition transition : TransitionsList){
	    if(transition.getNextState() == firstState ) {
		  count = count + 1;
		}else{
		  count = countCycles( firstState, transition.getNextState(), count );
		}         	  
	  }
	  sum = sum + count;
	  return sum;
  }


  /**
   * 
   * Load all transitions from a list of stateMachines to transitionsList attribute, without 
   * repeating of transitions.
   * This function was created to help execution of getAmountCycles(State). 
   * It must not be used directly. Use getAmountCycles(State)
   * 
   */
  @umplesourcefile(line={571},file={"SimpleMetrics_SM.ump"},javaline={1035},length={6})
  public void load(List<StateMachine> stateMachinesList){
    loadStatesRecursively( stateMachinesList ); // load all states of list of StateMachines
	  for(State state : statesSet){
		transitionsList.addAll(state.getTransitions()); // load all transitions without repeating from states loaded
	  }
  }

  @umplesourcefile(line={578},file={"SimpleMetrics_SM.ump"},javaline={1052},length={8})
  public void load(StateMachine SM){
    if ( SM == null ) return;
	  statesSet.addAll(SM.getStates());
	  
	  for ( State state: SM.getStates() ) {
		  load(state.getNestedStateMachines());
      }
  }

  @umplesourcefile(line={587},file={"SimpleMetrics_SM.ump"},javaline={1062},length={5})
  public void loadStatesRecursively(List<StateMachine> stateMachinesList){
    for (StateMachine sm: stateMachinesList){
	    loadStatesRecursively( sm );
	  }
  }

  @umplesourcefile(line={593},file={"SimpleMetrics_SM.ump"},javaline={1069},length={8})
  public void loadStatesRecursively(StateMachine SM){
    if ( SM == null ) return;
	  statesSet.addAll(SM.getStates());
	  
	  for ( State state: SM.getStates() ) {
		  loadStatesRecursively(state.getNestedStateMachines());
      }
  }

  @umplesourcefile(line={602},file={"SimpleMetrics_SM.ump"},javaline={1079},length={3})
  public void resetVisitedStates(){
    visitedStates.clear();
  }

  @umplesourcefile(line={606},file={"SimpleMetrics_SM.ump"},javaline={1084},length={3})
  public void incTotalStateMachines(int a){
    this.totalStateMachines+=a;
  }

  @umplesourcefile(line={609},file={"SimpleMetrics_SM.ump"},javaline={1089},length={3})
  public void incTotalStateMachinesPerClass(int a){
    this.totalStateMachinesPerClass+=a;
  }

  @umplesourcefile(line={612},file={"SimpleMetrics_SM.ump"},javaline={1094},length={3})
  public void incTotalStatesPerClass(int a){
    this.totalStatesPerClass+=a;
  }

  @umplesourcefile(line={615},file={"SimpleMetrics_SM.ump"},javaline={1099},length={3})
  public void incTotalStates(int a){
    this.totalStates+=a;
  }

  @umplesourcefile(line={618},file={"SimpleMetrics_SM.ump"},javaline={1104},length={3})
  public void incTotalEvents(int a){
    this.totalEvents+=a;
  }

  @umplesourcefile(line={621},file={"SimpleMetrics_SM.ump"},javaline={1109},length={3})
  public void incTotalEventsPerClass(int a){
    this.totalEventsPerClass+=a;
  }

  @umplesourcefile(line={624},file={"SimpleMetrics_SM.ump"},javaline={1114},length={3})
  public void incTotalTransitions(int a){
    this.totalTransitions+=a;
  }

  @umplesourcefile(line={627},file={"SimpleMetrics_SM.ump"},javaline={1119},length={3})
  public void incTotalTransitionsPerClass(int a){
    this.totalTransitionsPerClass+=a;
  }

  @umplesourcefile(line={630},file={"SimpleMetrics_SM.ump"},javaline={1124},length={3})
  public void incTotalGuards(int a){
    this.totalGuards+=a;
  }

  @umplesourcefile(line={633},file={"SimpleMetrics_SM.ump"},javaline={1129},length={3})
  public void incTotalGuardsPerClass(int a){
    this.totalGuardsPerClass+=a;
  }

  @umplesourcefile(line={636},file={"SimpleMetrics_SM.ump"},javaline={1134},length={3})
  public void incTotalDifferentTransitions(int a){
    this.totalDifferentTransitions+=a;
  }

  @umplesourcefile(line={639},file={"SimpleMetrics_SM.ump"},javaline={1139},length={3})
  public void incTotalDifferentTransitionsPerClass(int a){
    this.totalDifferentTransitionsPerClass+=a;
  }


  /**
   * void incAvgTransitionsPerClass(int a){
   * this.avgTransitionsPerClass+=a;
   * }
   */
  @umplesourcefile(line={645},file={"SimpleMetrics_SM.ump"},javaline={1144},length={3})
  public void incTotalActions(int a){
    this.totalActions+=a;
  }

  @umplesourcefile(line={648},file={"SimpleMetrics_SM.ump"},javaline={1155},length={3})
  public void incTotalActionsPerClass(int a){
    this.totalActionsPerClass+=a;
  }

  @umplesourcefile(line={651},file={"SimpleMetrics_SM.ump"},javaline={1160},length={3})
  public void incTotalNestedStateMachine(int a){
    this.totalNestedStateMachine+=a;
  }

  @umplesourcefile(line={654},file={"SimpleMetrics_SM.ump"},javaline={1165},length={3})
  public void incTotalNestedStateMachinePerClass(int a){
    this.totalNestedStateMachinePerClass+=a;
  }

  @umplesourcefile(line={657},file={"SimpleMetrics_SM.ump"},javaline={1170},length={3})
  public void incTotalSelfCycles(int a){
    this.totalSelfCycles+=a;
  }

  @umplesourcefile(line={660},file={"SimpleMetrics_SM.ump"},javaline={1175},length={3})
  public void incTotalSelfCyclesPerClass(int a){
    this.totalSelfCyclesPerClass+=a;
  }

  @umplesourcefile(line={663},file={"SimpleMetrics_SM.ump"},javaline={1180},length={3})
  public void incTotalCycles(int a){
    this.totalCycles+=a;
  }

  @umplesourcefile(line={666},file={"SimpleMetrics_SM.ump"},javaline={1185},length={3})
  public void incTotalCyclesPerClass(int a){
    this.totalCyclesPerClass+=a;
  }

  @umplesourcefile(line={669},file={"SimpleMetrics_SM.ump"},javaline={1190},length={3})
  public void incTotalClass(int a){
    this.totalClass+=a;
  }


  /**
   * 
   * Get values and set them like MIN and MAX values.
   * Used after first values calculated, when those values is MIN and MAX, considering they are first
   * values calculated.
   * @param  a CountSM class containing first values calculated   
   * 
   */
  @umplesourcefile(line={680},file={"SimpleMetrics_SM.ump"},javaline={1195},length={25})
  public void setMinMax(CountSM count){
    // MAX ATTRIBUTES
      this.totalStateMachinesPerClassMax = count.getTotalStateMachinesPerClassMax();	
	  this.totalStatesPerClassMax = count.getTotalStatesPerClassMax();
	  this.totalEventsPerClassMax = count.getTotalEventsPerClassMax();
	  this.totalGuardsPerClassMax = count.getTotalGuardsPerClassMax();
	  this.totalTransitionsPerClassMax = count.getTotalTransitionsPerClassMax();
	  this.totalDifferentTransitionsPerClassMax = count.getTotalDifferentTransitionsPerClassMax();
	  this.totalActionsPerClassMax = count.getTotalActionsPerClassMax();
	  this.totalNestedStateMachinePerClassMax = count.getTotalNestedStateMachinePerClassMax();
	  this.totalSelfCyclesPerClassMax = count.getTotalSelfCyclesPerClassMax();	
	  this.totalCyclesPerClassMax = count.getTotalCyclesPerClassMax(); 
	  
	  // MIN ATTRIBUTES
      this.totalStateMachinesPerClassMin = count.getTotalStateMachinesPerClassMin();	
	  this.totalStatesPerClassMin = count.getTotalStatesPerClassMin();
	  this.totalEventsPerClassMin = count.getTotalEventsPerClassMin();
	  this.totalGuardsPerClassMin = count.getTotalGuardsPerClassMin();
	  this.totalTransitionsPerClassMin = count.getTotalTransitionsPerClassMin();
	  this.totalDifferentTransitionsPerClassMin = count.getTotalDifferentTransitionsPerClassMin();
	  this.totalActionsPerClassMin = count.getTotalActionsPerClassMin();
	  this.totalNestedStateMachinePerClassMin = count.getTotalNestedStateMachinePerClassMin();
	  this.totalSelfCyclesPerClassMin = count.getTotalSelfCyclesPerClassMin();	
	  this.totalCyclesPerClassMin = count.getTotalCyclesPerClassMin();
  }


  public String toString()
  {
	  String outputString = "";
    return super.toString() + "["+
            "totalStateMachines" + ":" + getTotalStateMachines()+ "," +
            "totalStateMachinesPerClass" + ":" + getTotalStateMachinesPerClass()+ "," +
            "totalStates" + ":" + getTotalStates()+ "," +
            "totalStatesPerClass" + ":" + getTotalStatesPerClass()+ "," +
            "totalEvents" + ":" + getTotalEvents()+ "," +
            "totalEventsPerClass" + ":" + getTotalEventsPerClass()+ "," +
            "totalTransitions" + ":" + getTotalTransitions()+ "," +
            "totalTransitionsPerClass" + ":" + getTotalTransitionsPerClass()+ "," +
            "totalGuards" + ":" + getTotalGuards()+ "," +
            "totalGuardsPerClass" + ":" + getTotalGuardsPerClass()+ "," +
            "totalDifferentTransitions" + ":" + getTotalDifferentTransitions()+ "," +
            "totalDifferentTransitionsPerClass" + ":" + getTotalDifferentTransitionsPerClass()+ "," +
            "totalActions" + ":" + getTotalActions()+ "," +
            "totalActionsPerClass" + ":" + getTotalActionsPerClass()+ "," +
            "totalNestedStateMachine" + ":" + getTotalNestedStateMachine()+ "," +
            "totalNestedStateMachinePerClass" + ":" + getTotalNestedStateMachinePerClass()+ "," +
            "totalSelfCycles" + ":" + getTotalSelfCycles()+ "," +
            "totalSelfCyclesPerClass" + ":" + getTotalSelfCyclesPerClass()+ "," +
            "totalCycles" + ":" + getTotalCycles()+ "," +
            "totalCyclesPerClass" + ":" + getTotalCyclesPerClass()+ "," +
            "totalClass" + ":" + getTotalClass()+ "," +
            "totalStateMachinesPerClassMax" + ":" + getTotalStateMachinesPerClassMax()+ "," +
            "totalStatesPerClassMax" + ":" + getTotalStatesPerClassMax()+ "," +
            "totalEventsPerClassMax" + ":" + getTotalEventsPerClassMax()+ "," +
            "totalGuardsPerClassMax" + ":" + getTotalGuardsPerClassMax()+ "," +
            "totalTransitionsPerClassMax" + ":" + getTotalTransitionsPerClassMax()+ "," +
            "totalDifferentTransitionsPerClassMax" + ":" + getTotalDifferentTransitionsPerClassMax()+ "," +
            "totalActionsPerClassMax" + ":" + getTotalActionsPerClassMax()+ "," +
            "totalNestedStateMachinePerClassMax" + ":" + getTotalNestedStateMachinePerClassMax()+ "," +
            "totalSelfCyclesPerClassMax" + ":" + getTotalSelfCyclesPerClassMax()+ "," +
            "totalCyclesPerClassMax" + ":" + getTotalCyclesPerClassMax()+ "," +
            "totalStateMachinesPerClassMin" + ":" + getTotalStateMachinesPerClassMin()+ "," +
            "totalStatesPerClassMin" + ":" + getTotalStatesPerClassMin()+ "," +
            "totalEventsPerClassMin" + ":" + getTotalEventsPerClassMin()+ "," +
            "totalGuardsPerClassMin" + ":" + getTotalGuardsPerClassMin()+ "," +
            "totalTransitionsPerClassMin" + ":" + getTotalTransitionsPerClassMin()+ "," +
            "totalDifferentTransitionsPerClassMin" + ":" + getTotalDifferentTransitionsPerClassMin()+ "," +
            "totalActionsPerClassMin" + ":" + getTotalActionsPerClassMin()+ "," +
            "totalNestedStateMachinePerClassMin" + ":" + getTotalNestedStateMachinePerClassMin()+ "," +
            "totalSelfCyclesPerClassMin" + ":" + getTotalSelfCyclesPerClassMin()+ "," +
            "totalCyclesPerClassMin" + ":" + getTotalCyclesPerClassMin()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "visitedStates" + "=" + (getVisitedStates() != null ? !getVisitedStates().equals(this)  ? getVisitedStates().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "transitionsList" + "=" + (getTransitionsList() != null ? !getTransitionsList().equals(this)  ? getTransitionsList().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "statesSet" + "=" + (getStatesSet() != null ? !getStatesSet().equals(this)  ? getStatesSet().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "eventsSet" + "=" + (getEventsSet() != null ? !getEventsSet().equals(this)  ? getEventsSet().toString().replaceAll("  ","    ") : "this" : "null")
     + outputString;
  }
}