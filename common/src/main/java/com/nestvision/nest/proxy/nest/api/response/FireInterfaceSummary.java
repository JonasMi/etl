package com.nestvision.nest.proxy.nest.api.response;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class FireInterfaceSummary {
    private String physicalInterfaceName;

    private String logicInterfaceName;

    private Float errorRate=0f;

    private Long recordNumber=0L;

    private String upHospitalName;

    private Long errorCount=0L;
    
    private Date upTime;

    private List<FireInterfaceErrorType> fireInterfaceErrorTypes;

}
