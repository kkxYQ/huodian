package com.itcast.parent;

import com.itcast.entity.*;
import lombok.Data;

import java.util.List;

/**
 * 表格数据
 */
@Data
public class Table {
    private List<One> oneList;//表1.1
    private List<Two> twoList;//表1.2
    private List<Three> threeList;//表1.3
    private List<Four> fourList;//表1.4
    private List<Fives> fivesList;//表1.5
    private List<Six> sixList;//表1.6
}
