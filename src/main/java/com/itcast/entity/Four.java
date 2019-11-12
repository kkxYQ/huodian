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
 * 表1 4主要参数的合理相关性参考值
 * </p>
 *
 * @author huodian
 * @since 2019-11-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("one_four")
@ApiModel(value="Four对象", description="表1 4主要参数的合理相关性参考值")
public class Four implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "气象要素")
    private String meteorologicalElement;

    @ApiModelProperty(value = "条件")
    private String con;

    @ApiModelProperty(value = "合理相关性")
    private String reasonableCorrelation;


}
