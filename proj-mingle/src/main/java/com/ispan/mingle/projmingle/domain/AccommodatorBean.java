package com.ispan.mingle.projmingle.domain;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Accommodator")
@Component
public class AccommodatorBean {
    
    /** 住宿者ID */
    @Id
    @Column(name = "accommodatorID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accommodatorid;


    /** 訂單ID */
    @Column(name = "fk_orderID",
    columnDefinition = "int")
    private Integer orderid;


    /** 住宿者姓名 */
    @Column(name = "name", 
    columnDefinition = "nvarchar(20)")
    private String name;

    /** 住宿者電話 */
    @Column(name = "phone",
    columnDefinition = "varchar(20)")
    private String phone;


    /** 住宿者信箱 */
    @Column (name = "email",
    columnDefinition = "varchar(50)")
    private String email;


}
