package com.apress.prospring4.ch18;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
@Repository
public interface ContactRepository extends PagingAndSortingRepository<Contact, Long> {
}
