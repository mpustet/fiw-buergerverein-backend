package com.buergervereinHSH.BackendProject.forms.service;

import com.buergervereinHSH.BackendProject.auth.dataTransferObject.request.GeschStellenDto;
import com.buergervereinHSH.BackendProject.auth.web.ApiResponse;
import com.buergervereinHSH.BackendProject.forms.dataTransferObject.request.FormDto;


import javax.mail.MessagingException;

public interface FormService {

    ApiResponse saveForm(long userId, FormDto formDto);
    ApiResponse sendPDFtoUser(long userId) throws MessagingException;
    ApiResponse changeState(long formId, int statusInt );
    ApiResponse getAllForms();
    ApiResponse getSingleForm(long formId);

}
