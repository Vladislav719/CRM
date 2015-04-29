package com.github.vladislav719.service.impl;

import com.github.vladislav719.model.Entry;
import com.github.vladislav719.repository.EntryRepository;
import com.github.vladislav719.service.OrderService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by vladislav on 29.04.2015.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    public EntryRepository entryRepository;


    @Override
    public Collection<Entry> getAll() {
        return Lists.newArrayList(entryRepository.findAll());
    }

    @Override
    public Entry save(Entry entry) {
        return entryRepository.save(entry);
    }
}
