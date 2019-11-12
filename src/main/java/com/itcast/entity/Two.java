package com.itcast.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 表1 2厂址观测站使用仪器一览表
 * </p>
 *
 * @author huodian
 * @since 2019-11-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("one_two")
@ApiModel(value="Two对象", description="表1 2厂址观测站使用仪器一览表")
public class Two implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "仪器名称")
    private String name;

    @ApiModelProperty(value = "型号")
    private String model;

    @ApiModelProperty(value = "安装高度")
    private String height;

    @ApiModelProperty(value = "厂家名称")
    private String factory;


}
