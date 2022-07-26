package Bai6.dto;

import Bai6.Model.TblStudent;

import java.util.List;

public class ListStudent {
    private List<TblStudent> data;

    public List<TblStudent> getData() {
        return data;
    }

    public void setData(List<TblStudent> data) {
        this.data = data;
    }
}
