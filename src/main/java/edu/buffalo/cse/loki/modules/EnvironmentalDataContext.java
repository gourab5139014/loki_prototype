/**
 * 
 */
package edu.buffalo.cse.loki.modules;
import java.util.HashMap;

/**
 * @author gourabmi
 *
 */
public abstract class EnvironmentalDataContext implements Context {
	private HashMap<HashMap<Matcher, Concept>, Double> mappings;
}
