package com.yegol.exam_online.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
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
public class Exam implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    private String name;

    @TableField("subjectId")
    private Integer subjectId;

    @TableField("startTime")
    private LocalDateTime startTime;

    @TableField("endTime")
    private LocalDateTime endTime;

    @TableField("avaliableTime")
    private Integer avaliableTime;

    @TableField("questionNum")
    private Integer questionNum;

    @TableField("totalScore")
    private Integer totalScore;

    @TableField("passScore")
    private Integer passScore;

    @TableField("singleQuestionNum")
    private Integer singleQuestionNum;

    @TableField("muiltQuestionNum")
    private Integer muiltQuestionNum;

    @TableField("chargeQuestionNum")
    private Integer chargeQuestionNum;

    @TableField("paperNum")
    private Integer paperNum;

    @TableField("examedNum")
    private Integer examedNum;

    @TableField("passNum")
    private Integer passNum;

      @TableField(fill = FieldFill.INSERT)
      private LocalDateTime createTime;

      @TableField(fill = FieldFill.INSERT_UPDATE)
      private LocalDateTime updateTime;


}
