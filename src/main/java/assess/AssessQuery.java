package assess;

import java.util.List;

public class AssessQuery {
	public AssessQuery(
			String targetCube,
			List<String> parsedGammas,
			String measurement,
			String labelingMethod,
			List<List<String>> labelingSystem) {
		System.out.println("Target Cube: " + targetCube);
		System.out.println("Group By: " + parsedGammas);
		System.out.println("Measurement: " + measurement);

		// TODO: Create a labeling System based on the data below
		System.out.println(java.util.Optional.ofNullable(labelingMethod).orElse("Provided Custom System"));
		if (labelingSystem != null) { System.out.println(labelingSystem); }
	}
}
