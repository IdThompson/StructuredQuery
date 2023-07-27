package com.activEgde.structured_query.controller;

import com.activEgde.structured_query.model.TableOne;
import com.activEgde.structured_query.service.TableService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TableController {
    private final TableService recordService;
    @GetMapping("/ordered-records-not-in-t2")
    public List<TableOne> getOrderedRecordsNotInT2() {
        return recordService.findOrderedRecordsNotInT2();
    }
}
