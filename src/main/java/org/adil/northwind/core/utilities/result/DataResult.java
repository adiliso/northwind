package org.adil.northwind.core.utilities.result;

import java.util.List;

public class DataResult<T> extends Result {
    private T data;
    private List<T> dataList;

    public DataResult(boolean success, String message, T data) {
        super(success, message);
        this.data = data;
    }

    public DataResult(boolean success, T data) {
        super(success);
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

