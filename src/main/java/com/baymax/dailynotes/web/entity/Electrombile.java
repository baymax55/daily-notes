package com.baymax.dailynotes.web.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 电动车
 */
@Data
@Entity
@Table(name = "electrombile",uniqueConstraints = {@UniqueConstraint(columnNames = {"electrombileNumber"},name = "idx_electrombile_number")})
public class Electrombile {
    /**
     * 唯一标识
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 品牌id
     */
    @Column(columnDefinition="bigint(32) COMMENT '品牌id'")
    private Long brandId;
    /**
     * 品牌名称
     */
    @Column(columnDefinition="varchar(50) COMMENT '品牌名称'")
    private String brandName;
    /**
     * 型号id
     */
    @Column(columnDefinition="bigint(32) COMMENT '型号id'")
    private Long modelId;
    /**
     * 型号名称
     */
    @Column(columnDefinition="varchar(50) COMMENT '型号名称'")
    private String modelName;
    /**
     * 颜色
     */
    @Column(columnDefinition="varchar(50) COMMENT '颜色'")
    private String color;
    /**
     * 整车编号
     */
    @Column(columnDefinition="varchar(50) COMMENT '整车编号'")
    private String electrombileNumber;
    /**
     * 电机编号
     */
    @Column(columnDefinition="varchar(50) COMMENT '电机编号'")
    private String electricNumber;
    /**
     * 车辆用途
     * 0：自用 1：快递 2：外卖 3：其他
     */
    @Column(columnDefinition="varchar(20) COMMENT '车辆用途'")
    private String electrombileUsage;
    /**
     * 车辆合格证
     */
    @Column(columnDefinition="varchar(256) COMMENT '车辆合格证'")
    private String electrombileCertificate;
    /**
     * 生产厂家
     */
    @Column(columnDefinition="varchar(256) COMMENT '生产厂家'")
    private String manufacturer;
    /**
     * 创建时间
     */
    @Column(columnDefinition="datetime COMMENT '创建时间'")
    private Date createdAt;
    /**
     * 最后更新时间
     */
    @Column(columnDefinition="datetime COMMENT '最后更新时间'")
    private Date lastUploadatedAt;
    /**
     * 状态 0正常
     */
    @Column(columnDefinition="varchar(10) COMMENT '状态 0正常'")
    private String status;
}
