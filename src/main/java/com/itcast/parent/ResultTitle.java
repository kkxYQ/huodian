package com.itcast.parent;


import com.itcast.config.MyResponse;
import com.itcast.config.ResultEnum;
import lombok.Data;

import java.util.List;

/**
 * 模板返回实体
 */
@Data
public class ResultTitle  {

    private String title;//标题
    private String content;//文本
    private List<String> imageAddress;//图片地址
    private Table table;//返回的表格数据
    private Histogram histogram;//返回的柱状图数据
    private LineChart lineChart;//返回的折线图数据
    private Graph graph;//返回的曲线图数据
    private RoseFigure roseFigure;//返回的风玫瑰图数据

}
