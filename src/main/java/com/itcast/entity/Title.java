package com.itcast.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 标题表
 * </p>
 *
 * @author huodian
 * @since 2019-11-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_title")
@ApiModel(value="Title对象", description="标题表")
public class Title implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "一级标题id")
    private Long oneid;

    @ApiModelProperty(value = "二级标题id")
    private Long twoid;

    @ApiModelProperty(value = "三级标题id")
    private Long threeid;

    @ApiModelProperty(value = "标题名称")
    private String titleContent;

    @ApiModelProperty(value = "文本内容")
    private String content;

    @ApiModelProperty(value = "图片地址")
    private String imageAddress;

    @ApiModelProperty(value = "表格(0不存在,1存在)")
    private Boolean form;

    @ApiModelProperty(value = "柱状图(0不存在,1存在)")
    private Boolean histogram;

    @ApiModelProperty(value = "折线图(0不存在，1存在)")
    private Boolean lineChart;

    @ApiModelProperty(value = "曲线图(0不存在，1存在)")
    private Boolean graph;

    @ApiModelProperty(value = "玫瑰图(0不存在，1存在)")
    private Boolean roseFigure;


}
