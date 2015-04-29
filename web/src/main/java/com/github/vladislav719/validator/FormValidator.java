package com.github.vladislav719.validator;

import com.github.vladislav719.form.RecordForm;
import org.springframework.validation.BindingResult;

/**
 * Created by vladislav on 29.04.2015.
 */
public final class FormValidator {

    public static void validateRecordForm(RecordForm recordForm, BindingResult bindingResult) {
        if ( !(recordForm.getClientName().length() > 0))
            bindingResult.rejectValue("clientName", "" , "??? ?? ?????? ???? ??????");
        if (!(recordForm.getPhone().length() > 0))
            bindingResult.rejectValue("phone", "", "??????? ?????? ???? ???????");

    }
}
