package com.nestvision.nest.proxy.fhir.entity;
import javax.persistence.Temporal;
import java.util.Date;
import javax.persistence.TemporalType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.nestvision.nest.proxy.base.entity.BaseEntity;
import com.nestvision.nest.proxy.fhir.anotaion.FhirFieldValidate;

@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "SLOT")
public class Slot extends FhirResourceEntity {

    /**
     *名称:院内号源id
     *备注:号源在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="ITEM_CODE",length = 40,nullable = false)
     @FhirFieldValidate(name="ITEM_CODE",displayName="院内号源id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String itemCode;
    /**
     *名称:排班信息id
     *备注:引用排班信息表T_SCHEDULE院内排班id
 	 *
 	 *
     */
     @Column(name="SCHEDULE_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="SCHEDULE_ID",displayName="排班信息id",maxLength=40,required=true,valuesRange="")   
     private String scheduleId;
    /**
     *名称:剩余可预约量
     *备注:初始值与排班中可预约量相同。
 	 *
 	 *
     */
     @Column(name="SURPLUS_ALLOW_RESERVATION_NUM",length = 3,nullable = false)
     @FhirFieldValidate(name="SURPLUS_ALLOW_RESERVATION_NUM",displayName="剩余可预约量",maxLength=3,required=true,valuesRange="")   
     private Integer surplusAllowReservationNum;
    /**
     *名称:开始时间
     *
 	 *
 	 *
     */
     @Column(name="START",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="START",displayName="开始时间",required=false,valuesRange="")   
     private Date start;
    /**
     *名称:結束时间
     *
 	 *
 	 *
     */
     @Column(name="END",nullable = true)
 	 @Temporal(TemporalType.TIMESTAMP)    
     @FhirFieldValidate(name="END",displayName="結束时间",required=false,valuesRange="")   
     private Date end;
    /**
     *名称:是否可以被预约
     *
 	 *限制:CUS00004
 	 *
     */
     @Column(name="OVERBOOKED",length = 5,nullable = true)
     @FhirFieldValidate(name="OVERBOOKED",displayName="是否可以被预约",maxLength=5,required=false,valuesRange="CUS00004")   
     private Boolean overbooked;
    /**
     *名称:备注
     *
 	 *
 	 *
     */
     @Column(name="COMMENT",length = 200,nullable = true)
     @FhirFieldValidate(name="COMMENT",displayName="备注",maxLength=200,required=false,valuesRange="")   
     private String comment;
    
     public String getItemCode(){
       	return this.itemCode;
     }
     public void setItemCode(String itemCode){
       	this.itemCode=itemCode;
     }
     public String getScheduleId(){
       	return this.scheduleId;
     }
     public void setScheduleId(String scheduleId){
       	this.scheduleId=scheduleId;
     }
     public Integer getSurplusAllowReservationNum(){
       	return this.surplusAllowReservationNum;
     }
     public void setSurplusAllowReservationNum(Integer surplusAllowReservationNum){
       	this.surplusAllowReservationNum=surplusAllowReservationNum;
     }
     public Date getStart(){
       	return this.start;
     }
     public void setStart(Date start){
       	this.start=start;
     }
     public Date getEnd(){
       	return this.end;
     }
     public void setEnd(Date end){
       	this.end=end;
     }
     public Boolean getOverbooked(){
       	return this.overbooked;
     }
     public void setOverbooked(Boolean overbooked){
       	this.overbooked=overbooked;
     }
     public String getComment(){
       	return this.comment;
     }
     public void setComment(String comment){
       	this.comment=comment;
     }
}