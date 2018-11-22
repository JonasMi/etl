package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.fhir.entity.Slot;

public class SlotDetails extends SlotRecord {
    /**
     *名称:院内号源id
     *备注:号源在院内系统中的唯一标识
 	 *
     */
     private String itemCode;
    /**
     *名称:排班信息id
     *备注:引用排班信息表T_SCHEDULE院内排班id
 	 *
     */
     private String scheduleId;
    /**
     *名称:剩余可预约量
     *备注:初始值与排班中可预约量相同。
 	 *
     */
     private Integer surplusAllowReservationNum;
    /**
     *名称:开始时间
     *
 	 *
     */
     private Long start;
    /**
     *名称:結束时间
     *
 	 *
     */
     private Long end;
    /**
     *名称:是否可以被预约
     *
 	 *限制:CUS00004
     */
     private Boolean overbooked;
    /**
     *名称:备注
     *
 	 *
     */
     private String comment;
     private String errorMessage;
     private String errorDetail;             
     public SlotDetails(Slot slot) {
        super(slot);
         this.itemCode=slot.getItemCode();
         this.scheduleId=slot.getScheduleId();
         this.surplusAllowReservationNum=slot.getSurplusAllowReservationNum();
         java.util.Date _start = slot.getStart();
         if(_start!=null){
         	this.start=_start.getTime();
         }
         java.util.Date _end = slot.getEnd();
         if(_end!=null){
         	this.end=_end.getTime();
         }
         this.overbooked=slot.getOverbooked();
         this.comment=slot.getComment();
         this.errorMessage=slot.getErrorMessage();
         this.errorDetail=slot.getErrorDetail();      
    }
      public String  getItemCode(){
       		return this.itemCode;
      }    
      public String  getScheduleId(){
       		return this.scheduleId;
      }    
      public Integer  getSurplusAllowReservationNum(){
       		return this.surplusAllowReservationNum;
      }    
      public Long  getStart(){
       		return this.start;
      }    
      public Long  getEnd(){
       		return this.end;
      }    
      public Boolean  getOverbooked(){
       		return this.overbooked;
      }    
      public String  getComment(){
       		return this.comment;
      }    
	  public String getErrorMessage() {
	        return errorMessage;
	  }
	  public String getErrorDetail() {
	        return errorDetail;
	  }  
}