package com.nestvision.nest.proxy.fhir.entity;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.nestvision.nest.proxy.base.entity.BaseEntity;
import com.nestvision.nest.proxy.fhir.anotaion.FhirFieldValidate;

@Entity
@Table(name = BaseEntity.TABLE_PREFIX + "APPOINTMENT_PAY")
public class AppointmentPay extends FhirResourceEntity {

    /**
     *名称:挂号号
     *备注:引用挂号信息表T_APPOINTMENT挂号号
 	 *
 	 *主键字段
     */
     @Column(name="REGISTER_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="REGISTER_ID",displayName="挂号号",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String registerId;
    /**
     *名称:支付方式代码
     *
 	 *限制:CV9900376
 	 *主键字段
     */
     @Column(name="PAY_WAY_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="PAY_WAY_CD",displayName="支付方式代码",maxLength=20,required=false,valuesRange="CV9900376")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String payWayCd;
    /**
     *名称:结算方式代码
     *
 	 *限制:CV0710004
 	 *
     */
     @Column(name="SETTLEMENT_WAY_CD",length = 20,nullable = true)
     @FhirFieldValidate(name="SETTLEMENT_WAY_CD",displayName="结算方式代码",maxLength=20,required=false,valuesRange="CV0710004")   
     private String settlementWayCd;
    /**
     *名称:支付金额
     *
 	 *
 	 *
     */
     @Column(name="PAY_AMOUNT",length = 8,nullable = false)
     @FhirFieldValidate(name="PAY_AMOUNT",displayName="支付金额",maxLength=8,required=true,valuesRange="")   
     private Float payAmount;
     @ManyToOne
     @JoinColumn(name="F_UID")
     private Appointment appointment;
    
     public String getRegisterId(){
       	return this.registerId;
     }
     public void setRegisterId(String registerId){
       	this.registerId=registerId;
     }
     public String getPayWayCd(){
       	return this.payWayCd;
     }
     public void setPayWayCd(String payWayCd){
       	this.payWayCd=payWayCd;
     }
     public String getSettlementWayCd(){
       	return this.settlementWayCd;
     }
     public void setSettlementWayCd(String settlementWayCd){
       	this.settlementWayCd=settlementWayCd;
     }
     public Float getPayAmount(){
       	return this.payAmount;
     }
     public void setPayAmount(Float payAmount){
       	this.payAmount=payAmount;
     }
	 public Appointment getAppointment(){
	 	return this.appointment;
	}
	 public void setAppointment(Appointment appointment){
		this.appointment=appointment;
	}
}