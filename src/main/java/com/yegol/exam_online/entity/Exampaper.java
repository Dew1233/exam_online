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
public class Exampaper implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    @TableField("examId")
    private Integer examId;

    @TableField("studentId")
    private Integer studentId;

    private Integer status;

    @TableField("totalScore")
    private Integer totalScore;

    private Integer score;

    @TableField("startExamTime")
    private LocalDateTime startExamTime;

    @TableField("endExamTime")
    private LocalDateTime endExamTime;

    @TableField("useTime")
    private Integer useTime;

      @TableField(fill = FieldFill.INSERT)
      private LocalDateTime createTime;

      @TableField(fill = FieldFill.INSERT_UPDATE)
      private LocalDateTime updateTime;


}
