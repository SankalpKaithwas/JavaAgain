package com.interfaces.challenge;

public class Building implements IMappable {

	private String name;
	private UsageType usage;

	public Building(String name, UsageType usage) {
		this.name = name;
		this.usage = usage;
	}

	@Override
	public String getLabel() {
		return name + " (" + usage + ")";
	}

	@Override
	public Geometry getShape() {
		return Geometry.POINT;
	}

	@Override
	public String getMarker() {
		return switch (usage) {
		case ENTERTAINMENT -> Color.GREEN + " " + PointMarker.TRIANGLE;
		case GOVERNMENT -> Color.RED + " " + PointMarker.STAR;
		case RESIDENTIAL -> Color.BLUE + " " + PointMarker.SQUARE;
		case SPORTS -> Color.ORANGE + " " + PointMarker.PUSH_PIN;
		default -> Color.BLACK + " " + PointMarker.CIRCLE;
		};
	}

	@Override
	public String toJSON() {
		return IMappable.super.toJSON() + """
				, "name": "%s", "usage": "%s" """.formatted(name, usage);
	}

}
