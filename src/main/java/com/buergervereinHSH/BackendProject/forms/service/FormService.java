package com.buergervereinHSH.BackendProject.forms.service;

import com.buergervereinHSH.BackendProject.auth.dataTransferObject.request.ChangeStateDto;
import com.buergervereinHSH.BackendProject.auth.web.ApiResponse;
import com.buergervereinHSH.BackendProject.forms.dataTransferObject.request.FormDto;
import org.springframework.http.ResponseEntity;


import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;

public interface FormService {

    ApiResponse saveForm(HttpServletRequest request, FormDto formDto);
    ApiResponse sendPDFtoUser(long userId) throws MessagingException;
    ResponseEntity<?> changeState(ChangeStateDto changestateDto );
    ApiResponse getAllForms();
    ResponseEntity<ApiResponse>  getAllFormsOfUser(HttpServletRequest request);
    ApiResponse getSingleForm(long formId);
    Long getUserIdfromToken(HttpServletRequest request);

}
