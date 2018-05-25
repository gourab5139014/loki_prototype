/**
 * 
 */
package edu.buffalo.cse.loki.modules;
import java.util.HashMap;

/**
 * @author gourabmi
 *
 */
public abstract class EnvironmentalDataLink implements Link {
	private HashMap<Matcher, HashMap<Concept, Double>> mappings;
}
