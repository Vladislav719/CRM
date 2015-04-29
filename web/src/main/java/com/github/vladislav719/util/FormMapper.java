package com.github.vladislav719.util;

import com.github.vladislav719.form.RecordForm;
import com.github.vladislav719.model.Entry;

/**
 * Created by vladislav on 29.04.2015.
 */
public final class FormMapper {

    public static Entry recordFormToEntry(RecordForm recordForm) {
        Entry entry = new Entry();
        entry.setClientName(recordForm.getClientName());
        entry.setDateAt(recordForm.getDateAt());
        entry.setPhone(recordForm.getPhone());
        entry.setPrice(recordForm.getPrice());

        return entry;
    }

}
