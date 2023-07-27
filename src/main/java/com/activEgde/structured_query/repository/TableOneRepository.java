package com.activEgde.structured_query.repository;


import com.activEgde.structured_query.model.TableOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TableOneRepository extends JpaRepository<TableOne, Integer> {
    @Query("SELECT t1 FROM TableOne t1 LEFT JOIN TableTwo t2 ON t1.id = t2.id WHERE t2.id IS NULL ORDER BY t1.id")
    List<TableOne> findOrderedRecordsNotInT2();
}
