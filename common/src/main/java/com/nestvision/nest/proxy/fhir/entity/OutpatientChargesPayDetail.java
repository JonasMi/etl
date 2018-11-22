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
@Table(name = BaseEntity.TABLE_PREFIX + "OUTPATIENT_CHARGES_PAY_DETAIL")
public class OutpatientChargesPayDetail extends FhirResourceEntity {

    /**
     *名称:院内门诊收费记录id
     *备注:门诊收费记录在院内系统中的唯一标识
 	 *
 	 *主键字段
     */
     @Column(name="OUTPATIENT_CHARGES_ID",length = 40,nullable = false)
     @FhirFieldValidate(name="OUTPATIENT_CHARGES_ID",displayName="院内门诊收费记录id",maxLength=40,required=true,valuesRange="")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String outpatientChargesId;
    /**
     *名称:结算方式代码
     *
 	 *限制:CV0710004
 	 *主键字段
     */
     @Column(name="SETTLEMENT_CODE",length = 20,nullable = false)
     @FhirFieldValidate(name="SETTLEMENT_CODE",displayName="结算方式代码",maxLength=20,required=true,valuesRange="CV0710004")   
     @com.nestvision.nest.proxy.fhir.anotaion.Identifier
     private String settlementCode;
    /**
     *名称:支付金额
     *
 	 *
 	 *
     */
     @Column(name="PAY_AMOUNT",length = 8,nullable = false)
     @FhirFieldValidate(name="PAY_AMOUNT",displayName="支付金额",maxLength=8,required=true,valuesRange="")   
     private Float payAmount;
    /**
     *名称:支付备注
     *
 	 *
 	 *
     */
     @Column(name="PAYMENT_NOTES",length = 100,nullable = true)
     @FhirFieldValidate(name="PAYMENT_NOTES",displayName="支付备注",maxLength=100,required=false,valuesRange="")   
     private String paymentNotes;
     @ManyToOne
     @JoinColumn(name="F_UID")
     private OutpatientCharges outpatientCharges;
    
     public String getOutpatientChargesId(){
       	return this.outpatientChargesId;
     }
     public void setOutpatientChargesId(String outpatientChargesId){
       	this.outpatientChargesId=outpatientChargesId;
     }
     public String getSettlementCode(){
       	return this.settlementCode;
     }
     public void setSettlementCode(String settlementCode){
       	this.settlementCode=settlementCode;
     }
     public Float getPayAmount(){
       	return this.payAmount;
     }
     public void setPayAmount(Float payAmount){
       	this.payAmount=payAmount;
     }
     public String getPaymentNotes(){
       	return this.paymentNotes;
     }
     public void setPaymentNotes(String paymentNotes){
       	this.paymentNotes=paymentNotes;
     }
	 public OutpatientCharges getOutpatientCharges(){
	 	return this.outpatientCharges;
	}
	 public void setOutpatientCharges(OutpatientCharges outpatientCharges){
		this.outpatientCharges=outpatientCharges;
	}
}