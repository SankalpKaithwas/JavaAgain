package com.interfaces.challenge;

public interface IMappable {

	public String JSON_PROPERTY = """
			"properties: {%s} """;

	String getLabel();

	Geometry getShape();

	String getMarker();

	default String toJSON() {
		return """
				"type": "%s", "label": "%s", "marker": "%s" """.formatted(getShape(), getLabel(), getMarker());
	}

	static void mapIt(IMappable mappable) {
		System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
	}
}
