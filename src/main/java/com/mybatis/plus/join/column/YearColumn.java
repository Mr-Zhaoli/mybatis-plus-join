package com.mybatis.plus.join.column;

import com.mybatis.plus.join.ColumnData;
import lombok.Data;

@Data
public class YearColumn implements Column {
    private Column column;
    private String asName;

    public YearColumn(Column column) {
        this.column = column;
    }

    @Override
    public String selectColumn() {
        return "year(" + column.selectColumn() + ")";
    }

    @Override
    public void fillData(ColumnData columnData) {
        column.fillData(columnData);
    }

    @Override
    public void setAsName(String asName) {
        this.asName = asName;
    }
}