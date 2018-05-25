/**
 * 
 */
package edu.buffalo.cse.loki.modules;
import java.util.Random;

import 
/**
 * @author gourabmi
 *
 */
public class UniformDistributionNumericalMatcher extends NumericalMatcher {

	/* (non-Javadoc)
	 * @see edu.buffalo.cse.loki.modules.Matcher#calculateFit()
	 */
	public Double calculateFit() {
		// TODO Auto-generated method stub
		
		return new Random().next;
	}

}
