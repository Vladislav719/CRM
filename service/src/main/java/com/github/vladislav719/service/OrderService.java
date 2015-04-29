package com.github.vladislav719.service;

import com.github.vladislav719.model.Entry;

import java.util.Collection;

/**
 * Created by vladislav on 29.04.2015.
 */
public interface OrderService {

    Collection<Entry> getAll();
    Entry save(Entry entry);
}
