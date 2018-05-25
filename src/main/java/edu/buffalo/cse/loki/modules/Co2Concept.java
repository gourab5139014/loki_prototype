package edu.buffalo.cse.loki.modules;

import java.util.HashMap;

public class Co2Concept implements Concept {
	private HashMap<Concept, Double> adjacents; // Adjacency Hash for similar concepts with distance to each
	private String name;
}
