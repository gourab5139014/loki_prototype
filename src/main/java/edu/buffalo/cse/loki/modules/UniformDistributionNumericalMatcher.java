/**
 * 
 */
package edu.buffalo.cse.loki.modules;
import java.util.Collection;
import java.util.Random;

/**
 * @author gourabmi
 *
 */
public class UniformDistributionNumericalMatcher extends NumericalMatcher {

	/* (non-Javadoc)
	 * @see edu.buffalo.cse.loki.modules.Matcher#calculateFit()
	 */
	public Double calculateFit(Collection c) {
		// TODO Auto-generated method stub
		
		return new Random().nextDouble();
	}

}
