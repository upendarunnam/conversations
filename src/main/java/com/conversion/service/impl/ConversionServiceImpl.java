package com.conversion.service.impl;

import org.springframework.stereotype.Service;

import com.conversion.constant.ConversionTypes;
import com.conversion.constant.ResponseStatus;
import com.conversion.exception.ConversionException;
import com.conversion.service.ConversionService;
import com.conversion.webapp.request.ConverionRequest;
import com.conversion.webapp.response.ConversionResponse;

@Service
public class ConversionServiceImpl implements ConversionService {

	@Override
	public ConversionResponse getConvert(ConverionRequest request) throws ConversionException {
		
		if (request.getType() == null) {
			throw new ConversionException(ResponseStatus.ERROR, "Type is required");
		} else if (ConversionTypes.asMyEnum(request.getType()) == null) {
			throw new ConversionException(ResponseStatus.ERROR,
					"Please provide supported type from eg. KelvinToCelsius, PoundsToKilograms, MilesToKilometers");
		} else if (request.getValue() == 0) {
			throw new ConversionException(ResponseStatus.ERROR, "Pass the value more than 0");
		}

		ConversionResponse response = new ConversionResponse();
		response.setStatus(ResponseStatus.OK);

		double value = request.getValue();

		if (request.getType().equals(ConversionTypes.KelvinToCelsius.getType())) {
			double defaultValue = 273.15;
			response.setMessage(value + " Kelvin To Celsius is " + (value - defaultValue));
		} else if (request.getType().equals(ConversionTypes.MilesToKilometers.getType())) {
			double defaultValue = 1.60934;
			response.setMessage(value + " Miles To Kilometers is " + (value * defaultValue));
		} else if (request.getType().equals(ConversionTypes.PoundsToKilograms.getType())) {
			double defaultValue = 0.4536;
			response.setMessage(value + " Pounds To Kilograms is " + (value * defaultValue));
		}
		return response;
	}

}
