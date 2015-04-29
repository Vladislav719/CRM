package com.github.vladislav719.controller;

import com.github.vladislav719.form.RecordForm;
import com.github.vladislav719.model.Entry;
import com.github.vladislav719.service.OrderService;
import com.github.vladislav719.util.FormMapper;
import com.github.vladislav719.validator.FormValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

/**
 * Created by vladislav on 29.04.2015.
 */
@Controller
@RequestMapping(value = "/orders")
public class OrderController {

    @Autowired
    public OrderService orderService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String renderAllOrders(ModelMap map) {
        map.addAttribute("orders", orderService.getAll());

        return "order/order";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addRecord(@ModelAttribute RecordForm recordForm,
                            BindingResult result,
                            ModelMap map) {
        FormValidator.validateRecordForm(recordForm, result);
        if (!result.hasErrors()) {
            Entry entry = FormMapper.recordFormToEntry(recordForm);
            entry.setCreationDate(new Date());
            orderService.save(entry);
            return "redirect:/";
        } else {
            map.addAttribute("errors", result.getFieldErrors());
            return "errors/error";
        }

    }

}
