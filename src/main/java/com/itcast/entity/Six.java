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
 * 表1-6 24时次与4次定时统计值的合理差参考值
 * </p>
 *
 * @author huodian
 * @since 2019-11-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("one_six")
@ApiModel(value="Six对象", description="表1-6 24时次与4次定时统计值的合理差参考值")
public class Six implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "气象要素")
    private String meteorologicalElement;

    @ApiModelProperty(value = "合理差值")
    private String reasonableDifference;


}
