package com.activEgde.structured_query.service;

import com.activEgde.structured_query.model.TableOne;
import com.activEgde.structured_query.repository.TableOneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TableService {
    private final TableOneRepository t1Repository;

    public List<TableOne> findOrderedRecordsNotInT2() {
        return t1Repository.findOrderedRecordsNotInT2();
    }
}
