package com.example.task4.model.operations.testsMap;

import android.util.Pair;

import java.util.Map;

public abstract class SearchByKeyBase extends BaseMapOperationClass{
    public SearchByKeyBase(Map<String, Integer> map, Integer iDOperation) {
        super(map, iDOperation);
    }
    @Override
    public Pair<Integer, String> call() throws Exception {
        int size = map.size();

        long startTime = System.currentTimeMillis();
        map.get("key " + size / 2);
        long finalTime = System.currentTimeMillis() - startTime;

        return new Pair<>(getIDOperation(), String.valueOf(finalTime));
    }
}
