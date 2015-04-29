package com.github.vladislav719.repository;

import com.github.vladislav719.model.Entry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vladislav on 29.04.2015.
 */
@Repository
public interface EntryRepository extends CrudRepository<Entry, Long> {
}
