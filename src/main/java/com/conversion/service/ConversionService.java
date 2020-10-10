package com.conversion.service;

import com.conversion.exception.ConversionException;
import com.conversion.webapp.request.ConverionRequest;
import com.conversion.webapp.response.ConversionResponse;

public interface ConversionService {

	ConversionResponse getConvert(ConverionRequest request) throws ConversionException;

}
