package com.conversion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.conversion.exception.ConversionException;
import com.conversion.service.ConversionService;
import com.conversion.webapp.request.ConverionRequest;
import com.conversion.webapp.response.ConversionResponse;

@RestController
@RequestMapping("/api")
public class ConverionController {

	@Autowired
	private ConversionService conversionService;

	@RequestMapping(value = "/convert", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody ConversionResponse getConvert(@RequestBody ConverionRequest request)
			throws ConversionException {

		ConversionResponse response = conversionService.getConvert(request);
		return response;
	}

}
