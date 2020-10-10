package com.conversion.constant;

public enum ConversionTypes {

	KelvinToCelsius("KelvinToCelsius"), PoundsToKilograms("PoundsToKilograms"), MilesToKilometers("MilesToKilometers");

	private final String val;

	ConversionTypes(String val) {
		this.val = val;
	}

	public String getType() {
		return val;
	}

	public static ConversionTypes asMyEnum(String str) {
		for (ConversionTypes me : ConversionTypes.values()) {
			if (me.name().equalsIgnoreCase(str))
				return me;
		}
		return null;
	}
}
