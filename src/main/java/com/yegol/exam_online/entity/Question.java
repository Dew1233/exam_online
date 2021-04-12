package com.yegol.exam_online.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author YeGol
 * @since 2021-04-09
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Question implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    @TableField("subjectId")
    private Integer subjectId;

    @TableField("questionType")
    private Integer questionType;

    private String title;

    private Integer score;

    @TableField("attrA")
    private String attrA;

    @TableField("attrB")
    private String attrB;

    @TableField("attrC")
    private String attrC;

    @TableField("attrD")
    private String attrD;

    private String answer;

    @TableField("createTime")
    private LocalDateTime createTime;


}
